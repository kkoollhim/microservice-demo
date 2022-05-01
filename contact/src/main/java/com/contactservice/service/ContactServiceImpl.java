package com.contactservice.service;

import com.contactservice.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    private Long cId;
    private String email;
    private String contactName;
    private Long userId;

    //Fake List of contacts
    List<Contact> list = Arrays.asList(
            new Contact(1L, "hs3045@gmail.com", "Amit", 3045L),
            new Contact(2L, "abc@gmail.com", "Kulit", 3046L),
            new Contact(3L, "ilu22@gmail.com", "Sujit", 3045L),
            new Contact(4L, "h045@gmail.com", "Sumit", 3047L),
            new Contact(5L, "him45@gmail.com", "Praneet", 3048L)
    );

    @Override
    public List<Contact> getContact(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
