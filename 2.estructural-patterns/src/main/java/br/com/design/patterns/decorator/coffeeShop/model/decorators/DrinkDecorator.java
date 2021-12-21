package br.com.design.patterns.decorator.coffeeShop.model.decorators;

import br.com.design.patterns.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}