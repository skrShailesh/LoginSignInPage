package com.company.dao;

import com.company.servlet.User;

public interface UserDao {

	boolean isValidUser(String username, String password);

	boolean addUser(User user);

}
