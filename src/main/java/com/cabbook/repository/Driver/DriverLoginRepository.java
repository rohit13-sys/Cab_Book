package com.cabbook.repository.Driver;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabbook.model.Login.Login;

public interface DriverLoginRepository extends JpaRepository<Login, Long> {
	
}
