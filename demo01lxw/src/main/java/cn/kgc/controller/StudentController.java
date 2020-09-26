package cn.kgc.controller;

import cn.kgc.pojo.Classes;
import cn.kgc.pojo.Student;
import cn.kgc.service.ClassesService;
import cn.kgc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 14:57
 */
@Controller
public class StudentController {

    @Resource
    StudentService studentService;

    @Resource
    ClassesService classesService;

    @RequestMapping("/")
    public String toIndex(Model model) {
        List<Student> students = studentService.selectAll();
        model.addAttribute("students", students);
        return "jsp/index";
    }

    @RequestMapping("toadd")
    public String toadd(Model model) {
        List<Classes> classes = classesService.selectAll();
        model.addAttribute("classes", classes);
        return "jsp/add";
    }

    @RequestMapping("doadd")
    public String doadd(Student student) {
        studentService.insertStudent(student);
        return "redirect:/";
    }
}
