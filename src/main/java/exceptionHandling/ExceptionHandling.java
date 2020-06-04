  package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// we have two tips of exception:
		   //1- caught exception: ex: Thread.sleep(2000)=> this will ask you to add  exception
		   //2- uncaught exception:ex:
//		          int i = 9/0; 
//		          System.out.println(i);// this will throw arithmetic exception(execution will stop) and to handle this exception in 3 ways
		
		//A- try catch block:(usually used on small program to handle some exception )
		try {
			int i = 9/0;//this will throw arithmetic exception
		}catch(ArithmeticException e){// we can write (Exception e) to handle all exception not just arithmetic
			e.printStackTrace();// this just to print the exception but it will continue the execution to the next print statement
	        System.out.println(e.getMessage());//will print you the error(divided by zero =>  "/zero")
		}
         System.out.println("the program will continue it's execution because of handling with try catch block");  
	   //B- Throws keyword (usually used in big program with multiple exception)
           // (implementation in throwsKeyword class)
       //C- Throw keyword nb: its different than Throws keyword: used to create your own exception 
           //(implementation in throwKeyword class)
         
         //NB: EVEN WITH Throws and throw keywords we need try catch block to catch the exception 
               // Throws and throw keywords to  handle the exception and try catch to catch it 
	}
	
}
