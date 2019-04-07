package com.funnlearn.java.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {
	public static void main(String args[]) throws FileNotFoundException,IOException,ClassNotFoundException{
			SerializedSingleton 	instanceOne = SerializedSingleton.getInstance();
			ObjectOutput output = new ObjectOutputStream(new FileOutputStream("fileName.ser"));
			output.writeObject(instanceOne);
			output.close();
			
			ObjectInput input = new ObjectInputStream(new FileInputStream("filename.ser"));
			
			SerializedSingleton instanceTwo = (SerializedSingleton)input.readObject();
			input.close();
			
			System.out.println("InstanceOne HashCode value::"+instanceOne.hashCode());
			System.out.println("InstanceTwo HashCode value::"+instanceTwo.hashCode());
			
	}

}
