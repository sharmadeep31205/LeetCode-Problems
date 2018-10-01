package LeetcodeProblems;

public class ClimbingStairs {
	
	public int climbStairs(int n) {
        
        if(n <= 0){
            return 0;
        }
                
        int one = 1;
        int two = 2;
        int curr;
        
        if( n == 1){
        	return one;
        }
        
        if( n == 2){
        	return two;
        }
        
        for(int i = 2; i < n; i++){
        	curr = one + two;
        	one = two;
        	two = curr;
        }
        
        return two;
	}
}
