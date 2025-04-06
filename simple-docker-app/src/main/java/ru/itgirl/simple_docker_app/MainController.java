package ru.itgirl.simple_docker_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        System.out.println("Hello World!");
        return "Hello World!";
    }
}
