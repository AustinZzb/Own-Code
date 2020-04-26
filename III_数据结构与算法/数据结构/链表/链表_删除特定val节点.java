package 链表;
import 链表.ListNode;

public class 链表_删除特定val节点 {
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
