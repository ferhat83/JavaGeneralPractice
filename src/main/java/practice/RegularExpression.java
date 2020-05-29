package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		
		
		// Get the regex to be checked 
        String regex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$"; 
  
        // Create a pattern from regex 
        Pattern pattern   = Pattern.compile(regex); 
  
        // Get the String to be matched 
        String email = "elghul@hotmail.net";
  
        // Create a matcher for the input String 
        Matcher matcher  = pattern.matcher(email); 
  
        // Get the Pattern using pattern() method 
        System.out.println("Pattern: "+ matcher.pattern()); 
        System.out.println(matcher.find());

	}
}
