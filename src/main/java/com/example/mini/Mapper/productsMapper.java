package com.example.mini.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mini.Entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface productsMapper extends BaseMapper<Product> {
}
