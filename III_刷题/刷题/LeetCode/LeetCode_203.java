package LeetCode;
/**
 * ɾ�������������ֵval��ȵ����нڵ�
 * @author ���°�
 *
 * 2020��2��1��-����10:54:01
 */
public class LeetCode_203 {
	
	public ListNode removeElements(ListNode head, int val) {
        ListNode head_0 = new ListNode(0);
		head_0.next = head;
		
		ListNode cur = head,pre = head_0;
		while(cur != null) {
			if(cur.val == val) {
				pre.next = cur.next;
			}else {
                pre = cur;
            }  
				cur = cur.next;
		}
		
		return head_0.next;
    }
	
}
