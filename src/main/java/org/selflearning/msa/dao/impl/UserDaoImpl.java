package org.selflearning.msa.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.selflearning.msa.dao.UserDao;
import org.selflearning.msa.dto.UserDTO;
import org.selflearning.msa.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
	
	static List<User> users = null;
	
	static {
		users = new ArrayList<>();
		users.add(new User("1", "Alpha", new Integer(23), "alpha@gmail.com"));
		users.add(new User("2", "Beeta", new Integer(25), "beeta@yahoo.com"));
	}

	public UserDTO getUserById(String userId) {
		Optional<User> optionalUser = users.stream().filter(p -> p.getUserId().equals(userId)).findFirst();
		UserDTO userDto = null;
		if (optionalUser.isPresent()) {
			User user = optionalUser.get();
			userDto = new UserDTO();
			userDto.setName(user.getName());
			userDto.setAge(user.getAge());
			userDto.setEmail(user.getEmail());
		}
		return userDto;
	}
}
