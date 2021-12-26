package accessModifiers;

public class AccessResources {
	// access modifiers we have 4: default, public, private, protect
	// default & public => make variable accessible from different class trough objects. same as public (No need to add it in front of a variable de make it default )
	// private: NO access from different class (can't access at all)
	// protected: can't access from different folder using just object (we should use sub class (extends) & object(or just extend & static))
	int hours = 3;
	public int minutes= 100;
	private int hours2 = 1000;
	protected  String test2 = "hello all FRIENDS ";
	protected static String test = "hello all";
    
	public String testPublic() {
		String tests="test public method";
    System.out.println(tests);
	return tests;
    }
	private String testPrivate() {
		String tests="test private method";
    System.out.println(tests);
	return tests;
    }
	protected String testProtected() {
		String tests="test protected method";
    System.out.println(tests);
	return tests;
    }
}
