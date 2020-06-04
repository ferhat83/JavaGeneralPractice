package exceptionHandling;

public class ThrowKeyword {
	public static void main(String[] args) {
		//C- Throw keyword nb: its different than Throws keyword: used to create your own exception 
		
		System.out.println("first print statment before the throw Exception");
		try {//always need to catch it with try catch block
			throw new Exception("Ferhat Exception ");
		} catch (Exception e) {
			e.printStackTrace();
		}//now the program will continue to the next print statement
		System.out.println("the programe reached this println because of throw keyword Exception");
	}
	

}
