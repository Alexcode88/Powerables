package com.codingdojo.classes;
import com.codingdojo.interfaces.ACPowerable;

public class Microwave implements ACPowerable {
	private int timer;
	private Boolean status;
	private Boolean isPluggedIn;
	
	public Microwave( int timer, boolean status ) {
		this.timer = timer;
		this.status = status;
		this.isPluggedIn = false;
	}
	
	public void plugIn() {
		this.isPluggedIn = true;
	}
	
	public void unplug() {
		this.isPluggedIn = false;
	}
	
	public Boolean checkPlugIn() {
		return this.isPluggedIn;
	}
	
	public void printMicrowaveInfo() {
		ACPowerable.printInfoOfACPowerable();
		System.out.println( "Timer: " + this.timer );
		System.out.println( "Status: " + this.status );
		System.out.println( "Plugged in: " + this.isPluggedIn );
	}
	
}
