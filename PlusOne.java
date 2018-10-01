package LeetcodeProblems;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		if(digits == null || digits.length == 0){
			return new int[0];
		}
		
		for(int i = digits.length-1 ; i >= 0; i--){
			if(digits[i] != 9){
				digits[i]++;
				return digits;
			}
			else{
				digits[i] = 0;
			}
		}
		
		if(digits[0] == 0){
			int[] res = new int[digits.length+1];
			res[0] = 1;
			return res;
		}
		return digits;
	}
}
