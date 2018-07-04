package com.lt.service;

import java.util.Arrays;
import java.util.List;

import com.lt.dataobject.ProductCategory;
import com.lt.service.impl.CategoryServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tanghaoyu
 * @date 2018/5/10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
@Autowired
private CategoryServiceImpl categoryService;

    @Test
    public void findAll() throws Exception{
        List<ProductCategory> categories = categoryService.findAll();
        Assert.assertNotEquals(0,categories.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception{
        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2, 3));
        Assert.assertNotEquals(0,byCategoryTypeIn);
    }

}