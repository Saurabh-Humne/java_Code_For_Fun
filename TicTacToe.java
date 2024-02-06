import java.util.Scanner;

public class TicTacToe{
	private static char[][] board = new char[3][3];
	private static char currentPlayer = 'X';
	
	public static void main(String[] args) {
		initializeBoard();
		printBoard();
		
		while (true) {
			playTurn();
			printBoard();
			
			if (checkWin() || isBoardFull()) {
				break;
			}
			
			switchPlayer();
		}
		
		if (checkWin()) {
			System.out.println("Player "+ currentPlayer +" wins!");
		} else {
			System.out.println("It's a draw!");
		}
	}
	
	private static void initializeBoard() {
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	public static void printBoard() {
		System.out.println("----------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			
		System.out.println();
		System.out.println("------------");
		}
	}
	
	private static void playTurn() {
		int row, col;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Player "+ currentPlayer + ", enter your move (row and colum):");
			row = scanner.nextInt();
			col = scanner.nextInt();
		} while (!isValidMove(row, col));
		
		board[row][col] = currentPlayer;
	}
	
	private static boolean isValidMove(int row, int col) {
		if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
			System.out.println("Invalid move. try agin.");
			return false;
		}
		return true;
	}
	
	private static void switchPlayer() {
		currentPlayer = (currentPlayer == 'X')? 'O': 'X';
	}
	
	private static boolean checkWin() {
		// check rows, columns, and diagoals for a win
		for (int i = 0; i< 3; i++) {
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
				return true; // Row win
			}
			if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
				return true; // column win
			}
		}
		
		if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
			return true; // diagonal win
		}
		if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
			return true; // diagonal win
		}
		return false;
	}
	
	private static boolean isBoardFull() {
		// check if the board is full (a draw)
		for (int i = 0; i < 3; i++) {
			for ( int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					return false; // there is an empty space, teh board is not full
				}
			}
		}
		return true; // the board is full
	}
}

/* Output

----------
|   |   |   | 
------------
|   |   |   | 
------------
|   |   |   | 
------------
Player X, enter your move (row and colum):
0
0
----------
| X |   |   | 
------------
|   |   |   | 
------------
|   |   |   | 
------------
Player O, enter your move (row and colum):
1
1
----------
| X |   |   | 
------------
|   | O |   | 
------------
|   |   |   | 
------------
Player X, enter your move (row and colum):
1
0
----------
| X |   |   | 
------------
| X | O |   | 
------------
|   |   |   | 
------------
Player O, enter your move (row and colum):
2
1
----------
| X |   |   | 
------------
| X | O |   | 
------------
|   | O |   | 
------------
Player X, enter your move (row and colum):
2
0
----------
| X |   |   | 
------------
| X | O |   | 
------------
| X | O |   | 
------------
Player X wins!

*/
