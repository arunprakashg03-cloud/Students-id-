package com.example.projectdemo.Controller;

import com.example.projectdemo.Model.Student;
import com.example.projectdemo.Services.StudentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {
    @Autowired
 StudentsServices studentsServices;


 @GetMapping("/students")
 public List<Student> getAllstudent(){
     return studentsServices.getAllstudent();
    }


@GetMapping("/students/{name}")
public Student getStudentName(@PathVariable ("name") String name){
    return studentsServices.getStudentName(name);
}



 @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
     studentsServices.addStudent(student);
     return "add...";
 }


 @PutMapping("/students")
    public String updateStudents(@RequestBody Student student){
    studentsServices.updateStudents(student);
    return "Updated";
 }


@DeleteMapping("/students/{name}")
    public String deleteStudent(@PathVariable String name){
     studentsServices.deleteStudentByname(name);
    return "deleted Student";
 }
}
