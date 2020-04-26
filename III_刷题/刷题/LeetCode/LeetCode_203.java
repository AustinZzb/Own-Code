package LeetCode;
/**
 * 删除链表中与给定值val相等的所有节点
 * @author 张致邦
 *
 * 2020年2月1日-上午10:54:01
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
