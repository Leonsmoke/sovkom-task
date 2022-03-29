package com.leonsmoke.emailservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailPublisherController {

    @GetMapping("/send")
    public String send() {
        System.out.println("Email was sent");
        return "Email was sent";
    }

}
