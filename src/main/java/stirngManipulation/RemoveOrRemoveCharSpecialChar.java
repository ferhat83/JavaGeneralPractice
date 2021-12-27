package stirngManipulation;

public class RemoveOrRemoveCharSpecialChar {

	public static void main(String[] args) {
		String ilina = "!I*l%i&n*a_S(aa)d$i";
		
		// approach1 using using replace all on string method and reg expression
		// in following reg ex [^a-zA-Z0-9]: (^) => used as anything different from a to z and A to Z and 0 to 9 
		String str = ilina.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String value without special char is: "+str);
		
		// remove single space on a text using reg ex
		String str2 = " Il in a ";
		String st = str2.replaceAll("\\s", "");
		System.out.println("string value without single spaces: "+ st);
	}

}
