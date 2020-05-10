package Test;
/**
 * 使用 1-9 九个数字，填写 &&& + &&& = &&& 每个数字只可以使用一次 
 * 
 * @author 张致邦
 *
 * 2020年2月9日-上午10:18:53
 */
public class _填算式 {
	
	private static void dfs(int[] a, int n) {
		
		if(n == 9) {
			
			if(test(a)) {
				for (int i = 0; i < a.length; i++) {
					if(i == 3) System.out.print(" + ");
					if(i == 6) System.out.print(" = ");
					System.out.print(a[i]);
				}
				System.out.println();
			}
			
			return;
		}
		
		for (int i = 1; i <= 9; i++) {
			if(test_1(a, i)) {
				a[n] = i;
				dfs(a, n+1);
				a[n] = 0;
			}
		}
		
	}

	private static boolean test_1(int[] a, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			if(n == a[i]) return false;
		}
		return true;
	}

	private static boolean test(int[] a) {
		// TODO Auto-generated method stub
		String m_1 = a[0] + "" + a[1] + "" + a[2] + "";
		String m_2 = a[3] + "" + a[4] + "" + a[5] + "";
		String m_3 = a[6] + "" + a[7] + "" + a[8] + "";
		if((Integer.parseInt(m_1) + Integer.parseInt(m_2)) == Integer.parseInt(m_3))
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs(new int[9], 0);
	}

}
