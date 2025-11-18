package com.example.projectdemo.Services;

import com.example.projectdemo.Model.Student;
import com.example.projectdemo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentsServices {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllstudent() {
        return studentRepo.findAll();

    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public void updateStudents(Student student) {
        studentRepo.save(student);

    }

    public Student getStudentName(String name) {
        return studentRepo.findById(name).orElse(new Student());
    }

    public void deleteStudentByname(String name) {
        studentRepo.findById(name);
    }
}



