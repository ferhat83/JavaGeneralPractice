package baseJava;

public class LoopEx {
	public static void main(String[] args) {
		     //the output is pyramid
		 int k, l, m;
		 int n = 8;
		
		 for(k=1; k<n; k++) {//outer loop (increments k and go to next loops than print "\n")
		 System.out.println();

					for (l=k; l<n; l++) {// 1st inner loop create space character
						System.out.print(" ");
					}

					for (m=1 ; m<(k*2) ; m++) {// 2nd inner loop print *
						System.out.print("*");

					}
		}
		
	}
}
