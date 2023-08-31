package com.sayan.SPRINGJPA.Controllers;

import com.sayan.SPRINGJPA.Entity.Student;
import com.sayan.SPRINGJPA.Services.Implmentations.StudentImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@Api(value="MainController",description = "most used controller")
public class MainController {

    @Autowired
    private StudentImpl studentImpl;

    @PostMapping("/make")
    @ApiOperation(value="make a student")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "success ok"),
            @ApiResponse(code = 401,message = "not authorized"),
            @ApiResponse(code = 201,message = "new user created")}
    )
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
