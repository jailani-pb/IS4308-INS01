package ch04;

import java.util.LinkedList;
import java.util.ListIterator;

public class RunLinkedList {

	public static void main(String[] args) {
		LinkedList<String> countryList = new LinkedList<String>();
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		System.out.println("(1) " + countryList);
		countryList.addFirst("Vietnam");
		System.out.println("(2) " + countryList);
		countryList.removeFirst();
		System.out.println("(3) " + countryList);
		
		//Add ListIterator to LinkedList
		ListIterator<String> countryIterator = countryList.listIterator();
		//Add element using ListIterator
		countryIterator.add("Cambodia");
		System.out.println("(4) " + countryList);
		//Move ListIterator to the left
		System.out.println("--Move ListIterator--");
		System.out.println("Traversed Element: " + countryIterator.previous());
		if(countryIterator.hasPrevious()) {
			System.out.println("Traversed Element: " + countryIterator.previous());
		} else {
			System.out.println("I am at the beginning of the LinkedList");
		}
		//Move ListIterator to the right
		while(countryIterator.hasNext()) {
			System.out.println("Traversed Element: " + countryIterator.next());
		}
		
		//Remove element using ListIterator
		countryIterator.remove();
		System.out.println("(5) " + countryList);
		//Modify element using ListIterator
		if(countryIterator.hasPrevious()) {
			System.out.println("Traversed Element: " + countryIterator.previous());
		} else {
			System.out.println("I am at the beginning of the LinkedList");
		}
		countryIterator.set("Thailand");
		System.out.println("(6) " + countryList);
	}

}
