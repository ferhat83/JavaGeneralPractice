package abstractionAndInterfaceConcepts;

public class TestBank {

	public static void main(String[] args) {
		  HDFCBank hb = new HDFCBank();
		  hb.credit();
		  hb.debit();
		  hb.loan();
		  hb.funds();
		  System.out.println("***********");
		   
		  Bank b = new HDFCBank();// Dynamic Polymorphism 
		  //HDFCBank is an object referred to Bank class (because it extends Bank)
		  // but using this object we are not going to have access to funds method (its just HDFCBank method)
		  b.credit();
		  b.debit();
		  b.loan();
		  //b.funds(); (error no access to this method)
		  
	}

}
