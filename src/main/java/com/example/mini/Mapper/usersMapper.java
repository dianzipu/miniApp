package com.example.mini.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mini.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface usersMapper extends BaseMapper<User> {
}
