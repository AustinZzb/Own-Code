package WRONG;

import java.util.Scanner;

/**
 * Tom教授正在给研究生讲授一门关于基因的课程，有一件事情让他颇为头疼：一条染色体上有成千上万个碱基对，它们从0开始编号，到几百万，几千万，甚至上亿。
 * 比如说，在对学生讲解第1234567009号位置上的碱基时，光看着数字是很难准确的念出来的。
 * 所以，他迫切地需要一个系统，然后当他输入12 3456 7009时，会给出相应的念法：
 * 十二亿三千四百五十六万七千零九
 * 用汉语拼音表示为
 * shi er yi san qian si bai wu shi liu wan qi qian ling jiu
 * 这样他只需要照着念就可以了。
 * 你的任务是帮他设计这样一个系统：给定一个阿拉伯数字串，你帮他按照中文读写的规范转为汉语拼音字串，相邻的两个音节用一个空格符格开。
 * 注意必须严格按照规范，比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”
 * 						“100000”读作“shi wan”而不是“yi shi wan”，“2000”读作“er qian”而不是“liang qian”。
 * 
 * @author 张致邦
 *
 * 2020年2月5日-上午10:04:06
 */
public class WRONG_BASIC_20 {
	private static final int A = 100000000;
	private static final int B = 10000;
	private static String a[] = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi"};
	
	private static String fun(int n) {
		String s = "";
		
		if(n > A) {
			int m = n / A;
			if(m <= 10)
				s += a[m] + " yi ";
			else
				s += "shi " + a[m%10] + " yi ";
			n %= A;
		}
		
		int m_1 = n / B;
		int m_2 = n % B;
		if(n > B) {
			if(n % B < 1000)
				return s + fun_1(m_1) + "wan ling " + fun_1(m_2);
			return s + fun_1(m_1) + "wan " + fun_1(m_2);
		}else {
			return s + fun_1(m_2);
		}
		
	}
	
	private static String fun_1(int n) {
		
		String string = "";
		if(n > 1000) {
			int m = n / 1000;
			if(m != 0)string += a[m] + " qian ";
			if(n % 1000 == 0) return string;
		}
		
		int m_1 = 0;
		if(n >= 100) {
			m_1 = n % 1000 / 100;
			if(m_1 == 0) string += a[m_1] + " ";
			if(m_1 != 0) string += a[m_1] +" bai ";
			if(n % 100 == 0) return string;
		}
		
		if(n >= 10) {
			int m_2 = n % 100 / 10;
			if(m_2 == 0 && m_1 != 0)  string += a[m_1] + " ";
			if(m_2 != 0 && m_2 != 1) string += a[m_2] + " shi ";
			if(m_2 != 0 && m_2 == 1) string += "shi ";
			if(n % 10 == 0) return string;
		}
		
		if(n < 10) {
			return a[n] + " ";
		}
		
		return string + a[n % 10] + " ";
				
	}
	
	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("输入0结束");
		while (true) {
			int n = sacn.nextInt();
			if(n == 0)
				break;
			System.out.println(fun(n));
		}
	}
}
