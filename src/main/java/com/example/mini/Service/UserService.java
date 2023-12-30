package com.example.mini.Service;

import com.example.mini.Entity.User;
import com.example.mini.Mapper.usersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private usersMapper userMapper;

    public void decryptUser(User user) {
        userMapper.insert(user);
    }

    public void save(User user) {
        userMapper.insert(user);
    }
}
