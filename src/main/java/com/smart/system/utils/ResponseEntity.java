package com.smart.system.utils;

import lombok.Data;

@Data
public class ResponseEntity<T> {
    private int status;
    private String msg;
    private T data;

    public static <T> com.smart.system.utils.ResponseEntity<T> success(T data) {
        com.smart.system.utils.ResponseEntity<T> entity = new com.smart.system.utils.ResponseEntity<>();
        entity.setData(data);
        entity.setMsg(com.smart.system.utils.ErrorStatus.SUCCESS.getMsg());
        entity.setStatus(com.smart.system.utils.ErrorStatus.SUCCESS.getStatus());
        return entity;
    }

    public static <T> com.smart.system.utils.ResponseEntity<T> success(com.smart.system.utils.ErrorStatus status, T data) {
        com.smart.system.utils.ResponseEntity<T> entity = new com.smart.system.utils.ResponseEntity<>();
        entity.setData(data);
        entity.setMsg(status.getMsg());
        entity.setStatus(status.getStatus());
        return entity;
    }

    public static <T> com.smart.system.utils.ResponseEntity<T> error() {
        com.smart.system.utils.ResponseEntity<T> entity = new com.smart.system.utils.ResponseEntity<>();
        entity.setMsg(StatusConstants.SUCCESS);
        entity.setStatus(StatusConstants.SUCCESS_CODE);
        return entity;
    }

    public static <T> com.smart.system.utils.ResponseEntity<T> error(com.smart.system.utils.ErrorStatus status) {
        com.smart.system.utils.ResponseEntity<T> entity = new com.smart.system.utils.ResponseEntity<>();
        entity.setMsg(status.getMsg());
        entity.setStatus(status.getStatus());
        return entity;
    }
}
