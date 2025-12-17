package com.ashriel.learn.service;

import java.util.List;

import com.ashriel.learn.model.User;

public interface UserService {
  User creatUser(User user);
  List<User> getAllUsers();
  User updateUserById(Long id,User user);
  void deleteUserById(Long id);
  
}
