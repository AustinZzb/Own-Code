package ����;

/**
 * A �ϲ�������������
 * 1���ݹ����
 * 2����������ͷ�ڵ�
 * 3���������
 * @author 11586
 *
 */

public class ����_�ϲ������������� {
	
	/**
	 * A �ݹ����
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
	 * A ʹ������ͷ�ڵ�
	 */
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		
//		if(l1 == null) return l2;
//		if(l2 == null) return l1;
//		
//		ListNode head = new ListNode(0);  // ����ͷ�ڵ�
//		ListNode cur = head;
//		while (l1 != null && l2 != null) {
//			
//			if (l1.val < l2.val) {
//				cur = cur.next = l1;
//				l1 = l1.next;
//			}else {
//				cur = cur.next = l2;
//				l2 = l2.next;
//			}	
//			
//		}
//		
//		if (l1 == null) {
//			cur.next = l2;
//		}else if (l2 == null) {
//			cur.next = l1;
//		}
//		
//		return head.next;
//		
//	}
	
	
	
	
	/**
	 * A �������
	 */
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        
//		if(l1 == null) return l2;
//		if(l2 == null) return l1;
//		
//		ListNode head;
//		if (l1.val < l2.val) {
//			head = l1;
//			l1 = l1.next;
//		}else {
//			head = l2;
//			l2 = l2.next;
//		}
//		
//		ListNode cur = head;
//		while (l1 != null && l2 != null) {
//			
//			if (l1.val < l2.val) {
//				cur = cur.next = l1;
//				l1 = l1.next;
//			}else {
//				cur = cur.next = l2;
//				l2 = l2.next;
//			}	
//			
//		}
//		
//		if (l1 == null) {
//			cur.next = l2;
//		}else if (l2 == null) {
//			cur.next = l1;
//		}
//		
//		return head;
//		
//    } 
	
}











