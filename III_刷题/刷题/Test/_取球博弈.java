package Test;

import java.util.Scanner;

/**
 * 现在有一堆小球，两个人轮流从球堆中取1 || 3 || 7 || 8个小球，取到最后一个小球的人输
 * 求先取的人是否可以获胜
 * 
 * @author 张致邦
 *
 * 2020年2月8日-上午10:28:19
 */
public class _取球博弈 {
	
	private static void fun(int n) {
		int[] arr = new int[10000];
		arr[1] = 0;
		arr[2] = 1;
		arr[3] = 0;
		arr[4] = 1;
		arr[5] = 0;
		arr[6] = 1;
		arr[7] = 0;
		arr[8] = 0;
		arr[9] = 1;
		
		for (int i = 9; i < n+1; i++) {
			if(arr[i-1] == 0) arr[i]= 1;
			else if(arr[i-3] == 0) arr[i] = 1;
			else if(arr[i-7] == 0) arr[i] = 1;
			else if(arr[i-8] == 0) arr[i] = 1;
		}
		
		if(arr[n] == 0) System.out.println("你输了！");
		else System.out.println("YOU ARE WIN !");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入球的个数 ： ");
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			fun(scan.nextInt());			
		}
	}

}
