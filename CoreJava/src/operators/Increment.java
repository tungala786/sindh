package operators;

public class Increment {

	public static void main(String[] args) {
		int x=10;
		System.out.println(x++);
		
		System.out.println(x);
		
		System.out.println(++x);  //prints 12
		
		System.out.println(x++ + ++x + x);  
        //                 12     14   14
		System.out.println(x);
	}

}
