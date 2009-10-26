import java.util.Random;

public class Battleship {

	private int board[][];
	private int count10;
	private int count20;
	private int win;       	//is used to determine if there was a win
	private int score; 		//tracks the score of the game
    private int length;  	//the constraints of the board - 1
    private int width;
	private int lBound;  	//the constraints of the board
	private int wBound;
	

	
	int caseNumber1;		//returned value used for selecting ship one switch statement
	int caseNumber2;		//returned value used for selecting ship two switch statement
    
	static Random generRand = new Random();  //series of random numbers to be used.

	int x1;  		//random point x generated
	int y1;		//random point y generated	
	int x2;  		//random point x generated
	int y2;   	//random point y generated 




	
	public Battleship(int l, int w){
		width = (w - 1);
		length = (l - 1);
		wBound = w;
		lBound = l;
		
		board = new int[l][w];
		


		
		
		////.......This is the Begining of Placing Ship One........////
		
	int direction1 = generRand.nextInt(2);  	//used to chose leftright or updown
	x1 = generRand.nextInt(wBound);  		//random point x generated
	y1 = generRand.nextInt(lBound);		//random point y generated	
		
		if (x1 == 0){
			x1 = 1;
		}
		
		if (x1 == width) {
			x1 = width - 1;
		}
		if (y1 == 0){
			y1 = 1;
		}
		
		if (y1 == length) {
			y1 = (length - 1);
		}
		
		if (direction1 == 0){
			caseNumber1 = 0;
		} 
		if (direction1 == 1){
			caseNumber1 = 1;
		}
		
		switch (caseNumber1){
		case 0:
//		going right to left
		board[y1][x1] = 10 ; //start point.
		board[y1][x1 - 1] = 10 ;
		board[y1][x1 + 1] = 10 ;

		if (((y1 + 1) <= length))
		board[y1 + 1][x1] = 1 ; // adds 3, 1s belox1 ship
		if (((y1 + 1) <= length) && ((x1 - 1) >= 0))
		board[y1 + 1][x1 - 1] = 1 ;
		if (((y1 + 1) <= length) && ((x1 + 1) <= width))
		board[y1 + 1][x1 + 1] = 1 ;
		if ((y1 + 2) <= length)
		board[y1 + 2][x1] = 2; //adds 3, 2s belox1 ship
		if (((y1 + 2) <= length) && ((x1 - 1) >= 0))
		board[y1 + 2][x1 - 1] = 2;
		if (((y1 + 2) <= length) && ((x1 + 1) <= width))
		board[y1 + 2][x1 + 1] = 2;

		if ((y1 - 1) >= 0)
		board[y1 - 1][x1] = 1 ; // adds 3, 1s belox1 ship
		if (((y1 - 1) >= 0) && ((x1 - 1) >= 0))
		board[y1 - 1][x1 - 1] = 1 ;
		if (((y1 - 1) >= 0) && ((x1 + 1) <= width))
		board[y1 - 1][x1 + 1] = 1 ;
		if ((y1 - 2) >= 0)
		board[y1 - 2][x1] = 2; //adds 3, 2s belox1 ship
		if (((y1 - 2) >= 0) && ((x1 - 1) >= 0))
		board[y1 - 2][x1 - 1] = 2;
		if (((y1 - 2) >= 0) && ((x1 + 1) <= width))
		board[y1 - 2][x1 + 1] = 2; 



		if ((x1 + 2) <= width)
		board[y1][x1 + 2] = 1; 
		if (((x1 - 2) >= 0))
		board[y1][x1 - 2] = 1; 
		if ((x1 + 3) <= width)
		board[y1][x1 + 3] = 2; 
		if (((x1 - 3) >= 0))
		board[y1][x1 - 3] = 2; //adds 1 to left side
		break;
		
		
		case 1:
			//vertical down
			board[y1][x1] = 10; //start point
			board[y1 + 1][x1] = 10;
			board[y1 - 1][x1] = 10;

			if ((y1 - 2) >= 0)
			board[y1 - 2][x1] = 1; //adds 1 top and bottom
			if ((y1 + 2) <= length)
			board[y1 + 2][x1] = 1;
			if ((y1 - 3) >= 0)
			board[y1 - 3][x1] = 2; //nox1 x1ith 2s
			if ((y1 + 3) <= length)
			board[y1 + 3][x1] = 2;

			if ((x1 - 1) >= 0)
			board[y1][x1 - 1] = 1; //adds 1 to the right of ship
			if (((y1 + 1) <= length) && ((x1 - 1) >= 0))
			board[y1 + 1][x1 - 1] = 1;
			if (((y1 - 1) >= 0) && ((x1 - 1) >= 0))
			board[y1 - 1][x1 - 1] = 1;
			if ((x1 - 2) >=0)
			board[y1][x1 - 2] = 2; //adds 1 to the right of ship
			if (((y1 - 1) >= 0) && ((x1 - 2) >=0))
			board[y1 - 1][x1 - 2] = 2;
			if (((y1 + 1) <= length) && ((x1 - 2) >=0))
			board[y1 + 1][x1 - 2] = 2;


			
			if ((x1 + 1) <= width)
			board[y1][x1 + 1] = 1; //to the right
			if (((y1 + 1) <= length) && ((x1 + 1) <= width))
			board[y1 + 1][x1 + 1] = 1;
			if (((y1 - 1) >= 0) && ((x1 + 1) <= width))
			board[y1 - 1][x1 + 1] = 1;
			if ((x1 + 2) <= width)
			board[y1][x1 + 2] = 2 ; //nox1 x1ith 2s
			if (((y1 + 1) <= length) && ((x1 + 2) <= width))
			board[y1 + 1][x1 + 2] = 2 ;
			if (((y1 - 1) >= 0) && ((x1 + 2) <= width))
			board[y1 - 1][x1 + 2] = 2 ;
			break;
		}

	////.......This is the End of Placing Ship One........////
		
		/////......This is the Begining of ship two placement......//////
		

		
		ship2();	
	
			switch (caseNumber2){
		case 0:
//			going right to left
			board[y2][x2] = 20 ; //start point.
			board[y2][x2 - 1] = 20 ;
			board[y2][x2 + 1] = 20 ;
			
			if (((y2 + 1) <= length) && (board[y2 + 1][x2] != 10))
			board[y2 + 1][x2] = 1 ; // adds 3, 1s belox2 ship
			if (((y2 + 1) <= length) && ((x2 - 1) >= 0) && (board[y2 + 1][x2 - 1] !=10))
			board[y2 + 1][x2 - 1] = 1 ;
			if (((y2 + 1) <= length) && ((x2 + 1) <= width) && (board[y2 + 1][x2 + 1] !=10))
			board[y2 + 1][x2 + 1] = 1 ;
			if (((y2 + 2) <= length) && (board[y2 + 1][x2] != 10) && (board[y2 +1][x2]!= 1))
			board[y2 + 2][x2] = 2 ; // adds 3, 1s belox2 ship
			if (((y2 + 2) <= length) && ((x2 - 1) >= 0) && (board[y2 - 1][x2 - 1] !=10)&& (board[y2 - 1][x2 - 1] != 1))
			board[y2 + 2][x2 - 1] = 2 ;
			if (((y2 + 2) <= length) && ((x2 + 1) <= width) && (board[y2 + 2][x2 + 1] !=10) && (board[y2 - 1][x2 + 1] != 1))
			board[y2 + 2][x2 + 1] = 2 ;


			if (((y2 - 1) >= 0) && (board[y2 - 1][x2] != 10))
			board[y2 - 1][x2] = 1 ; // adds 3, 1s above
			if (((y2 - 1) >= 0) && ((x2 - 1) >= 0) && (board[y2 - 1][x2 - 1] != 10))
			board[y2 - 1][x2 - 1] = 1 ;
			if (((y2 - 1) >= 0) && ((x2 + 1) <= width) && (board[y2 - 1][x2 + 1] !=10))
			board[y2 - 1][x2 + 1] = 1 ;
			if (((y2 - 2) >= 0) && (board[y2 - 2][x2] != 10) && (board[y2 - 2][x2]!= 1))
			board[y2 - 2][x2] = 2; //adds 3, 2s above
			if (((y2 - 2) >= 0) && ((x2 - 1) >= 0) && (board[y2 -2][x2 - 1] != 10)&&(board[y2 - 2][x2 - 1] != 1))
			board[y2 - 2][x2 - 1] = 2;
			if (((y2 - 2) >= 0) && ((x2 + 1) <= width) && (board[y2 - 2][x2 + 1] !=10)&& (board[y2 - 2][x2 + 1] !=1))
			board[y2 - 2][x2 + 1] = 2;

			if (((x2 + 2) <= width) && (board[y2][x2 + 2] != 10))
			board[y2][x2 + 2] = 1; //adds 1 to right side
			if (((x2 - 2) >= 0) && (board[y2 ][x2 - 2] != 10))
			board[y2][x2 - 2] = 1; //adds 1 to left side
			if (((x2 + 3) <= width) && (board[y2][x2 + 3] != 10) && (board[y2][x2 +3] !=1))
			board[y2][x2 + 3] = 2; //adds 2 to right
			if (((x2 - 3) >= 0) && (board[y2][x2 - 3] != 10) && (board[y2][x2 - 3]!= 1))
			board[y2][x2 - 3] = 2; //adds 2 to the left
			break;
			
			
		case 1:
//			vertical dox1n
			board[y2][x2] = 20; //start point
			board[y2 + 1][x2] = 20;
			board[y2 - 1][x2] = 20;

			if (((y2 - 2) >= 0) && (board[y2 - 2][x2] != 10))
			board[y2 - 2][x2] = 1; //adds 1 top and bottom
			if (((y2 + 2) <= length) && (board[y2 + 2][x2] != 10))
			board[y2 + 2][x2] = 1;
			if (((y2 - 3) >= 0) && (board[y2 - 3][x2] != 10) && (board[y2 - 3][x2]!= 1))
			board[y2 - 3][x2] = 2; //nox2 x2ith 2s
			if (((y2 + 3) <= length) && (board[y2 + 3][x2] != 10) && (board[y2 + 3][x2]!= 1))
			board[y2 + 3][x2] = 2;
			
			if (((x2 - 1) >= 0) && (board[y2][x2 - 1] != 10))
			board[y2][x2 - 1] = 1; //adds 1 to the right of ship
			if (((y2 + 1) <= length) && ((x2 - 1) >= 0) && (board[y2 + 1][x2 - 1] !=10))
			board[y2 + 1][x2 - 1] = 1;
			if (((y2 - 1) >= 0) && ((x2 - 1) >= 0) && (board[y2 - 1][x2 - 1] != 10))
			board[y2 - 1][x2 - 1] = 1;
			if (((x2 - 2) >= 0) && (board[y2][x2 - 2] != 10) && (board[y2][x2 - 2]!=1))
			board[y2][x2 - 2] = 2 ; //nox2 x2ith 2s
			if (((y2 + 1) <= length) && ((x2 - 2) >= 0) && (board[y2 + 1][x2 - 2] !=10)&& (board[y2 + 1][x2 - 2] !=1))
			board[y2 + 1][x2 - 2] = 2 ;
			if (((y2 - 1) >= 0) && ((x2 - 2) >= 0) && (board[y2 - 1][x2 - 2] != 10)&&(board[y2 - 1][x2 - 2] !=1))
			board[y2 - 1][x2 - 2] = 2 ;

			if (((x2 +1) <= width) && (board[y2][x2 +1] != 10))
			board[y2][x2 + 1] = 1; //adds 1 to the right of ship
			if (((y2 + 1) <= length) && ((x2 +1) <= width) && (board[y2 + 1][x2 + 1]!=10))
			board[y2 + 1][x2 + 1] = 1;
			if (((y2 - 1) >= 0) && ((x2 +1) <= width) && (board[y2 - 1][x2 + 1] !=10))
			board[y2 - 1][x2 + 1] = 1;
			if (((x2 + 2) <= width) && (board[y2][x2 + 2] != 10) && (board[y2][x2 +2] != 1))
			board[y2][x2 + 2] = 2 ;
			if (((y2 + 1) <= length) && ((x2 + 2) <= width) && (board[y2 + 1][x2 + 2] !=10) && (board[y2 + 1][x2 + 2] !=1))
			board[y2 + 1][x2 + 2] = 2 ;
			if (((y2 - 1) >= 0) && ((x2 + 2) <= width) && (board[y2 - 1][x2 + 2] !=10)&& (board[y2 - 1][x2 + 2] !=1))
			board[y2 - 1][x2 + 2] = 2 ;
			break;

		default:
			System.out.println("you have an error in switch statement2");
			break;
			
			}


	////.......This is the End of Placing Ship Two........////		
}
	

	
	public void ship2(){

		int direction2 = generRand.nextInt(2);	//used to chose left right or up down.
		x2 = generRand.nextInt(wBound);  		//random point x generated
		y2 = generRand.nextInt(lBound);   	//random point y generated 
	
		if (x2 == 0){
			x2 = 1;
		}
		
		if (x2 == width) {
			x2 = (width - 1);
		}
		if (y2 == 0){
			y2 = 1;
		}
		
		if (y2 == length) {
			y2 = (length - 1);
		}
		
		if (board[y2][x2] != 10){  //checks to make sure that the point chosen a ship.
			if ((direction2 == 0) && (board[y2][x2 - 1] !=10) && (board[y2][x2 + 1]!=10)){
				caseNumber2 = 0;
			} else caseNumber2 = 1;
			if ((direction2 == 1) && (board[y2 - 1][x2] != 10) && (board[y2 + 1][x2]!=10)){
				caseNumber2 = 1;			
			} else caseNumber2 = 0;
		}else ship2();
		
	}
	
	
	public void gamePlay(int l, int w){
		
		if (l <= length && l >= 0 && w <= width && w >= 0 )
		{
		
		switch (board[l][w])
		{
		case -1:
			score += 2;
			System.out.println("you already hit this spot");
			System.out.println("your score is: " + score);
			break;
			
		case 0:	
			score += 1;
			System.out.println("miss");
			System.out.println("your score is: " + score);
			board[l][w] = -1;
			break;
			
		case 1:
			score += 1;
			System.out.println("miss but very close");
			System.out.println("your score is: " + score);
			board[l][w] = -1;
			break;
			
		case 2:
			score += 1;
			System.out.println("miss but close");
			System.out.println("your score is: " + score);
			board[l][w] = -1;	
			break;
			
		case 10:
			score += 1;
			System.out.println("hit");
			System.out.println("your score is: " + score);
			if (count10 == 2 && count20 ==3){
				System.out.println("you win!");
				win += 1; 
				board[l][w] = -1;
			}
			else if (count10 == 2){
				System.out.println("you sunk my battleship");
				count10 += 1;
				win += 1;
				board[l][w] = -1;
				}
			else { 
				count10 += 1;
			    win += 1;
			    board[l][w] = -1;
			}
			break;
			
		case 20:
			score += 1;
			System.out.println("hit");
			System.out.println("your score is: " + score);
			if (count20 == 2 && count10 ==3){
				System.out.println("you win!");
				win += 1;
				board[l][w] = -1;
			}
			else if (count20 == 2){
				System.out.println("you sunk my battleship");
				count20 += 1;
				win +=1;
				board[l][w] = -1;
				}
			else {
				count20 += 1;
			    win += 1;
			    board[l][w] = -1;	
			}
			break;	
			
		default:
			System.out.println("unknown case! fix it.");
			break;
		}//end switch
		
		}//ends first part of if
		
		else {
			System.out.println("sorry out of range bucko");
			score += 2;
		}
		
	}
	
	
	public void printA(){    ///our 2darray print method..
	for (int len = 0; len<= length ; len++ ){
		System.out.println();
		for (int wid = 0; wid <= width ; wid++){		
			System.out.print(+ board[len][wid] + " ");
			}	
	}
}
	
	//accessor method
	public int testWin(){
		return win;
	}

}
