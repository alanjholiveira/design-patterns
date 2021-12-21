package br.com.design.patterns.mediator.translate.mediator;

import br.com.design.patterns.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}
