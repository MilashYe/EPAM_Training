package model.dao.impl.jdbc.mysql;

import model.dao.interfaces.UserDAO;
import model.entity.User;

import java.sql.Connection;
import java.util.List;

public class JDBCUserDAO implements UserDAO {

	Connection connection ;

	public JDBCUserDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(User entity) {

	}

	@Override
	public User readById(long id) {
		return null;
	}

	@Override
	public List<User> readAll() {
		return null;
	}

	@Override
	public void update(User entity) {

	}

	@Override
	public void delete(User entity) {

	}

	@Override
	public void close() {

	}
}
