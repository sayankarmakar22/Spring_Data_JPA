package com.sayan.SPRINGJPA.Services.Implmentations;

import com.sayan.SPRINGJPA.Entity.Student;
import com.sayan.SPRINGJPA.Repository.StudentRepo;
import com.sayan.SPRINGJPA.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveUser(Student student) {
        Student save = studentRepo.save(student);
        return save;
    }

    @Override
    public Student updateUser(Student student) {
        Student fetched_user = studentRepo.findById(student.getId()).orElseThrow(() -> new RuntimeException("id not found"));
        fetched_user.setAddress(student.getAddress());
        fetched_user.setName(student.getName());
        Student save = studentRepo.save(fetched_user);
        return save;
    }

    @Override
    public Student getUser(int id) {
        Student fetched_user = studentRepo.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
        return fetched_user;
    }

    @Override
    public String deleteUser(int id) {
        studentRepo.deleteById(id);
        return id + " has been deleted";
    }

}