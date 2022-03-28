package baseJava;

public class Loops {
	public static void main(String[] args) {
		//for loop structure: for(variableType statingCondition; limitCondition; increase/decreaseCondition ){}
		System.out.println("******** < for loop > *******");
		for(int i=1; i<11; i++) {// increase
			System.out.print(i);
		}//NB:i+=2 for incrementation by 2 
		
		System.out.println();
		
		for(int i=10; i>0; i--) {//decrease
			System.out.print(i);
		}
		System.out.println();
		
		//while loop structure:
		System.out.println("******** < while loop > *******");
		int i=1;//variableType strating Condition;
		while(i<11) {//limitCondition;
			System.out.print(i);
			i++;//increase
		}
		
		System.out.println();
		System.out.println("******** < while loop > *******");
		int j=10;
		while(j>0) {
			System.out.print(j);
			j--;// decreaseCondition
		 }
		System.out.println();
		System.out.println();
		System.out.println("******** < while loop with 2 conditions > *******");
		int a=20;
		int b=3;
		while(a>0 && b<=7 ) {			
			System.out.println("value of a: "+a+", value of b: "+b);
			a--;
			b++;
		}
		System.out.println();
		//for each loop		
		System.out.println("******** < for each loop > *******");
				String tc ="good night team";
				String [] words = tc.split(" ");
				for(String tcwr : words) {
					System.out.println(tcwr);					
				}
			
		}
	   
	
}
