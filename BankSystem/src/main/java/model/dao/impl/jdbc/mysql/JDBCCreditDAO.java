package model.dao.impl.jdbc.mysql;

import model.dao.interfaces.CreditDAO;
import model.entity.Credit;

import java.sql.Connection;
import java.util.List;

public class JDBCCreditDAO implements CreditDAO {

	private Connection connection;

	public JDBCCreditDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(Credit entity) {

	}

	@Override
	public Credit readById(long id) {
		return null;
	}

	@Override
	public List<Credit> readAll() {
		return null;
	}

	@Override
	public void update(Credit entity) {

	}

	@Override
	public void delete(Credit entity) {

	}

	@Override
	public void close() {

	}
}
