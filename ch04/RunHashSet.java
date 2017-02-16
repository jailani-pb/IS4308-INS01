package ch04;

import java.util.HashSet;

public class RunHashSet {

	public static void main(String[] args) {
		HashSet<String> countryList = new HashSet<String>();
		// Add element into the HashSet
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		countryList.add("Vietnam");
		countryList.add("Cambodia");
		countryList.add("Vietnam");
		System.out.println("(1) " + countryList);
		// Remove element from HashSet
		countryList.remove("Cambodia");
		System.out.println("(2) " + countryList);
		// Check if an element exists inside the HashSet
		System.out.println("Is Brunei exist? " + countryList.contains("Brunei"));
		System.out.println("Is brunei exist? " + countryList.contains("brunei"));
		// Retrieve all elements from HashSet
		for(String country : countryList) {
			System.out.println("Retrieved: " + country);
		}
	}

}
