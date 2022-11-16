package com.cabbook.repository.Driver;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabbook.model.Driver.Driver;
import com.cabbook.model.Login.Login;

public interface DriverRegRepository extends JpaRepository<Driver,Long>{

	Driver findByLogin(Login login);


}
