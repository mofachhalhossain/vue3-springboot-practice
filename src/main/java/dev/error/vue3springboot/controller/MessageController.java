package dev.error.vue3springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @GetMapping("/index")
    public String index(){
        return "Connectivity with vue js";
    }
}
