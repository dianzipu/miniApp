package com.example.mini.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.mini.Common.Result;
import com.example.mini.Entity.User;
import com.example.mini.Mapper.usersMapper;
import com.example.mini.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/getPhoneNumber")
    public Result decryptUser(@RequestBody JSONObject jsonObject) {
        User user = new User();
        user.setEmail(jsonObject.toString());
        userService.decryptUser(user);
        return Result.SuccessOb(user);
    }

    @PostMapping("/saveUser")
    public Result saveUsers(@RequestBody JSONObject jsonObject) {
        User user = new User();
        user.setUsername(jsonObject.getString("nickName"));
        userService.save(user);
        return Result.SuccessOb(user);
    }
}
