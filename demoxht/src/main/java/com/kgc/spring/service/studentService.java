package com.kgc.spring.service;

import com.kgc.spring.entity.student;
import com.kgc.spring.entity.studentExample;

import java.util.List;

public interface studentService {
    List<student> select();
    int add(student student);
    List<student> selectByExample(studentExample example);

//    List<student> selectBycha(int classid,String name);
}
