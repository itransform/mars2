package com.lt.dataobject;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author lt
 * @date 2018/5/9
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    /**
     *类目id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer categoryId;

    /**
     * 类目名字
     */
   private String categoryName;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    /**
     * 类目编号
     */
   private Integer categoryType;

    public ProductCategory(){}
    @Override
    public String toString() {
        return "ProjectCategory{" +
            "categoryId=" + categoryId +
            ", categoryName='" + categoryName + '\'' +
            ", categoryType=" + categoryType +
            '}';
    }
}

