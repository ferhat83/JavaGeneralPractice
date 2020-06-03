package abstractionAndInterfaceConcepts;

public class TestInterfaceCar {

	public static void main(String[] args) {
		BMWChildOfCarIterface B = new BMWChildOfCarIterface();
		//creating BMWChildOfCarIterfaceobject  with BMWChildOfCarIterface as reference (access all method)
			B.start();
			B.stop();
			B.refuel();
			B.testSafty();
			System.out.println("***********");
			InterfaceCar c = new BMWChildOfCarIterface();// Dynamic Polymorphism  
			//creating BMWChildOfCarIterfaceobject  with InterfaceCar as reference (we can't access BMWChildOfCarIterface methods)
				c.start();
				c.stop();
				c.refuel();
				//c.testSafty();	(error no access to this method)
	}

}
