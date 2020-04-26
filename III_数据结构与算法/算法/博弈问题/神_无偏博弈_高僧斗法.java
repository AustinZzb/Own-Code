package 博弈问题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 无偏博弈多可以转换为尼姆堆问题。提示：让小和尚两两组队，其中间的台阶数即为尼姆数！
 * 
 * A 输入几个小和尚的位置，两位高僧指挥某一个小和尚向前走任意距离（不能跳过其他小和尚），直到一位高僧指挥时，无路可走判输。
 * 
 * @author 张致邦
 *
 * 2020年1月31日-下午7:59:26
 */
public class 神_无偏博弈_高僧斗法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] string = scan.nextLine().split("\\ ");
		int[] a = new int[string.length];
		for (int i = 0; i < string.length; i++) {
			a[i] = Integer.parseInt(string[i]);
		}
		fun(a);
	}

	private static void fun(int[] a) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = a[i]+1; j < a[i+1]; j++) {
				
				int old = a[i];
				try {
					a[i] = j;
					if(ans(a) == false) {
						System.out.println(old+"-->"+j);
						return;
					}
				} finally {
					a[i] = old;
				}
				
			}
		}
		
	}
	
	private static boolean ans(int[] a) {
		
		int sum = 0;
		for (int i = 0; i < a.length-1; i+=2) {
			sum ^= a[i+1] - a[i] - 1;
		}
		
		return sum != 0;
		
	}

}
















