package com.smart.system.domain.dto;
//接受客户端传递的参数
//以后需要对数据做数据校验

import lombok.Data;
//查询关键字手机号用户名邮箱

@Data
public class MemberDto {
    private String keyword;
    private Long memberId;
    private String username;
    private String phone;
    private String email;
    private String createDate;
    //关联详细信息
    private MemberDetailDto detailDto;



}
