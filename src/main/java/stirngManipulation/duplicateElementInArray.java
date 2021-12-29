package stirngManipulation;

public class duplicateElementInArray {

	public static void main(String[] args) {
		int [] test = {1,2,3,3,5,6,9,9,10};
		for(int i=0; i<test.length-1; i++ ) {
			for(int j=i+1; j<test.length; j++) {
				if(test[i]==test[j]) {
					
					System.out.println("repeted value is: "+test[j]);
				}
				
			}
			
		}
        String [] test2 = {"VW", "VOLVO", "HONDA", "VW", "FORD", "TESLA"};
        for(int i=0; i<test2.length-1; i++ ) {
			for(int j=i+1; j<test2.length; j++) {
				if(test2[i]==test2[j]) {
					
					System.out.println("repeted brand is: "+test2[j]);
				}
				
			}
			
		}
	}

}
