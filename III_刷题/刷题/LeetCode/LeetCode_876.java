package LeetCode;

/**
 * ������м�ڵ�(����ָ��)
 * 
 * @author ���°�
 *
 * 2020��2��1��-����10:22:08
 */

public class LeetCode_876 {

	public ListNode middleNode(ListNode head) {
        
		ListNode fastListNode = head;
		ListNode slowListNode = head;
		
		while (fastListNode != null && fastListNode.next != null) {
			fastListNode = fastListNode.next.next;
			slowListNode = slowListNode.next;
			
		}
		
		return slowListNode;
		
    }

}
