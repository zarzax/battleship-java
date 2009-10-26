
public class BattleshipApp {

public static void main(String args[]) {


	EasyReader console = new EasyReader();
	
	System.out.println("#####Battleship Game#####");
	System.out.println("...please pick a board size bigger than 4 x 4...");
	System.out.println();
	System.out.print("length of board: ");
	int length = console.readInt();
	System.out.print("width of board: ");
	int width = console.readInt();
	Battleship game = new Battleship(length, width);
	
	///testing only
	//game.printA();    
	//System.out.println();
   
	

	System.out.println();
	System.out.println("Lets play Battleship!!!!");
	while (game.testWin() < 6){
		System.out.println();
		System.out.print("Length: ");
		int l = console.readInt();		
		System.out.print("Width: ");
		int w = console.readInt();
		System.out.println();
		game.gamePlay(l, w);}
		
	}
	
}
	

