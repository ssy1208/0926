package cn.kgc.service;

import cn.kgc.pojo.Student;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 14:59
 */
public interface StudentService {

    List<Student> selectAll();

    void insertStudent(Student student);
}
