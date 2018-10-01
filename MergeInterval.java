package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class MergeInterval {
	
	public List<Interval> merge(List<Interval> intervals) {
		if(intervals == null || intervals.size() == 0){
			return intervals;
		}
		
		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2){
				return i1.start - i2.start;
			}
		});
		
		List<Interval> res = new ArrayList<>();
		
		Stack<Interval> stack = new Stack<>();
		stack.push(intervals.get(0));
		
		for(Interval i : intervals){
			if(!stack.isEmpty()){
				if(stack.peek().end >= i.start){
					if(stack.peek().end >= i.end){
						continue;
					}
					else{
						Interval temp = stack.pop();
						temp.end = i.end;
						stack.push(temp);
					}
				}
				else{
					stack.push(i);
				}
			}
		}
		
		while(!stack.isEmpty()){
			res.add(stack.pop());
		}
		
		return res;
	}
}
