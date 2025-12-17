package com.ashriel.learn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashriel.learn.model.User;
import com.ashriel.learn.repository.UserRepository;
import com.ashriel.learn.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User creatUser(User user) {
   return userRepository.save(user);
  }

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public User updateUserById(Long id, User user) {
     Optional<User> existingUser = userRepository.findById(id);
     if(existingUser.isPresent()){
      User isUser=existingUser.get();//to convert Optional<User> to User
      isUser.setName(user.getName());
      isUser.setEmail(user.getEmail());
      isUser.setPassword(user.getPassword());
      isUser.setRole(user.getRole());
      return userRepository.save(isUser);
     }
     return null;
  }

  @Override
  public void deleteUserById(Long id) {
    userRepository.deleteById(id);
  }
  
}
