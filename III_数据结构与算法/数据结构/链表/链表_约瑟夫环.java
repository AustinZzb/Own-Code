package 链表;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * N个人坐成一个圆环（编号为1 - N），从第1个人开始报数，数到K的人出列，后面的人重新从1开始报数。问最后剩下的人的编号。
 * 例如：N = 3，K = 2。2号先出列，然后是1号，最后剩下的是3号。
 * 
 * @author 张致邦
 *
 * 2020年2月3日-下午4:58:36
 */

import com.sun.source.tree.Tree;

import 排序算法.ing_归并排序;
public class 链表_约瑟夫环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入有几个人参与游戏,然后输入第几个人出队");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		ListNode head = new ListNode(0);
		ListNode cur = head;
		
		for (int i = 1; i <= n; i++) {
			cur = cur.next = new ListNode(i);			
		}
		
		cur.next = head.next;
		//yusefu(head.next, m, n);
		System.out.println(cir(n, m));
		System.out.println(cir_good(n, m));
		
	}

	private static int cir_good(int n, int m) {
		return n == 1 ? 1 : (cir(n-1, m)+(m-1))%n+1;
	}
	
	private static int cir(int n,int m){
	    int p=0;
	    for(int i=2;i<=n;i++){
	        p=(p+m)%i;
	    }
	    return p+1;
	}
	
	private static void yusefu(ListNode now, int n, int count) {
		
		if(count == 1) {
			System.out.println("最后获胜者是----->"+now.val);
			return ;
		}			
		
		ListNode up = now;
		for (int i = 0; i < n-1; i++) {
			up = now;
			now = now.next;	
		}
		
		System.out.print(now.val+" ");
		up.next = now.next;
		
		yusefu(up.next, n, count-1);
		
	}
	

}
















