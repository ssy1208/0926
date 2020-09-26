package com.kgc.zhang.service.impl;

import com.kgc.zhang.entity.Classes;
import com.kgc.zhang.entity.ClassesExample;
import com.kgc.zhang.entity.Student;
import com.kgc.zhang.entity.StudentExample;
import com.kgc.zhang.mapper.ClassesMapper;
import com.kgc.zhang.mapper.StudentMapper;
import com.kgc.zhang.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;
    @Resource
    ClassesMapper classesMapper;

    @Override
    public List<Student> selectStudent(StudentExample example) {
        return studentMapper.lian(example);
    }

    @Override
    public List<Classes> selectClass(ClassesExample example) {
        return classesMapper.selectByExample(example);
    }

    @Override
    public int insertadd(Student record) {
        return studentMapper.insert(record);
    }
}
