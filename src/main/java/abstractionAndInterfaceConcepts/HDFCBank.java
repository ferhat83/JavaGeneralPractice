package abstractionAndInterfaceConcepts;

public class HDFCBank extends Bank {//it give error because HDFCBank is not abstract class and Bank class is absract
	//so we going to implement the Bank abstract method in here: 

	
	public void loan() {// now its not abstract method(it was implemented or we can say overrided)
		System.out.println("HDFC--loan method");
	}
	public void funds () {
		System.out.println("HDFC --FUNDS");
	}

}
