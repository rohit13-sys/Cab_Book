package com.cabbook.service.User.login;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbook.model.Login.Login;
import com.cabbook.repository.User.UserLoginRepository;

@Service
@Transactional
public class UserLoginServiceImp implements UserLoginService {

	@Autowired
	private UserLoginRepository userLoginRepository;
	
	@Override
	public void loginUser(Login login) {
		this.userLoginRepository.save(login);
		
	}

	@Override
	public List<Login> loginCheck(String email, String password) {
		System.out.println(">>>>>>>>emailservice");
		System.out.println(email);
		List<Login> login= this.userLoginRepository.findByEmailAndPassword(email,password);
		System.out.println("login>>>>>>>");
		System.out.println(login);
		return login;
	}

	

	

}
