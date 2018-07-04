package com.lt.repository;

import java.util.List;

import com.lt.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tanghaoyu
 * @date 2018/5/10
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);



}
