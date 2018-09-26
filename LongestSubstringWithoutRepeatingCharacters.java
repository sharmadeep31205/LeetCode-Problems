package LeetcodeProblems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
		
		if(s == null || s.length() == 0){
			return 0;
		}
		
		Set<Character> set = new HashSet<>();
		
		int j = 0;
		
		int max = 0;
		
		for(int i = 0; i < s.length();){
			if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
				max = Math.max(max, set.size());
			}
			else{
				set.remove(s.charAt(j++));
			}
		}
		
		return max;
	}
}
