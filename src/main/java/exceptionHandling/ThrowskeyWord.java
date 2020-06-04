package exceptionHandling;

public class ThrowskeyWord {

	public static void main(String[] args) {
		ThrowskeyWord tr = new ThrowskeyWord();
		 tr.sum();
		 System.out.println("the program continue its execution to here");
	}
	
	public void sum() {
		try{//always need to catch it with try catch block
			div();
		}catch(Exception e) {
			
		}
	}
	//B- Throws keyword (usually used in big program with multiple exception)
	      
	public void div()throws ArithmeticException{
		int x = 9/0; //exception line
		
	  }
}
