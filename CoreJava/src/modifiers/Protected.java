package modifiers;

public class Protected {
    protected int p=100;
    protected void print() {
    	System.out.println(p*10);
    }
	public static void main(String[] args) {
		Protected object = new Protected();
		System.out.println(object.p);
		object.print();

	}

}
