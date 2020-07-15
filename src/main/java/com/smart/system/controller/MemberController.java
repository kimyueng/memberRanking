package com.smart.system.controller;

import com.smart.system.domain.dto.MemberDto;
import com.smart.system.domain.entity.Member;
import com.smart.system.service.MemberService;

import com.smart.system.utils.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/member")

public class MemberController {
    MemberService memberService;
    /**
     * 根据用户名，手机号或者时间进行分页查询
     * 对数据进行校验
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity<List<Member>> list(MemberDto memberDto, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        List<Member> members = memberService.findAll(memberDto, page, size);
        return ResponseEntity.success(members);

    }

    /**
     *更改对象
     * @return
     */
    @PostMapping("/list")
    public ResponseEntity<Member>update(@RequestBody  MemberDto memberDto) {

        return null;
    }

    //添加对象
    @PostMapping("/add")
    public ResponseEntity<Member>add() {
        return null;
    }
    //批量删除
    @PostMapping("/batch")
    public ResponseEntity<Member>batchDel() {
        return null;
    }
    //删除

    @PostMapping("/del")
    public ResponseEntity<Member>delete(int id) {
        return null;
    }
    //
    @PostMapping("/active")
    public ResponseEntity<Member>active(int id) {
        return null;
    }

}
