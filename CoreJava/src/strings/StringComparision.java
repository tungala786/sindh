package strings;

public class StringComparision {

	public static void main(String[] args) {
		String s1="mahesh";
		String s2="mahesh";
		String s3=new String("mahesh");
		String s4="MAHESH";
		
		//using equals() method
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
        
        //using the == operator
        System.out.println("*************************");
        System.out.println(s1==s2);  
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        
        //using compareTo() method
        System.out.println("*************************");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s4));
        System.out.println(s4.compareTo(s1));
        System.out.println(s1.compareToIgnoreCase(s4));
	}

}
