package org.selflearning.msa.dao;

import org.selflearning.msa.dto.UserDTO;

public interface UserDao {

	public UserDTO getUserById(String userId);
}
