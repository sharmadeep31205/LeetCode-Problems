package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationII {

	public List<List<Integer>> permuteUnique(int[] nums) {
		
		List<List<Integer>> list = new ArrayList<>();
		
		if(nums == null || nums.length == 0){
			return list;
		}
		
		boolean[] visited = new boolean[nums.length];
		
		Arrays.sort(nums);
		
		permute(list, new ArrayList<>(), visited, nums);
		
		return list;
		
	}
	
	public void permute(List<List<Integer>> list, List<Integer> tempList, boolean[] visited, int[] nums){
		if(tempList.size() == nums.length){
			list.add(new ArrayList<>(tempList));
			return;
		}
		
		for(int i = 0; i < nums.length; i++){
			if(visited[i] || i > 0 && nums[i-1] == nums[i] && !visited[i-1]){
				continue;
			}
			
			visited[i] = true;
			tempList.add(nums[i]);
			permute(list, tempList, visited, nums);
			visited[i] = false;
			tempList.remove(tempList.size()-1);
		}
	}
}
