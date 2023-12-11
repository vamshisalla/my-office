package MODULE4;

public class FINALISE {
	public void finalize() {
		System.out.println("vamshi");
	}
		public static void main(String[] args) {
	FINALISE f1 = new FINALISE();    //object creation
	f1 = null;      //  just have to pass null
	System.gc();    // garbage collector
	}

}
