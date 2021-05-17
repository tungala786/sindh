package inheritance;
class Employee{
	double sal=10000;
	double hike() {
		return(sal*0.40);
	}
}
public class Programmer extends Employee{
   
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		
		System.out.println("The salary of p is "+ p.sal);
		
		System.out.println("P was given a hike of "+p.hike());
		
		System.out.println("The total salary of p now is " +(p.sal+p.hike()));
        
		Car.welcome();
	}

}
