package LeetCode;
/**
 * 根据逆波兰表示法，求表达式的值。
 * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * 说明：
 * 整数除法只保留整数部分。
 * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 * 
 * @author 张致邦
 *
 * 2020年2月1日-上午9:42:03
 */
import java.util.Scanner;
import java.util.Stack;

public class LeetCode_150 {

	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for (String token : tokens) {
			
			stack.push("+-*/".contains(token) 
					? opear(stack.pop(), stack.pop(), token) 
							: Integer.parseInt(token));
			
		}
		return stack.pop();
	
	}

	private static Integer opear(Integer right, Integer left, String string) {
		
		switch (string) {
		
		case "+":
			return left + right;
		case "-":
			return left - right;
		case "*":
			return left * right;
		default:
			return left / right;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] tokens = new String[n];
		
		for (int i = 0; i < tokens.length; i++) {
			tokens[i] = scan.next();
		}
		
		System.out.println(evalRPN(tokens));
		
	}

}
