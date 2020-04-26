package 链表;

/**
 * 判断链表是否有环（快慢指针）
 * 
 * @author 张致邦
 *
 * 2020年2月1日-上午9:42:03
 */

public class 快慢指针_判断链表是否有环 {

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
