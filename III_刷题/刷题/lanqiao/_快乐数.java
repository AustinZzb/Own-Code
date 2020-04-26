package lanqiao;

import java.util.Scanner;
/**
 * 2 8 → 2²+8²=68 → 6²+8²=100 → 1²+0²+0²=1
 * 
 * 一个数字的进行如上变换，如果最终能变为1则为快乐数
 * @author 张致邦
 *
 * 2020年2月2日-下午9:01:08
 */
public class _快乐数 {

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


