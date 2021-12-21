package br.com.design.patterns.bridge.converter.converters;

import br.com.design.patterns.bridge.converter.employees.Employee;

public interface Converter {
	String getEmployeeFormated(Employee emp);
}
