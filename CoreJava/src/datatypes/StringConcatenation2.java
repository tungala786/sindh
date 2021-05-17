package datatypes;

public class StringConcatenation2 {

	public static void main(String[] args) {
		String s1="Sachin";
	
		System.out.println(10+10);  //prints 20
		
		System.out.println("10"+"10");  //prints 1010
		
		System.out.println(s1+10);       //prints Sachin10
		System.out.println(10+s1);       //prints 10Sachin
		
		System.out.println(10+10+s1);    //prints 20Sachin
		
		System.out.println(s1+10+10);   //prints Sachin1010
		
	}
}
