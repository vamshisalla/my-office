package corejava;

public class Increment_Operator {
public static void main (String[] args) {
  int a = 4, b, c;
  a = a++;
  b = a++ + a++;
  c = b++;

   System.out.println(c);

}
}