package com.lt.utils;

import java.util.Random;

/**
 * 生成唯一主键
 * @author tanghaoyu
 * @date 2018/5/15
 */
public class KeyUtil {
    public static String genUniqueKey(){
        Random random = new Random();
        System.currentTimeMillis();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
