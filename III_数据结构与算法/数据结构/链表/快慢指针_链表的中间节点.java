package ����;

/**
 * ������м�ڵ�(����ָ��)
 * 
 * @author ���°�
 *
 * 2020��2��1��-����10:22:08
 */

public class ����ָ��_������м�ڵ� {

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
