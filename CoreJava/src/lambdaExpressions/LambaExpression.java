package lambdaExpressions;
interface Draw{  
    public void draw();  
}  
public class LambaExpression {

	public static void main(String[] args) {
		int width=10;  
		  
        //without lambda, Drawable implementation using anonymous class  
        Draw d=new Draw(){  
            public void draw(){
            	System.out.println("Drawing "+width);
            	}  
        };  
        d.draw();  

	}

}
