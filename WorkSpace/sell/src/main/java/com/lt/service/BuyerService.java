package com.lt.service;

import com.lt.dataobject.dto.OrderDTO;

/**
 * @author tanghaoyu
 * @date 2018/6/23
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne (String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
