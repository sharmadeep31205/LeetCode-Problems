package LeetcodeProblems;

public class LongestPalindromicSubstring {

	int lo = 0; int max = 0;
	
	public String longestPalindrome(String s) {
		if(s == null || s.length() == 0){
			return s;
		}
		
		for(int i = 0; i < s.length(); i++){
			palindrome(s, i, i);
			palindrome(s, i, i+1);
		}
		
		return s.substring(lo, max);
	}
	
	public void palindrome(String s, int i, int j){
		while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
			i--; j++;
		}
		
		if(max < j-i-1){
			lo = i+1;
			max = j-i-1;
		}
	}
}
