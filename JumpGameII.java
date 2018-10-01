package LeetcodeProblems;

public class JumpGameII {

	public int jump(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int currentStep = 0;
        int e = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            max = Math.max(max, i+nums[i]);
            if(i == e){
                currentStep++;
                e = max;
            }
        }
        
        return currentStep;
    }
}
