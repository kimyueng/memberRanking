package com.smart.system.mapper;

import com.smart.system.domain.entity.Rank;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RankMapper {


    List<Rank> selectRankById(@Param("rankId") int rankId) throws Exception;

    int deleteByPrimaryKey(Integer rankId);

    int insert(Rank record);

    int insertSelective(Rank record);

    Rank selectByPrimaryKey(Integer rankId);

    int updateByPrimaryKeySelective(Rank record);

    int updateByPrimaryKey(Rank record);





}