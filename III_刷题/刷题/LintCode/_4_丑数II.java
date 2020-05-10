package LintCode;

// 涓戞暟锛岃В棰樻�濊矾锛氫笐鏁板彧鑳界敱涓戞暟浜х敓
import java.util.Scanner;

public class _4_涓戞暟II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] m = new int[n];
		int p1 = 0, p2 = 0, p3 = 0;
		m[0] = 1;
		
		for(int i=1;i<n;i++) {
			m[i] = min(m[p1]*2,m[p2]*3,m[p3]*5);
			if(m[i] == m[p1]*2)
				p1++;
			if(m[i] == m[p2]*3)
				p2++;
			if(m[i] == m[p3]*5)
				p3++;
		}
		
		System.out.print(m[n-1]);
		
	}
	
	public static int min(int m,int n, int k) {
		int a = m<(n<k ? n: k)? m : (n<k ? n: k);
		return a;
	}

}
