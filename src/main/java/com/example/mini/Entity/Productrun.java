package com.example.mini.Entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("product_run")
public class Productrun {
    @TableField(value = "product_id")
    private int product_id;
    @TableField(value = "product_name")
    private String product_name;
    @TableField(value = "category_name")
    private String category_name;
    @TableField(value = "publisher_user_id")
    private int publisher_user_id;
    @TableField(value = "product_image")
    private String product_image;

    @Override
    public String toString() {
        return "Productrun{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", category_name='" + category_name + '\'' +
                ", publisher_user_id=" + publisher_user_id +
                ", product_image='" + product_image + '\'' +
                '}';
    }
}
