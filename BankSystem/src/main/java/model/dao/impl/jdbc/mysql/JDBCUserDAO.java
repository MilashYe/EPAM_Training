package model.dao.impl.jdbc.mysql;

import model.dao.interfaces.UserDAO;
import model.entity.ROLE;
import model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCUserDAO implements UserDAO {

	Connection connection ;

	public JDBCUserDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(User entity) {
		try( PreparedStatement statement = connection.prepareStatement(SQLQueries.CREATE_USER) ){
			statement.setString(1, entity.getLogin());
			statement.setString(2,entity.getRole());
			statement.setString(3, entity.getPwdHash());
			statement.setString(4, entity.getName());
			statement.setString(5, entity.getSurname());
			statement.setString(6, entity.getPhone());

			statement.executeUpdate();

		} catch ( SQLException e ) {
			e.printStackTrace();
		}

	}

	@Override
	public User readById(long id) {
		return null;
	}


	@Override
	public User readByString(String login) {
		ArrayList<User> arr = new ArrayList<>();
		ResultSet set;
		try( PreparedStatement statement = connection.prepareStatement(SQLQueries.READ_USER_BY_LOGIN) ){
			statement.setString(1, login);

			set = statement.executeQuery();

			while ( set.next() ) {
				arr.add(createUser(set));
			}

		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		if ( arr.isEmpty() ) {
			return null;
		}
		return arr.get(0);
	}

	private User createUser(ResultSet set) throws SQLException {
		String login = set.getString("login");
		String name= set.getString("name");
		String surname = set.getString("surname");
		String phone = set.getString("phone");
		String pwd= set.getString("pwdhash");
		String role = set.getString("role");
		System.out.println(role);

		User user = new User();

		user.setLogin(login);
		user.setName(name);

		if ( role.equals("admin") ) {
			user.setRole(ROLE.ADMIN);
			System.out.println(user.getRole());

		} else{
			user.setRole(ROLE.USER);
			System.out.println(user.getRole());
		}

		user.setSurname(surname);
		user.setPhone(phone);
		user.setPwdHash(pwd);

		return user;
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
