package com.lt.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author tanghaoyu
 * @date 2018/5/10
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
