package com.contactservice.controller;

import com.contactservice.entity.Contact;
import com.contactservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long id){
        return this.contactService.getContact(id);
    }
}
