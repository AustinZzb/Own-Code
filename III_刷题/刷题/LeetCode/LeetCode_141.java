package LeetCode;

/**
 * 判断链表是否有环（快慢指针）
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。
 * 
 * @author 张致邦
 *
 * 2020年2月1日-上午9:42:03
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
