package modifiers;

public class Print {
    public int p=10;
    public void print() {
    	System.out.println(p*5);
    }
	public static void main(String[] args) {
		Print p = new Print();
		System.out.println(p.p);
		p.print();

		Protected ob =new Protected();
		System.out.println(ob.p);
		ob.print();
	}

}
