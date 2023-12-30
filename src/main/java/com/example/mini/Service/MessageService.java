package com.example.mini.Service;

import com.example.mini.Entity.ChatMessage;
import com.example.mini.Mapper.chat_messageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private chat_messageMapper chatMessageMapper;

    public void save(ChatMessage message) {
        this.chatMessageMapper.insert(message);
    }

    public List<ChatMessage> findAll() {
        return this.chatMessageMapper.selectList(null);
    }

    public ChatMessage findById(int id) {
        return this.chatMessageMapper.selectById(id);
    }

    public void deleteById(int id) {
        this.chatMessageMapper.deleteById(id);
    }

    public boolean existsById(int id) {
        ChatMessage message = this.chatMessageMapper.selectById(id);
        return message != null;
    }
}
