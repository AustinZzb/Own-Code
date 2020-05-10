package LeetCode;
/**
 * 缁欏嚭涓や釜聽闈炵┖ 鐨勯摼琛ㄧ敤鏉ヨ〃绀轰袱涓潪璐熺殑鏁存暟銆傚叾涓紝瀹冧滑鍚勮嚜鐨勪綅鏁版槸鎸夌収聽閫嗗簭聽鐨勬柟寮忓瓨鍌ㄧ殑锛屽苟涓斿畠浠殑姣忎釜鑺傜偣鍙兘瀛樺偍聽涓�浣嵚犳暟瀛椼��
 * 濡傛灉锛屾垜浠皢杩欎袱涓暟鐩稿姞璧锋潵锛屽垯浼氳繑鍥炰竴涓柊鐨勯摼琛ㄦ潵琛ㄧず瀹冧滑鐨勫拰銆�
 * 鎮ㄥ彲浠ュ亣璁鹃櫎浜嗘暟瀛� 0 涔嬪锛岃繖涓や釜鏁伴兘涓嶄細浠� 0聽寮�澶淬��
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�1鏃�-涓婂崍9:42:03
 */
public class LeetCode_2 {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	     
		ListNode head = new ListNode(0);
		ListNode cur = head;
		int carry = 0;
		
		while(l1 != null || l2 != null) {
			
			int x = l1 == null ? 0 : l1.val;
			int y = l2 == null ? 0 : l2.val;
			int sum = x + y + carry;
			
			carry = sum / 10;
			cur = cur.next = new ListNode(sum % 10);
			
			if(l1 != null)
				l1 = l1.next;
			if(l2 != null)
				l2 = l2.next;
			
		}
		
		if (carry != 0) {
			cur.next = new ListNode(carry);
		}
		
		return head.next;
		
    }

}
