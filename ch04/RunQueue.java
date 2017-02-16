package ch04;

import java.util.LinkedList;
import java.util.Queue;

public class RunQueue {

	public static void main(String[] args) {
		//Implement Queue data structure
		Queue<String> countryList = new LinkedList<String>();
		//Add elements into the Queue
		countryList.offer("Brunei");
		countryList.offer("Malaysia");
		countryList.offer("Indonesia");
		countryList.offer("Vietnam");
		System.out.println("(1) " + countryList);
		//Remove and Retrieve element from the Queue
		System.out.println("Removed: " + countryList.poll());
		System.out.println("(2) " + countryList);
		//Retrieve element from the Queue
		System.out.println("Retrieved: " + countryList.peek());
		System.out.println("(3) " + countryList);
		//Remove and Retrieve all elements from the Queue
		while(!countryList.isEmpty()) {
			System.out.println("Removed: " + countryList.poll());
		}
		System.out.println("(4) " + countryList);
	}

}
