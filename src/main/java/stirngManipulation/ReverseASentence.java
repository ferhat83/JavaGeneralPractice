package stirngManipulation;

public class ReverseASentence {
	public static void main(String[] args) {
		System.out.println();
		//reverse st as a all string
		String st1 = "the sky is blue";
		StringBuffer str = new StringBuffer(st1);
		System.out.println("Reversed chars of all sentence is: "+str.reverse());
		
		//reverse a sentence 
		String st = "the sky is blue";
		// write a code to make the following string "blue is sky the"
		String [] test = st.split(" ");
		System.out.println("array lenght is: "+test.length);
		System.out.print("Reverced sentence is: ");
		for(int i=test.length-1; i>=0; i--) {
			System.out.print(test[i]+" ");
			
		}
		
	}

}
