package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	
	public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return list;
        }
        
        subset(list, new ArrayList<Integer>(), nums, 0);
        
        return list;
    }
    
    public void subset(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){
        list.add(new ArrayList(tempList));
        
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            subset(list, tempList, nums, i+1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
