package lambdaExpressions;
interface Sayable{  
    public String say();  
}  
public class LambaExpression2 {

	public static void main(String[] args) {
		Sayable s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say()); 
	    
	   

	}

}
