package com.example.mini.Service;

import com.example.mini.Common.Result;
import com.example.mini.Entity.ChatMessage;
import com.example.mini.Entity.School;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.mini.Mapper.schoolsMapper;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private schoolsMapper schoolsMapper;

    public void save(School school) {
        schoolsMapper.insert(school);
    }
}
