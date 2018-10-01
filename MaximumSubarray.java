package LeetcodeProblems;

public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0){
			return 0;
		}
		
		int max = 0; int maxSoFar = Integer.MIN_VALUE;
		
		for(int i = 0; i < nums.length; i++){
			max = Math.max(nums[i], max + nums[i]);
			maxSoFar = Math.max(maxSoFar, max);
		}
		
		return maxSoFar;
	}
}
