package ch03;

public class Truck extends Car {

	String hornSound;
	
	public Truck(String hornSound) {
		super("White", 2, 1000, 0, 200000);
		this.hornSound = hornSound;
	}
	
	public String pressHorn() {
		return "Horn is pressed. " + hornSound;
	}
	
	@Override
	public String pressBrake() {
		currentSpeed -= 10;
		return "Truck has pressed the brake. CurrentSpeed = " + currentSpeed;
	}
	
	@Override
	public String pressAccelerator(int speed) {
		super.pressAccelerator(speed);
		return "I am Truck. I pressed Accelerator. CurrentSpeed = " + currentSpeed;
	}
	
}
