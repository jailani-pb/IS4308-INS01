package ch04;

import java.util.TreeSet;

public class RunTreeSet {
	public static void main(String[] args) {
		TreeSet<String> countryList = new TreeSet<String>();
		// Add element into the TreeSet
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		countryList.add("Vietnam");
		countryList.add("Cambodia");
		countryList.add("Vietnam");
		System.out.println("(1) " + countryList);
		// Remove element from TreeSet
		countryList.remove("Cambodia");
		System.out.println("(2) " + countryList);
		// Check if an element exists inside the TreeSet
		System.out.println("Is Brunei exist? " + countryList.contains("Brunei"));
		System.out.println("Is brunei exist? " + countryList.contains("brunei"));
		// Retrieve all elements from TreeSet
		for(String country : countryList) {
			System.out.println("Retrieved: " + country);
		}
	}
}
