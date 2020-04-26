/**		LeetCode_有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
package 栈;

import java.util.Stack;

/**
 * @author 张致邦
 *
 * 2020�?2�?12�?-下午4:01:56
 */
public class 栈_有效的括号 {
	
	 // 栈的正确使用！！！！
	 public static boolean isValid(String s) {
	     
		 if(s.isEmpty())
			 return true;
		 if(s.length() % 2 != 0)
			 return false;
		 Stack<Character> stack = new Stack<Character>();
		 
		 for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(')
				stack.push(')');
			else if(s.charAt(i) == '[')
				stack.push(']');
			else if(s.charAt(i) == '{')
				stack.push('}');
			else if(stack.isEmpty() || s.charAt(i) != stack.pop())
				return false;
		 }
		 
		 return stack.isEmpty();
		 
	 }
	
	
	// 利用栈，效率�?�?  （错误利用！！！！） 
	public static boolean isValid_2(String s) {
        if(s.length() == 0)
            return true;
        if(s.length() % 2 != 0)
			return false;
		Stack<Character> stack = new Stack<Character>();
		stack.push(s.charAt(0));
				
		for (int i = 1; i < s.length(); i++) {
			if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                if(!equle(s.charAt(i), stack.peek()))
				    stack.pop();
                else
                    stack.push(s.charAt(i));
            }
		}
		
		return stack.isEmpty();
		
    }
	
	private static boolean equle(char c_1, char c_2) {
		String string = c_1 + "" + c_2 + "";
		if(string.contains(")("))
			return false;
		if(string.contains("]["))
			return false;
		if(string.contains("}{"))
			return false;
		
		return true;
	}
	
	
	// 利用Java自带的一些string函数，运行极�?
	public static boolean isValid_1(String s) {
		
		if(s.length() % 2 != 0)
			return false;
		
		if(s.contains("()") || s.contains("[]") || s.contains("{}")) {
			return isValid_1(s.replace("()", "").replace("[]", "").replace("{}", ""));
		}else {
			return "".equals(s);
		}
		
    }
	
	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}

}
