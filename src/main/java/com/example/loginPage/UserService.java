package com.example.loginPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String createUser(User user){
        userRepository.save(user);
        return "User Created Successfully";
    }

    public User getUser(int id){
       User user = userRepository.findById(id).get();
       return user;
    }

    public List<User> getAll(){
        List<User> findAll= userRepository.findAll();
        return findAll;
    }
}
