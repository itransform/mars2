package com.lt.controller;

import com.lt.dataobject.dto.OrderDTO;
import com.lt.dataobject.exception.SellException;
import com.lt.enums.ResultEnum;
import com.lt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tanghaoyu
 * @date 2018/6/23
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/create")
    public void create(@RequestParam("orderId") String orderId,
                       @RequestParam("returnUrl") String returnUrl){
        //1.查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
           throw new SellException(ResultEnum.order_not_exist);
        }

    }
}
