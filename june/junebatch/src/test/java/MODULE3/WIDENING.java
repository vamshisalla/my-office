package MODULE3;

public class WIDENING {
public static void main(String[] args) {
	byte b = 35;
	short s = b;
	int i = s;
	long l = i;
	float f = l;
	double d = f;
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
}
}
