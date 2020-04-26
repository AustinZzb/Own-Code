/**		约瑟夫环
 * N个人坐成一个圆环（编号为1 - N），从第1个人开始报数，数到K的人出列，后面的人重新从1开始报数。问最后剩下的人的编号。
 * 例如：N = 3，K = 2。2号先出列，然后是1号，最后剩下的是3号。
 */
package 经典算法;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * @author 张致邦
 *
 * 2020年2月3日-下午4:58:36
 */

import com.sun.source.tree.Tree;

import 排序算法.ing_归并排序;
public class _约瑟夫环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入有几个人参与游戏,然后输入第几个人出队");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		System.out.println(cir(n, m));
		System.out.println(cir_0(n, m));
		System.out.println(cir_1(n, m));
		
	}
	
	// @note 模拟法
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
















