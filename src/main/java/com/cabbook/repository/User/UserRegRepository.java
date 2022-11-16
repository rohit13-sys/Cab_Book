package com.cabbook.repository.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabbook.model.Login.Login;
import com.cabbook.model.User.User;

public interface UserRegRepository extends JpaRepository<User, Long> {
	
	
	User findByLogin(Login login);
}
