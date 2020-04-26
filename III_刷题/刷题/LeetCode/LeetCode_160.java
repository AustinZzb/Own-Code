package LeetCode;
/**
 * �ж����������Ƿ��ཻ
 * ��ʾ�� ������������һ����������ཻ��ô����ָ��ͻ�����
 * 
 * @author ���°�
 *
 * 2020��2��2��-����5:18:19
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
