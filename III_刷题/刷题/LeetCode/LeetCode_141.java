package LeetCode;

/**
 * �ж������Ƿ��л�������ָ�룩
 * ����һ�������ж��������Ƿ��л���
 * Ϊ�˱�ʾ���������еĻ�������ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ����
 * ��� pos �� -1�����ڸ�������û�л���
 * 
 * @author ���°�
 *
 * 2020��2��1��-����9:42:03
 */

public class LeetCode_141 {

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
