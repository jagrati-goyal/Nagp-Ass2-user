package org.selflearning.msa.controller;

import org.selflearning.msa.dto.UserDTO;
import org.selflearning.msa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private static Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/user/{userId}")
	public UserDTO getUser(@PathVariable String userId) {
		LOG.info("Inside user service");
		UserDTO userDto = userService.getuserbyId(userId);
		if (null != userDto) {
			LOG.info("User with user id " + userId + " is present ");
		} else {
			LOG.info("User with user id " + userId + " not found");
		}
		return userDto;
	}

}
