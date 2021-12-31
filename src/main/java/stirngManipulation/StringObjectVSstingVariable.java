package stirngManipulation;

public class StringObjectVSstingVariable {

	public static void main(String[] args) {
		// String variables
		String A = "love";
		String B = "love";
		
		// String objects (with stirng method with parameter)
		String C = new String("love");
		String D = new String("love");
		
		if(A==B) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		if(A.equals(B)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		if(A==C) {//this will return false because we are comparing String variable to an object using ==
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		if(A.equals(D)) {//this will return True because we are comparing string variable value to string parameters value of an object
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		if(C==D) {//this will return false because we are comparing two different objects (C vs D) with same parameter 
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		if(C.equals(D)) {//this will return True because we are comparing parameters of two objects
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		
		//NOTE:
		// to compare two string value we always use=> .equals of String method,(to check strings text) 
		// this is to make our code comparing value of string not two objects or string value to an abject
		
	}

}
