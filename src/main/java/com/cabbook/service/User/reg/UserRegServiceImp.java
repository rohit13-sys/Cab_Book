package com.cabbook.service.User.reg;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbook.model.Login.Login;
import com.cabbook.model.User.User;
import com.cabbook.repository.User.UserRegRepository;


@Service
@Transactional
public class UserRegServiceImp implements UserRegService{

	@Autowired
	private UserRegRepository userRegRepository;
	
	@Override
	public void saveUser(User user) {
		this.userRegRepository.save(user);
	}

	@Override
	public User getUserData(Login login) {
		System.out.println(login);
		User userData=this.userRegRepository.findByLogin(login);
		return userData;
	}

	

	

}
