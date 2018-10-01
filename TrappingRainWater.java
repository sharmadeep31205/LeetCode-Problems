package LeetcodeProblems;

public class TrappingRainWater {

	public int trapRainWater(int[] nums){
		
		if(nums.length < 3){
			return 0;
		}
		
		int low = 0; int high = nums.length-1;
		int ans = 0;
		while(low < high && nums[low] <= nums[low+1]){
			low++;
		}
		
		while(low < high && nums[high] <= nums[high - 1]){
			high--;
		}
		
		while(low < high){
			int left = nums[low];
			int right = nums[high];
			
			if(left <= right){
				while(low < high && left >= nums[++low]){
					ans += left - nums[low];
				}
			}
			else{
				while(low < high && right >= nums[--high]){
					ans += right - nums[high];
				}
			}
		}
		
		return ans;
	}
}
