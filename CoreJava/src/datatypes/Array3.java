package datatypes;

public class Array3 {
    
	int[] a=new int[3];  //instance array
	{
       a[0]=12;
       a[1]=23;
       a[2]=34;
	}  
	public static void main(String[] args) {
		Array3 obj=new Array3();
		/*obj.a[0] = 1;
		obj.a[1] = 2;
		obj.a[2] = 3;*/
		
		System.out.println(obj.a[2]);
        System.out.println(obj.a.length); 
	}

}
