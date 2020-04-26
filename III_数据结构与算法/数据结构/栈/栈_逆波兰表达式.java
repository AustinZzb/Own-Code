package 栈;

/**
 *  (参考代码) 栈的学习
 */

import java.util.Scanner;
import java.util.Stack;

public class 栈_逆波兰表达式 {
	
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
