package constructors;
public class Student {
    int rollno;
    String name;
    String city;
    Student(){  //default constructor
    	
    }
    Student(int r,String n){  //parameterized constructor
    	rollno=r;
    	name=n;
    	//System.out.println(rollno+" "+name);
    	//return (rollno+" "+name);
    }
    Student(int r,String n,String c){  //overloaded constructor
    	rollno=r;
    	name=n;
    	city=c;
    }
    void print() {
    	System.out.println(rollno+" "+name+" "+city);
    }
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(1111,"Sindu");
		Student s3=new Student(2222,"Mahesh","Hyderabad");
		//Student s4=new Student(4444);
		
		s1.print();
		s2.print();
		s3.print();

	}

}
