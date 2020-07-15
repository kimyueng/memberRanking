package com.smart.system.service;

import com.smart.system.domain.dto.MemberDto;
import com.smart.system.domain.entity.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface MemberService  {
    List<Member>findAll(MemberDto memberDto,int page,int size);

    int updateMember(MemberDto memberDto);








}
