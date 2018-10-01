package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
		 
		 List<List<Integer>> list = new ArrayList<>();
		 
		 if(candidates == null || candidates.length == 0){
			 return list;
		 }
		 
		 Arrays.sort(candidates);
		 
		 combination(candidates, target, 0, list, new ArrayList<>());
		 
		 return list;
	 }
	 
	 public void combination(int[] nums, int remain, int start, List<List<Integer>> list, List<Integer> tempList){
		 if(remain < 0){
			 return;
		 }
		 if(remain == 0){
			 list.add(new ArrayList<>(tempList));
		 }
		 
		 for(int i = start; i < nums.length; i++){
			 tempList.add(nums[i]);
			 combination(nums, remain- nums[i], i, list, tempList);
			 tempList.remove(tempList.size() - 1);
		 }
	 }
}
