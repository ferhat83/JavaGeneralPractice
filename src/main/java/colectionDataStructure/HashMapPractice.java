package colectionDataStructure;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		// HashMap is a List with keys and values
		// HashMap deosn't have order
		int a = 10;
		int b = 20;
		int c = 30;
		// we can store those values in HashMap (it contains keys ex:a, and values ex:10)
		HashMap<String, Integer> myValues = new HashMap<String, Integer>();
		//string => keys(ex:a), Integer => value(ex:10)
		
		myValues.put("a", 10);
		myValues.put("b", 20);
		myValues.put("c", 30);
		System.out.println(myValues);// print all values
		System.out.println(myValues.get("b"));// print specific value by giving its key
		
		
		
		// use HashMap with username and password as keys and values
		HashMap <String, String> users = new HashMap<String, String>();
		users.put("user1", "abc12");
		users.put("user2", "abc123");
		users.put("user3", "abc1234");
		System.out.println("***** users before removing element:");
		System.out.println(users);
		
		//remove element by just giving the key
		users.remove("user2");
		System.out.println("**** users after rmove : ");
		System.out.println(users);
		
		
		

	}

}
