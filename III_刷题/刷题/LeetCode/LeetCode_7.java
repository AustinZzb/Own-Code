package LeetCode;
/**
 * ����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��
 * 
 * @author ���°�
 *
 * 2020��1��31��-����8:23:32
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
