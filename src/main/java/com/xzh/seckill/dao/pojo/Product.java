package com.xzh.seckill.dao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 产品名
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 库存
     */
    private Integer amount;
}