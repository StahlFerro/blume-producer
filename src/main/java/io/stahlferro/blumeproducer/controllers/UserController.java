package io.stahlferro.blumeproducer.controllers;

import io.stahlferro.blumeproducer.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private Producer producer;

    @PostMapping
    public void sendMessage(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }
}
