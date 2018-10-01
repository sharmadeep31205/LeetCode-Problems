package LeetcodeProblems;

public class RemoveNthNodeFromEndOfList {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null){
            return head;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(n > 0 && fast != null){
        	fast = fast.next;
        	n--;
        }
        
        if(fast == null){
        	return head.next;
        }
        
        while(fast.next != null){
        	fast = fast.next;
        	slow = slow.next;
        }
        
        slow.next = slow.next == null ? null : slow.next.next;
        return head;
	}
}
