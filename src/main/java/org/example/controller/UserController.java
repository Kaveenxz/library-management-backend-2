package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Login;
import org.example.dto.User;
import org.example.entitiy.UserEntity;
import org.example.service.LoginService;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    final UserService service;
    final LoginService loginService;
    @GetMapping("get-all")
    public List<UserEntity> getAllUsers(){
        return service.gerAllUsers();
    }
    @PostMapping("add-user")
    public void addUser(@RequestBody User user){
        loginService.insertLoginData(new Login(user.getEmail(),user.getPassword()));
        service.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteById(id);
    }

    @GetMapping("/find-user-name/{userName}")
    public User findByUserName(@PathVariable String userName){
        return service.findByUserName(userName);
    }

    @GetMapping("/is-exist-user/{userName}")
    public Boolean isExistUser(@PathVariable String userName){
        return service.isExistUser(userName);
    }

}
