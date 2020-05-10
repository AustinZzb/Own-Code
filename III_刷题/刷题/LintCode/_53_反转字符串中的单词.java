package LintCode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * 缁欏畾涓�涓瓧绗︿覆锛岄�愪釜缈昏浆瀛楃涓蹭腑鐨勬瘡涓崟璇嶃��
 * 
 * 鏍蜂緥  1:
 * 杈撳叆:  "the sky is blue"
 * 杈撳嚭:  "blue is sky the"
 * 鏍蜂緥瑙ｉ噴: 
 * 杩斿洖閫愬瓧鍙嶈浆鐨勫瓧绗︿覆.
 * 鏍蜂緥 2:
 * 杈撳叆:  "hello world"
 * 杈撳嚭:  "world hello"
 * 鏍蜂緥瑙ｉ噴: 杩斿洖閫愬瓧鍙嶈浆鐨勫瓧绗︿覆.
 * 璇存槑
 * 鍗曡瘝鐨勬瀯鎴愶細鏃犵┖鏍煎瓧姣嶆瀯鎴愪竴涓崟璇嶏紝鏈変簺鍗曡瘝鏈熬浼氬甫鏈夋爣鐐圭鍙�
 * 杈撳叆瀛楃涓叉槸鍚﹀寘鎷墠瀵兼垨鑰呭熬闅忕┖鏍硷紵鍙互鍖呮嫭锛屼絾鏄弽杞悗鐨勫瓧绗︿笉鑳藉寘鎷�
 * 濡備綍澶勭悊涓や釜鍗曡瘝闂寸殑澶氫釜绌烘牸锛熷湪鍙嶈浆瀛楃涓蹭腑闂寸┖鏍煎噺灏戝埌鍙惈涓�涓�
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�11鏃�-涓嬪崍8:19:50
 */
public class _53_鍙嶈浆瀛楃涓蹭腑鐨勫崟璇� {
	
	private static void rever(List<String> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			if(i == list.size() - 1)
				System.out.print(list.get(i));
			else 
				System.out.print(" "+list.get(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c = scan.nextLine().toCharArray();
		List<String> list = new Vector<String>();
		int t = 0;
		list.add("");
		for (int i = 0; i < c.length; i++) {
			if(c[i]!=' ') {
				list.set(t, list.get(t)+c[i]);
			}else{
				if(i >= 1 && c[i-1] != ' ') {
					t++;
					list.add("");
				}
			}
		}
		rever(list);
		
	}

}




















