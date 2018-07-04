package com.lt.dataobject;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author lutao
 * @date 2018/5/10
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;

    /**姓名**/
    private String productName;

    /**价格**/
    private BigDecimal productPrice;

    /**库存**/
    private Integer productStock;

    /**描述**/
    private String productDescription;

    /**小图**/
    private String productIcon;

    /**状态，0正常 1下架**/
    private Integer productStatus;

    /**类目编号**/
    private Integer categoryType;


}
