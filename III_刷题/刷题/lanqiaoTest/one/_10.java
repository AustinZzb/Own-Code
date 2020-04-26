package lanqiaoTest.one;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
 *
 */

/**
 * @author 张致邦
 *
 * 2020年3月14日-下午4:07:46
 */
public class _10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int count = 1000*1000, temp = n, min = 0;
		while(temp != m) {
			for (int i = 0; i < n; i++) {
				if (arr[i] >= 0) {
					min = i;
					break;
				}
			}
			for (int i = 0; i < n; i++) {
				if (arr[i] >= 0 && arr[i] <= arr[min]) {
					min = i;
				}
			}
			arr[min] = -1;
			temp--;
		}
		boolean flag = true;
		for (int num: arr) {
			if (num >= 0) {
				if (flag) {
					System.out.print(num);
					flag = false;
				} else {
					System.out.print(" "+num);
				}
			} 
		}
		
	}	

}
