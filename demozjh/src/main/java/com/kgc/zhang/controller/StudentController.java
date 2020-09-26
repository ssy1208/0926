package com.kgc.zhang.controller;

import com.kgc.zhang.entity.Classes;
import com.kgc.zhang.entity.Student;
import com.kgc.zhang.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    StudentService studentService;
    @RequestMapping("index")
    public  String toindex(Model model){
        List<Student> students =studentService.selectStudent(null);
        model.addAttribute("students",students);
        return "index";
    }
    @RequestMapping("toadd")
    public  String toadd(Model model){
        List<Classes> classes = studentService.selectClass(null);
        model.addAttribute("classes",classes);
        return "add";
    }
    @RequestMapping("add")
    public  String add(Model model,Student student){
        int insertadd = studentService.insertadd(student);
      return "redirect:index";
    }

}
