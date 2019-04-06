package model.dao.impl.jdbc.mysql;

import model.dao.DAOFactory;
import model.dao.GenericDAO;
import model.entity.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JDBCUserDAOTest {
	GenericDAO<User> dao = DAOFactory.getInstance().createUserDAO();


	@Test
	public void create() {


	}

	@Test
	public void readById() {
	}

	@Test
	public void readByString() {
		User user = dao.readByString("admin");
		System.out.println(user.toString());
		assertEquals("admin",user.getLogin() );
	}

	@Test
	public void readAll() {
	}

	@Test
	public void update() {
	}

	@Test
	public void delete() {
	}

	@Test
	public void close() {
	}
}