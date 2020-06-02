package colectionDataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkeListPractice {
	public static void main(String[] args) {
	    
		LinkedList<String> linky = new LinkedList<String>();
	    linky.add("ferhat");
	    linky.add("nacer");
	    linky.add("youcef");
	    linky.add("miro");
	    
	    System.out.println(linky);
		System.out.println(linky.getFirst());
		System.out.println(linky.getLast());
	    
	    //add first and last
		linky.addFirst("messi");
		linky.addLast("ronaldo");
		System.out.println("****after adding the 2 values : ");
		System.out.println(linky);
		System.out.println(linky.getFirst());
		System.out.println(linky.getLast());
		System.out.println("**********");
		
	    for(String elements : linky) {
	    	if(elements.equalsIgnoreCase("nacer")) {
	    		System.out.println(elements);
	    	}
	    }
		System.out.println("************");	
			
	    ListIterator<String> it = linky.listIterator();
	    if(it.hasNext()) {//check if linky has 1st element
	    	it.next();//pass that first element(to second position)
	    	it.add("eto");//add element on second position
	  // you can't call remove method after add method, we use it after next or previous method
	    }
	    for(String item1 : linky) {
	        System.out.println(item1+" ");
	    }
	    System.out.println("***********");
	    
	// LinkedList  vs ArrayList 
	   // ArrayList follows the concept of Dynamic-Array:
	          //when you add or delete element it will affect the others(index) so takes time
	          // but for fetch data ArrayList is faster 
	   // LinkedList follows the concept of Double-LinkList:
	    	  // Helpful to add or remove element from the   of data structure 
	          //when you add or delete element it will not affect the others(index) less time 
			  //slower for fetch data
	}
}
