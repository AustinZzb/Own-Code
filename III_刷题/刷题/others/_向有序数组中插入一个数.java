package others;
/**
 * 给定一个有序数组，再输入一个数x，输出比x大的第一个数
 * 
 * @author 张致邦
 *
 * 2020年2月6日-下午12:35:15
 */
public class _向有序数组中插入一个数 {
	
	private static int fun(int[] a, int n) {
		
		if(n >= a[a.length - 1]) return a.length;
		
		return fun_1(a, 0, a.length - 1, n);
		
	}

	private static int fun_1(int[] a, int begin, int end, int n) {
		// TODO Auto-generated method stub
		if(end - begin == 1) {
			
			if(a[begin] >= n) return begin;
			return end;
			
		}
		
		int index = (begin + end) / 2;
		
		if(a[index] > n) return fun_1(a, begin, index, n);
		else return fun_1(a, index, end, n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(new int[] {1,5,8,9}, 10));
	}

}
