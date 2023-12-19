package com.example.mini.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("schools")
public class School {
    @TableField(value = "school_id")
    private int school_id;
    @TableField(value = "school_name")
    private String school_name;

    @Override
    public String toString() {
        return "School{" +
                "school_id=" + school_id +
                ", school_name='" + school_name + '\'' +
                '}';
    }

    public School() {
    }

    public School(int school_id, String school_name) {
        this.school_id = school_id;
        this.school_name = school_name;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }
}
