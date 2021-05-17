package statics;
public class Student {
    int rollno;
    String name;
    static String college="IIT";
    Student(int rollno,String name){
    	this.rollno=rollno;
    	this.name=name;
      }
    void print() {
    	System.out.println(rollno+" "+name+" "+college);
    }
    static void change() {
    	college="VIT";
    }
    static {
    	System.out.println("Welcome to Freshers!");
    }
	public static void main(String[] args) {
		Student s1=new Student(1111,"Sindhu");
		Student s2=new Student(2222,"Mahesh");
		
		s1.print();
		s2.print();
		
		change();
		System.out.println("****************");
		s1.print();
		s2.print();	
    }
	static {
		System.out.println("Ragging is strictly prohibited!");
	}
}
