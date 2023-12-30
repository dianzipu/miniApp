package com.example.mini.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.mini.Entity.dto.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("users")
public class User {
    @TableField(value = "user_id")
    private int user_id;
    @TableField(value = "username")
    private String username;
    @TableField(value = "school_id")
    private int school_id;
    @TableField(value = "gender")
    private String  gender;
    @TableField(value = "avatar")
    private String avatar;
    @TableField(value = "school_id",exist = false)
    private int school_ex;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", school_id=" + school_id +
                ", gender='" + gender + '\'' +
                ", avatar='" + avatar + '\'' +
                ", school_ex=" + school_ex +
                '}';
    }
}
