package LeetcodeProblems;

public class SearchInsertPosition {
	
	public int searchInsert(int[] nums, int target) {
		if(nums == null || nums.length == 0){
			return 0;
		}
		
		int low = 0; int high = nums.length - 1;
		
		while(low <= high){
			int mid = (low + high)/2;
			if(nums[mid] == target){
				return mid;
			}
			
			else if(nums[mid] > target){
				high = mid-1;
			}
			else{
				low = mid+1;
			}
		}
		
		return low;
	}
}
