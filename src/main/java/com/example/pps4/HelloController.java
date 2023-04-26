package com.example.pps4;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController{
@GetMapping("/hello")
    public String hello() {
        return "Hello luis";
    }
@GetMapping("/goodbye")
public String goodbye() {
    return "Goodbye luis";
    }
}
