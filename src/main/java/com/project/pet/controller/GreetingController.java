package com.project.pet.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.project.pet.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {
    private static final String template = "Greetings, from %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "my app") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}