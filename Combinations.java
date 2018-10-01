package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	
	public List<List<Integer>> combine(int n, int k) {
		
		List<List<Integer>> list = new ArrayList<>();
		
		if(n <= 0){
			return list;
		}
		
		combination(list, new ArrayList<Integer>(), 1, n, k);
		
		return list;
	}
	
	public void combination(List<List<Integer>> list, List<Integer> tempList, int start, int n, int k){
		if(tempList.size() == k){
			list.add(new ArrayList<>(tempList));
			return;
		}
		
		for(int i = start; i <= n; i++){
			tempList.add(i);
			combination(list, tempList, i+1, n, k);
			tempList.remove(tempList.size()-1);
		}
	}
}
