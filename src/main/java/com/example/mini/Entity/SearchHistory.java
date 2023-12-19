package com.example.mini.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("search_history")
public class SearchHistory {
    @TableField(value = "search_id")
    private int search_id;
    @TableField(value = "user_id")
    private int user_id;
    @TableField(value = "search_query")
    private String search_query;
    @TableField(value = "searcher_id",exist = false)
    private int searcher_id;

    @Override
    public String toString() {
        return "SearchHistory{" +
                "search_id=" + search_id +
                ", user_id=" + user_id +
                ", search_query='" + search_query + '\'' +
                ", searcher_id=" + searcher_id +
                '}';
    }
}
