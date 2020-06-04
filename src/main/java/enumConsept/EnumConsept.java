package enumConsept;


//enum is constant variables ex: months, days, company names etc
//we can declare enum out of class or inside the class but not on methods.

enum MobileCompanies{
	APPLE, SAMSUNG, HTC;//We use column between the variables and semi-column at the end
	// we are allow to create method and variables inside an enum 
}
public class EnumConsept {
//we can also create enum here 
	
	public static void main(String[] args) {//we can't create enum here 
		System.out.println(MobileCompanies.APPLE);

	}

}
