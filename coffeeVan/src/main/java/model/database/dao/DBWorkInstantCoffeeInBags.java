package model.database.dao;

import model.Coffee;
import model.entity.InstantCoffeeInBags;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBWorkInstantCoffeeInBags extends DBWork {

	@Override
	public void insert(Coffee coffee) {
		try( PreparedStatement statement = connection.prepareStatement("" +
				"insert into coffee" +
				"(type,price,weight,taste) " +
				"values (?,?,?,?)");
		){
			statement.setString(1,coffee.getType());
			statement.setLong(2, coffee.getPrice());
			statement.setLong(3, coffee.getWeight());
			statement.setString(4,((InstantCoffeeInBags)coffee).getTaste());

			statement.executeUpdate();

		} catch ( SQLException e ) {
			e.printStackTrace();
		}

	}

}
