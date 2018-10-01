package LeetcodeProblems;

public class RemoveDuplicateFromSortedArray {
	
	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0){
			return 0;
		}
		
		int count = 1; int j = 1; int i = 1; int k = 2;
		
		while(j < nums.length){
			if(nums[j] != nums[j-1]){
				count = 1;
				nums[i++] = nums[j];
			}
			else {
				if(count < k){
					nums[i++] = nums[j];
					count++;
				}
			}
			j++;
		}
		
		return i;
	}
}
