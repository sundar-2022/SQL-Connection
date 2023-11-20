package com.example.loginPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String createUser(@RequestBody() User user){
        return userService.createUser(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") Integer id){
        return userService.getUser(id);
    }
}
