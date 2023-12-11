package MODULE3;
class ICIC
{
	public void details() {
	System.out.println("VAMSHI" + "ACC 630125" + "BRANCH HYD");
}
}
class IOB
{
	public void details() {
 System.out.println("VAMSHI" + "ACC 456782" + "BRANCH HYD");
}
}
class Cust extends IOB
{
	
}
public class INHERITANCE {
	public static void main(String[] args) {
		Cust c1 = new Cust();
		c1.details();
	} 
}


