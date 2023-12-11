package corejava;

public class Method_Overloading {
	public static void m1(int a, long h) {
        System.out.println(a+" "+h);
	}

	public static void m1(String s, String b) {
		System.out.println(s+" "+b);
	}

	public static void m1(long k) {
		System.out.println(k);
	}

	public static void main(String[] args) {
	m1(1,3);
	m1("vam","ram");
	m1(123344);
	}
}
