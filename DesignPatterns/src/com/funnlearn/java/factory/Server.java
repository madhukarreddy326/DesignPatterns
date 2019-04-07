package com.funnlearn.java.factory;

public class Server extends Computer {

	private String ram;
	private String cpu;
	private String hdd;
	
	public Server(String ram,String cpu,String hdd)
	{
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
