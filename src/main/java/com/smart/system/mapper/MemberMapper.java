package com.smart.system.mapper;

import com.smart.system.domain.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//一个mapper对应一个表操作

/**
 * member,起始 page,返回多少条size
 *
 */
public interface MemberMapper {

    List<Member>selectAll(@Param("keyword")String keyword,
                          @Param("createDate")String createDate,
                          @Param("limit")int limit,
                          @Param("offset")int offset);

    int deleteByPrimaryKey(Long memberId);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Long memberId);

    int updateByPrimaryKeySelective(Member Record);








}
