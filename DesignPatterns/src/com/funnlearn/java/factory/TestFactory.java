package com.funnlearn.java.factory;

public class TestFactory {
	
	public static void main(String args[])
	{
		Computer pc = ComputerFactory.getComputer("PC", "1 TB", "2 GB", "ducal core");
		Computer server = ComputerFactory.getComputer("Server", "2 TB", "16 GB", "i5");
		System.out.println("pc related configurtion:"+pc);
		System.out.println("Server related configuration::"+server);
	}

}
