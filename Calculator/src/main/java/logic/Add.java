package logic;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;


public class Add extends Function {


	public Add(Double a, Double b) {
		super(a, b);
	}



	@Override
	public Double calculate() {

		return getA().doubleValue()+getB().doubleValue();
	}
}
