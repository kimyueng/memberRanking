package com.smart.system.service;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.smart.system.domain.dto.MemberDto;
import com.smart.system.domain.entity.Member;
import com.smart.system.domain.entity.MemberDetail;
import com.smart.system.mapper.MemberDetailMapper;
import com.smart.system.mapper.MemberMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
//功能实现
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;
    @Resource
    MemberDetailMapper memberDetailMapper;


    @Override
    public List<Member> findAll(MemberDto memberDto, int page, int size) {
        List<Member> members = memberMapper.selectAll(memberDto.getKeyword(),memberDto.getCreateDate(),size*(page-1),size);

        return members;
    }


    //更新会员信息
    //dto--->entity

    @Override
    @Transactional
    public int updateMember(MemberDto memberDto) {
        //更新主表数据
        Member member =new Member();
        //参数一：要拷贝的对象 dto
        //参数二：目标对象entity
        BeanUtils.copyProperties(memberDto,member);
        int count = memberMapper.updateByPrimaryKeySelective(member);
        //保存子表数据
        //会员详情的信息更新
        MemberDetail memberDetail=new MemberDetail();
        //获取memberDto DetailDto的数值
        BeanUtils.copyProperties(memberDto.getDetailDto(),memberDetail);
        memberDetailMapper.updateByPrimaryKeySelective(memberDetail);
        return count;









    }
}
