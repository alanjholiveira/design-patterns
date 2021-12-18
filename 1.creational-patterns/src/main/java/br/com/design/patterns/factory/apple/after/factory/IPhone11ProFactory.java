package br.com.design.patterns.factory.apple.after.factory;

import br.com.design.patterns.factory.apple.after.model.IPhone;
import br.com.design.patterns.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
