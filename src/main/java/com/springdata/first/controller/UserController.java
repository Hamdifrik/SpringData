package com.springdata.first.controller;

import com.springdata.first.model.Dto.UserDto;
import com.springdata.first.model.Entity.User;
import com.springdata.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")

public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-user")
    public UserDto getUser (@RequestParam Integer id){
      return userService.getUser(id);
}


    @PostMapping("/save-user")
    public UserDto save(@RequestBody UserDto user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/delete-user")
    public void delete(@RequestParam Integer id){
        userService.deleteUser(id);
    }

    @GetMapping("/get-all")
    public List<User> getAll(){return this.userService.getAll();}
    }
