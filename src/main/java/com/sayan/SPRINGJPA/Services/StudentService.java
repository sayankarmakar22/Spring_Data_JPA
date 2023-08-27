package com.sayan.SPRINGJPA.Services;

import com.sayan.SPRINGJPA.Entity.Student;

public interface StudentService {
    Student saveUser(Student student);
    Student updateUser(Student student);
    Student getUser(int id);
    String deleteUser(int id);
}
