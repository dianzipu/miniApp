package com.example.mini.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.mini.Common.Result;
import com.example.mini.Mapper.productsMapper;
import com.example.mini.Mapper.usersMapper;
import com.example.mini.Service.OrderService;
import com.example.mini.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private productsMapper ProductMapper;

    @Autowired
    private OrderService orderService;

    @PostMapping("/deal")
    public Result Deal(@RequestBody JSONObject jsonObject){
        return null;
    }
}
