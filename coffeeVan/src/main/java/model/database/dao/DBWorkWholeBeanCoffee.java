package model.database.dao;

import model.Coffee;
import model.entity.WholeBeanCoffee;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBWorkWholeBeanCoffee extends DBWork {

	@Override
	public void insert(Coffee coffee) {
		try( PreparedStatement statement = connection.prepareStatement("" +
				"insert into coffee" +
				"(type,price,weight,beanType) " +
				"values (?,?,?,?)");
		){
			statement.setString(1,coffee.getType());
			statement.setLong(2, coffee.getPrice());
			statement.setLong(3, coffee.getWeight());
			statement.setString(4,((WholeBeanCoffee)coffee).getBeanType());

			statement.executeUpdate();

		} catch ( SQLException e ) {
			e.printStackTrace();
		}

	}
}
