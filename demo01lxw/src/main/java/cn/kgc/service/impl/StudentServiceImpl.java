package cn.kgc.service.impl;

import cn.kgc.mapper.ClassesMapper;
import cn.kgc.mapper.StudentMapper;
import cn.kgc.pojo.Classes;
import cn.kgc.pojo.Student;
import cn.kgc.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 14:59
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;

    @Resource
    ClassesMapper classesMapper;

    @Override
    public List<Student> selectAll() {
        List<Student> students = studentMapper.selectByExample(null);
        for (Student student : students) {
            Classes classes = classesMapper.selectByPrimaryKey(student.getClassid());
            student.setClassName(classes.getName());
        }
        return students;
    }

    @Override
    public void insertStudent(Student student) {
        studentMapper.insertSelective(student);
    }
}
