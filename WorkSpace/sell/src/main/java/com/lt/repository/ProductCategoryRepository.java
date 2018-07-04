package com.lt.repository;

import java.util.List;

import com.lt.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tanghaoyu
 * @date 2018/5/9
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
   List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
