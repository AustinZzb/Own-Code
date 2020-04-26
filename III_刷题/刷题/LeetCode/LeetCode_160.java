package LeetCode;
/**
 * 判断两个链表是否相交
 * 提示： 将两个链表串成一个环，如果相交那么两个指针就会相遇
 * 
 * @author 张致邦
 *
 * 2020年2月2日-下午5:18:19
 */
public class LeetCode_160 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) return null;

        ListNode pA = headA, pB = headB;
        while(pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }

        return pA;

    }
	
}
