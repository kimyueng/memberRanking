package com.smart.system.mapper;

import com.smart.system.domain.entity.MemberDetail;

public interface MemberDetailMapper {
    int deleteByPrimaryKey(Integer memberDetailId);

    int insert(MemberDetail record);

    int insertSelective(MemberDetail record);

    MemberDetail selectByPrimaryKey(Integer memberDetailId);

    int updateByPrimaryKeySelective(MemberDetail record);

    int updateByPrimaryKey(MemberDetail record);
}