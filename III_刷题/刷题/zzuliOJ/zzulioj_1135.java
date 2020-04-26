package zzuliOJ;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class zzulioj_1135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		while(scan.hasNext()) {
			
			double sum_1 = 0;
			String[] s = scan.nextLine().split("\\s+");
			
			sum_1 = Double.parseDouble(s[1]) * Double.parseDouble(s[2]);
			sum += sum_1;
			
		}
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.print(df.format(sum));

	}

}
