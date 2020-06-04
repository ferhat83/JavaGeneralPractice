package baseJava;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("please enter your name");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("my name is : "+name);
		switch(name) {
		    case"ferhat":
		    	//code
		    	System.out.println("please enter your id ");
		    	String id = scan.nextLine();
		    	scan.close();
		    	System.out.println("my id is : "+id);
		    	break;// if don't put break it will execute the next code
		    case"ilina":
		    case"ilyas"://we have multiple cases for the next statement
		    	System.out.println("your are allow to access this computer");
		    	break;
		    case"racha":
		    	System.out.println("you are an amazing person");
		    	break;
		    	
		    	
		}

	}

}
