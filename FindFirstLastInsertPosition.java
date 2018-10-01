package LeetcodeProblems;

public class FindFirstLastInsertPosition {

	
	public int[] searchRange(int[] nums, int target) {
		if(nums == null || nums.length == 0){
			return new int[]{-1,-1};
		}
		
		int start = search(nums, target);
		
		if(start == nums.length || nums[start] != target){
			return new int[]{-1,-1};
		}
		
		return new int[]{start, search(nums, target+1)-1};
	}
	
	public int search(int[] nums, int target){
		int low = 0; int high = nums.length;
		
		while(low < high){
			int mid = (low + high)/2;
			
			if(nums[mid] < target){
				low = mid+1;
			}
			else{
				high = mid;
			}
		}
		
		return low;
	}
}
