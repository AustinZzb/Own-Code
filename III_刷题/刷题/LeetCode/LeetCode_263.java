package LeetCode;
/**
 * 编写一个程序判断给定的数是否为丑数。
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 * 
 * @author 张致邦
 *
 * 2020年1月31日-下午8:23:32
 */
import java.util.Scanner;

public class LeetCode_263 {
	
	public static boolean isUgly(int num) {
		if(num <= 0) return false;
		
		while (num != 1) {
			if (num % 2 == 0) {
				num /= 2;
				continue;
			}else if (num % 3 == 0) {
				num /= 3;
				continue;
			}else if (num % 5 == 0) {
				num /= 5;
				continue;
			}
			return false;
		}
		
		return true;
	
    }
	
	
	
	/**
	 * A 递归
	 * @param args
	 */
//	public static boolean isUgly(int num) {
//		if (num == 1) {
//			return true;
//		}
//        
//		if (num <= 0 || (num % 2 != 0 && num % 3 != 0 && num % 5 != 0)) {
//			return false;
//		}else if(num == 2 || num == 3 || num == 5){
//			return true;
//		}
//		
//		boolean flag_1 = false;
//		boolean flag_2 = false;
//		boolean flag_3 = false;
//		
//		if(num % 2 == 0) flag_1 = isUgly(num/2);
//		if(num % 3 == 0) flag_2 = isUgly(num/3);
//		if(num % 5 == 0) flag_3 = isUgly(num/5);
//		
//		return flag_3 || flag_1 || flag_2;
//	
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(isUgly(num));

	}

}
