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
    @TableField(value = "email")
    private String email;
    @TableField(value = "school_id")
    private int school_id;
    @TableField(value = "first_name")
    private String first_name;
    @TableField(value = "last_name")
    private String last_name;
    @TableField(value = "gender")
    private String  gender;
    @TableField(value = "birthdate")
    private Date birthdate;
    @TableField(value = "address")
    private String address;
    @TableField(value = "school_id",exist = false)
    private int school_ex;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", school_id=" + school_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", school_ex=" + school_ex +
                '}';
    }
}
