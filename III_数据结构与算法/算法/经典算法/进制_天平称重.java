package 经典算法;
/**
 * 用天平称重时，我们希望用尽可能少的砝码组合称出尽可能多的重量。
 * 如果只有5个砝码，重量分别是1，3，9，27，81
 * 则它们可以组合称出1到121之间任意整数重量（砝码允许放在左右两个盘中）。
 * 本题目要求编程实现：对用户给定的重量，给出砝码组合方案
 * 例如：
 * 用户输入：5		程序输出：9-3-1			用户输入：19	程序输出：27-9+1
 * 要求程序输出的组合总是大数在前小数在后。
 * 可以假设用户的输入的数字符合范围1~121。
 * @author 张致邦
 *
 * 2020年2月4日-下午4:45:21
 */
public class 进制_天平称重 {
	
	// 利用进制解决问题
	private static String fun_1(int n) {
		
		String s = "";
		int q = 1;
		
		while(n > 0) {
			
			int shang = n / 3;
			if(n % 3 == 1) s = "+" + q + s;
			if(n % 3 == 2) {
				shang ++;
				s = "-" + q + s;
			}
			n = shang;
			q *= 3;
			
		}
		
		return s.substring(1);
		
	}
	
	
	// 递归
	private static String fun(int n) {
		
		int a = 1;
		while(a < n) a *= 3;
		
		if(a == n) return ""+a;
		if(n <= a/2) return a/3 + "+" + fun(n - a/3);
		return a + reve(fun(a - n));
		
	}

	private static String reve(String s) {
		// TODO Auto-generated method stub
		s = s.replace('-', '#');
		s = s.replace('+', '-');
		s = s.replace('#', '+');
		return "-"+s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 121 ; i++) {
			System.out.println(i+":"+fun(i)+"	"+fun_1(i));
		}
		
	}

}
