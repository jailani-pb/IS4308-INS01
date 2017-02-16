package ch04;

import java.util.ArrayList;

public class RunArrayList {

	public static void main(String[] args) {
		ArrayList<String> countryList = new ArrayList<String>();
		//Add element into ArrayList
		countryList.add("Brunei");
		System.out.println("(1) " + countryList);
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		System.out.println("(2) " + countryList);
		countryList.add(0, "Vietnam");
		System.out.println("(3) " + countryList);
		//Remove element from ArrayList
		countryList.remove(0);
		System.out.println("(4) " + countryList);
		//Modify element in ArrayList
		countryList.set(1, "Cambodia");
		System.out.println("(5) " + countryList);
		//Retrieve element in ArrayList
		System.out.println(countryList.get(0));
	}

}
