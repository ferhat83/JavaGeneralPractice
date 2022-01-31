package stirngManipulation;

public class Palindrom {
     //palindrom is a word that sounds the same from right to left and left to right
	public static boolean flag;
	
	public static void main(String[] args) {
		
		String str_Even = "moom";
		String str_Odd = "dad";
		String str3 ="lol";
		String str4 ="losl";
		System.out.println(" check if the given Even word is palindron: "+isPalindrom(str_Even));
		System.out.println(" check if the given Even word is palindron: "+isPalindrom(str_Even));
		System.out.println(" check if the given Even word is palindron: "+isPalindrom2(str3));
		System.out.println(" check if the given Even word is palindron: "+isPalindrom2(str4));
	}
	public static boolean isPalindrom(String word) {
		 flag = true;
		word = word.toLowerCase();
		for(int i=0; i<(word.length()-1)/2; i++) {
			if(word.charAt(i)!=word.charAt((word.length()-1)-i))
				flag = false;
				break;			
		}
		return flag;
	}
	public static boolean isPalindrom2(String word) {
		flag = true;
		word = word.toLowerCase();
		StringBuffer str = new StringBuffer(word);
		StringBuffer reversedWord = str.reverse();		
		if(reversedWord.toString().equals(word)) {
			flag = true;
		}else {
			flag = false;
		}
		
		
		return flag;
		
	}

}
