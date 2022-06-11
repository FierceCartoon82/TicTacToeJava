package ticTacToeProj;

import java.util.Scanner;

public class TTTTester {

	public static void main(String[] args) {
		// declare scanner object
		Scanner input = new Scanner(System.in);
		
		// declare variables
		String p1, p2;
		int choice, turn = 0;
		boolean p1Win, p2Win;
		
		// game name & instructions
		System.out.println("TIC TAC TOE! Series best 2 out of 3\n");
		
		// prompt user for names
		System.out.print("Enter the name for Player 1: ");
		p1 = input.next();
		System.out.print("Enter the name for Player 2: ");
		p2 = input.next();
		
		// declare player objects
		Player player1 = new Player(p1);
		Player player2 = new Player(p2);
		
		// while loop 
		while(player1.getWins() < 2 && player2.getWins() < 2) {
			// declare and init array values for grid (also will reset each time a game ends)
			char grid[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8','9'}};
			
			for(int i = 0; i <= 8; i++) {
				if (turn == 0) {
					// show grid
					System.out.println();
					printGrid(grid);
					
					// prompt user
					System.out.print("\n" + player1.getName() + " choose a space: ");
					choice = input.nextInt();
					
					// switch statement to replace chose space with X
					switch(choice) {
					case 1: grid[0][0] = 'X';
							break;
					case 2: grid[0][1] = 'X';
							break;
					case 3: grid[0][2] = 'X';
							break;
					case 4: grid[1][0] = 'X';
							break;
					case 5: grid[1][1] = 'X';
							break;
					case 6: grid[1][2] = 'X';
							break;
					case 7: grid[2][0] = 'X';
							break;
					case 8: grid[2][1] = 'X';
							break;
					case 9: grid[2][2] = 'X';
							break;
					}
					
					// check for winner
					if(player1.checkWin(grid) == true) {
						// output winner
						System.out.println(player1.getName() + " WON!");
						
						// add a win
						player1.addWins();
						
						// print final grid
						printGrid(grid);
						
						// print score
						System.out.println(player1.getName() + " - " + player1.getWins() + " wins"
								+ "\n" + player2.getName() + " - " + player2.getWins() + " wins");
						
						// break loop
						break;
					}
					// change turn
					turn++;
				} else {
					// show grid
					System.out.println();
					printGrid(grid);
					
					// prompt user
					System.out.print("\n" + player2.getName() + " choose a space: ");
					choice = input.nextInt();
					
					// switch statement to replace chose space with X
					switch(choice) {
					case 1: grid[0][0] = 'O';
							break;
					case 2: grid[0][1] = 'O';
							break;
					case 3: grid[0][2] = 'O';
							break;
					case 4: grid[1][0] = 'O';
							break;
					case 5: grid[1][1] = 'O';
							break;
					case 6: grid[1][2] = 'O';
							break;
					case 7: grid[2][0] = 'O';
							break;
					case 8: grid[2][1] = 'O';
							break;
					case 9: grid[2][2] = 'O';
							break;
					}
					
					// check for winner
					if(player2.checkWin(grid) == true) {
						// output winner
						System.out.println(player2.getName() + " WON!");
						
						// add a win
						player2.addWins();
						
						// print final grid
						printGrid(grid);
						
						// print score
						System.out.println(player1.getName() + " - " + player1.getWins() + " wins"
								+ "\n" + player2.getName() + " - " + player2.getWins() + " wins");
						
						// break loop
						break;
					}
					
					// change turn
					turn = 0;
				} 
				
				if (i == 8) {
					// output draw
					System.out.println("DRAW!");
					
					// print grid
					printGrid(grid);
				}
			}
		}
		// output series winner
		if (player1.getWins() > player2.getWins()) {
			// output winner
			System.out.println("\n" + player1.getName() + " WINS!");
			
		} else {
			// output winner
			System.out.println("\n" + player2.getName() + " WINS!");
			
		}

	}
	
	
	// altered print grid method
	public static void printGrid(char grid[][]) {
		
		for(int i = 0; i < grid.length; i++) {
			
			for(int j=0; j <grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
}
