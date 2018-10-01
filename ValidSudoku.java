package LeetcodeProblems;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	
	public static boolean isValidSudoku(char[][] board) {
		
		for(int i = 0; i < 9; i++){
			Set<Character> rows = new HashSet<>();
			Set<Character> column = new HashSet<>();
			Set<Character> cube = new HashSet<>();
			
			for(int j = 0; j < 9; j++){
				if(board[i][j] != '.' && !rows.add(board[i][j])){
					return false;
				}
				if(board[j][i] != '.' && !column.add(board[j][i])){
					return false;
				}
				
				int rowIndex = 3 * (i/3);
				int columnIndex = 3*(i%3);
				
				if(board[rowIndex + j/3][columnIndex + j % 3] != '.' 
						&& !cube.add(board[rowIndex + j/3][columnIndex + j%3])){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args){
		char[][] input = {{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				  {'7','.','.','.','2','.','.','.','6'},
				  {'.','6','.','.','.','.','2','8','.'},
				  {'.','.','.','4','1','9','.','.','5'},
				  {'.','.','.','.','8','.','.','7','9'}};
		
		isValidSudoku(input);
	}
}
