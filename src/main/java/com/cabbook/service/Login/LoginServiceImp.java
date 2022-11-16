package com.cabbook.service.Login;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbook.model.Login.Login;
import com.cabbook.repository.Login.LoginRepository;

@Service
@Transactional
public class LoginServiceImp implements LoginService {

	@Autowired
	LoginRepository loginRepository;

	@Override
	public Login loginCheck(String email, String password) {
		Login login = this.loginRepository.findByEmailAndPassword(email, password);
		return login;
	}

}
