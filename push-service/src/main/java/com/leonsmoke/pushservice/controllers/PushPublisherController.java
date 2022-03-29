package com.leonsmoke.pushservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/push")
public class PushPublisherController {

    @GetMapping("/send")
    public String send() {
        System.out.println("Push was sent");
        return "Push was sent";
    }

}
