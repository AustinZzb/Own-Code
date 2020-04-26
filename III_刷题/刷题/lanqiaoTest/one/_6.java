package lanqiaoTest.one;
import java.util.Scanner;

/*
 *
 */

/**
 * @author 张致邦
 *
 * 2020年3月14日-下午2:27:32
 */
public class _6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), ans = 9;
		
		for (int t = 11; t <= n; t++) {
			int i = t, up = i%10;
			i /= 10;
			while (i != 0) {
				int now = i % 10;
				if (now > up)
					break;
				up = now;
				i /= 10;
				if (i == 0)
					ans++;
			}
		}
		System.out.println(ans);

	}

}
