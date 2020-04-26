package 随机算法;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
/**
 * 
 * @author 张致邦
 *
 * 2020年1月31日-上午11:33:03
 * 
 * A 随机打乱，利用统计思想，效率太低
 */
 

public class _24点游戏 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.print("请输入四位整数 : ");
			Scanner scan = new Scanner(System.in);
			String[] strings = new String[4];
			strings = scan.nextLine().split(" ");
			basic_24(strings);
		}
	}

	private static void basic_24(String[] strings) {
		// TODO Auto-generated method stub
		String[] s = new String[7];
		for (int i = 0; i < 4; i++) s[i] = strings[i];
		for (int i = 4; i < 7; i++) s[i] = op();
		
		jisuan(s);
		
	}

	private static void jisuan(String[] s) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 100000; i++) {
			daluan(s);
			Stack<Integer> stack = new Stack<Integer>();
			for (int j = 0; j < s.length; j++) {
				try {
					if ("+-*/".contains(s[j])) {
						int right = stack.pop();
						int left = stack.pop();
						if(s[j].equals("+")) 
							if ((left + right) == (int)(left + right))
								stack.push(left + right);
						if(s[j].equals("-"))
							if ((left - right) == (int)(left - right) && (left - right) >= 0)
								stack.push(left - right);
						if(s[j].equals("*")) 
							if ((left * right) == (int)(left * right))
								stack.push(left * right);
						if(s[j].equals("/")) 
							if ((left / right) == (int)(left / right) && (left % right) == 0)
								stack.push(left / right);
					}else {
						stack.push(Integer.parseInt(s[j]));
					}
				}catch (Exception e) {
					// TODO: handle exception
					break;
				}
			}
			if (stack.size() == 1 && stack.pop() == 24) {
				show(s);
				break;
			}
		}
		
	}

	private static void show(String[] s) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		for (int j = 0; j < s.length; j++) {
			if ("+-*/".contains(s[j])) {
				String right = stack.pop();
				String left = stack.pop();
				if(s[j].equals("+")) stack.push("(" + left + "+" + right + ")");
				if(s[j].equals("-")) stack.push("(" + left + "-" + right + ")");
				if(s[j].equals("*")) stack.push("(" + left + "*" + right + ")");
				if(s[j].equals("/")) stack.push("(" + left + "/" + right + ")");
			}else {
				stack.push(s[j]);
			}
		}
		
		System.out.println(stack.pop());
	}

	private static void daluan(String[] s) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.length; i++) {
			int n = (int)(Math.random()*7);
			String string = s[i];
			s[i] = s[n];
			s[n] = string;
		}
		if("+-*/".contains(s[0]) || "+-*/".contains(s[1])) daluan(s);
	}

	private static String op() {
		// TODO Auto-generated method stub
		int n = (int)(Math.random()*4);
		if(n == 0) return "+";
		if(n == 1) return "-";
		if(n == 2) return "*";
		return "/";
	}

}
