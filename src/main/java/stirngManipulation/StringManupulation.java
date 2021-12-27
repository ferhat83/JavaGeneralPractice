package stirngManipulation;

public class StringManupulation {
	public static void main(String[] args) {
	
	String str = "hello everyone in this class";
	String str2= "hello everyone in this Class";
	
	  //1- get the length of a string (it will count also space):
	  int totalOfCharacters = str.length();
	  System.out.println(totalOfCharacters);
	  System.out.println("*****************************");
	  //2- Character at specific index:
	  System.out.println(str.charAt(6));// will return character at index 5
	  System.out.println("*****************************");
	  
	  // 3-index of character:
	        // index of first occurrence of a character
	  System.out.println(str.indexOf("e"));// it will return the index of the first e. (first occurrence of "e")
	        // index of second occurrence of a character 
	  System.out.println(str.indexOf("e", 3));// will return index of second "e" but starting from index 5 going up. (second occurrence of "e")
	  System.out.println(str.indexOf("e", str.indexOf("e")+1));// same than the previous method . (second occurrence of "e")
	  System.out.println("*****************************");
	  
	  //4- index of a String:
	  System.out.println(str.indexOf("in"));//it will return index of starting charcter of specific string
	  System.out.println("*****************************");
	  
	  //5- index of a string who doens't in that declared String:
	  System.out.println(str.indexOf("my"));// it will return "-1" it means not available(very useful in selenium).
	  System.out.println("*****************************");
	  
	  //6- String comparison:(java is case sensitive)
	  System.out.println(str.equals(str2));// will return false because there is i capital letter in the second string.
	  System.out.println(str.equalsIgnoreCase(str2));// will return true because we ignore the cases.
	  System.out.println("*****************************");
	  
	  //7- substring(return specific part of the all string)
	  System.out.println(str.substring(6, 14)); // frome index 6 to 14.
	  System.out.println("*****************************");
	  
	  //8-trim(remove before space and after space but not between space)
	  String str3 = "   hi my friend    ";
	  System.out.println(str3.trim());//it will remove spaces before that sentence and those after
	  System.out.println("*****************************");
	  
	  //9-replace character:
	  System.out.println(str3.replace(" ", ""));// replace space character with nothing 
	  //ex: change 01-01-2020 to 01/01/2020
	  String date = "01-01-2020";
	  System.out.println("new date : "+date.replace("-", "/"));
	  System.out.println("*****************************");
	  
	  //10-split
	  String str4 = "hi my friends ";
	  String splitesStr4 [] = str4.split(" ");
	  for(int i=0; i< splitesStr4.length ; i++) {
		  System.out.println(splitesStr4[i]);
	  }
	  System.out.println("*****************************");
	  
	  //11- concatenation
	  String s3 = "cases";
	  System.out.println(s3.concat("s")); // add a character or a string to an existing string 
	  
	    int a = 100;
		int b = 200;
		String x= "hello";
		String y = "World";
		double c = 10.33;
		double d = 12.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		
		
				// the + sign is called concatenation operator
				// the logic is that after a string java will ignore the mathematique logic and will print each value separated
				// but before the string it will apply the math logic than print the string 
		System.out.println("*****************************");
		
		//12- reverse a String:(using for loop or StringBuffer)
		
		
		    //1- using for loop: 
		String str7 = "selenium";
		int len = str7.length();
		String revStr7 ="";
		for(int i=len-1; i>=0; i--) {
			revStr7 = revStr7 + str7.charAt(i);
		}
		System.out.println("the reversed String with foor loop is : "+revStr7);
		
		    //2- using StringBuffer Method:
		String str8 = "selenium";
		StringBuffer strB = new StringBuffer(str8);
		System.out.println("the reversed String with StringBuffer is : "+strB.reverse());
		  //NB: String method is immutable (deosn't have reverse function), StringBuffer has reverse function.
		System.out.println("*****************************");
		
		// 13- swap 2 string  (e will become f and f will become e):
		    // a-without using 3rd variable
		System.out.println("1-swapping using substring (without using 3rd variable):");
		String e = "Hello";
		String f = "World";	
		
		System.out.println("before swapping:");
		System.out.println("value of e is : "+e);
		System.out.println("value of f is : "+f);
			   // 1- append e and f:
			      e = e+f;// we will get HelloWorld
			  
			   // 2- Store initial string e in f:
			      f = e.substring(0,e.length()-f.length());
			   
			   // 3- Store initial string f in e:
			      e=e.substring( f.length());
			  
		System.out.println("after swapping");
		System.out.println("value of e is : "+e);
		System.out.println("value of f is : "+f);
		System.out.println("*****************************");
		    // b- with using 3rd variable:
		System.out.println("2-swapping using 3rd variable :");
		String g = "Hello";
		String k = "World";
		String l = "";
		System.out.println("before swapping");
		System.out.println("value of e is : "+g);
		System.out.println("value of e is : "+k);
		
		l=g;
		g=k;
		k=l;
		System.out.println("after swapping");
		System.out.println("value of e is : "+g);
		System.out.println("value of e is : "+k);
		      
		System.out.println("*****************************");      
		     
		// Exercise:
		String name = "Student First Name";
		// convert the previous String to  "studentFirstName"?
		String newName = name.replace(" ", "");
		System.out.println(newName);
		int lenth = newName.length();
		
		String str9 ="";
		for(int i=1 ; i<lenth; i++) {
			str9 = str9+newName.charAt(i);
			}
		    System.out.println(str9);
	    String str10 ="s";
	    String finalString = str10 + str9;
	    System.out.println("the final String is : " + finalString );
	    
	    
	}
}
