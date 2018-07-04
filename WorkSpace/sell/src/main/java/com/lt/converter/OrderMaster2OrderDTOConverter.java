package com.lt.converter;

import java.util.List;
import java.util.stream.Collectors;

import com.lt.dataobject.OrderMaster;
import com.lt.dataobject.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

/**
 * @author lutao
 * @date 2018/5/20
 */
public class OrderMaster2OrderDTOConverter {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);

        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->convert(e)
        ).collect(Collectors.toList());
    }
}