package innerClasses;

public class LocalInnerClass2 {
	void display() {
    	class Inner{
    		int x=25;
    		void print() {
    			System.out.println("My age is "+x);
    		}
    	}
    	Inner ob = new Inner();
    	ob.print();
    }
	public static void main(String[] args) {
		LocalInnerClass2 obj =new LocalInnerClass2();
		obj.display();

	}

}
