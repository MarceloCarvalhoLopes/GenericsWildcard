package br.com.marcelocarvalho.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Drink> drink = new ArrayList<Drink>();
		drink.add(new Coffee());
		drink.add(new Tea());
		preparingDrinks(drink);

		
		List<Tea> tea =  new ArrayList<Tea>();
		tea.add(new Tea());
		preparingDrinks(tea);
		
		List<Coffee> coffee = new ArrayList<Coffee>();
		coffee.add(new Coffee());
		preparingDrinks(coffee);
		
		
	}
	
	private static void preparingDrinks(List<? extends Drink> drinks) {
		
		for(Drink d: drinks ) {
			d.prepare();
		}
	}

	private static void preparingDrinks2(List<? super Tea> drinks) {
		
		for(Object obj: drinks ) {
			Tea tea = (Tea) obj;
			tea.prepare();
		}
	}

	private static void preparingDrinks3(List<?> drinks) {
		
		for(Object obj: drinks ) {
			Tea tea = (Tea) obj;
			tea.prepare();
		}
	}

	
}
