package �����㷨;

/**
 * A �Ƚϴ���쳲����������ַ���
 * A �桤����
 */

import java.util.Scanner;
import ������.TimeTool;
import ������.TimeTool.Task;;

public class 쳲��������� {
	
	/**
	 * A �ݹ鴦��쳲������������࣬��ʱ��ʱ�临�Ӷ�O(2^n)
	 * @param args
	 */
//	public static int fic(int n) {
//		if (n == 1 || n == 2) {
//			return 1;
//		}
//		return fic(n-1)+fic(n-2);
//	}
	
	
	/**
	 * A �򵥴���쳲�������ʱ�临�Ӷ�O(n)
	 * @param args
	 */
	public static int fic(int n) {
		
		if (n <= 2) {
			return 1;
		}else {
			
			int fic_1 = 1;
			int fic_2 = 1;
			
			for (int i = 0; i < n-2; i++) {
				
				int t = fic_1;
				fic_1 = fic_2;
				fic_2 += t;
				
			}
			
			return fic_2;
			
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		TimeTool.check("fib_1", new Task() {
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				System.out.println(fic(n));
			}
		});
				
	}

}























