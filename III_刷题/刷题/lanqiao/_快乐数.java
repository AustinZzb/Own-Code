package lanqiao;

import java.util.Scanner;
/**
 * 2 8 鈫� 2虏+8虏=68 鈫� 6虏+8虏=100 鈫� 1虏+0虏+0虏=1
 * 
 * 涓�涓暟瀛楃殑杩涜濡備笂鍙樻崲锛屽鏋滄渶缁堣兘鍙樹负1鍒欎负蹇箰鏁�
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�2鏃�-涓嬪崍9:01:08
 */
public class _蹇箰鏁� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			
			int n = scan.nextInt();
			if(n == -1)
				break;
			int j =0 ;
			
			while(true) {
				
				String s = n+"";
				char[] s_1 = s.toCharArray();
				int sum = 0;
				for(int i=0;i<s_1.length;i++) {
					sum += Integer.parseInt(s_1[i]+"")*Integer.parseInt(s_1[i]+"");
				}
				
				n = sum;
				
				if(sum == 1) {
					System.out.println("true");
					break;
				}
				
				j++;
				if(j>1000){
					System.out.println("false");
					break;
				}
				
			}
				
		}
				
	}

}


