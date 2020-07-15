package com.smart.system.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class MemberDetail {
    /**
     * 主键
     */
    private Integer memberDetailId;

    /**
     * 1表示男 2表示女 3保密
     */
    private Integer sex;

    /**
     * 地址
     */
    private String city;

    private Integer memberId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 状态 1表示正常0表示停用
     */
    private Integer status;
}