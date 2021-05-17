package collections;
import java.util.*;
public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<Integer> ai = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		//iterate the collection using the for loop
		for(int i=0;i<ai.size();i++){
			   System.out.println(ai.get(i));
			}

		//print the arraylist directly
		System.out.println(ai);

	}

}
