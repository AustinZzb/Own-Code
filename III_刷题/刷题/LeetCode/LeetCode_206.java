package LeetCode;
/**
 * ��ת����
 * @author ���°�
 *
 * 2020��2��1��-����9:10:03
 */


public class LeetCode_206 {
	// �ݹ�
	public ListNode reverseList2(ListNode head) {
	   
		if(head == null || head.next == null) return head;
		
		ListNode newhead = reverseList2(head.next);
		head.next.next = head;
		head.next = null;
		
		return newhead;
		
	}
	
	// ����
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
