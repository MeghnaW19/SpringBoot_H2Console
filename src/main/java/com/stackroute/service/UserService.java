package com.stackroute.service;

import com.stackroute.domain.User;

import java.util.List;

public interface UserService {


    public User saveUser(User user);

    public List<User> getAllUser();
}
