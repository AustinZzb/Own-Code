package LeetCode;
/**
 * ��������ȥ��
 * @author ���°�
 *
 * 2020��2��1��-����10:52:20
 */
public class LeetCode_83 {

	public ListNode deleteDuplicates(ListNode head) {
        
		if(head == null) return head;
		
		ListNode cur = head;
		while (cur != null && cur.next != null) {
			if(cur.val == cur.next.val)
				cur.next = cur.next.next;
			else
				cur = cur.next;
		}
		
		return head;
		
    }

}
