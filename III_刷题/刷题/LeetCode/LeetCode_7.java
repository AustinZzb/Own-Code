package LeetCode;
/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * @author 张致邦
 *
 * 2020年1月31日-下午8:23:32
 */
import java.util.Scanner;

public class LeetCode_7 {
	
	public static int reverse(int x) {
        
		long ans = 0;
		
		char[] arr = (x + "").toCharArray();
		for (int i = arr.length-1; i >= 0 ; i--) {
			ans = ans * 10 + Integer.parseInt(String.valueOf(arr[i]));
		}
		
//		while(x!=0) {
//			ans += ans * 10 + x % 10;
//			x /= 10;
//		}
		
		return (int)ans == ans ? (int)ans : 0;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(reverse(n));

	}

}
