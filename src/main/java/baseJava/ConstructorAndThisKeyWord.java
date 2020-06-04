package baseJava;

public class ConstructorAndThisKeyWord {
	//global variables:
	String name;
	int age;
	String carName;
	int price; 
	String engine;
	
	//NB:we use constructor to initialize class properties (initialize objects of a class)
	
	
	//constructors : we can override a constructor by using different parameters(ex in the next 5 constructors)
	
	public ConstructorAndThisKeyWord() {// default constructor without parameters
		System.out.println("1-default constaructor:");
		//this default constructor is created by java by default even if don't create it at the time we create an instance of a class
	}
	public ConstructorAndThisKeyWord(int i) {
		System.out.println("2-constructor with one parameter:");
		System.out.println(i);
	}
	public ConstructorAndThisKeyWord(int i, int j) {
		System.out.println("3-constructor with two parameters:");
		System.out.println(i+ "  " +j);
	}
	public ConstructorAndThisKeyWord(String name, int age) {// name and age are local variables 
		this.name=name;// give the global variable the value of the local one
		this.age= age;// give the global variable the value of the local one
		System.out.println("4-constructor with two diferent type of variables and using this keyword: ");
		System.out.println(name+" "+age);
	}
	public ConstructorAndThisKeyWord(String carName, int price, String engine) {
		// give the global variable the value of the local one:
		this.carName = carName;
		this.price= price;
		this.engine= engine;
	}
	
	
	

	public static void main(String[] args) {
		ConstructorAndThisKeyWord obj = new ConstructorAndThisKeyWord();
		ConstructorAndThisKeyWord obj1 = new ConstructorAndThisKeyWord(10);
		ConstructorAndThisKeyWord obj2 = new ConstructorAndThisKeyWord(10,20);
		ConstructorAndThisKeyWord obj3 = new ConstructorAndThisKeyWord("tom",25);
		
		//we can also print tom and its age with the next 2 lines
		System.out.println("Name is : "+obj3.name); 
		System.out.println("Age is : "+obj3.age);
		
		//cars exemple:
		
		ConstructorAndThisKeyWord cars1 = new ConstructorAndThisKeyWord("Audi",35000,"Automatic");//OBJECT1
		ConstructorAndThisKeyWord cars2 = new ConstructorAndThisKeyWord("BMW",25000,"Automatic");//OBJECT2
		ConstructorAndThisKeyWord cars3 = new ConstructorAndThisKeyWord("HYNDAI",20000,"MANUAL");//OBJECT3
		System.out.println();
		System.out.println("CARS LIST:");
        System.out.println("FIRST CAR : "+cars1.carName+"  "+cars1.price+"  "+ cars1.engine);
        System.out.println("SECOND CAR : "+cars2.carName+"  "+cars2.price+"  "+ cars2.engine);
        System.out.println("THIRD CAR : "+cars3.carName+"  "+cars3.price+"  "+ cars3.engine);
        //get a specific parameter
        System.out.println("whats is the price of audi car?");
        System.out.println("the perice of audi is : " +cars1.price);
	}

}
