package com.cabbook.repository.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabbook.model.Login.Login;

public interface UserLoginRepository extends JpaRepository<Login, Long>{

	List<Login> findByEmailAndPassword(String email,String password);
	
}
