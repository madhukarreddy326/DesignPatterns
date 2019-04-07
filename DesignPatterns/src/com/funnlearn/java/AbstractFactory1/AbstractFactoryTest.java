package com.funnlearn.java.AbstractFactory1;

public class AbstractFactoryTest {

	public static void main(String args[])
	{
		testAbstractFactory();
	}
	private static void testAbstractFactory()
	{
		
		Computer PC = ComputerFactory.getComputer(new PCFactory("2 GB","1 TB","dual core"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","i 5"));
		System.out.println("Pc related computer values are::"+PC);
		System.out.println("Server related computer values are::"+server);
	}
	
}
