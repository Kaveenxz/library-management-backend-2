package org.example.service;

import org.example.dto.User;
import org.example.entitiy.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> gerAllUsers();

    void addUser(User user);

    void deleteById(Long id);

    User findByUserName(String userName);

    Boolean isExistUser(String userName);
}
