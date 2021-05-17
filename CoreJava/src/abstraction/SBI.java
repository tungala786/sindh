package abstraction;
abstract class Bank{
	abstract void minBalance();
	static void welcome() {
		System.out.println("Welcome to Banking!");
	}
}
class Axis extends Bank{
	void minBalance() {
		System.out.println("The min balance in Axis is 3000");
	}
}
public class SBI extends Bank{
	void minBalance() {
		System.out.println("The min balance in SBI is 1000");
	}
	public static void main(String[] args) {
		//  Bank b=new Bank();
		  Bank a = new Axis();  //reference object
		  Bank s = new SBI();   //reference object
		  
		  
		  welcome();
		  a.minBalance();
		  s.minBalance();

	}

}
