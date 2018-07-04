package com.lt.dataobject.dto;

import lombok.Data;

/**
 * @author tanghaoyu
 * @date 2018/5/15
 */
@Data
public class CartDTO {
    /**
     * 商品id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
