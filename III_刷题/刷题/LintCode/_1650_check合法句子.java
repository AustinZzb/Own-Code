package LintCode;

import java.util.Arrays;
/**
 * 鍒ゆ柇涓�涓彞瀛愭槸鍚﹀悎娉曪紝涓�鍙ュ瓙棣栧瓧姣嶄负灏忓啓  浜屽崟璇嶉潪棣栧瓧姣嶄负澶у啓
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�26鏃�-涓嬪崍9:30:41
 */
public class _1650_check鍚堟硶鍙ュ瓙 {
	
	public static int count(String s) {
        // Write your code here.
		int n = 0;
		String[] strings = s.split("\\. ");
		for (int i = 0; i < strings.length; i++) {
			String[] strings2 = strings[i].split("\\, | ");
			for (int j = 0; j < strings2.length; j++) {
				if(j == 0 && ( strings2[j].charAt(0) >= 'a' && strings2[j].charAt(0) <= 'z' ))
					return i+1;
				if(test(strings2[j]))
					return i+1;
			}
		}
		
		return n;
	}
	
	private static boolean test(String string) {
		
		for (int i = 1; i < string.length(); i++) {
			if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(count("This won iz correkt. It has, No Mistakes et Oll. But there are two BIG mistakes in this sentence. and here is one more."));
	}
	
}
