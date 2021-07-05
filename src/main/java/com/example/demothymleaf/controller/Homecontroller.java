package com.example.demothymleaf.controller;

import com.example.demothymleaf.bean.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

@Controller
public class Homecontroller {
    @RequestMapping("/home/index")
    public String index(Model model) throws IOException {
        model.addAttribute("message","Welcome Thymeleaf");
        ObjectMapper mapper = new ObjectMapper();
        String path = "D:\\inteliji\\Demothymleaf\\src\\main\\resources\\static\\images\\student.json";
        Student student = mapper.readValue(new File(path),Student.class);
        model.addAttribute("sv",student);
        return "home/index";
    }
}
