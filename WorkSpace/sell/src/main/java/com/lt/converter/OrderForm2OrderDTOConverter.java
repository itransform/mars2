package com.lt.converter;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lt.dataobject.OrderDetail;
import com.lt.dataobject.dto.OrderDTO;
import com.lt.dataobject.exception.SellException;
import com.lt.enums.ResultEnum;
import com.lt.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tanghaoyu
 * @date 2018/5/20
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {

        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();

        try {
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e){
            log.error("【对象转换】错误,string={}",orderForm.getItems());
            throw new SellException(ResultEnum.param_error);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
