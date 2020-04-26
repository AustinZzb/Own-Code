package LeetCode;
/**
 * 合并K个有序链表
 * A 参考leetcode_21(链表_合并两个有序链表)
 * @author 11586
 *
 */

public class LeetCode_23 {

    public ListNode mergeKLists(ListNode[] lists) {
    	if(lists.length == 0) return null;
        
    	for (int i = 1; i < lists.length; i++) {
			lists[0] = mergeTwoLists(lists[0], lists[i]);
		}
    	return lists[0];
    	
    }
    
    /**
	 * A 递归操作
	 */
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		
//		if(l1 == null) return l2;
//		if(l2 == null) return l1;
//		
//		if (l1.val < l2.val) {
//			l1.next = mergeTwoLists(l1.next, l2);
//			return l1;
//		}else {
//			l2.next = mergeTwoLists(l1, l2.next);
//			return l2;
//		}
//		
//	}
	
	
	
	
	/**
	 * A 使用虚拟头节点
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode head = new ListNode(0);  // 虚拟头节点
		ListNode cur = head;
		while (l1 != null && l2 != null) {
			
			if (l1.val < l2.val) {
				cur = cur.next = l1;
				l1 = l1.next;
			}else {
				cur = cur.next = l2;
				l2 = l2.next;
			}	
			
		}
		
		if (l1 == null) {
			cur.next = l2;
		}else if (l2 == null) {
			cur.next = l1;
		}
		
		return head.next;
		
	}
	
}
