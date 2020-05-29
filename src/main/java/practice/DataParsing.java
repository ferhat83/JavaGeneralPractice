package practice;

public class DataParsing {

	public static void main(String[] args) {
		//data conversion (parsing data) 
		  //NB: Wrapper classes : Integer , Double ,  Boolean
		

		//1-String to int:(we use: Integer.parseInt)
		System.out.println("********* //1-String to int:(we use: Integer.parseInt)******** ");
		String x ="100";
		System.out.println(x+20);
		int i = Integer.parseInt(x);//convert String x to int i
		System.out.println(i+20);
			//NB: we can't convert a non-pure number(100A) from String to int 
		         //ex: 
			         // String u ="100A"; // it's a pure number(contains a letter A)
					 //int v = Integer.parseInt(u);
			         //System.out.println(v); // this will throw an exception: numberFormatException
		
		//2- String to double:
		System.out.println("********* //2-String to doouble ********");
		String y = "12.22";
		double d = Double.parseDouble(y); // convert String y to double d
		System.out.println(d+10 );
		
		//3- String to boolean:
		System.out.println("********* //3 -String to boolean ******** ");
		String k = "True";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//4- int to String:
		System.out.println("********* //4- int to String (we use String.valueOf)******** ");
		int j = 200;
		System.out.println(j+20);//it will use math logic 
		String s = String.valueOf(j);
		System.out.println(s+20);//it will ignore the math logic because 200 is converted to a String 
		
		
	}

}
