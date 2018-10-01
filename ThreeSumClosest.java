package LeetcodeProblems;

import java.util.Arrays;

public class ThreeSumClosest {
	
	public int threeSumClosest(int[] nums, int target) {
        
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        Arrays.sort(nums);
        
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        
        for(int i = 0; i < nums.length; i++){
        	
        	if(i > 0 && nums[i] == nums[i-1]){
        		continue;
        	}
        	
        	int j = i+1, k = nums.length-1;
        	
        	while(j < k){
        		int sum = nums[i] + nums[j] + nums[k];
        		
        		if(sum > target){
        			k--;
        		}
        		else{
        			j++;
        		}
        		
        		if(Math.abs(sum - target) < Math.abs(result - target)){
        			result = sum;
        		}
        	}
        }
        
        return result;
	}
}
