package 链表;
/**
 * A 参考leetcode_21(链表_合并两个有序链表)
 * @author 11586
 *
 */

public class 链表_合并K个有序链表 {
	
	/**
	 * A 分治算法（时间复杂度O（nlogk））
	 */
	public ListNode mergeKLists(ListNode[] lists) {
    	if(lists.length == 0) return null;
        
    	int t = 1;
    	while (t < lists.length) {
    		for (int i = 0; i < lists.length; i += t*2) {
    			lists[i] = mergeTwoLists(lists[i], lists[i + t]);
    		}
    		t *= 2;
		}
    	return lists[0];
    	
    }
	
	
	
	/**
	 * A 常规算法(时间复杂度O（kn）)
	 * @param lists
	 * @return
	 */
//	public ListNode mergeKLists(ListNode[] lists) {
//    	if(lists.length == 0) return null;
//        
//    	for (int i = 1; i < lists.length; i++) {
//			lists[0] = mergeTwoLists(lists[0], lists[i]);
//		}
//    	return lists[0];
//    	
//    }
    
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
