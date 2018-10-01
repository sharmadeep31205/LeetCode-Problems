package LeetcodeProblems;

public class SwapNodesInPairs {

	public static ListNode swapPairs(ListNode head) {
		if(head == null){
			return head;
		}
		
		/*ListNode curr = head;
		ListNode newHead = head.next;
		
		while(curr != null && curr.next != null){
			ListNode temp = curr.next;
			curr.next = curr.next.next;
			temp.next = curr;
			curr = curr.next;
		}
		
		return newHead;*/
		
		ListNode node = head.next;
		head.next = swapPairs(head.next.next);
		node.next = head;
		
		return node;
	}
	
	public static void main(String[] args){
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		swapPairs(node);
	}
}
