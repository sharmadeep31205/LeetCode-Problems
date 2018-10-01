package LeetcodeProblems;

public class RotateImage {

	public void rotateImage(int[][] nums){
		
		if(nums == null || nums.length == 0){
			return;
		}
		
		for(int i = 0; i < nums.length; i++){
			for(int j = i; j < nums[0].length; j++){
				int temp = nums[i][j];
				nums[i][j] = nums[j][i];
				nums[j][i] = temp;
			}
		}
		
		for(int i = 0; i < nums.length; i++){
			int k = nums[0].length-1;
			for(int j = 0; j < nums[0].length/2; j++){
				int temp = nums[i][j];
				nums[i][j] = nums[i][k];
				nums[i][k] = temp;
				k--;
			}
		}
	}
}
