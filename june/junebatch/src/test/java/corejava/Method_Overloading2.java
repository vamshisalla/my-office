package corejava;

public class Method_Overloading2 {
public static void main(String[] args) {
	add(3,4);
	add('c','d');//ASC|| value of character lower case alphabets from 97 to 122(here c=99 & d=100)
	add("java",500); //upper case values were from 65 to 90(A =65,B=66,C=67,D=68,Z=90)K
	add(234,"vamshi");
}
public static void add(int i, int j) {
System.out.println(i + j);	
}	
public static void add(char c1,char c2) {
System.out.println(c1 + c2);	
}
public static void add(String s, int i) {
System.out.println(s + i);	
}
public static void add(int i,String s) {
System.out.println(i + s);	
}
}
