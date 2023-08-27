package com.sayan.SPRINGJPA.Controllers;

import com.sayan.SPRINGJPA.Entity.Student;
import com.sayan.SPRINGJPA.Services.Implmentations.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MainController {

    @Autowired
    private StudentImpl studentImpl;

    @PostMapping("/make")
    public ResponseEntity<Student> create(@RequestBody Student student){
        return new ResponseEntity<>(studentImpl.saveUser(student), HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public ResponseEntity<Student> get(@RequestParam(name = "id") int id){
        return new ResponseEntity<>(studentImpl.getUser(id), HttpStatus.FOUND);
    }
    @PutMapping("/update")
    public ResponseEntity<Student> update(@RequestBody Student student){
        return new ResponseEntity<>(studentImpl.updateUser(student), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        return new ResponseEntity<>(studentImpl.deleteUser(id), HttpStatus.ACCEPTED);
    }
}
