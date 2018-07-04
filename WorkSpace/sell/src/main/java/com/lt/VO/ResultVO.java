package com.lt.VO;

import lombok.Data;

/**
 * http请求返还最外层对象
 * @author tanghaoyu
 * @date 2018/5/10
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
