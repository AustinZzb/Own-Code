package 博弈问题;
/**
 * 题目：
 * 有3堆硬币，分别是3,4,5
 * 二人轮流取硬币。
 * 每人每次只能从某一堆上取任意数量。
 * 不能弃权。
 * 取到最后一枚硬币的为赢家。
 * 求先取硬币一方有无必胜的招法。
 * 
 * 题解： 利用异或求解，如果剩余堆球的数目异或结果（ans）为0，那么必输
 * 	          如果异或结果（ans）不为0，那么用ans去任意的异或剩余堆球中的一个，得到的结果合理则能这么进行
 * 
 * @author 张致邦
 *
 * 2020年2月4日-下午8:17:15
 */
public class _尼姆堆 {
	
	private static void fun(int[] a) {
		
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans ^= a[i];
		}
		if(ans == 0) System.out.println("必输");
		for (int i = 0; i < a.length; i++) {
			int x = ans ^ a[i];
			if(x < a[i]) System.out.println("你可以这样干 ：" + a[i] + "-->" + x);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 12, 5, 14};
		fun(a);
	}

}
