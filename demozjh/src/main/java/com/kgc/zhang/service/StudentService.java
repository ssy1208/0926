package com.kgc.zhang.service;

import com.kgc.zhang.entity.Classes;
import com.kgc.zhang.entity.ClassesExample;
import com.kgc.zhang.entity.Student;
import com.kgc.zhang.entity.StudentExample;

import java.util.List;

public interface StudentService {
    List<Student> selectStudent(StudentExample example);
    List<Classes> selectClass(ClassesExample example);
    int insertadd(Student record);
}
