package others;
/**
 * 小明最近喜欢搭数字积木，
 * 一共有10块积木，每个积木上有一个数字，0~9。
 * 搭积木规则：
 * 每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
 * 最后搭成4层的金字塔形，必须用完所有的积木。
 * 下面是两种合格的搭法：
 *    0				0
 *   1 2		   3 1
 *  3 4 5		  7 5 2
 * 6 7 8 9		 9 8 6 4
 * 
 * @author 张致邦
 *
 * 2020年2月3日-下午9:08:53
 */
public class _搭积木 {
	static int sum = 0;
	
	public static void fun(int[] a, int k) {
		
		if(k == a.length - 1) {
			if(fun_1(a)) sum++;
			return ;
		}
		
		for (int i = k; i < a.length; i++) {
			int t = a[k]; a[k] = a[i]; a[i] = t;
			fun(a, k+1);
			t = a[k]; a[k] = a[i]; a[i] = t;
		}
		
	}

	private static boolean fun_1(int[] a) {
		// TODO Auto-generated method stub
		boolean[] flag = new boolean[5];
		flag[0] = a[1] < a[3] && a[1] < a[4];
		flag[1] = a[2] < a[4] && a[2] < a[5];
		flag[2] = a[3] < a[6] && a[3] < a[7];
		flag[3] = a[4] < a[7] && a[4] < a[8];
		flag[4] = a[5] < a[8] && a[5] < a[9];
		for (int i = 0; i < flag.length; i++) {
			if(!flag[i]) return false; 
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		fun(a, 1);
		System.out.println(sum);
	}

}
