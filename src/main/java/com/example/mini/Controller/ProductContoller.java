package com.example.mini.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.mini.Common.Result;
import com.example.mini.Entity.Product;
import com.example.mini.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductContoller {

    @Autowired
    private ProductService productService;

    @GetMapping("/getproducts")
    public List Product(){
        try {
            List<Product> list = this.productService.findProduct();
            if(list != null){
                return list;
            }else {
                return null;
            }
        }catch (Exception e){
            throw new RuntimeException("查询错误");
        }
    }

    @PostMapping("/addgoods")
    public Result SetProduct(@RequestBody JSONObject jsonObject){
        try{
            Product product = new Product();
            product.setProduct_name(jsonObject.getString("input_trade_name"));
            product.setDescription(jsonObject.getString("input_product_data"));
            BigDecimal price = new BigDecimal(jsonObject.getString("input_price"));
            product.setPrice(price);
            product.setQq(jsonObject.getString("QQ"));
            product.setWechat(jsonObject.getString("WX"));
            product.setTelephone(jsonObject.getString("Tele"));
            product.setForm_id(jsonObject.getString("form_id"));
            Result result =  this.productService.SetProduct(product);
            return result;
        }catch (Exception e){
            throw new RuntimeException("插入商品错误");
        }
    }

//    @GetMapping("/goodsdetails/{id}")
//    public Result getOneProduct(){
//        try {
//
//        }
//    }

}
