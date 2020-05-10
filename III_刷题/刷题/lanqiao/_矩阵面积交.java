/*
 * 闂鎻忚堪锛�
 * 骞抽潰涓婃湁涓や釜鐭╁舰锛屽畠浠殑杈瑰钩琛屼簬鐩磋鍧愭爣绯荤殑X杞存垨Y杞淬�傚浜庢瘡涓煩褰紝鎴戜滑缁欏嚭瀹冪殑涓�瀵圭浉瀵归《鐐圭殑鍧愭爣锛岃浣犵紪绋嬬畻鍑轰袱涓煩褰㈢殑浜ょ殑闈㈢Н銆�
 * 杈撳叆鏍煎紡锛�
 * 杈撳叆浠呭寘鍚袱琛岋紝姣忚鎻忚堪涓�涓煩褰€��
 * 鍦ㄦ瘡琛屼腑锛岀粰鍑虹煩褰㈢殑涓�瀵圭浉瀵归《鐐圭殑鍧愭爣锛屾瘡涓偣鐨勫潗鏍囬兘鐢ㄤ袱涓粷瀵瑰�间笉瓒呰繃10^7鐨勫疄鏁拌〃绀恒��
 */
package lanqiao;

import java.util.Scanner;

/**
 * @author 寮犺嚧閭�
 *
 * 2020骞�3鏈�18鏃�-涓婂崍11:11:29
 */
public class _鐭╅樀闈㈢Н浜� {

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
