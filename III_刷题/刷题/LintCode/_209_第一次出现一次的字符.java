package LintCode;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
/**
 * 缁欏嚭涓�涓瓧绗︿覆锛屾壘鍑虹涓�涓彧鍑虹幇涓�娆＄殑瀛楃銆�
 * 鏍蜂緥
 * 鏍蜂緥 1:
 * 杈撳叆: "abaccdeff"
 * 杈撳嚭:  'b'
 * 瑙ｉ噴:
 * 'b' 鏄涓�涓嚭鐜颁竴娆＄殑瀛楃
 * 鏍蜂緥 2:
 * 杈撳叆: "aabccd"
 * 杈撳嚭:  'b'
 * 瑙ｉ噴:
 * 'b' 鏄涓�涓嚭鐜颁竴娆＄殑瀛楃
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�11鏃�-涓嬪崍8:44:24
 */
public class _209_绗竴娆″嚭鐜颁竴娆＄殑瀛楃 {
	private static char first(List<Character> list) {
		
		for (int i = 0; i < list.size(); i++) {
			char old = list.get(i);
			list.remove(i);
			if(!list.contains(old))
				return old;
			list.add(i, old);
		}
		
		return ' ';
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c = scan.nextLine().toCharArray();
		List<Character> list = new Vector<Character>();
		for (int i = 0; i < c.length; i++) {
			list.add(c[i]);
		}
		System.out.println(first(list));
	}

}
