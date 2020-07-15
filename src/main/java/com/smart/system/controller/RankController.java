package com.smart.system.controller;

import com.smart.system.domain.entity.Rank;
import com.smart.system.service.RankService;
import com.smart.system.utils.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.smart.system.exception.ServiceException;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/rank")
public class RankController {
    @Resource
    RankService rankService;
    //按照会员ID查询会员的等级信息

    //按照等级信息查询会员列表
    @GetMapping("/list/rankId")
    public ResponseEntity<List<Rank>>list(@PathVariable()int rankId) throws Exception {
        List<Rank>list=rankService.list(rankId);
        return ResponseEntity.success(list);
    }








}
