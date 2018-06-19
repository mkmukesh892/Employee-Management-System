package com.fico.ems.service;

import java.util.List;


import com.fico.ems.model.User;

public interface UserService {
public User findUserByEmail(String email);

public void saveUser(User user);
public List<User> getAllUser();
public void deleteUser(User user);
}
