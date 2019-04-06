package model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import model.Coffee;


@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class GroundCoffee extends Coffee {

	private int grindSize;

	public GroundCoffee(long weight, long price, int grindSize) {
		super(weight, price);
		setType("ground coffee");
		setGrindSize(grindSize);
	}

	@Override
	public String toString() {
		return "GroundCoffee{" +
				"weight = " + super.getWeight()+"g " +
				"price = " + super.getPrice()+"c " +
				"grind size = "+getGrindSize()+"}";
	}
}
