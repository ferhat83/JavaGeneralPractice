package stirngManipulation;

public class ReverseString {

	public static void main(String[] args) {
		String atr = "hello world";
		int lenght = atr.length();
		char[] charr = atr.toCharArray();

		// approach1 using decremented for loop
		System.out.println("I- aAproche 1:");
		System.out.print("reverce of hello world using for loop is: ");
		for (int i = lenght - 1; i >= 0; i--) {
			System.out.print(charr[i]);
		}

		System.out.println();
		// approach2 using StringBuffer
		System.out.println("II- Aproche 2:");
		StringBuffer st = new StringBuffer(atr);
		System.out.print("reverce of hello world using StringBuffer is: " + st.reverse());
		
		System.out.println();
		// approach3 using StringBuilder
		System.out.println("II- Aproche 3:");
		StringBuilder sts = new StringBuilder(atr);
		System.out.print("reverce of hello world using StringBuilder method is: " + sts.reverse());
	}

}
