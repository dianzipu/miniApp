package com.example.mini.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Blob;

@Data
@TableName("product_images")
public class ProductImages {
    @TableField(value = "image_id")
    private int image_id;
    @TableField(value = "product_id")
    private int product_id;
    @TableField(value = "image_data")
    private Blob image_data;
//    @TableField(value = "product_id")
//    private Product product;


    @Override
    public String toString() {
        return "ProductImages{" +
                "image_id=" + image_id +
                ", product_id=" + product_id +
                ", image_data=" + image_data +
                '}';
    }

    public ProductImages() {
    }

    public ProductImages(int image_id, int product_id, Blob image_data) {
        this.image_id = image_id;
        this.product_id = product_id;
        this.image_data = image_data;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public Blob getImage_data() {
        return image_data;
    }

    public void setImage_data(Blob image_data) {
        this.image_data = image_data;
    }
}
