package com.mindtree.projEmployee.util;

import com.mindtree.projEmployee.entity.Login;

public interface LoginService {
	void create(Login login);

	Login read(String userName);
}
