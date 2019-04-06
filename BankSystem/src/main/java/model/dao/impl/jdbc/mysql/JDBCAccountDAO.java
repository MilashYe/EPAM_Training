package model.dao.impl.jdbc.mysql;

import model.dao.interfaces.AccountDAO;

import java.sql.Connection;
import java.util.List;

public class JDBCAccountDAO implements AccountDAO {

	private final Connection connection;

	public JDBCAccountDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(AccountDAO entity) {

	}

	@Override
	public AccountDAO readById(long id) {
		return null;
	}

	@Override
	public AccountDAO readByString(String str) {
		return null;
	}

	@Override
	public List<AccountDAO> readAll() {
		return null;
	}

	@Override
	public void update(AccountDAO entity) {

	}

	@Override
	public void delete(AccountDAO entity) {

	}

	@Override
	public void close() {

	}
}
