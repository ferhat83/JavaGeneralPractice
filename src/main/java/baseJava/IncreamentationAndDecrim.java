package baseJava;

public class IncreamentationAndDecrim {
	public static void main(String[] args) {
		int a=5;
		System.out.println(a);//=5
		System.out.println(a++);//increase after usage, still =5
		System.out.println(a);//the increase take effect in this line so it's =6
		System.out.println(a);//=6
		System.out.println(a++);//=6
		System.out.println(a);//=7
		System.out.println();
		System.out.println(a);//=7
		System.out.println(a--);//=7
		System.out.println(a);//=6
		System.out.println(a--);//=6
		System.out.println(a);//=5
		System.out.println();
		System.out.println(a);//=5
		System.out.println(++a);// increase before usage //=6
		System.out.println(a);//=6
		System.out.println();
		System.out.println(--a);//=5
	}
}
