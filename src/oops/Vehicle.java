package oops;

public class Vehicle {
	public int speed;
	
	public  void start() {
		System.out.println("Starting the car");
	}
	
	public  void stop() {
		System.out.println("Stopping the car");
	}
	
	public  void turn() {
		System.out.println("Turning the car");
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public  void setSpeed(int speed) {
		 this.speed = speed;
		 return ;
	}
	
	public  void increaseSpeed(int increase) {
		 this.speed = this.speed + increase;
		 return ;
	}
	public  void decreaseSpeed(int decrease) {
		 this.speed = this.speed - decrease;
		 return ;
	}
	
}
