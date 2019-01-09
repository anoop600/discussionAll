package com.mindtree.diccussionMVC.dao.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mindtree.diccussionMVC.dao.ActorDao;
import com.mindtree.diccussionMVC.entity.Actor;
import com.mindtree.diccussionMVC.exception.dao.DaoException;

@Repository
public class ActorDaoImpl implements ActorDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public void AddActor(Actor actor) throws DaoException {
		try {
			hibernateTemplate.save(actor);
		} catch (DataAccessException e) {
			throw new DaoException("Dao layer Add Actor Exception ", e);
		}
	}

	public List<Actor> ShowAllActor() throws DaoException {
		try {
			return hibernateTemplate.loadAll(Actor.class);
		} catch (DataAccessException e) {
			throw new DaoException("Dao layer get all actor exception", e);
		}
	}

}
