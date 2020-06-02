package baseJava;

public class Loops {
	public static void main(String[] args) {
		//for loop structure: for(variableType statingCondition; limitCondition; increase/decreaseCondition ){}
		for(int i=1; i<11; i++) {// increase
			System.out.print(i);
		}//NB:i+=2 for incrementation by 2 
		
		System.out.println();
		
		for(int i=10; i>0; i--) {//decrease
			System.out.print(i);
		}
		System.out.println();
		
		//while loop structure:
		int i=1;//variableType strating Condition;
		while(i<11) {//limitCondition;
			System.out.print(i);
			i++;//increase
		}
		System.out.println();
		
		int j=10;
		while(j>0) {
			System.out.print(j);
			j--;// decreaseCondition
		 }
		}
	   //for each loop
	
	
	
	
}
