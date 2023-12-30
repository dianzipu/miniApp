package com.example.mini.Entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("products")
public class Product {
    @TableField(value = "product_id")
    private int product_id;
    @TableField(value = "product_name")
    private String product_name;
    @TableField(value = "description")
    private String description;
    @TableField(value = "price")
    private BigDecimal price;
    @TableField(value = "stock_quantity")
    private int stock_quantity;
    @TableField(value = "publisher_user_id")
    private int publisher_user_id;
    @TableField(value = "school_id")
    private int school_id;
    @TableField(value = "category_name")
    private String category_name;
    @TableField(value = "form_id")
    private String form_id;
    @TableField(value = "wechat")
    private String wechat;
    @TableField(value = "qq")
    private String qq;
    @TableField(value = "telephone")
    private String telephone;
//    @TableField(value = "publisher_user_id")
//    private User user;

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock_quantity=" + stock_quantity +
                ", publisher_user_id=" + publisher_user_id +
                ", school_id=" + school_id +
                ", category_name='" + category_name + '\'' +
                ", form_id='" + form_id + '\'' +
                ", wechat='" + wechat + '\'' +
                ", qq='" + qq + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
