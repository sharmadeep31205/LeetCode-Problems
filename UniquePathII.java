package LeetcodeProblems;

public class UniquePathII {
	
	public int uniquePathII(int[][] nums){
		if(nums == null && nums.length == 0){
			return 0;
		}
		int m = nums.length; int n = nums[0].length;
		
		int[] temp = new int[n];
		temp[0] = 1;
		
		for(int[] rows : nums){
			for(int i = 0; i < n; i++){
				if(rows[i] == 1){
					temp[i] = 0;
				}
				else if(i > 0){
					temp[i] += temp[i-1];
				}
			}
		}
		
		return temp[temp.length-1];
	}
}
