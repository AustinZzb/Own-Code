package lanqiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 最近FJ为他的奶牛们开设了数学分析课，FJ知道若要学好这门课，必须有一个好的三角函数基本功。所以他准备和奶牛们做一个“Sine之舞”的游戏，寓教于乐，提高奶牛们的计算能力。
 * 不妨设
 * An=sin(1–sin(2+sin(3–sin(4+...sin(n))...)
 * Sn=(...(A1+n)A2+n-1)A3+...+2)An+1
 * FJ想让奶牛们计算Sn的值，请你帮助FJ打印出Sn的完整表达式，以方便奶牛们做题。
 * 
 * @author 张致邦
 *
 * 2020年3月2日-上午11:21:29
 */
public class BASIC_21 {
	private static List<String> list = new ArrayList<String>();
	
	private static String Sn_sum(int n) {
		An_sum(n, 1, "");
		String sn = "";
		for (String an : list) {
			sn += "(" + an + "+" + n-- + "" + ")";
		}
		return sn;
	}
	
	private static void An_sum(int n, int m, String An) {
		String an = "";
		if(m > n)
			return ;
		if(m == 1) {
			an = "sin(1)";
			list.add(an);
			An_sum(n, m+1, an);
		}else {
			an = An.substring(0, An.length() - m + 1) + "-" + "sin(" + m + ")" + An.substring(An.length() - m + 1);
			list.add(an);
			An_sum(n, m+1, an);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String string = Sn_sum(n);
		System.out.println(string.substring(1, string.length() - 1));
	}
	
}
