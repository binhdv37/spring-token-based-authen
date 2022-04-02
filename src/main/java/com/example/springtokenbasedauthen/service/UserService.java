package com.example.springtokenbasedauthen.service;

import com.example.springtokenbasedauthen.entity.Role;
import com.example.springtokenbasedauthen.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();

}
