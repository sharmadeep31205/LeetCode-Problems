package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
		List<List<Integer>> list = new ArrayList<>();
		
		if(candidates == null || candidates.length == 0){
			return list;
		}
		
		Arrays.sort(candidates);
		
		combination(candidates, list, new ArrayList<>(), target, 0);
		
		return list;
    }
	
	public void combination(int[] nums, List<List<Integer>> list, List<Integer> tempList, int remain, int start){
		if(remain < 0){
			return;
		}
		
		if(remain == 0){
			list.add(new ArrayList<>(tempList));
		}
		
		for(int i = start; i < nums.length; i++){
			if(i > start && nums[i] == nums[i-1]){
				continue;
			}
			tempList.add(nums[i]);
			combination(nums, list, tempList, remain - nums[i], i+1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
