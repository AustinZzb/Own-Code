package LintCode;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
/**
 * 鏍蜂緥
 * 鏍蜂緥1
 * 杈撳叆: str="ABCabcA"
 * 杈撳嚭: 2
 * 瑙ｉ噴:
 * A鍑虹幇浜�2娆★紝B鍑虹幇浜�1娆★紝C鍑虹幇浜�1娆★紝a鍑虹幇浜�1娆★紝b鍑虹幇浜�1娆★紝c鍑虹幇浜�1娆★紝A鍑虹幇鐨勬鏁版渶澶氾紝鎵�浠ヨ繑鍥�2銆�
 * 鏍蜂緥2
 * 杈撳叆: str="abca"
 * 杈撳嚭: 2
 * 瑙ｉ噴:
 * a 鍑虹幇浜�2娆★紝b鍜宑閮藉彧鍑虹幇浜�1娆�
 * 鎵�浠ヨ繑鍥� 2
 * 娉ㄦ剰浜嬮」
 * 瀛楁瘝涓彧鍙兘浼氬嚭鐜板ぇ鍐欏瓧姣嶆垨鑰呭皬鍐欏瓧姣嶃��
 * 瀛楃涓查暱搴︿笉瓒呰繃100000
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�11鏃�-涓嬪崍9:15:22
 */
public class _1654_鍑虹幇鏈�澶氱殑瀛楃 {
	private static int fun(List<Character> list) {
		int ans = 0;
		
		for (int i = 0; i < list.size(); i++) {
			int sum = 0;
			char old = list.get(i);
			while(list.contains(old)) {			
				sum++;
				list.remove(list.indexOf(old));
			}
			ans = sum > ans ? sum : ans;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c = scan.nextLine().toCharArray();
		List<Character> list = new Vector<Character>();
		for (int i = 0; i < c.length; i++) {
			list.add(c[i]);
		}
		System.out.println(fun(list));
	}

}
