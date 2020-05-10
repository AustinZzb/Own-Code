package lanqiao;

import java.util.Scanner;
/**
 * 缁欏嚭涓�涓煩闃碉紝姹傚叾涓竴鍏辨湁澶氬皯涓笁闃跺够鏂�
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�2鏃�-涓嬪崍9:07:33
 */
public class _鐭╅樀姹備笁闃跺够鏂� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] t = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				t[i][j] = scan.nextInt();
			}
		}
		
		int t_1 = 0;
		
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<m-2;j++) {
				int n_1 = t[i][j]+t[i][j+1]+t[i][j+2];
				int n_2 = t[i+1][j]+t[i+1][j+1]+t[i+1][j+2];
				int n_3 = t[i+2][j]+t[i+2][j+1]+t[i+2][j+2];
				int n_4 = t[i][j]+t[i+1][j]+t[i+2][j];
				int n_5 = t[i][j+1]+t[i+1][j+1]+t[i+2][j+1];
				int n_6 = t[i][j+2]+t[i+1][j+2]+t[i+2][j+2];
				int n_7 = t[i][j]+t[i+1][j+1]+t[i+2][j+2];
				int n_8 = t[i+2][j]+t[i+1][j+1]+t[i][j+2];
				
				if(n_1==n_2&&n_1==n_3&&n_1==n_4&&n_1==n_5&&n_1==n_6&&n_1==n_7&&n_1==n_8)
					t_1++;
				
			}
		}
		
		System.out.println(t_1);

	}

}
