package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public abstract class Coffee {

	private String type;
	private long weight;
	private long price;

	public Coffee(long weight, long price){
		setWeight(weight);
		setPrice(price);
	}



}
