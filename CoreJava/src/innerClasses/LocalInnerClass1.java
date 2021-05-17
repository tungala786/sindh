package innerClasses;

public class LocalInnerClass1 {
	private int data=30;//instance variable  
	 void display(){  
	  class Local{  
	   void msg(){
		   System.out.println(data);
		   }  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	public static void main(String[] args) {
		LocalInnerClass1 obj = new LocalInnerClass1();
        obj.display();
	}

}
