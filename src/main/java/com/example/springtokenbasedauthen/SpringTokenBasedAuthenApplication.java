package com.example.springtokenbasedauthen;

import com.example.springtokenbasedauthen.entity.Role;
import com.example.springtokenbasedauthen.entity.User;
import com.example.springtokenbasedauthen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class SpringTokenBasedAuthenApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringTokenBasedAuthenApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        userService.saveRole(new Role(null, "ROLE_USER"));
//        userService.saveRole(new Role(null, "ROLE_MANAGER"));
//        userService.saveRole(new Role(null, "ROLE_ADMIN"));
//        userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//        userService.saveUser(new User(null, "Bruce Wayne", "bruce", "123qwe", new ArrayList<>()));
//        userService.saveUser(new User(null, "Tony Stark", "tony", "123qwe", new ArrayList<>()));
//        userService.saveUser(new User(null, "Binh dv", "binhdv", "123qwe", new ArrayList<>()));
//
//        userService.addRoleToUser("binhdv", "ROLE_USER");
//        userService.addRoleToUser("binhdv", "ROLE_MANAGER");
//        userService.addRoleToUser("binhdv", "ROLE_ADMIN");
//        userService.addRoleToUser("tony", "ROLE_USER");
//        userService.addRoleToUser("bruce", "ROLE_SUPER_ADMIN");
    }
}
