package lambdaExpressions;
interface Addable{  
    int add(int a,int b);  
}  
public class LambaExpression4 {

	public static void main(String[] args) {
		Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));

        //using datatypes
        Addable ad2=(int a,int b)->(a+b);
        System.out.println(ad2.add(11, 22));
        
        //using return statement
        Addable ad3=(int a,int b)->{  
            return (a+b);   
            };  
        System.out.println(ad3.add(100,200));  
	}

}
