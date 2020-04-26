package lanqiao;

/**
 * 参考：others ———— Set_有重复元素_从数组中取n个元素
 * X星球要派出一个5人组成的观察团前往W星。
 * 其中：
 * A国最多可以派出4人。B国最多可以派出2人。
 * C国最多可以派出2人。D国最多可以派出1人。
 * E国最多可以派出1人。F国最多可以派出3人。
 * 那么最终派往W星的观察团会有多少种国别的不同组合呢？
 * 
 * @author 张致邦
 *
 * 2020年2月4日-下午4:22:20
 */
public class _代表团出访 {
	private static int sum = 0;
	
	private static void fun(int[] a, int[] b, int n, int m) {
		
		if(n == b.length) {
			if(m == 0) {
				sum++;
				for (int i = 0; i < b.length; i++) {
					for(int j = 0; j < b[i]; j++)
						System.out.print((char)('A'+i));
				}
				System.out.println();
			}
			return ;
		}
		
		for (int i = 0; i <= Math.min(a[n], m) ; i++) {
			b[n] = i;
			fun(a, b, n+1, m-i);
		}
		b[n] = 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 2, 2, 1, 1, 3};
		int[] b = new int[6];
		fun(a, b, 0, 5);
		System.out.println(sum);
	}

}
