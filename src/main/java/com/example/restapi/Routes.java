package com.example.restapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.features.Student;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "http://someserver:8080"})
public class Routes {

    @GetMapping("/")
    public String index() {
        return "hello world";
    }

    @GetMapping("/params")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/example")
    public ReturnProps exampleMethodName() {
        return new ReturnProps("Welcome to the bootie app", "success");
    }

    @PostMapping("/posts")
    public ReturnProps postMethodName(@RequestBody ReturnProps entity) {
        String name = entity.getStatus();
        String message = entity.getMessage();
        System.out.println(name);
        return new ReturnProps(name, message);
    }

    @PostMapping("/student")
    public Student postMethodName(@RequestBody Student entity) {
        return entity;
    }
    

}
