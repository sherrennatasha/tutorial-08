package com.apap.tu08.service;

import com.apap.tu08.model.UserRoleModel;

public interface UserRoleService {
	UserRoleModel addUser(UserRoleModel user);
	public String encrypt(String password);
	UserRoleModel getUser(String name);
	boolean isMatch(String rawPassword, String encodedPassword);
}