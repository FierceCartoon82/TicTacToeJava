package ticTacToeProj;

public class Player {
	// declare private variables
	private int wins;
	private String name;
	
	// constructor method
	Player(String PlayerName) {
		// init private vars
		wins = 0;
		name = PlayerName;
	}
	
	// gather method (name)
	public String getName() {
		// return win amount
		return name;
	}
	
	// gather method (wins)
	public int getWins() {
		// return win amount
		return wins;
	}
	
	// method to add wins
	public int addWins() {
		// add a win
		wins++;
		
		// return win amount
		return wins;
	}
	
	//check wins method
    public boolean checkWin(char[][] grid) {
    	// conditionals to check for win
    	if ((grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X') ||
    			(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O')) {
    		/* X/O 2 3
    		 * X/O 5 6
    		 * X/O 8 9
    		 */
    		
    		return true;
    	} else if ((grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X') ||
    			(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O')) {
    		/* 1 X/O 3
    		 * 4 X/O 6
    		 * 7 X/O 9
    		 */
    		
    		return true;
    		
    	} else if ((grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X') ||
    			(grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O')) {
    		/* 1 2 X/O
    		 * 4 5 X/O
    		 * 7 8 X/O
    		 */
    		
    		return true;
    	} else if ((grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') ||
    			(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O')) {
    		/* X/O   2     3
    		 * 4     X/O   6
    		 * 7     8     X/O
    		 */
    		
    		return true;
    	} else if ((grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X') ||
    			(grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O')) {
    		/* 1   2   O/X
    		 * 4   O/X 6
    		 * O/X 8   9 
    		 */
    		
    		return true;
    	} else if ((grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X') ||
    			(grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == '0')) {
    		/* XXX or OOO
    		 * 456
    		 * 789
    		 */
    		
    		return true;
    	} else if ((grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X') ||
    			(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O')) {
    		/* 123
    		 * XXX or OOO
    		 * 789
    		 */
    		
    		return true;
    	} else if ((grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X') ||
		(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O')) {
    		/* 123
    		 * 456
    		 * XXX or OOO
    		 */
    		
    		return true;
		} else {
			
			return false;
		}
   }
 
}