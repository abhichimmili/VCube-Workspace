package tic_tac_toe;

import java.util.Scanner;

public class Tic_Tac_Toe {

	static int ROW = 3;
	static int COL = 3;

	static String[][] board = new String[ROW][COL];
	static String player = "X";
	static int row;
	static int col;
	static Scanner sc = new Scanner(System.in);

	private static void displayBoard() {
		System.out.println("\n********* Your Board *********");
		System.out.println("\t-------------");
		for (int i = 0; i < ROW; i++) {
			System.out.print("\t");
			for (int j = 0; j < COL; j++) {
				System.out.print("| " + (board[i][j] == null ? " " : board[i][j]) + " ");
			}
			System.out.println("|");
			System.out.println("\t-------------");
		}

		System.out.println("\n");
	}

	public static void main(String[] args) {
		System.out.println("\n\tTIC - TAC - TOE \n");
		System.out.println("Let's start the game....");

		while (!isBoardFull()) {
			displayBoard();
			System.out.println("Player " + player + " turn");
			do {
				choosePosition();
			} while (!positionValid());
			fillBoard();
			checkWinner();
			changePlayer();
		}
		displayBoard();
		System.out.println("Match Draw!");

	}

	private static void checkWinner() {
		if (isWin()) {
			displayBoard();
			System.out.println("YOU WON : " + player);
			System.exit(0);
		}
	}

	private static boolean isWin() {
		// TODO Auto-generated method stub
		for (int i = 0; i < ROW; i++) {
			int r = 0;// rows
			for (int j = 0; j < COL; j++) {
				if (player.equals(board[i][j])) {
					r++;
				}
				if (r == ROW) {
					return true;
				}

			}
		}
		for (int i = 0; i < COL; i++) {
			int c = 0;// columns
			for (int j = 0; j < ROW; j++) {
				if (player.equals(board[j][i])) {
					c++;
				}
				if (c == COL) {
					return true;
				}
			}
		}
		int d1 = 0;// diagonals
		int d2 = 0;
		for (int i = 0; i < ROW; i++) {

			if (player.equals(board[i][i])) {
				d1++;
			}
			if (player.equals(board[i][COL - i - 1])) {
				d2++;
			}
		}
		if (d1 == ROW || d2 == COL) {
			return true;
		}

		return false;
	}

	private static void changePlayer() {
		player = player.equals("X") ? "O" : "X";
	}

	private static void fillBoard() {
		board[row][col] = player;

	}

	private static boolean isBoardFull() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (board[i][j] == null)
					return false;
			}
		}
		return true;
	}

	private static boolean positionValid() {
		if (row >= ROW || row < 0 || col >= COL || col < 0) {
			System.out.println("Invalid Position.. Please Enter again.. ");
			return false;
		} else if (board[row][col] != null) {
			System.out.println("Already Taken.. Please Enter again.. ");
			return false;
		}
		return true;
	}

	private static void choosePosition() {
		System.out.println("Enter the row : ");
		row = sc.nextInt();
		System.out.println("Enter the col : ");
		col = sc.nextInt();

	}

}
