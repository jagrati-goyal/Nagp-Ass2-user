package org.selflearning.msa.service.impl;

import org.selflearning.msa.dao.UserDao;
import org.selflearning.msa.dto.UserDTO;
import org.selflearning.msa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	public UserDTO getuserbyId(String userId) {
		return userDao.getUserById(userId);
	}
}
