package corejava;

public class Pre_Increment {
public static void main(String[] args) {
	int a = 5,b,c;
	a = ++a;
	b = ++a + ++a;
	 ++b;
	System.out.println(b);
}
}
