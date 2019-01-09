package com.mindtree.projEmployee.dao;

import com.mindtree.projEmployee.entity.Login;

public interface LoginDao {
	void create(Login login);

	Login read(String userName);
}
