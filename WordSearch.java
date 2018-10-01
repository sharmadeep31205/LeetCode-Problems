package LeetcodeProblems;

public class WordSearch {
	
	public boolean exist(char[][] board, String word) {
		
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				if(findWord(board, word, i, j, 0)){
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean findWord(char[][] board, String word, int i, int j, int n){
		if(n == word.length()){
			return true;
		}
		if(i < 0 || j < 0 || i >= board.length || j >= board.length || board[i][j] != word.charAt(n)){
			return false;
		}
		
		board[i][j] ^= 256;
		boolean res = findWord(board, word, i+1, j, n+1) ||
				findWord(board, word, i, j+1, n+1) ||
				findWord(board, word, i-1, j, n+1) ||
				findWord(board, word, i, j-1, n+1);
		board[i][j] ^= 256;
		
		return res;
	}
}
