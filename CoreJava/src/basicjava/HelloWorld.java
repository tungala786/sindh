package basicjava;
//import oops.*;
//import oops.Car;
import modifiers.*;
public class HelloWorld extends Protected{
	
public static void main(String[] args) {
		oops.Car maruti=new oops.Car();  //fully qualified classname
		oops.Car.start();   //fully qualified method name
		
		Print o = new Print();
		System.out.println(o.p);
		o.print();
		
		HelloWorld h  = new HelloWorld();
		System.out.println(h.p);
		h.print();
		
		
	}
}
