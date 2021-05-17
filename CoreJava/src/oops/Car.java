package oops;

public class Car {
	
   private int year;       //attributes
   private String model;
   private double price;
                   //methods
   public static void start() {
	   System.out.println("Car started");
   }
   void run() {
	   System.out.println("Car is running");
   }
   void stop() {
	   System.out.println("Car stopped");
   }
   void print() {
	   System.out.println(year+" "+model+" "+price);
   }
	public static void main(String[] args) {
		Car maruti=new Car();
		maruti.year=1985;
		maruti.model="800 classic";
		maruti.price=50000;
		
		//System.out.println(maruti.year+" "+maruti.model+" "+maruti.price);
		maruti.print();
		maruti.start();
		maruti.run();
		maruti.stop();

	}

}
