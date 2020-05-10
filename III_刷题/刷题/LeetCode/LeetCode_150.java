package LeetCode;
/**
 * 鏍规嵁閫嗘尝鍏拌〃绀烘硶锛屾眰琛ㄨ揪寮忕殑鍊笺��
 * 鏈夋晥鐨勮繍绠楃鍖呮嫭聽+,聽-,聽*,聽/聽銆傛瘡涓繍绠楀璞″彲浠ユ槸鏁存暟锛屼篃鍙互鏄彟涓�涓�嗘尝鍏拌〃杈惧紡銆�
 * 璇存槑锛�
 * 鏁存暟闄ゆ硶鍙繚鐣欐暣鏁伴儴鍒嗐��
 * 缁欏畾閫嗘尝鍏拌〃杈惧紡鎬绘槸鏈夋晥鐨勩�傛崲鍙ヨ瘽璇达紝琛ㄨ揪寮忔�讳細寰楀嚭鏈夋晥鏁板�间笖涓嶅瓨鍦ㄩ櫎鏁颁负 0 鐨勬儏鍐点��
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�1鏃�-涓婂崍9:42:03
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
