package LeetcodeProblems;

public class ZigzagConversion {

	
	public static String convert(String s, int numRows) {
		if(s == null || s.length() == 0 || numRows <= 1){
			return s;
		}
		
		StringBuilder[] sbArr = new StringBuilder[numRows];
		
		int index = 0; int incre = 1;
		
		for(int i = 0; i < sbArr.length; i++){
			sbArr[i] = new StringBuilder();
		}
		
		for(int i = 0; i < s.length(); i++){
			sbArr[index].append(s.charAt(i));
			if(index == 0){
				incre = 1;
			}
			if(index == numRows-1){
				incre = -1;
			}
			index += incre;
		}
		
		String res = "";
		
		for(int i = 0; i < sbArr.length; i++){
			res += sbArr[i].toString();
		}
		
		return res;
	}
	
	public static void main(String[] args){
		String s = "AB"; int i =1;
		convert(s, 1);
	}
}
