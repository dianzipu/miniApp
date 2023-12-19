package com.example.mini.Entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
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
                '}';
    }

    public Product() {
    }

    public Product(int product_id, String product_name, String description, BigDecimal price, int stock_quantity, int publisher_user_id, int school_id, String category_name) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.description = description;
        this.price = price;
        this.stock_quantity = stock_quantity;
        this.publisher_user_id = publisher_user_id;
        this.school_id = school_id;
        this.category_name = category_name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public int getPublisher_user_id() {
        return publisher_user_id;
    }

    public void setPublisher_user_id(int publisher_user_id) {
        this.publisher_user_id = publisher_user_id;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
