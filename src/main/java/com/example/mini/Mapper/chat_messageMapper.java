package com.example.mini.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mini.Entity.ChatMessage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface chat_messageMapper extends BaseMapper<ChatMessage> {
}
