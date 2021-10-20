package com.codingdojo.interfaces;

public interface ACPowerable {
	// All attribute will be public static final 
	int voltage = 120;
	int frequency = 60;
	
	// Static methods
	static void printInfoOfACPowerable() {
		System.out.println( "Voltage: " + voltage );
		System.out.println( "Frequency: " + frequency );
	}
	
	// Default methods
	default void printType() {
		System.out.println( "Type of device is: ACPowerable" );
	}
	
	// Abstracrt methods
	abstract void plugIn();
	abstract void unplug();
	abstract Boolean checkPlugIn();
}


