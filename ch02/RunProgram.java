package ch02;

public class RunProgram {

	public static void main(String[] args) {
		System.out.println(Car.getNoOfCars());
		Car firstCar = new Car("Blue", 5, 500, 0, 100);
		
		System.out.println("Initial Speed of firstCar");
		System.out.println(firstCar.currentSpeed);
		
		System.out.println("Pressing Accelerator for firstCar");
		System.out.println(firstCar.pressAccelerator(100, 100, 100));
		System.out.println("Current firstCar Speed: " 
				+ firstCar.currentSpeed);
		System.out.println("Pressing Accelerator for firstCar");
		System.out.println(firstCar.pressAccelerator(20));
		System.out.println("Current firstCar Speed: " 
				+ firstCar.currentSpeed);
		
		System.out.println("Pressing Brake for firstCar");
		firstCar.pressBrake();
		System.out.println("Current firstCar Speed: " 
				+ firstCar.currentSpeed);
		System.out.println("Current firstCar Gas Mileage: " 
				+ firstCar.gasMileage);
		System.out.println("Current firstCar Total Mileage: " 
				+ firstCar.totalMileage);
		
		Car secondCar = new Car("White", 5, 200, 0, 10000);
		
		System.out.println("Pressing Accelerator for secondCar");
		System.out.println(secondCar.pressAccelerator(30));
		System.out.println("Current firstCar Speed: " 
				+ firstCar.currentSpeed);
		System.out.println("Current secondCar Speed: " 
				+ secondCar.currentSpeed);
		
		Car thirdCar = new Car();
		
		System.out.println("No of cars");
		System.out.println("noOfCars in firstCar: " 
				+ firstCar.noOfCars);
		System.out.println("noOfCars in secondCar: " 
				+ secondCar.noOfCars);
	}

}
