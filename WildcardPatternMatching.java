package LeetcodeProblems;

public class WildcardPatternMatching {
	
	
	public boolean wildcardMatch(String str, String pattern){
		if(str == null && pattern == null){
			return true;
		}
		
		char[] patternArr = pattern.toCharArray();
		
		int writeIndex = 0;
		boolean isFirst = true;
		
		for(int i = 0; i < pattern.length(); i++){
			if(patternArr[i] == '*'){
				if(isFirst){
					patternArr[writeIndex++] = patternArr[i];
					isFirst = false;
				}
			}
			else{
				patternArr[writeIndex++] = patternArr[i];
				isFirst = true;
			}
		}
		
		boolean[][] res = new boolean[str.length()+1][writeIndex+1];
		
		if (writeIndex > 0 && patternArr[0] == '*') {
            res[0][1] = true;
        }
		
		res[0][0] = true;
		
		for(int i = 1; i < res.length; i++){
			for(int j = 1; j < res[0].length; j++){
				if(str.charAt(i-1) == patternArr[j-1] || patternArr[j-1] == '?'){
					res[i][j] = res[i-1][j-1];
				}
				else if(patternArr[j-1] == '*'){
					if(res[i-1][j] || res[i][j-1]){
						res[i][j] = true;
					}
				}
				else{
					res[i][j] = false;
				}
			}
		}
		
		return res[res.length-1][res[0].length - 1];
	}
}
