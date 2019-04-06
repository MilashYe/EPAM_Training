package model.database.dao;

import model.Coffee;
import model.entity.InstantCoffee;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBWorkInstantCoffee extends DBWork {

	@Override
	public void insert(Coffee coffee) {
		try( PreparedStatement statement = connection.prepareStatement("" +
				"insert into coffee" +
				"(type,price,weight,quality) " +
				"values (?,?,?,?)");
		){
			statement.setString(1,coffee.getType());
			statement.setLong(2, coffee.getPrice());
			statement.setLong(3, coffee.getWeight());
			statement.setInt(4,((InstantCoffee)coffee).getQuality());

			statement.executeUpdate();

		} catch ( SQLException e ) {
			e.printStackTrace();
		}

	}

}
