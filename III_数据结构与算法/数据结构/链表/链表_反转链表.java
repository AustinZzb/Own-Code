package 链表;
import 链表.ListNode;

public class 链表_反转链表 {

	public ListNode reverseList(ListNode head) {
	   
		if(head == null || head.next == null) return head;
		
		ListNode newhead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		
		return newhead;
		
	}

}
