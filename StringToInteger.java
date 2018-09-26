package LeetcodeProblems;

public class StringToInteger {
	
public int myAtoi(String str) {
        
        str = str.trim();
        
        if(str == null || str.length() == 0){
            return 0;
        }
        
        int sign = 1;
        int i = 0;
        if(str.charAt(0) == '-'){
            sign = -1;
            i = 1;
        }
        else if(str.charAt(0) == '+'){
            sign = 1;
            i = 1;
        }
        
        long res = 0;
        
        for(;i< str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                res *= 10;
                res += Character.getNumericValue(str.charAt(i));
                if(res > Integer.MAX_VALUE){
                    return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }
            else{
                return sign * (int)res;   
            }
        }
        
        return sign * (int)res;
    }
}
