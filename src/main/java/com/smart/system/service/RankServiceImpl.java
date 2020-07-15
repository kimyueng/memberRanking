package com.smart.system.service;

import com.smart.system.domain.entity.Rank;
import com.smart.system.mapper.RankMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RankServiceImpl implements RankService {
    @Resource
    RankMapper rankMapper;


    @Override
    public List<Rank> list(int rankId) throws Exception  {
        return rankMapper.selectRankById(rankId);
    }


}
