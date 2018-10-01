package LeetcodeProblems;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		if(height == null || height.length == 0){
			return 0;
		}
		
		int i = 0, j = height.length - 1;
		
		int max = 0;
		
		while(i < j){
			int min = Math.min(height[i], height[j]);
			max = Math.max(max, min * (j-i));
			
			if(height[i] > height[j]){
				j--;
			}
			else{
				i++;
			}
		}
		
		return max;
	}
}
