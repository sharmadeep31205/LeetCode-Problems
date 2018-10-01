package LeetcodeProblems;

public class SimplifyPath {
	
	public String simplifyString(String path){
		
		if(path == null || path.length() == 0){
			return path;
		}
		
		String[] dir = path.split("/");
		String[] stack = new String[dir.length];
		
		int ptr = 0;
		
		for(String str : dir){
			if(str.equals(".") || str.equals("")){
				continue;
			}
			else if(str.equalsIgnoreCase("..")){
				if(ptr > 0){
					ptr--;
				}
			}
			else{
				if(ptr >= 0 ){
					stack[ptr++] = str;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < ptr; i++){
			sb.append("/");
			sb.append(stack[i]);
		}
		
		return sb.length() == 0 ? "/" : sb.toString();
	}
}
