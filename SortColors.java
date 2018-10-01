package LeetcodeProblems;

public class SortColors {
	
	public void sortColors(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return;
        }
        
        int[] temp = new int[3];
        
        for(int i = 0; i < nums.length; i++){
            temp[nums[i]]++;
        }
        int count = 0;
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[i]; j++){
                nums[count++] = i;
            }
        }
    }
}
