package ����;
/**
 * A �ο�leetcode_21(����_�ϲ�������������)
 * @author 11586
 *
 */

public class ����_�ϲ�K���������� {
	
	/**
	 * A �����㷨��ʱ�临�Ӷ�O��nlogk����
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
	 * A �����㷨(ʱ�临�Ӷ�O��kn��)
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
