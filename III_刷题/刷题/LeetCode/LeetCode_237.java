package LeetCode;

/**
 * A ɾ�������е�ĳһ�������
 * @author ���°�
 *
 * 2020��1��31��-����8:23:32
 */
public class LeetCode_237 {
	
	public void deleteNode(ListNode node) {
        
		node.val = node.next.val;
		node.next = node.next.next;

    }

}
