package com.kgc.service.impl;

import com.kgc.mapper.ClassesMapper;
import com.kgc.mapper.StudentMapper;
import com.kgc.pojo.Classes;
import com.kgc.pojo.Student;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.kgc.service.StudentService;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceimpl implements StudentService {
    @Resource
    StudentMapper studentMapper;
    @Resource
    ClassesMapper classesMapper;

    @Override
    public List<Student> select() {
        List<Student> students = studentMapper.selectByExample(null);
        for (Student student : students) {
            Classes classes = classesMapper.selectByPrimaryKey(student.getClassid());
            student.setName(classes.getName());
        }
        return students;
    }

    @Override
    public void insertStudent(Student student) {
        studentMapper.insertSelective(student);
    }
}
