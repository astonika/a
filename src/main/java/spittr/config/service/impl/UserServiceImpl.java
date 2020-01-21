package spittr.config.service.impl;

import java.util.List;

import spittr.config.User;
import spittr.config.dao.LoginLogDao;
import spittr.config.dao.UserDao;
import spittr.config.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	private LoginLogDao loginLogDao;
	
	public void register(User user) {

	}

	public void update(User user) {

	}

	public User getUserByUserName(String userName) {
		return null;

	}

	public User getUserById(int userId) {

		return null;
	}

	public void lockUser(String userName) {

	}

	public void unLockUser(String userName) {

	}

	public List<User> queryUserByUserName(String userName) {
		return null;
	}

	public List<User> getAllUsers() {
		return null;
	}

	public void loginSuccess(User user) {

	}

}
