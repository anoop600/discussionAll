package com.mindtree.projEmployee.dao.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mindtree.projEmployee.dao.LoginDao;
import com.mindtree.projEmployee.entity.Login;

@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private HibernateTemplate hibernatetemplate;

	public void create(Login login) {
		hibernatetemplate.save(login);
	}

	public Login read(String userName) {
		return hibernatetemplate.get(Login.class, userName);
	}

}
