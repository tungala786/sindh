package basicjava;
public class Instance {
    int x=10;  //instance variable
    void print() {  //instance method
    	System.out.println(x*2);
    }
	public static void main(String[] args) {
		Instance obj = new Instance();
		System.out.println(obj.x);   //instance variable
		obj.print(); //instance method
	}
}
