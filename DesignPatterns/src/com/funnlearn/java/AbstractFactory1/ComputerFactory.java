package com.funnlearn.java.AbstractFactory1;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory)
	{
		return factory.createComputer();
	}

}
