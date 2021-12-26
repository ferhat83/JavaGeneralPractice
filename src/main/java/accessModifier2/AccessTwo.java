package accessModifier2;

import accessModifiers.AccessResources;

public class AccessTwo extends AccessResources {
   public static void main(String[] args) {
	   // following is to show that we can access a protected variable from same package:
		System.out.println("test is protected in AccessResources, it's in different follder we need to extend the class and mark as static or use object : "+test);
	   // acces by using object of the sub class (AccessTwo is a sub class of AccessResources )
		AccessTwo ac= new AccessTwo();
		System.out.println("test is protected in AccessResources, it's in different follder we need to extend the class and mark as static or use object : "+ac.test2);
		// access methods
		ac.testPublic();
		ac.testProtected();
   }
}
