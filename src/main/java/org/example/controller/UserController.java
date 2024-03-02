package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entitiy.UserEntity;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    final UserService service;
    @GetMapping("get-all")
    public List<UserEntity> getAllUsers(){
        return service.gerAllUsers();
    }
    @PostMapping("add-user")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteById(id);
    }


}
