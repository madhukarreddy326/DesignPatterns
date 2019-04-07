package com.funnlearn.java.AbstractFactory1;

public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getCPU();
	public abstract String getHDD();
	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getCPU()=" + getCPU() + ", getHDD()=" + getHDD() + "]";
	}
	
	
	
	

}
