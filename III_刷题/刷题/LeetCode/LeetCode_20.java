package LeetCode;

import java.util.Stack;

/**
 * 缁欏畾涓�涓彧鍖呮嫭 '('锛�')'锛�'{'锛�'}'锛�'['锛�']'聽鐨勫瓧绗︿覆锛屽垽鏂瓧绗︿覆鏄惁鏈夋晥銆�
 * 鏈夋晥瀛楃涓查渶婊¤冻锛�
 * 宸︽嫭鍙峰繀椤荤敤鐩稿悓绫诲瀷鐨勫彸鎷彿闂悎銆�
 * 宸︽嫭鍙峰繀椤讳互姝ｇ‘鐨勯『搴忛棴鍚堛��
 * 娉ㄦ剰绌哄瓧绗︿覆鍙璁や负鏄湁鏁堝瓧绗︿覆銆�
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�12鏃�-涓嬪崍4:01:56
 */
public class LeetCode_20 {
	
	 // 鏍堢殑姝ｇ‘浣跨敤锛侊紒锛侊紒
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
	
	
	// 鍒╃敤鏍堬紝鏁堢巼涓�鑸�  锛堥敊璇埄鐢紒锛侊紒锛侊級 
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
	
	
	// 鍒╃敤Java鑷甫鐨勪竴浜泂tring鍑芥暟锛岃繍琛屾瀬鎱�
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
