package ch03;

public abstract class Car {

	String colour;
	int noOfDoors;
	int gasMileage;
	int currentSpeed;
	int totalMileage;
	static int noOfCars;

	public Car() {
		this("Blue", 0, 0, 0, 0);
	}
	
	public Car(int gasMileage, int currentSpeed, int totalMileage) {
		this("Blue", 5, gasMileage, currentSpeed, totalMileage);
	}

	public Car(String colour, int noOfDoors, int gasMileage, int currentSpeed, int totalMileage) {
		this.colour = colour;
		this.noOfDoors = noOfDoors;
		this.gasMileage = gasMileage;
		this.currentSpeed = currentSpeed;
		this.totalMileage = totalMileage;
		noOfCars++;
	}

	public String pressAccelerator(int speed) {
		return pressAccelerator(speed, 5, 5);
	}
	
	public String pressAccelerator(int speed, int gasConsumed, int totalTravelled) {
		String msg = "Ku takan ni";
		currentSpeed += speed;
		gasMileage -= gasConsumed;
		totalMileage += totalTravelled;
		return msg + " CurrentSpeed = " + currentSpeed;
	}
	
	public String pressBrake() {
		currentSpeed = 0;
		return "I have pressed the brake. CurrentSpeed = " + currentSpeed;
	}
	
	public abstract String turnSteering();
	
	public static int getNoOfCars() {
		return noOfCars;
	}
	
}
