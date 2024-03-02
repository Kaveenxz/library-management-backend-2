package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entitiy.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ModelMapper mapper;
    @Override
    public List<UserEntity> gerAllUsers() {
        return repository.findAll();
    }

    @Override
    public void addUser(User user) {
        UserEntity entity = mapper.map(user, UserEntity.class);
        repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public User findByUserName(String userName) {
        return mapper.map(repository.findByUserName(userName), User.class);
    }
}
