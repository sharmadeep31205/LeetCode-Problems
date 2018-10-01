package LeetcodeProblems;

public class Sqrt {
	
	public static int mySqrt(int x) {
		if(x <= 0){
			return 0;
		}
		
		long i = 0; long k = 0;
		
		for(long j = 1; j < x; j++){
			i = j*j;
			k = (j+1) * (j+1);
			
			if(i <= x && k > x){
				return (int)j;
			}
		}
		
		return 0;
    }
	
	public static void main(String[] args){
		mySqrt(4);
	}
}
