import java.util.Scanner;

/**
 * @author 张致邦
 *
 * 2020年3月16日-下午8:43:34
 */
public class Main {
	private static char n;
	
	public static void main(String[] args) {
		System.out.println(n);
//		fun();
	}
	
	private static void fun() {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt(), ans = 0;
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = in.nextInt();
		}
		
		while (!test(arr)) {
			
			int[] temp = new int[m];
			for (int i = 0; i < m; i++) {
				int t = (i+1)%m;
				temp[i] = arr[t]/2+arr[i]/2;
				ans += temp[i]%2;
				temp[i] += temp[i]%2;
			}
			
			arr = temp;	
		}
		
		in.close();
		System.out.println(ans);
	}

	private static boolean test(int[] arr) {
		int n = arr[0];
		
		for (int temp: arr) {
			if (temp != n)
				return false;
		}
		
		return true;
	}


	
}
