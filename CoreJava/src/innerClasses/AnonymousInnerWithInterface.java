package innerClasses;
interface Eatable{  
	 void eat();  
	}  
public class AnonymousInnerWithInterface {

	public static void main(String[] args) {
		Eatable e=new Eatable() {
			public void eat() {
				System.out.println("I am eating...");
			}
		};
     e.eat();
	}

}
