package lanqiao;

import java.util.Scanner;

/**
 * 　兔子的速度v1（表示每秒兔子能跑v1米），乌龟的速度v2，以及兔子对应的t，s值，以及赛道的长度l——就能预测出比赛的结果。
 * 请你写一个程序，对于输入的一场比赛的数据v1，v2，t，s，l，预测该场比赛的结果。
 * 兔子发现自己领先t米或以上，它们就会停下来休息s秒。对于不同的兔子，t，s的数值是不同的，
 * 但是所有的乌龟却是一致——它们不到终点决不停止。
 * @author 张致邦
 *10 5 5 2 20
 * 2020年2月15日-上午10:54:38
 */
public class BASIC_24 {
	private static void fun(int v1, int v2, int t, int s, int l) {
		int ans = 0, sum = 0;
		
		for (int i = 1; i <= l/v2; i++) {
			ans ++;
			sum += v1;		
			if(sum >= l) break;
			if((sum - v2 * i) >= t) {
				ans += s;
				i += s;
			}
			
		}
		
		if(ans == l/v2 && sum >= l) {
			System.out.println("D");
			System.out.println(ans);
		}else if(ans < l/v2) {
			System.out.println("R");
			System.out.println(ans);
		}else {
			System.out.println("T");
			System.out.println(l/v2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] n = new int[5];
		for (int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();
		}
		fun(n[0], n[1], n[2], n[3], n[4]);
	}

}
