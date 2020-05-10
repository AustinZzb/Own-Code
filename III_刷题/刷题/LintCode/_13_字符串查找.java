package LintCode;

import java.util.Scanner;
/**
 * 瀵逛簬涓�涓粰瀹氱殑 source 瀛楃涓插拰涓�涓� target 瀛楃涓�
 * 浣犲簲璇ュ湪 source 瀛楃涓蹭腑鎵惧嚭 target 瀛楃涓插嚭鐜扮殑绗竴涓綅缃�(浠�0寮�濮�)銆傚鏋滀笉瀛樺湪锛屽垯杩斿洖 -1銆�
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�28鏃�-涓嬪崍4:39:33
 */
public class _13_瀛楃涓叉煡鎵� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s_1 = scan.next();
		String s_2 = scan.next();
		
		char[] arr_1 = s_1.toCharArray();
		char[] arr_2 = s_2.toCharArray();
		
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < arr_1.length-arr_2.length+1; i++) {
			flag = true;
			for (int j = 0; j < arr_2.length; j++) {
				if (arr_1[i+j]!=arr_2[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count = i;
				break;
			}
		}
		
		if (flag) {
			System.out.print(count);
		}else {
			System.out.print(-1);
		}
		
	}

}
