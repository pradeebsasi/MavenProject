package com.example.MavenProject.Controller;

import com.example.MavenProject.Model.Teacher;
import com.example.MavenProject.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

    @RestController
    @RequestMapping("/teacher")
    public class TeacherController {

        @Autowired
        private TeacherRepository teacherRepository;

        @GetMapping("/search")
        public Teacher getTeacherById(@RequestParam Long id){
            Teacher teacher=teacherRepository.findTeacherById(id);
            return teacher;
        }

        @GetMapping("/list")
        public List<Teacher> getAllTeachers(){
            return teacherRepository.findAll();
        }

        @PostMapping("/add")
        public String createTeacherRecord(@RequestBody Teacher teach){
            teacherRepository.save(teach);
            return "Teacher details added";
        }
    }

