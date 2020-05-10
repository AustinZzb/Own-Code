package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * 缁欏畾涓�涓瓧绗︿覆锛岄獙璇佸畠鏄惁鏄洖鏂囦覆锛屽彧鑰冭檻瀛楁瘝鍜屾暟瀛楀瓧绗︼紝鍙互蹇界暐瀛楁瘝鐨勫ぇ灏忓啓銆�
 * 璇存槑锛氭湰棰樹腑锛屾垜浠皢绌哄瓧绗︿覆瀹氫箟涓烘湁鏁堢殑鍥炴枃涓层��
 * 绀轰緥 1:
 * 杈撳叆: "A man, a plan, a canal: Panama"
 * 杈撳嚭: true
 * 娉ㄦ剰锛� 濡傛灉鎸夌収ASCII鍊煎彇姣旇緝鏄惁鐩稿悓锛岄渶瑕佹敞鎰忕壒娈婃儏鍐�"0P"锛屼粬淇╃嫍鐜╂剰涔熺浉宸�32
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�16鏃�-涓婂崍10:59:43
 */
public class LeetCode_125 {
	
	
	// 鍙屾寚閽�
	public static boolean isPalindrome(String s) {
		
		int i = 0, j = s.length() - 1;
		while(i < j) {
			char a = s.charAt(i);
			char b = s.charAt(j);
			if(!test(a)) {
				i++;
			}
			if(!test(b)) {
				j--;
			}
			if(test(b) && test(a)){
				if(a != b) {
					if(a >= 'A' && b >= 'A') {
						int n = Math.abs((int)a - (int)b);
						if(n != 32)
							return false;
					}else 
						return false;
				}
				i++;
	            j--;
			}
			
		}
		return true;
		
    }
	
	private static boolean test(char c) {
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
	
}
