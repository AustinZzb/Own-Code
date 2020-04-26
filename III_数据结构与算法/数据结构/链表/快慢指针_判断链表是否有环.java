package ����;

/**
 * �ж������Ƿ��л�������ָ�룩
 * 
 * @author ���°�
 *
 * 2020��2��1��-����9:42:03
 */

public class ����ָ��_�ж������Ƿ��л� {

	public boolean hasCycle(ListNode head) {
        
		if(head == null || head.next == null) return false;
		
		ListNode fast = head.next;
		ListNode slow = head;
		
		while(fast != slow) {
			slow = slow.next;
			if(fast != null && fast.next != null)
				fast = fast.next.next;
            else
                return false; 
		}
		
		return true;
		
    }

}
