package com.example.mini.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.mini.Common.Result;
import com.example.mini.Mapper.usersMapper;
import com.example.mini.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private usersMapper UsersMapper;

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result Register(@RequestBody JSONObject jsonObject){
        return null;
    }

}
