package LeetCode;

/**
 * A 删除链表中的某一给定结点
 * @author 张致邦
 *
 * 2020年1月31日-下午8:23:32
 */
public class LeetCode_237 {
	
	public void deleteNode(ListNode node) {
        
		node.val = node.next.val;
		node.next = node.next.next;

    }

}
