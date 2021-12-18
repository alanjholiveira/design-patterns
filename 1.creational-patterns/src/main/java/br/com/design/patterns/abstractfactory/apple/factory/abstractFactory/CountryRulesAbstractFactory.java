package br.com.design.patterns.abstractfactory.apple.factory.abstractFactory;

import br.com.design.patterns.abstractfactory.apple.model.certificate.Certificate;
import br.com.design.patterns.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
