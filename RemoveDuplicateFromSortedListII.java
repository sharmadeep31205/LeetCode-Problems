package LeetcodeProblems;

public class RemoveDuplicateFromSortedListII {
	
	
	 public ListNode deleteDuplicates(ListNode head) {
	        
	        if(head == null || head.next == null){
	            return head;
	        }
	        
	        ListNode dummy = new ListNode(0);
	        ListNode pre = dummy;
	        ListNode curr = head;
	        pre.next = head;
	        
	        while(curr != null){
	        	while(curr.next != null && curr.val == curr.next.val){
	        		curr= curr.next;
	        	}
	        	
	        	if(pre.next == curr){
	        		pre = pre.next;
	        	}
	        	else{
	        		pre.next = curr.next;
	        	}
	        	
	        	curr = curr.next;
	        }
	        
	        return dummy.next;
	 }
}
