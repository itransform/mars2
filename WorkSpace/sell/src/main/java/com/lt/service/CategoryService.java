package com.lt.service;

import java.util.List;

import com.lt.dataobject.ProductCategory;

/**
 * @author tanghaoyu
 * @date 2018/5/10
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
