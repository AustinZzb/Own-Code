/**		Լɪ��
 * N��������һ��Բ�������Ϊ1 - N�����ӵ�1���˿�ʼ����������K���˳��У�����������´�1��ʼ�����������ʣ�µ��˵ı�š�
 * ���磺N = 3��K = 2��2���ȳ��У�Ȼ����1�ţ����ʣ�µ���3�š�
 */
package �����㷨;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * @author ���°�
 *
 * 2020��2��3��-����4:58:36
 */

import com.sun.source.tree.Tree;

import �����㷨.ing_�鲢����;
public class _Լɪ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������м����˲�����Ϸ,Ȼ������ڼ����˳���");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		System.out.println(cir(n, m));
		System.out.println(cir_0(n, m));
		System.out.println(cir_1(n, m));
		
	}
	
	// @note ģ�ⷨ
	private static int cir_0(int n, int m) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		
		int index = 0;
		while (n > 1) {
			index = (index + m - 1) % n;
			list.remove(index);
			n--;
		}
		
		return list.get(0)+1;
	}

	private static int cir_1(int n, int m) {
		return n == 1 ? 1 : (cir(n-1, m)+(m-1))%n+1;
	}
	
	private static int cir(int n,int m){
	    int p=0;
	    for(int i=2;i<=n;i++){
	        p=(p+m)%i;
	    }
	    return p+1;
	}

}
















