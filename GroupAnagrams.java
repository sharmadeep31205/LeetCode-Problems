package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
    
	    if(strs == null || strs.length == 0){
	        return list;
	    }
	    
	    Map<String, List<String>> map = new HashMap<>();
	    
	    for(String s : strs){
	    	String temp = s;
	        char[] t = temp.toCharArray();
	        Arrays.sort(t);
	        temp = String.valueOf(t);
	        
	        if(map.containsKey(temp)){
	        	List<String> l = map.get(temp);
	        	l.add(s);
	        	map.put(temp,  l);
	        }
	        else{
	        	List<String> res = new ArrayList<>();
	        	res.add(s);
	        	map.put(temp, res);
	        }
	    }
	    
	    for(List<String> lis : map.values()){
	    	list.add(lis);
	    }
	    
	    return list;
	}
}
