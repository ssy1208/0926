package com.kgc.spring.controller;

import com.kgc.spring.entity.student;
import com.kgc.spring.entity.studentExample;
import com.kgc.spring.service.studentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class sutdentController {
@Resource
    studentService studentService;

@RequestMapping("/index")
public String cha(Model model){
    List<student> select = studentService.select();
    model.addAttribute("list",select);
    return "index";

}

@RequestMapping("/add")
    public String add(student student){

    int add = studentService.add(student);

    return "redirect:/index";
}

}
