package lanqiaoTest.one;
import java.util.Scanner;
/**
 * 1.94 2.15488 3.2018 4.544
 * @author 张致邦
 *
 * 2020年3月14日-下午4:26:03
 */
public class _5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int ans = 0;
		
		for (int i = 1; i < n-1; i++) {
			boolean flag_1 = false;
			for (int j = i-1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					flag_1 = true;
					break;
				}
			}
			if (flag_1) {
				for (int j = i+1; j < n; j++) {
					if (arr[j] > arr[i]) {
						ans++;
						break;
					}
				}
			}
		}
		
		System.out.println(ans);
		
	}
}
