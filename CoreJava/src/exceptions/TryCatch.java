package exceptions;

public class TryCatch {

	public static void main(String[] args) {
		int i=10;
		try {
			System.out.println(i/0);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide a number by zero");
		}
          System.out.println("Hello");
          System.out.println("World");
	}

}
