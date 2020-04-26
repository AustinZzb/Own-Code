package 链表;

public class 链表_有序链表去重 {

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
