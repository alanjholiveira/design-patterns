package br.com.design.patterns.abstractfactory.app.service;

import br.com.design.patterns.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.design.patterns.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.design.patterns.abstractfactory.app.service.services.CarService;
import br.com.design.patterns.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = new EJBAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();
		
		UserService userService = factory.getUserService();
		userService.save("Jhon");
		userService.delete(5);
		
		CarService carService = factory.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");
	}
}
