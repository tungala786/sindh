package innerClasses;

public class MemberInnerClass {
    private int m=30;  //member data
    class Inner{   //member inner class
    	void printInner() {
    		System.out.println("the value of m is "+m);
    	}
    }
	public static void main(String[] args) {
		MemberInnerClass out = new MemberInnerClass();
		Inner in =  out.new Inner();
		in.printInner();

	}

}
