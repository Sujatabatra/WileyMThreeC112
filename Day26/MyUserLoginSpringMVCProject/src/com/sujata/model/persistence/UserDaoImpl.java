package com.sujata.model.persistence;

import org.springframework.stereotype.Repository;

import com.sujata.db.UserDetails;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public String getPassword(String userName) {
		return UserDetails.getUsers().get(userName);
	}

}
