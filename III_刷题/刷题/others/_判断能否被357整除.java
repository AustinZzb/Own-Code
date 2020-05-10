package others;

import java.util.Scanner;

public class _判断能否被357整除 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sacn = new Scanner(System.in);
		int n = sacn.nextInt();
		
		boolean flag = true;
		if(n % 3 == 0) {
			System.out.print("3 ");
			flag = false;
		}
		if(n % 5 == 0) {
			System.out.print("5 ");
			flag = false;
		}
		if(n % 7 == 0) {
			System.out.print("7 ");
			flag = false;
		}
		if (flag) {
			System.out.print("n");
		}

	}

}
