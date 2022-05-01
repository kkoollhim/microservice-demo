package com.userservice.service;

import com.userservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //Fake User List

    List<User> list = Arrays.asList(
            new User(3045L, "Himanshu", "9090000"),
            new User(3046L, "Deepanshu", "5253134"),
            new User(3047L, "Priyanshu", "45435345"),
            new User(3048L, "Anshu", "563423423")
    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
