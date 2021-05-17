package exceptions;
public class Throw {
    void vote(int age) {
    	if(age<18) {
    		throw new ArithmeticException();
    	}else {
    		System.out.println("Welcome to vote!");
    	}
    }
	public static void main(String[] args) {
		Throw t = new Throw();
		try {
		t.vote(16);
		}catch(ArithmeticException e) {
			System.out.println("invalid voting age!");
		}
        System.out.println("Voting is democracy!");
	}

}
