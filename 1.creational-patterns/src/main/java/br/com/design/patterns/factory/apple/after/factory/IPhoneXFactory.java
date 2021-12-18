package br.com.design.patterns.factory.apple.after.factory;

import br.com.design.patterns.factory.apple.after.model.IPhone;
import br.com.design.patterns.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
