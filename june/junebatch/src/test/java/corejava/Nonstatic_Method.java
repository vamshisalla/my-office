package corejava;

public class Nonstatic_Method {
public void m1() {
	System.out.println("vamshi");
}
public void m2() {
	System.out.println("ranjith");
}
public static void main(String[] args) {
Nonstatic_Method ram = new Nonstatic_Method();
   ram.m1();
   ram.m2();
}
}
