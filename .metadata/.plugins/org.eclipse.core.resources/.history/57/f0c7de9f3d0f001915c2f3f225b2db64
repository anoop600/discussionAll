package com.mindtree.diccussionMVC.dao.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mindtree.diccussionMVC.dao.GenreDao;
import com.mindtree.diccussionMVC.entity.Genre;
import com.mindtree.diccussionMVC.exception.dao.DaoException;

@Repository
public class GenreDaoImpl implements GenreDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public void addGenre(Genre genre) throws DaoException {
		try {
			hibernateTemplate.save(genre);
		} catch (DataAccessException e) {
			throw new DaoException("Genre cannot be added in DAO ", e);
		}
	}

	public List<Genre> getAllGenre() throws DaoException {
		try {
			return hibernateTemplate.loadAll(Genre.class);
		} catch (DataAccessException e) {
			throw new DaoException("Cannot load all genre in service", e);
		}
	}

}
