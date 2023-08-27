package com.sayan.SPRINGJPA.Repository;

import com.sayan.SPRINGJPA.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
