package com.avseenkov.springmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping(value = "hello")
public class SpringMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesApplication.class, args);
    }

    @GetMapping("/{firstName}")
    public String helleGet(@PathVariable("firstName") String firstName,
                           @RequestParam("lastName") String lastName) {
        return String.format("{ \"message\":\"Hello %s %s}", firstName, lastName);

    }
}
