package com.example.streamingdemusicas.controller;

import com.example.streamingdemusicas.entities.User;
import com.example.streamingdemusicas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll(){
       return userService.findAll();
    }

    @PostMapping
    public User insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable Long id) { userService.deleteUser(id);}

    @PutMapping(value = "/{id}")
    public User updateUser(@RequestBody User newUser, @PathVariable Long id){return userService.updateUser(newUser, id);}

}
