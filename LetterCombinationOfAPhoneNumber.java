package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {
	
	String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz"};
	
	public List<String> letterCombinations(String digits){
		
		List<String> list = new ArrayList<>();
		
		if(digits == null || digits.length() == 0){
			return list;
		}
		
		combination(list, 0, digits, "");
		
		return list;
	}
	
	public void combination(List<String> list, int index, String digit, String s){
		if(index >= digit.length()){
			list.add(s);
			return;
		}
		
		String letter = str[digit.charAt(index) - '0'];
		
		for(int i = 0; i < letter.length(); i++){
			combination(list, index+1, digit, s+letter.charAt(i));
		}
	}
}
