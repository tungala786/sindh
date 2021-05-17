package abstraction;
interface Testing{
	public void testing();
	static void welcome() {
		System.out.println("Welcome to Software Testing!");
	}
}
interface Selenium extends Testing{
	public void selenium();
}
abstract class Qaplanet{
	abstract void work();
}
public class Mahesh extends Qaplanet implements Selenium{
	void work() {
		System.out.println("Mahesh works for Qaplanet!");
	}
    public void testing() {
    	System.out.println("Mahesh teaches Testing!");
    }
    public void selenium() {
    	System.out.println("Mahesh teaches Selenium also!");
    }
	public static void main(String[] args) {
		Mahesh m = new Mahesh();
		Testing.welcome();
		m.work();
		m.testing();
        m.selenium();
		/*Testing t = new Mahesh();
		t.testing();*/
		
		
	}

}
