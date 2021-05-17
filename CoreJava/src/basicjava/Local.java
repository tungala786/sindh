package basicjava;

public class Local {
    void print() {
    	int x=10;  //local to the print method
    	System.out.println(x*2);
    }
	public static void main(String[] args) {
		Local obj = new Local();
		obj.print();
		
		int x=25;  //local to the main() method
		System.out.println(x);
		
		

	}

}
