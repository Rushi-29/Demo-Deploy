package com.springDep.demo.controller;

import com.springDep.demo.model.Student;
import com.springDep.demo.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class studentController {
    @Autowired
    IStudentRepo studentRepo;

    @PostMapping
    public void saveStudent(Student student){
        studentRepo.save(student);
    }

    @GetMapping
    public List<Student> getAll(){
        return studentRepo.findAll();
    }
}
