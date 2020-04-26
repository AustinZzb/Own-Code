/*
 * 问题描述：
 * 平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
 * 输入格式：
 * 输入仅包含两行，每行描述一个矩形。
 * 在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。
 */
package lanqiao;

import java.util.Scanner;

/**
 * @author 张致邦
 *
 * 2020年3月18日-上午11:11:29
 */
public class _矩阵面积交 {

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
