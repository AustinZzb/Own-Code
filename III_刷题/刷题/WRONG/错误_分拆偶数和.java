package WRONG;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 把一个偶数拆成两个不同素数的和，有几种拆法呢？
 * 输入包含一些正的偶数，其值不会超过10000，个数不会超过500，若遇0，则结束。
 * 
 * 错误原因：   超时！！！
 * 
 * @author 张致邦
 *
 * 2020年2月3日-下午5:01:21
 */
public class 错误_分拆偶数和 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i < 10000; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				list.add(i);
			}
		}
		
		while(true) {
			int n = scan.nextInt();
			if(n == 0) break;
			int sum = 0;
			for (int i = 2; i < n/2; i++) {
				if(list.contains(n - i) && list.contains(i)) {
					sum ++;
				}
			}
			System.out.println(sum);
		}

	}

}
