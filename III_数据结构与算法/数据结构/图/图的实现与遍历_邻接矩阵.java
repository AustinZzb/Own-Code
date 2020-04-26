package ͼ;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * ����ͼ��ʵ�֣�ʹ�õ����ڽӾ���洢��
 * ����ʹ�õķ�����dfs��bfs
 * 
 * ���밸����
 * 5
 * 1 2		2 4		1 3		1 5		3 5
 * 
 * @author ���°�
 *
 * 2020��2��10��-����9:41:21
 */
public class ͼ��ʵ�������_�ڽӾ��� {
	
	private static int[][] arr;         // �洢ͼ
	private static int[] book;          // ͼ�ڵ�ı������
	private static int sum = 0; 		// ���ʶ�������
	
	private static void bfs(int n) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(n);
		book[n] = 1;
		
		for (int i = 0; i < queue.size(); i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[queue.element()][j] == 1 && book[j] == 0) {
					queue.offer(j);
					book[j] = 1;
				}
					
			}
			System.out.print(queue.poll()+" ");
			i = -1;
		}
		
		
	}
	
	private static void dfs(int n) {
		
		book[n] = 1;
		System.out.print(n+" ");
		sum ++;
		if(sum == arr.length-1) return ;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[n][i] == 1 && book[i] == 0) {   // ����������бߣ����Ҹö��㲢δ������
				book[i] = 1;
				dfs(i);
			}
		}
		
		return ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input �� ������������N,M��������������M��������ʾͼ�еĹ�ϵ");
		int m = scan.nextInt();
		int n = scan.nextInt();
		arr = new int[m+1][m+1];
		book = new int[m+1];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j) arr[i][j] = 0;
				else arr[i][j] = 8;
			}
		}
		
		for (int t = 0; t < n; t++) {   // ����ͼ�����ǻ����
			int i = scan.nextInt();
			int j = scan.nextInt();
			arr[i][j] = 1;
			arr[j][i] = 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
//		dfs(1);
		bfs(1);

	}

}










