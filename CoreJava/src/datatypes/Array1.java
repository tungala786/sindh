package datatypes;
public class Array1 {

	public static void main(String[] args) {
		int[] a=new int[3];
        a[0]=12;
        a[1]=23;
        a[2]=34;
        
        System.out.println(a[2]);
        
        System.out.println(a.length);
        
        System.out.println(a.length-1);
        
        System.out.println(a[a.length-1]);
	}
}
