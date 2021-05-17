package exceptions;

public class TryFinally {

	public static void main(String[] args) {
		int i=10;
		//System.exit(0);
		try {
			
			System.out.println(i/0);
			
		}finally {
			System.exit(0);
			System.out.println("Executing the finally block!");
			System.out.println("Hello");
	          System.out.println("World");

		}
        System.out.println("After the finally block!");  
	}

}
