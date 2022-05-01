package com.userservice.controller;

import com.userservice.entity.Contact;
import com.userservice.entity.User;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long id){

        User user = this.userService.getUser(id);
        List<Contact> contactList = this.restTemplate.getForObject("http://contact-service/contact/"+ user.getUserId(),List.class);

        user.setContacts(contactList);
        return user;
    }
}
