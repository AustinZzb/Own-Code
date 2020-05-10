package zzuliOJ;
//  答案错误
import java.util.Arrays;
import java.util.Scanner;

public class zzulioj_1133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] sum = scan.nextLine().split("\\s+");
		System.out.println(Arrays.toString(sum));
		if(sum.length == 0) {
			System.out.println(0);
		}else if(sum[0].equals("")) {
			System.out.println(sum.length-1);
		}else {
			System.out.println(sum.length);
		}
		
	}

}
