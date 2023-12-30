package com.example.mini.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.mini.Common.Result;
import com.example.mini.Entity.School;
import com.example.mini.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/school")
@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/saveSchool")
    public Result saveSchools(@RequestBody JSONObject jsonObject) {
        School school = new School();
        school.setSchool_name(jsonObject.getString("selectedSchool"));
        schoolService.save(school);
        return Result.SuccessOb(school);
    }
}
