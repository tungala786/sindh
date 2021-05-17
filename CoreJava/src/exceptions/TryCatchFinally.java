package exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		int i=10;
		try {
			System.out.println(i/0);
		}catch(ArithmeticException e) {
       	 System.out.println("Cannot divide a number by zero!"); 
         }
		finally {
			System.out.println("Executing the finally block!");
			System.out.println("Hello");
	          System.out.println("World");
          }
        System.out.println("After the finally block!");  

	}

}
