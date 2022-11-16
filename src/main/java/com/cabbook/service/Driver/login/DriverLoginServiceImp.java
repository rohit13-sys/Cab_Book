package com.cabbook.service.Driver.login;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbook.model.Login.Login;
import com.cabbook.repository.Driver.DriverLoginRepository;

@Service
@Transactional
public class DriverLoginServiceImp implements DriverLoginService {

	@Autowired
	DriverLoginRepository driverLoginRepository;
	
	@Override
	public void loginDriver(Login driverLogin) {
		this.driverLoginRepository.save(driverLogin);
	}

}
