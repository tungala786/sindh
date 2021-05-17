package modifiers;

public class MyClass1 {
    private int p=10;
    private void print() {
    	System.out.println(p*2);
    }
	public static void main(String[] args) {
		MyClass1 ob = new MyClass1();
		System.out.println(ob.p);
		ob.print();

	}

}
