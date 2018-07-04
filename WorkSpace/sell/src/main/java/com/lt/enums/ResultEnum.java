package com.lt.enums;

import lombok.Getter;

/**
 * @author lutao
 * @date 2018/5/15
 */
@Getter
public enum ResultEnum {

    param_error(1,"参数不正确"),

    product_not_exist(10,"商品不存在"),
    product_stock_error(11,"商品库存不存在"),
    order_not_exist(12,"订单不存在"),
    orderDetail_not_exist(13,"订单详情不存在"),
    order_status_error(14,"订单状态不正确"),
    order_update_fail(15,"订单更新失败"),
    order_detail_empty(16,"订单中无商品详情"),
    order_pay_status_error(17,"订单支付状态不正确"),
    cart_empty(18,"购物车不能为空"),
    order_owner_error(19,"该订单不属于当前用户"),
    wx_mp_error(20, "微信公众账号错误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
