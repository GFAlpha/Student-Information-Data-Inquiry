package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

@PostMapping("/find")
public String findStudent(@RequestParam("id") Long id, Model model) {
    Student student = studentRepository.findById(id).orElse(null);

    if (student == null) {
        model.addAttribute("error", "找不到学号为 " + id + " 的学生");
    } else {
        model.addAttribute("student", student);
    }

    return "result";
}
}