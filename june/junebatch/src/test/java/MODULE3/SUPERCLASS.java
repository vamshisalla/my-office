package MODULE3;

class A
{
	public A(int i) {
   System.out.println("A class default constructor");  
}
class B extends A
{
	public B()
	{
		super(100);
		System.out.println("B class default constructor");
}
}
public class SUPERCLASS
{
	public void main(String[] args) {
		B b1 = new B();
		b1.A();
	
		
		
	}
}
}


