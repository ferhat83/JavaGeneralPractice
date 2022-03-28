package stirngManipulation;

public class OccurenceOfCharInString {
	public static void main (String[] args) {
		String st = "hello all, how is it going today?";
		char [] chars = st.toCharArray();
		int count = 0;
		for(int i=0; i<chars.length; i++) {
			if(chars[i]=='o') {//choose char you want count
				count ++;
			}					
		 }
		System.out.println("choosen char is reppeted : "+count);	
		}
	

}
