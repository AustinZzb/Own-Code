package 链表;

/**
 * 链表的中间节点(快慢指针)
 * 
 * @author 张致邦
 *
 * 2020年2月1日-上午10:22:08
 */

public class 快慢指针_链表的中间节点 {

	public ListNode middleNode(ListNode head) {
        
		ListNode fastListNode = head;
		ListNode slowListNode = head;
		
		while (fastListNode != null && fastListNode.next != null) {
			fastListNode = fastListNode.next.next;
			slowListNode = slowListNode.next;
			
		}
		
		return slowListNode;
		
    }

}
