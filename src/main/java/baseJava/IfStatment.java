package baseJava;

public class IfStatment {
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		// Comparison operators:
		     // ">" greater than, "<" less than, "<=" less or equal than, ">=" greator or equal than,
	       	//"==" verify if values are equal ,"!=" not equal to
		
		int c =40; 
		int d =40;
		int e =50;
		
		if (c==d) {
			System.out.println("c is equal to d");
			}else {
				System.out.println("c is not equal to d");
			}
		
		if(c!=e) {
			System.out.println("c is not equal to e");
			
		}
		
		//write a logic to find the greatest value:
		int x= 10;
		int y=40;
		int z=30;
		    // we use nested if statment 
		if(x>y & x>z) {//false & true = false
			System.out.println("x is the greatest value");
		}else if(y>z) {
			System.out.println("y is the greatest value");
		}else {
			System.out.println("z is the greatest value");
		}
		
	}

}

