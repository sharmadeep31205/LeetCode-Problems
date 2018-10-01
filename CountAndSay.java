package LeetcodeProblems;

public class CountAndSay {
	
	public static String countAndSay(int n) {
		String res = "1";
		
		StringBuilder sb = new StringBuilder();
		
		for(int j = 1; j < n; j++){
			int count = 1;
			
			for(int i = 0; i < res.length(); i++){
				if(i > 0 && res.charAt(i-1) == res.charAt(i)){
					count++;
				}
				else if(i > 0){
					sb.append(count).append(res.charAt(i-1));
					count = 1;
				}
			}
			sb.append(count).append(res.charAt(res.length()-1));
			res = sb.toString();
			sb = new StringBuilder();
		}
		
		return res;
    }
	
	public static void main(String[] args){
		int n = 5;
		String res = countAndSay(n);
		System.out.println(res);
	}
}
