package com.lt.repository;

import java.math.BigDecimal;
import java.util.List;

import com.lt.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author tanghaoyu
 * @date 2018/5/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456789100");
        orderDetail.setOrderId("1111112222");
         orderDetail.setProductIcon("http:xxxx.jpg");
         orderDetail.setProductId("11112");
         orderDetail.setProductName("皮蛋瘦肉粥");
         orderDetail.setProductPrice(BigDecimal.valueOf(3.5));
         orderDetail.setProductQuantity(2);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("1111112222");
        Assert.assertNotEquals(0,orderDetailList.size());

    }
}