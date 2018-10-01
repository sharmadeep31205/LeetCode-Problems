package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	 public List<List<Integer>> threeSum(int[] nums) {
		 	
		 List<List<Integer>> list = new ArrayList<>();
		 
		 if(nums == null || nums.length == 0){
			 return list;
		 }
		 
		 Arrays.sort(nums);
		 
		 for(int i = 0; i < nums.length-2; i++){
			 int j = i+1; int k = nums.length-1;
			 int target = -nums[i];
			 
			 while(j < k){
				 if(target == nums[j] + nums[k]){
					 list.add(Arrays.asList(nums[i], nums[j], nums[k]));
					 j++;
					 k--;
					 
					 while(j < k && nums[j] == nums[j-1]){
						 j++;
					 }
					 
					 while(j < k && nums[k] == nums[k+1]){
						 k--;
					 }
				 }
				 
				 if(nums[j] + nums[k] > target){
					 k--;
				 }
				 else{
					 j++;
				 }
			 }
		 }
		 
		 return list;
	 }
}
