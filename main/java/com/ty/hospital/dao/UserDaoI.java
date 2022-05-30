package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.User;

public interface UserDaoI {
	boolean saveUser(User user);
	User getUserById(int uid);
	User validateUser(String email,String password);
	boolean removeUser(int uid);
	boolean updateUser(int uid,User user);
	List<User> getAllUser();
}
