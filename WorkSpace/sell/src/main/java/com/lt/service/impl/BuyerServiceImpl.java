package com.lt.service.impl;

import com.lt.dataobject.dto.OrderDTO;
import com.lt.dataobject.exception.SellException;
import com.lt.enums.ResultEnum;
import com.lt.service.BuyerService;
import com.lt.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tanghaoyu
 * @date 2018/6/23
 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {

        return checkOrderOwner(openid, orderId);
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
       OrderDTO orderDTO = checkOrderOwner(openid, orderId);
       if (orderDTO == null){
          log.error("【取消订单】查不到该订单，orderId={}",orderId);
          throw new SellException(ResultEnum.order_not_exist);
       }
        return orderService.cancel(orderDTO);
    }

    private OrderDTO checkOrderOwner(String openid, String orderId){

        OrderDTO orderDTO =  orderService.findOne(orderId);
        if (orderDTO == null) {
            return null;
        }
        if (!orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)) {
            log.error("【查询订单】订单的openid不一致，openid={}, orderId={}",openid, orderId);
            throw new SellException(ResultEnum.order_owner_error);
        }
        return orderDTO;
    }

}
