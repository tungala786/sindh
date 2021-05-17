package modifiers;
class Hell{
	 int h=50;
	 void print() {
		System.out.println(h*2);
	}
}
public class MyClass2 {

	public static void main(String[] args) {
		MyClass1 obj = new MyClass1();
        //System.out.println(obj.p);
        //obj.print();
		Hell h=new Hell();   //class
		System.out.println(h.h);  //variable
		h.print();   //method
		
		Print ob = new Print();
		System.out.println(ob.p);
		ob.print();
  }
}
