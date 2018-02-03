import java.util.Scanner;

public class Tic {

public static int row ;
public static int col;
public static Scanner scanner= new Scanner(System.in);
public static char[][] board = new char[3][3] ;
public static char turn = 'X' ;


public static void main(String arr[]) {

	System.out.println("Hello Player X/O ... Please Enter the coordinates : ");

		for(int i=0;i<3;i++) {
		for(int j = 0;j<3;j++) {
			board[i][j] = '_';
		}
	}
	
	printBoard();
		
	play();

}


public static void play () {
	
	boolean playing = true ;
	while(playing) {
		row = scanner.nextInt() - 1 ;
		col = scanner.nextInt() - 1 ;
		board[row][col] = turn ;
		
		if(gameOver(row, col)) {
			playing = false ;
			System.out.println("Gameover !  Player "+turn+ " Wins");
		}
			printBoard();
		
			if(turn =='X') {
			turn = 'O' ;
			if(playing==true)
			{System.out.println("Player "+turn+"'s turn ");}
		}
			else  {
			
			turn = 'X' ;
			if(playing==true)
			{System.out.println("Player "+turn+"'s turn ");
			}
			}
	
	}
}


public static void printBoard() {

	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(j==0)
				System.out.print("| ");
			System.out.print(board[i][j]+" | ");
		}
		System.out.println();

	}
}

public static Boolean gameOver(int rmove,int cmove) {
	
	if(board[0][cmove]==board[1][cmove] && board[0][cmove]==board[2][cmove] ) {
		return true ;
	}
	if(board[rmove][0]==board[rmove][1] && board[rmove][0]==board[rmove][2] ) {
		return true ;
	}
	if(board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[1][1]!='_') {
		return true ;
	}
	if(board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[1][1]!='_' ) {
		return true ;
	}
	
	return false ;
}


}

