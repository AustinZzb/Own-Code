/*
 * ����������
 * ƽ�������������Σ����ǵı�ƽ����ֱ������ϵ��X���Y�ᡣ����ÿ�����Σ����Ǹ�������һ����Զ�������꣬����������������εĽ��������
 * �����ʽ��
 * ������������У�ÿ������һ�����Ρ�
 * ��ÿ���У��������ε�һ����Զ�������꣬ÿ��������궼����������ֵ������10^7��ʵ����ʾ��
 */
package lanqiao;

import java.util.Scanner;

/**
 * @author ���°�
 *
 * 2020��3��18��-����11:11:29
 */
public class _��������� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double[] n1 = new double[4];
		double[] n2 = new double[4];
		for (int i = 0; i < 4; i++)
			n1[i] = scan.nextDouble();
		if (n1[1] > n1[3]) {
			double temp = n1[3];
			n1[3] = n1[1];
			n1[1] = temp;
		}
		
		for (int i = 0; i < 4; i++)
			n2[i] = scan.nextDouble();
		if (n2[1] > n2[3]) {
			double temp = n2[3];
			n2[3] = n2[1];
			n2[1] = temp;
		}
		
		double x_1 = Math.min(n1[2], n1[0]), x_2 = Math.max(n1[2], n1[0]), y_1 = Math.min(n1[1], n1[3]), y_2 = Math.max(n1[1], n1[3]);
		double x1 = Math.min(n2[2], n2[0]), x2 = Math.max(n2[2], n2[0]), y1 = Math.min(n2[1], n2[3]), y2 = Math.max(n2[1], n2[3]);
		
		
		if (x_2 <= x1 || x2 <= x_1 || y_2 <= y1 || y2 <= y_1)
			System.out.print("0.00");
		else {
			double left = Math.max(x_1, x1);
			double right = Math.min(x_2, x2);
			double top = Math.min(y_2, y2);
			double bottom = Math.max(y_1, y1);
			System.out.printf("%.2f",(right-left)*(top-bottom));
		}
	}

}
