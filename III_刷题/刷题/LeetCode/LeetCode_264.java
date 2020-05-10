package LeetCode;
/**
 * 编写一个程序，找出第 n 个丑数
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 * 
 * @author 张致邦
 *
 * 2020年1月31日-下午8:23:32
 */
import java.util.ArrayList;
import java.util.Scanner;

public class LeetCode_264 {
	
	/**
	 * A 将所有情况求出
	 */
	public static int nthUglyNumber(int n) {
		
		int  m = 1, ans = 1, a = 0, b = 0, c = 0;
		int[] arr = new int[1690];
		arr[m-1] = 1;
		while(true) {
			
			if (m > arr.length-1) {
				break;
			}
			
			ans = Math.min(Math.min(arr[a]*2, arr[b]*5), arr[c]*3);
			
			if(ans > arr[m-1]) {
				if(ans == arr[a]*2) a++;
				else if(ans == arr[b]*5) b++;
				else c++;
				m++;
				arr[m-1] = ans;
			}else if(ans == arr[a]*2) a++;
			else if(ans == arr[b]*3) b++;
			else c++;
			
		}
		
		return arr[n-1];
        
    }
	
	
	
	
	/**
	 * A 普通解法
	 * @param n
	 * @return
	 */
//	public static int nthUglyNumber(int n) {
//		
//		int m = 1, ans = 1, a = 0, b = 0, c = 0;
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		while(true) {
//			
//			if(m == n) return ans;
//			ans = Math.min(Math.min(list.get(a)*2, list.get(b)*3), list.get(c)*5);
//			
//			if(ans > list.get(m-1)) {
//				list.add(ans);
//				if(ans == list.get(a)*2) a++;
//				else if(ans == list.get(b)*3) b++;
//				else c++;
//				m++;
//			}else if(ans == list.get(a)*2) a++;
//			else if(ans == list.get(b)*3) b++;
//			else c++;
//			
//		}
//        
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(nthUglyNumber(n));
		
	}

}
