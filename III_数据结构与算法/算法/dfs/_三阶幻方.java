package dfs;

public class _Èý½×»Ã·½ {
	public static int[] a = new int[9];
	
	public static boolean dfs_0() {
		int[] b = new int[8];
		b[0] = a[0] + a[1] + a[2];
		b[1] = a[3] + a[4] + a[5];
		b[2] = a[6] + a[7] + a[8];
		b[3] = a[0] + a[3] + a[6];
		b[4] = a[4] + a[1] + a[7];
		b[5] = a[5] + a[8] + a[2];
		b[6] = a[0] + a[4] + a[8];
		b[7] = a[6] + a[4] + a[2];
		for (int i = 1; i < b.length; i++) {
			if(b[i] != b[0]) return false;
		}
		return true;
	}
	
	public static boolean dfs_1(int n) {
		for (int i = 0; i < a.length; i++) {
			if(n == a[i]) return false;
		}
		return true;
		
	}

	public static void dfs(int n) {
		
		if(n == 9) {
			if (dfs_0()) {
				for (int i = 0; i < a.length; i++) {
					if(i == 3 || i == 6) System.out.println();
					System.out.print(a[i]+" ");
				}
				System.out.println();
				System.out.println();
			}
			return ;
		}
		
		for (int i = 1; i <= a.length; i++) {
			if (a[n] == 0 && dfs_1(i)) {
				a[n] = i;
				dfs(n+1);
				a[n] = 0;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs(0);
	}

}
