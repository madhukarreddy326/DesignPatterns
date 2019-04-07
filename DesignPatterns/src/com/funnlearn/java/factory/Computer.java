package com.funnlearn.java.factory;

public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	
	@Override
	public String toString() {
		return " [RAM=" + this.getRAM() + ", hd=" + this.getHDD() + ", cpu=" + this.getCPU() + "]";
	}
	
	
	

}
