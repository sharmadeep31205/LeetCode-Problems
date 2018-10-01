package LeetcodeProblems;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int x) {
		if(x < 0){
			return false;
		}
		
		int res = 0;
		int temp = x;
		while(temp > 0){
			res *= 10;
			res += temp % 10;
			temp = temp/10;
		}
		
		return res == x;
	}
}
