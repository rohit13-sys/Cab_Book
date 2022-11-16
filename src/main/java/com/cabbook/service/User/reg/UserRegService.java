package com.cabbook.service.User.reg;

import com.cabbook.model.Login.Login;
import com.cabbook.model.User.User;


public interface UserRegService {

	void saveUser(User user);

	User getUserData(Login login);
}
