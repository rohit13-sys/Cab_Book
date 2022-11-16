package com.cabbook.service.Driver.reg;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbook.model.Driver.Driver;
import com.cabbook.model.Login.Login;
import com.cabbook.repository.Driver.DriverRegRepository;

@Service
@Transactional
public class DriverRegServiceImp implements DriverRegService {

	@Autowired
	DriverRegRepository driverRegRepository;
	
	@Override
	public void saveDriver(Driver driver) {
		this.driverRegRepository.save(driver);
		
	}

	@Override
	public Driver getDriverData(Login login) {
		Driver driver=this.driverRegRepository.findByLogin(login);
		return driver;
	}

}
