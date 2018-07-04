package com.lt.dataobject.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lt.dataobject.OrderDetail;
import com.lt.utils.serializer.Date2LongSerializer;
import lombok.Data;

/**
 * @author tanghaoyu
 * @date 2018/5/14
 */
@Data
public class OrderDTO {
    @Id
    private String orderId;

    private String buyerName;

    /****/
    private String buyerPhone;

    /**买家地址**/
    private String buyerAddress;

    /**买家微信Openid**/
    private String buyerOpenid;


    private BigDecimal orderAmount;

    /**订单状态，默认为0新下单**/
    private Integer orderStatus;

    /**支付状态，默认为0未支付**/
    private Integer payStatus;

    /**创建时间**/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**更新时间**/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;



}
