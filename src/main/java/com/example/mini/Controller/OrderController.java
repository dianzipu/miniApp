package com.example.mini.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.mini.Common.Result;
import com.example.mini.Mapper.productsMapper;
import com.example.mini.Service.OrderService;
import com.example.mini.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private productsMapper ProductMapper;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/uploadOrder/{id}")
    public Result Deal(){
        return Result.Success();
    }


}
