package abstractionAndInterfaceConcepts;

public class BMWChildOfCarIterface implements InterfaceCar{
	// we use implements key word to implement interfaces
		// it will ask to implement the method existing in InterfaceCar(add implemented method )
		//
	@Override
	public void start() {
		System.out.println("BMW  START");
		
	}

	@Override
	public void stop() {
		System.out.println("BMD STOP");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW REFUEL");
		
	}
	public void testSafty() {
		System.out.println("BMW test safty");
	}
  
}
