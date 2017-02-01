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
		int currentSpeed = this.getCurrentSpeed();
		currentSpeed -= 10;
		this.setCurrentSpeed(currentSpeed);
		return "Truck has pressed the brake. CurrentSpeed = " + this.getCurrentSpeed();
	}
	
	@Override
	public String pressAccelerator(int speed) {
		super.pressAccelerator(speed);
		return "I am Truck. I pressed Accelerator. CurrentSpeed = " + this.getCurrentSpeed();
	}

	@Override
	public String turnSteering() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
