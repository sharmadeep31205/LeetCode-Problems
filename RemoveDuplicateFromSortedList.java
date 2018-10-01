package LeetcodeProblems;

public class RemoveDuplicateFromSortedList {
	
	public ListNode deleteDuplicates(ListNode temp) {
		if(temp == null){
			return temp;
		}
		
		ListNode head = temp;
		
		while(head != null && head.next != null){
			if(head.val == head.next.val){
				head.next = head.next.next;
			}
			else{
				head = head.next;
			}
		}
		
		return temp;
	}
}
