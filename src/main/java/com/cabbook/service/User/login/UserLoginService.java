package com.cabbook.service.User.login;

import java.util.List;

import com.cabbook.model.Login.Login;

public interface UserLoginService {

	void loginUser(Login login);

	List<Login> loginCheck(String email, String password);


}
