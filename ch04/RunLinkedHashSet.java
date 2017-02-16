package ch04;

import java.util.LinkedHashSet;

public class RunLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> countryList = new LinkedHashSet<String>();
		// Add element into the LinkedHashSet
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		countryList.add("Vietnam");
		countryList.add("Cambodia");
		countryList.add("Vietnam");
		System.out.println("(1) " + countryList);
		// Remove element from LinkedHashSet
		countryList.remove("Cambodia");
		System.out.println("(2) " + countryList);
		// Check if an element exists inside the LinkedHashSet
		System.out.println("Is Brunei exist? " + countryList.contains("Brunei"));
		System.out.println("Is brunei exist? " + countryList.contains("brunei"));
		// Retrieve all elements from LinkedHashSet
		for(String country : countryList) {
			System.out.println("Retrieved: " + country);
		}
	}

}
