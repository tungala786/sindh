package innerClasses;
class A{
	interface Hello{
		void hello();
	}
}
public class NestedInterface2 implements A.Hello {
    public void hello() {
    	System.out.println("Hello NestedInterface");
    }
	public static void main(String[] args) {
		NestedInterface2 obj = new NestedInterface2();
        obj.hello();
	}

}
