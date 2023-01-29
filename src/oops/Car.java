package oops;

public class Car extends Vehicle {
	
	
	@Override 
	public void setSpeed(int speed) {
		super.speed = speed;
		if (super.speed > 75) {
			super.speed = 75;
		}
	}
//	public int getSpeed() {
//		return this.speed;
//	}
	public void  openTrunk() {
		System.out.println("Opening the trunk");
	}
	
	public void  closeTrunk() {
		System.out.println("Closing the trunk");
	}
	
}
