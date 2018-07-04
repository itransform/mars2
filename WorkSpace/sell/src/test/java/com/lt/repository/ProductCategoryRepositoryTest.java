package com.lt.repository;

import java.util.Arrays;
import java.util.List;

import com.lt.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tanghaoyu
 * @date 2018/5/9
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
     private ProductCategoryRepository repository;

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("葡萄");
        productCategory.setCategoryType(4);
        repository.save(productCategory);
    }
    //@Test
    //public void findByCategoryTypeInTest(){
    //    List<Integer> list = Arrays.asList(2, 3, 4);
    //    List<ProductCategory> result = repository.findByCategoryTypeIn(list);
    //    Assert.assertEquals(0,result.size());
    //}
}