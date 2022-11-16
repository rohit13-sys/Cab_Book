package com.cabbook.service.Login;

import java.util.List;

import com.cabbook.model.Login.Login;

public interface LoginService {

	Login loginCheck(String email, String password);

}
