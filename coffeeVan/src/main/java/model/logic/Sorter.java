package model.logic;

import model.Coffee;
import model.entity.CoffeeVan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Sorter {

	public static ArrayList<Coffee> sortByParam(ArrayList<Coffee> arrayList, String sortParam) {

		if ( sortParam.equals("price") ) {
			arrayList = Sorter.sortByPrice(arrayList);
		}
		if ( sortParam.equals("weight") ) {
			arrayList = Sorter.sortByWeight(arrayList);
		}
		if ( sortParam.equals("priceThenWeight") ) {
			arrayList = Sorter.sortPriceWeight(arrayList);
		}
		return arrayList;
	}
	public static ArrayList<Coffee> sortByPrice(ArrayList<Coffee> arrayList) {
		Comparator<Coffee> comparator = (o1, o2) -> {
			Long price1 = o1.getPrice();
			Long price2 = o2.getPrice();

			return price1.compareTo(price2);
		};

		Collections.sort(arrayList, comparator);
		return arrayList;

	}

	public static ArrayList<Coffee> sortByWeight(ArrayList<Coffee> arrayList) {
		Comparator<Coffee> comparator = (o1, o2) -> {
			Long weight1 = o1.getWeight();
			Long weight2 = o2.getWeight();

			return weight1.compareTo(weight2);
		};

		Collections.sort(arrayList, comparator);
		return arrayList;

	}

	public static ArrayList<Coffee> sortPriceWeight(ArrayList<Coffee> coffee) {

		class PriceComparator implements Comparator<Coffee>{

			@Override
			public int compare(Coffee o1, Coffee o2) {
				Long price1 = o1.getPrice();
				Long price2 = o2.getPrice();

				return price1.compareTo(price2);
			}

		}

		class WeightComparator implements Comparator<Coffee>{

			@Override
			public int compare(Coffee o1, Coffee o2) {
				Long weight1 = o1.getWeight();
				Long weight2 = o2.getWeight();

				return weight1.compareTo(weight2);
			}
		}
		Comparator comparator = new PriceComparator().thenComparing(new WeightComparator());

		Collections.sort(coffee, comparator);
		return coffee;


	}

	public static ArrayList<Coffee> getInRange(String min, String max , ArrayList<Coffee> array) {

		Iterator iterator = array.iterator();

		while (iterator.hasNext()) {
			Coffee c = (Coffee) iterator.next();
			if (c.getPrice() > Long.parseLong(max) ||
					c.getPrice() < Long.parseLong(min)) {
				iterator.remove();
			}
		}
		CoffeeVan.getInstance().setCoffeeList(array);

		return CoffeeVan.getInstance().getCoffeeList();
	}
}
