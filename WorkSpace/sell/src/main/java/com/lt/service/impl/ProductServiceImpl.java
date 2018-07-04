package com.lt.service.impl;

import java.util.List;

import com.lt.dataobject.ProductInfo;
import com.lt.dataobject.dto.CartDTO;
import com.lt.dataobject.exception.SellException;
import com.lt.enums.ProductStatusEnum;
import com.lt.enums.ResultEnum;
import com.lt.repository.ProductInfoRepository;
import com.lt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lt
 * @date 2018/5/10
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findById(productId).get();
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    @Transactional
    public void increaseStock(List<CartDTO> cartDTOList) {
     for (CartDTO cartDTO: cartDTOList){
         ProductInfo productInfo = repository.findById(cartDTO.getProductId()).get();
         if (null == productInfo){
             throw new SellException(ResultEnum.product_not_exist);
         }
         //增加库存
         Integer result = productInfo.getProductStock() + cartDTO.getProductQuantity();
         productInfo.setProductStock(result);
         repository.save(productInfo);
     }

    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO :cartDTOList) {
            ProductInfo productInfo = repository.findById(cartDTO.getProductId()).get();
            if (null == productInfo){
                throw new SellException(ResultEnum.product_not_exist);
            }
            Integer result = productInfo.getProductStatus() - cartDTO.getProductQuantity();
            if (result < 0){
                throw new SellException(ResultEnum.product_stock_error);
            }
            productInfo.setProductStock(result);
            repository.save(productInfo);
        }

    }
}
