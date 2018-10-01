package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	public List<Integer> spiralOrder(int[][] matrix) {
        
		List<Integer> list = new ArrayList<>();
		if(matrix == null || matrix.length == 0){
        	return list;
        }
        
        int rowBegin = 0; int colBegin = 0;
        int rowEnd = matrix.length-1; int colEnd = matrix[0].length-1;
        
        while(rowBegin < rowEnd && colBegin < colEnd){
        	
        	for(int i = colBegin; i<= colEnd; i++){
        		list.add(matrix[rowBegin][i]);
        	}
        	rowBegin++;
        	
        	for(int i = rowBegin; i <= rowEnd; i++){
        		list.add(matrix[i][colEnd]);
        	}
        	colEnd--;
        	
        	if(rowBegin <=  rowEnd){
        		for(int i = colEnd; i >= colBegin; i--){
        			list.add(matrix[rowEnd][i]);
        		}
        		rowEnd--;
        	}
        	
        	if(colBegin <= colEnd){
        		for(int i = rowEnd; i >= rowBegin; i--){
        			list.add(matrix[i][colBegin]);
        		}
        		colBegin++;
        	}
        }
        
        return list;
    }
}
