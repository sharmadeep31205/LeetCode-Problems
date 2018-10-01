package LeetcodeProblems;

import java.util.Stack;

public class LongestValidParentheses {
	/*In this basically keep marking the correct pair as 1 and then at then end after the 
	whole string conversion just check max consecutive sequence of 1*/
	public int longestValidParentheses(String s) {
		if(s == null || s.length() == 0){
			return 0;
		}
		
		Stack<Integer> stack = new Stack<>();
		
		int[] data = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '('){
				stack.push(i);
			}
			else{
				if(!stack.isEmpty()){
					data[i] = 1;
					data[stack.pop()] = 1;
				}
			}
		}
		
		int res = 0; int temp = 0;
		for(int i : data){
			if(i == 1){
				temp++;
			}
			else{
				res = Math.max(res,  temp);
				temp = 0;
			}
		}
		
		return Math.max(res,  temp);
	}

}
