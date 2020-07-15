package com.smart.system.domain.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Member {
    private  Integer memberId;
    private String username;
    private String password;
    private String sex;
    private Integer phone;
    private String email;
    private Date createTime;
    private  String adress;
    private String rankings;
    private String nickName;

    private Integer status;
    private Integer isDel;

    private Date updateTime;


    private String icon;
    private MemberDetail memberDetail;


}
