package colectionDataStructure;

public class Array {

		public static void main(String[] args) {
			//soutArray of Strings 
			String cars []= {"golf","audi A4","elentra","sonata"};//Array is static(can't change length) 
			System.out.println("element at index 0 is: "+cars[0]);//print element at first index
			System.out.println("Array lenght is: "+cars.length);
			//
			for(int i=0; i<cars.length; i++) {
				System.out.println( cars[i]);// we use for loop print all elements in array
			}
			
			// Array of integers
			int numb [] = {3,4,5,7};
			System.out.println("element at index 2 (3rd number)is: "+numb[2]);
			for(int i : numb) {
				System.out.print(i+" ");// print all elements in same line with space in between 
				
			}
			
			  
		}

}
