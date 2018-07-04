package com.lt.enums;

import lombok.Getter;

/**
 * @author tanghaoyu
 * @date 2018/5/11
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消"),
    WAIT(3,"等待"),
    ;
    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
