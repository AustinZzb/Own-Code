package LeetCode;
/**
 * 有序链表去重
 * @author 张致邦
 *
 * 2020年2月1日-上午10:52:20
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
