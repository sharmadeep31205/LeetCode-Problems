package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
	
	public List<List<Integer>> calclulatePermutation(int[] nums){
		
		List<List<Integer>> list = new ArrayList<>();
		
		if(nums == null || nums.length == 0){
			return list;
		}
		
		permute(list, new ArrayList<>(), nums);
		
		return list;
	}
	
	public void permute(List<List<Integer>> list, List<Integer> tempList, int[] nums){
		if(tempList.size() == nums.length){
			list.add(new ArrayList<>(tempList));
			return;
		}
		
		for(int i = 0; i < nums.length; i++){
			if(tempList.contains(nums[i])){
				continue;
			}
			
			tempList.add(nums[i]);
			permute(list, tempList, nums);
			tempList.remove(tempList.size() - 1);
		}
	}
}
