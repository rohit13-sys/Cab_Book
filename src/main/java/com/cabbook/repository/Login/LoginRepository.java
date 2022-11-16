package com.cabbook.repository.Login;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabbook.model.Login.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{

	Login findByEmailAndPassword(String email, String password);

}
