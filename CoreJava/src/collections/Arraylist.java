package collections;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		//ArrayList<String> al = new ArrayList<String>();
		List<String> al =new ArrayList<String>();
		
		//add elements to the arraylist
		al.add("Mahesh");
		al.add("Sindhu");
		al.add("Ravi");
		al.add("Vijay");
		al.add("Mahesh");
		
		//print vijay
		System.out.println(al.get(3));
		System.out.println("******************************");
		
		//iterate the arraylist
		for(String s:al) {
			System.out.println(s);
		}

		
	}

}
