package LeetCode;
/**
 * 反转链表
 * @author 张致邦
 *
 * 2020年2月1日-上午9:10:03
 */


public class LeetCode_206 {
	// 递归
	public ListNode reverseList2(ListNode head) {
	   
		if(head == null || head.next == null) return head;
		
		ListNode newhead = reverseList2(head.next);
		head.next.next = head;
		head.next = null;
		
		return newhead;
		
	}
	
	// 迭代
	public ListNode reverseList(ListNode head) {
		ListNode newhead = null;
		
		while(head != null) {
			ListNode curListNode = head.next;
			head.next = newhead;
			newhead = head;
			head = curListNode;
		}
		
		return newhead;
		
	}

}
