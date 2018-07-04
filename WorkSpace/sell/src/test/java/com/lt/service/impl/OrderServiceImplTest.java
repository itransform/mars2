//package com.lt.service.impl;
//
//import java.util.ArrayList;
//
//import com.lt.dataobject.OrderDetail;
//import com.lt.dataobject.dto.OrderDTO;
//import com.lt.enums.OrderStatusEnum;
//import com.lt.enums.PayStatusEnum;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.Assert.*;
//
///**
// * @author tanghaoyu
// * @date 2018/5/20
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Slf4j
//public class OrderServiceImplTest {
//
//    @Autowired
//    private OrderServiceImpl orderService;
//
//    private final String BUYER_OPENID = "110110";
//
//    private final String ORDER_ID = "1526795389029569281";
//
//    @Test
//    public void create() throws Exception{
//        OrderDTO orderDTO = new OrderDTO();
//        orderDTO.setBuyerName("lt");
//        orderDTO.setBuyerAddress("mooic");
//        orderDTO.setBuyerPhone("12345678910");
//        orderDTO.setBuyerOpenid(BUYER_OPENID);
//
//        //购物车
//        ArrayList<OrderDetail> orderDetailList = new ArrayList<>();
//        OrderDetail orderDetail = new OrderDetail();
//        orderDetail.setProductId("123456");
//        orderDetail.setProductQuantity(1);
//        orderDetailList.add(orderDetail);
//        orderDTO.setOrderDetailList(orderDetailList);
//
//        OrderDTO result = orderService.create(orderDTO);
//        log.info("创建订单 result={}",result);
//    }
//
//    @Test
//    public void findOne() {
//        OrderDTO result = orderService.findOne(ORDER_ID);
//        log.info("查询单个订单result={}",result);
//        Assert.assertEquals(ORDER_ID,result.getOrderId());
//    }
//
//    @Test
//    public void findList() {
//        PageRequest request = new PageRequest(0,2);
//
//        Page<OrderDTO> orderDTOPage = orderService.findList(BUYER_OPENID, request);
//        Assert.assertNotEquals(0,orderDTOPage.getTotalElements());
//    }
//
//    @Test
//    public void cancel() {
//        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
//
//        OrderDTO result = orderService.cancel(orderDTO);
//        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(),result.getOrderStatus());
//    }
//
//    @Test
//    public void finish() {
//        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
//
//        OrderDTO result = orderService.finish(orderDTO);
//        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(),result.getOrderStatus());
//
//    }
//
//    @Test
//    public void paid() {
//        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
//
//        OrderDTO result = orderService.paid(orderDTO);
//        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(),result.getPayStatus());
//    }
//
//}