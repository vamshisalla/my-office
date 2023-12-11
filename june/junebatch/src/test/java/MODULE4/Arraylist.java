package MODULE4;

import java.util.ArrayList;

public class Arraylist {   //COLLECTIONS
	public static void main(String[] args) {
		ArrayList<String> cl = new ArrayList<String>();
		cl.add("vamshi");
		cl.add("ram");
		cl.add("white");
		System.out.println(cl);  /// can print all values
	    System.out.println(cl.get(1)); /// to get particular values use index values
		System.out.println(cl.get(1).trim());
		System.out.println(cl.size());
	}

}
