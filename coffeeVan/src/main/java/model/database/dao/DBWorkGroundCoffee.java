package model.database.dao;

import model.Coffee;
import model.entity.GroundCoffee;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBWorkGroundCoffee extends DBWork {


	@Override
	public void insert(Coffee coffee) {
		try(PreparedStatement statement = connection.prepareStatement("" +
					"insert into coffee" +
					"(type,price,weight,grindSize) " +
					"values (?,?,?,?)");
		){
			statement.setString(1,coffee.getType());
			statement.setLong(2, coffee.getPrice());
			statement.setLong(3, coffee.getWeight());
			statement.setInt(4,((GroundCoffee)coffee).getGrindSize());

			statement.executeUpdate();

		} catch ( SQLException e ) {
			e.printStackTrace();
		}

	}

}
