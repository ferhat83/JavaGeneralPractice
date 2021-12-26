package accessModifiers;

public class AccessOne {

	public static void main(String[] args) {
		AccessResources accRess = new AccessResources();
	//following shows access to default and public variables :
		System.out.println("since hours is default in AccessResources we can use them in this class: "+accRess.hours);
		System.out.println("since minutes is default in AccessResources we can use them in this class: "+accRess.minutes);
        // following shows that we can't access private variables (syntax error):
	//System.out.println("since hours is private in AccessResources class we can NOT use them inthis class"+access1.hours2);
        // following is to show that we can access a protected variable from same package:
		System.out.println("since test is protected in AccessResources we can use them in this class(if in same folder): "+accRess.test);
	// methods with acces modifiers:
		accRess.testPublic();
		accRess.testProtected();
		//accRess.testPrivate(); can't access
	}

}
