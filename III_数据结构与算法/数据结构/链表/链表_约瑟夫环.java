package ����;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * N��������һ��Բ�������Ϊ1 - N�����ӵ�1���˿�ʼ����������K���˳��У�����������´�1��ʼ�����������ʣ�µ��˵ı�š�
 * ���磺N = 3��K = 2��2���ȳ��У�Ȼ����1�ţ����ʣ�µ���3�š�
 * 
 * @author ���°�
 *
 * 2020��2��3��-����4:58:36
 */

import com.sun.source.tree.Tree;

import �����㷨.ing_�鲢����;
public class ����_Լɪ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������м����˲�����Ϸ,Ȼ������ڼ����˳���");
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
			System.out.println("����ʤ����----->"+now.val);
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
















