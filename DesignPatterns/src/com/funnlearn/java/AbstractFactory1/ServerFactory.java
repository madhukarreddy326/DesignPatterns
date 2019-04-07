package com.funnlearn.java.AbstractFactory1;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String cpu;
	private String hdd;
	
	
	
	public ServerFactory(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}



	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(ram,hdd,cpu);
	}

}
