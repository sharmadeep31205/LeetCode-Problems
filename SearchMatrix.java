package LeetcodeProblems;

public class SearchMatrix {
	
public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0){
            return false;
        }
        
        int i = 0; int j = matrix[0].length - 1;
        
        while(true){
            
            if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length){
                break;
            }
            
            int temp = matrix[i][j];
            
            if(temp == target)
                return true;
            
            if(temp < target){
                i++;
            }
            else{
                j--;
            }
        }
        
        
        return false;
    }
}
