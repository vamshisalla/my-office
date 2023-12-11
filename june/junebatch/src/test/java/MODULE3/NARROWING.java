package MODULE3;

public class NARROWING {
public static void main(String[] args) {
	double d = 163.45;
	float f =(float) d;
	long l =(long) f;
	int i =(int) l;
	short s = (short)i;
	System.out.println(d);
	System.out.println(f);
	System.out.println(l);
	System.out.println(i);
	System.out.println(s);
}
}
