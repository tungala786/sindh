package innerClasses;

public class StaticNestedClass1 {
	static int data=30;
	static class Inner{  
		   static void msg(){
			   System.out.println("data is "+data);
			   }  
		  }  
	public static void main(String[] args) {
		StaticNestedClass1.Inner.msg();

	}

}
