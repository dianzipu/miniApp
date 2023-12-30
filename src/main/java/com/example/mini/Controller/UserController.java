package com.example.mini.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.mini.Common.Constants;
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

//    无权限，暂时不可用
    @PostMapping("/decrypt")
    public Result DecryptPhone(@RequestBody JSONObject jsonObject) throws Exception {
        try{
            JSONObject phone = this.userService.Decryptphone(jsonObject);
            if(phone != null){
                return Result.SuccessOb(phone);
            }else {
                return Result.Error(Constants.code_300,"查询失败");
            }
        }catch (Exception e){
            throw new Exception("查询失败");
        }
    }
}
