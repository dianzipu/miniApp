package com.example.mini.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.mini.Common.Constants;
import com.example.mini.Common.Result;
import com.example.mini.Entity.Product;
import com.example.mini.Mapper.productsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private productsMapper ProductMapper;

    public List<Product> findProduct(){
        List<Product> list = new ArrayList<>();
        try {
            list = this.ProductMapper.selectList(null);
            if (list != null){
                return list;
            }else {
                return null;
            }
        }catch (Exception e){
            throw new RuntimeException("查询失败");
        }
    }

    public Result SetProduct(Product product){
        try{
            QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("form_id",product.getForm_id());
            Product isproduct = this.ProductMapper.selectOne(queryWrapper);
            if(isproduct != null){
                return Result.Error(Constants.code_800,"商品不存在");
            }else {
                Integer flag =  this.ProductMapper.insert(product);
                if(flag !=null){
                    return Result.Success();
                }else {
                    return Result.Error(Constants.code_801,"商品插入失败");
                }
            }
        }catch (Exception e){
            throw new RuntimeException("查询失败，更新错误");
        }
    }
}
