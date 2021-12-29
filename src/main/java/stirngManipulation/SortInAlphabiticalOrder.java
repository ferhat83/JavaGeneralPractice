package stirngManipulation;

import java.util.Arrays;

public class SortInAlphabiticalOrder {

	public static void main(String[] args) {
		String str = "ilina the best";
		//remove space char
		String str2 = str.replaceAll("\\s", "");
		System.out.println(str2);
		char arr[] = str2.toCharArray();
		//Approach 1:
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
			//if i > j we need to swap the two char and store the small on in temp
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			
		}
		//print string of array
		System.out.println(new String(arr));
	
		//Approach 2: using sort static method from predefined class Arrays in java libraries 
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr2);
		System.out.println(arr2);
	}
}
