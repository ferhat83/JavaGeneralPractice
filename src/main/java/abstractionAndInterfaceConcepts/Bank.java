package abstractionAndInterfaceConcepts;

public abstract class Bank {
	
	
	public abstract void loan();// abstract method(abstract key word) no implementation{}(no body)
	
	public void credit() {//non abstract method (no abstract key word) and it have implementation{}
		System.out.println("bank ...Credit");
	}
	public void debit() {//non abstract method (no abstract key word) and it have implementation{}
		System.out.println("bank ..debit");
	}
	
	//NB:
	  //1- abstract class:  // abstract class(abstract key word) have one or more abstract method
							//if it have implemented method we call it partial abstraction
							// we can't create an object of abstract class
							// accept all type of variables 
	  //2- interface:	// only abstract methods
						// no method body
						//we achieve 100% abstraction
						// can't create object of Interfaces
						// Accept only static and final variables

}
