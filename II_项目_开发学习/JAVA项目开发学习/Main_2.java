import java.util.Scanner;

/**
 * 	@author 张致邦
 *
 * 	2020年5月10日-下午3:39:27
 */
public class Main_2 {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode cur = head;
		Scanner scan = new Scanner(System.in);
		String[] vals = scan.nextLine().split(" ");
		
		for (String string : vals) {
			int val = Integer.parseInt(string);
			cur = cur.next = new ListNode(val);
		}
		
		ListNode slow = head.next;
		ListNode fast = head.next;
		ListNode pre = null;
		while (fast != null && fast.next != null) {
			ListNode temp = slow;
			slow = slow.next;
			fast = fast.next.next;
			temp.next = pre;
			pre = temp;
		}
		
		if (fast != null) 
			slow = slow.next;
		
		boolean flag = true;
		while (pre != null) {
			if (pre.val != slow.val) {
				flag = false;
				break;
			}
			slow = slow.next;
			pre = pre.next;
		}
		
		if (flag) 
			System.out.print("True");
		else
			System.out.print("False");
		
		scan.close();
	}
	
}

class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode(int val) {
		this.val = val;
	}
}























