package com.smart.system.domain.dto;

import com.smart.system.domain.entity.Member;
import com.smart.system.domain.entity.Rank;

import java.util.List;

public class RankDto extends Rank {
    private List<Member>members;

}
