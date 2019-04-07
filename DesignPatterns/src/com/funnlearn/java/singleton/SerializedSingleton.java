package com.funnlearn.java.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable

{
	private static final long serialVerionUID = -7604766932017737115L;
	
	private SerializedSingleton()
	{
		
	}
	private static class InstanceHelper
	{
		private static final SerializedSingleton instance = new SerializedSingleton();
	}
	public static SerializedSingleton getInstance()
	{
		return InstanceHelper.instance;
	}
	
	protected Object readResolve()
	{
		return getInstance();
	}
	
	
	
}