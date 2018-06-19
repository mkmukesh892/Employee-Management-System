package com.fico.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.fico.ems.dao.UserDao;
import com.fico.ems.model.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public User findUserByEmail(String email) {
		return userDao.findByEmail(email);
	}

	

	@Override
	public void saveUser(User user) {
		//user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userDao.save(user);
	}



	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}



	@Override
	public void deleteUser(User user) {
		userDao.delete(user);
		
	}

}
