package LeetcodeProblems;

import java.util.Arrays;

public class LongestCommonPrefix {

	
	public static String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0){
            return "";
        }
        
        Arrays.sort(strs);
        
        String str1 = strs[0];
        
        String str2 = strs[strs.length-1];
        
        int length = str1.length() < str2.length() ? str1.length() : str2.length();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < length; i++){
        	if(str1.charAt(i) == str2.charAt(i)){
        		sb.append(str1.charAt(i));
        	}
        	else{
        		break;
        	}
        }
        
        return sb.toString();
	}
}
