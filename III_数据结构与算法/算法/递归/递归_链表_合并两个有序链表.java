package 递归;

import 链表.ListNode;

public class 递归_链表_合并两个有序链表 {
	
	/**
	 * A 递归操作
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	
	}
	
}
