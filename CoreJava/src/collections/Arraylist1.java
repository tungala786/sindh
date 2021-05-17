package collections;
import java.util.*;
public class Arraylist1 {

	public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
		
		//add elements to the arraylist
		al.add("Mahesh");
		al.add("Sindhu");
		al.add("Ravi");
		al.add("Vijay");
		al.add("Mahesh");
		
		//using the iterator interface
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//printing the collection directly
		System.out.println("**************************");
		System.out.println(al);
		
		//fetch the size of the arraylist
		System.out.println("The size of the arraylist is :" +al.size());
	}

}
