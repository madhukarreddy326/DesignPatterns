package com.funnlearn.java.factory;

public class ComputerFactory {
	
	public static Computer getComputer(String type,String hdd,String ram,String cpu)
	{
		if("PC".equalsIgnoreCase(type))
				return new PC(ram,hdd,cpu);
		else if("Server".equalsIgnoreCase(type))
				return new Server(ram,cpu,hdd);
		return null;
	}
	

}
