package com.cabbook.service.Driver.reg;

import com.cabbook.model.Driver.Driver;
import com.cabbook.model.Login.Login;

public interface DriverRegService {

	void saveDriver(Driver driver);

	Driver getDriverData(Login login);
}
