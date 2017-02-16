package ch04;

import java.util.HashMap;

public class RunHashMap {

	public static void main(String[] args) {
		HashMap<String, String> capitalList = new HashMap<String, String>();
		//Add elements into HashMap
		capitalList.put("Brunei", "Bandar Seri Begawan");
		capitalList.put("Malaysia", "Kuala Lumpur");
		capitalList.put("Indonesia", "Jakarta");
		capitalList.put("Phillippines", "Manila");
		capitalList.put("Thailand", "Bangkok");
		capitalList.put("Brunei", "Bangar");
		System.out.println("(1) " + capitalList);
		//Remove element from HashMap
		System.out.println("Removed: " + capitalList.remove("Brunei"));
		System.out.println("(2) " + capitalList);
		//Retrieve element from HashMap
		System.out.println("Retrieved: " + capitalList.get("Malaysia"));
		//Retrieve all keys in HashMap
		System.out.println("Keys: " + capitalList.keySet());
		//Retrieve all values in HashMap
		System.out.println("Values: " + capitalList.values());
		
		for(String country : capitalList.keySet()) {
			System.out.println("Retrieved: " + country);
		}
		for(String capital : capitalList.values()) {
			System.out.println("Retrieved: " + capital);
		}
		for(String country : capitalList.keySet()) {
			if(country.equals("Thailand")) {
				System.out.println("Welcome to Thailand");
				break;
			} else {
				System.out.println("Not Thailand. Retrieved: " + country);
			}
			
		}
	}

}
