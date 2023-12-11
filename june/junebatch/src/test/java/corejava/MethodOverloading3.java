package corejava;

public class MethodOverloading3 {
	public static void m1(int i, double d) {
		System.out.println(i+ " " +d);
	}
		public static void m1(String s, String k) {
			System.out.println(s+ " " +k);
	}
      public static void main (String args[])   {
    	  m1(12,2.6789);
    	  m1("ram","krish");
      }
}
