package baseJava;

import java.util.Scanner;

public class ScannerINputFromUser {
public static void main(String[] args) {
		
		
		//Integer example
		System.out.println("please  1st number and click enter ");  // print statement.
		Scanner sc = new Scanner(System.in); //create object named sc. the scanner need to be imported 
		int input1 = sc.nextInt();//read int we going to enter in to console
		System.out.println("please 2nd number and click enter ");
		int input2 = sc.nextInt();//read int we going to enter in to console
		sc.close();  // to close the scanner
		int result = input1 + input2;
		System.out.println("total addistion of the two inputs: " + result);
		
		
//		//String example
//		System.out.println(" please inter your first name : ");
//		Scanner scan = new Scanner(System.in);
//		String input3 = scan.next();
//		System.out.println(" please inter your last name : ");
//		String input4 = scan.next();
//		System.out.println(input3 +" "+ input4);
//		scan.close();
//		

	}
}
