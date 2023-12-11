package MODULE3;
class Megastar {
	public void m1()
	{
		System.out.println("m1 method");
	}
	 class ramcharan extends Megastar {
		public void m2()
		{
			System.out.println("m2 method");
		}
	}
	 class varuntej extends Megastar {
		 public void m3()
		 {
			 System.out.println("m3 method");
		 }
	 }
public class FRUITS {
public  void main(String[] args) {
	Megastar mj = new ramcharan();
	ramcharan rs = (ramcharan) mj;
	rs.m1();
	rs.m2();
}
}
}

