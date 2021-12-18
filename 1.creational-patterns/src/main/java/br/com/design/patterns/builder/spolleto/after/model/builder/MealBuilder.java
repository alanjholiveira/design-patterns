package br.com.design.patterns.builder.spolleto.after.model.builder;

import java.util.List;

import br.com.design.patterns.builder.spolleto.after.model.Size;

public interface MealBuilder {

	void setSize(Size size);
	void setSauce(List<String> sauces);
	void setToppings(List<String> toppings);
	void setCheese(boolean cheese);
	void setPepper(boolean pepper);
}
