package statics;

public class Player {
    String name;
    static int playerCount=0;
    Player(String name){
    	this.name=name;
    	System.out.println("The player "+name+" added to the team!");
    	playerCount++;
    }
	public static void main(String[] args) {
	 Player one = new Player("UsainBolt");
	 System.out.println("The playerCount is "+playerCount);
	 
	 Player two = new Player("MikeJordan");
	 System.out.println("The playerCount is "+playerCount);
	}

}
