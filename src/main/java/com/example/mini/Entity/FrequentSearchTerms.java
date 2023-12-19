package com.example.mini.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("frequent_search_terms")
public class FrequentSearchTerms {
    @TableField(value = "term_id")
    private int term_id;
    @TableField(value = "search_term")
    private String search_term;
    @TableField(value = "frequency")
    private int frequency;

    @Override
    public String toString() {
        return "FrequentSearchTerms{" +
                "term_id=" + term_id +
                ", search_term='" + search_term + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
