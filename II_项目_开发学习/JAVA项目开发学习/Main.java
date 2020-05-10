import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] val = scan.nextLine().split(" ");
		int n = scan.nextInt();
		
		Node head = new Node(0);
		Node cur = head;
		for (String string : val) {
			if (string.equals("NULL"))
				break;
			int m = Integer.parseInt(string);
			cur = cur.next = new Node(m);
		}
		
		cur = head;
		Node pre = head.next;
		while (pre != null) {
			if (pre.val == n) {
				pre = pre.next;
				cur.next = pre;
				continue;
			}
			cur = cur.next;
			pre = pre.next;
		}
		
		head = head.next;
		while (head != null) {
			System.out.print(head.val+" ");
			head = head.next;
		}
		System.out.print("NULL");
		
		scan.close();
	}

}

class Node {
	public int val;
	public Node next;
	public Node(int val) {
		this.val = val;
	}
}