package com.leonsmoke.smsservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class SmsPublisherController {

    @GetMapping("/send")
    public String send() {
        System.out.println("Sms was sent");
        return "Sms was sent";
    }

}
