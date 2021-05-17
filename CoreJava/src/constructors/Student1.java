package constructors;
public class Student1 {
    int rollno=1234;
    String name="ravi";
    String city="london";
    Student1(){
    	System.out.println("Default costructor!");
    }
    Student1(int rollno,String name,String city){
    	this();  //calls the default constructor here
    	this.rollno=rollno;
    	this.name=name;
    	this.city=city;
    }
    void print() {
    	System.out.println(rollno+" "+name+" "+city);
    }
	public static void main(String[] args) {
		Student1 s1= new Student1(1111,"mahesh","hyderabad");
		Student1 s2= new Student1(2222,"Harry","Edinburgh");
		
        s1.print();
        s2.print();
	}

}
