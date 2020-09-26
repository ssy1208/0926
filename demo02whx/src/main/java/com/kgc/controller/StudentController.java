package com.kgc.controller;

import com.kgc.pojo.Classes;
import com.kgc.pojo.Student;
import com.kgc.service.ClassesService;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    StudentService studentService;

    @Resource
    ClassesService classesService;

    @RequestMapping("/")
    public String toIndex(Model model) {
        List<Student> students = studentService.select();
        model.addAttribute("students", students);
        return "index";
    }

    @RequestMapping("toadd")
    public String toadd(Model model) {
        List<Classes> classes = classesService.selectAll();
        model.addAttribute("classes", classes);
        return "add";
    }

    @RequestMapping("doadd")
    public String doadd(Student student) {
        studentService.insertStudent(student);
        return "redirect:/";
    }

}
