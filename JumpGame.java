package LeetcodeProblems;

public class JumpGame {

	public boolean canJump(int[] nums) {
		if(nums == null || nums.length == 0){
			return true;
		}
		
		int res = nums[0];
		
		for(int i = 1; i < nums.length; i++){
			if(res == 0){
				return false;
			}
			
			res = Math.max(res-1, nums[i]);
		}
		
		return true;
	}
}
