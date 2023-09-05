package com.example.dockerassignment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentController {

    @GetMapping ("/name")
    public String getName(){
        return "Name: Harshada Sonsare";
    }


    @GetMapping("/age")
    public String getAge() {
        return "Age: 22";
    }

    @GetMapping("/address")
    public String getAddress(){
        return "Address: Universe";
    }
}
