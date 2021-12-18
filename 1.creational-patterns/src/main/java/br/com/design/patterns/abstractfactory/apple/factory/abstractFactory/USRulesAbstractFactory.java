package br.com.design.patterns.abstractfactory.apple.factory.abstractFactory;

import br.com.design.patterns.abstractfactory.apple.model.certificate.Certificate;
import br.com.design.patterns.abstractfactory.apple.model.certificate.USCertificate;
import br.com.design.patterns.abstractfactory.apple.model.packing.Packing;
import br.com.design.patterns.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
