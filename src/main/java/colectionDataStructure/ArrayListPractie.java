package colectionDataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractie {

	public static void main(String[] args) {
		
        List<String> stats = new ArrayList<String>();
		
		stats.add("new jersey");
		stats.add("new york");
		stats.add("california");
		stats.add("main");
		stats.add("texas");
		
		for(String statsName : stats) {
			System.out.println(statsName);
		}
		 System.out.println();
         System.out.println("the size of stats ArrayList is :" + stats.size());
         
         //*****************EX2****************
         List<Integer> list1 = new ArrayList<Integer>();//declare ArrayList.
 		//array list let us add object. the array is open to add objects
 	
 		
 		list1.add(11);//add  objects to ArrayList
 		list1.add(20);
 		list1.add(25);
 		list1.add(295);
 		
 		int sum1=0;// variable to stock sum of ArrayList elements
 		
 		// for each loop to read data from array list
 		for(Integer data : list1) {
 			System.out.println(data);// print elements in ArrayList 
 		}
 		// for loop to do sum of array list
 		for(int i =0 ;i<list1.size();i++) {
 			sum1+= list1.get(i);// do sum  
 		}
 		System.out.println("array size is : " +list1.size());// print size 
 		System.out.println("the sum is : "+ sum1);// print sum 
 		
 		//******************EXP3*****************
 		List<Integer> tab = new ArrayList<Integer>();
 		
 		  tab.add(11);//add  objects to ArrayList
 		  tab.add(30);
 		  tab.add(20);
 		  tab.add(234);
 		  
 		  int tabSum = 0;
 		  Iterator it1 = tab.listIterator();//use Iterator it to display elements saved  in the ArrayList.
 		  while(it1.hasNext()) {//use while to go to the next line.
 			  System.out.println(it1.next());//print tab element stocked in it1 
 		    }
 		  for(int i=0; i<tab.size(); i++) {
 			  tabSum+= tab.get(i);// do sum
 			 }
 		  System.out.println("sum of tab is: " + tabSum);// print sum of ArrayList
 		  }
	
	
	
}
