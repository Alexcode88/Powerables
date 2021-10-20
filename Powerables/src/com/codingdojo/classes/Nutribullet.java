package com.codingdojo.classes;
import com.codingdojo.interfaces.ACPowerable;

public class Nutribullet implements ACPowerable {
	private Boolean status;
	private Boolean isPluggedIn;
	private Boolean isClosedAppropriately;
	
	public Nutribullet( Boolean status, Boolean pluggedIn ) {
		this.status = status;
		this.isPluggedIn = false;
		this.isClosedAppropriately = false;
	}
	
	public void plugIn() {
		if( this.isClosedAppropriately ) {
			this.isPluggedIn = true;
		}
	}
	
	public void unplug() {
		if( !this.isClosedAppropriately ) {
			this.isPluggedIn = false;
		}
	}
	
	public Boolean checkPlugIn() {
		if( this.isPluggedIn && this.isClosedAppropriately ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printNutribulletInfo() {
		ACPowerable.printInfoOfACPowerable();
		System.out.println( "Status: " + this.status );
		System.out.println( "Plugged in: " + this.isPluggedIn );
		System.out.println( "Closed appropriately: " + this.isClosedAppropriately );
	}
}
