package others;
/**
 * ����һ���������飬������һ����x�������x��ĵ�һ����
 * 
 * @author ���°�
 *
 * 2020��2��6��-����12:35:15
 */
public class _�����������в���һ���� {
	
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
