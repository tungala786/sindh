package innerClasses;
interface Showable{  
	void show();
	interface Message{  
	   void msg();  
	  }  
	}  
public class NestedInterface1 implements Showable, Showable.Message{
	public void show() {
		System.out.println("showing...");
	}
	public void msg(){
		System.out.println("Hello nested interface");
		}  
	public static void main(String[] args) {
		Showable.Message obj = new NestedInterface1();
		obj.msg();
		Showable s = new NestedInterface1();
		s.show();

	}

}
