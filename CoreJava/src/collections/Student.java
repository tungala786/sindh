package collections;
import java.util.*;
public class Student {
    int rollno;
    String name;
    
    Student(int rollno,String name){
    	this.rollno=rollno;
    	this.name=name;
    }
    public String toString() {
    	return(rollno+" "+name);
    }
	public static void main(String[] args) {
		Student s1 = new Student(1111,"Sindhu");
		Student s2 = new Student(2222,"Mahesh");
		
		//create a collection of Students
		ArrayList<Student> st = new ArrayList<Student>();
		
		//add the students to this collection
		st.add(s1);
		st.add(s2);
		
		//using the iterator interface
		Iterator itr = st.iterator();
		while(itr.hasNext()) {
			//Student s = (Student) itr.next();
			//System.out.println(s.rollno+" "+s.name);
			System.out.println(itr.next());
		}
		
		//System.out.println(s1.rollno+" "+s1.name);
		//System.out.println(s2.rollno+" "+s2.name);

		//System.out.println(s1);
		//System.out.println(s2);
	}

}
