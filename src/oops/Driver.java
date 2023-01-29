package oops;

public class Driver {

	public static void main(String[] args) {
		Car honda = new Car();
		Truck ford = new Truck();
		honda.start();
		honda.stop();
		honda.turn();
		honda.setSpeed(100);
		System.out.println(honda.getSpeed());
		honda.decreaseSpeed(50);
		System.out.println(honda.getSpeed());
		honda.increaseSpeed(25);
		System.out.println(honda.getSpeed());
		honda.openTrunk();
		honda.closeTrunk();
		ford.openTailgate();
		ford.closeTailgate();
		
		

	}

}
