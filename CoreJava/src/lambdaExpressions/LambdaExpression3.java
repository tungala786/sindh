package lambdaExpressions;
interface Singer{
	public String sing(String name);
}
public class LambdaExpression3 {

	public static void main(String[] args) {
		// Lambda expression with single parameter.  
        Singer s=(name)->{  
            return "Hello"+name;  
        };  
        System.out.println(s.sing(" Cuckoo"));  

        //without parnathesis
        Singer s1=name->{  
            return "Hello"+name;  
        };
        System.out.println(s1.sing(" Cuckoo")); 
	}

}
