package model.dao.impl.jdbc.mysql;

import model.dao.interfaces.DepositDAO;
import model.entity.Deposit;

import java.sql.Connection;
import java.util.List;

public class JDBCDepositDAO implements DepositDAO {
	private Connection connection;
	public JDBCDepositDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(Deposit entity) {

	}

	@Override
	public Deposit readById(long id) {
		return null;
	}

	@Override
	public Deposit readByString(String str) {
		return null;
	}

	@Override
	public List<Deposit> readAll() {
		return null;
	}

	@Override
	public void update(Deposit entity) {

	}

	@Override
	public void delete(Deposit entity) {

	}

	@Override
	public void close() {

	}
}
