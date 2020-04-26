package ��ϣ��;

import java.util.HashMap;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的�??
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的�??
 * �?有出现的字符都必须用另一个字符替换，同时保留字符的顺序�?�两个字符不能映射到同一个字符上，但字符可以映射自己本身�?
 * 
 * @author 张致�?
 *
 * 2020�?2�?18�?-上午8:54:45
 */
public class _ͬ���ַ��� {
	// 直接调用hash�?
	public boolean isIsomorphic_1(String s, String t) {
        if(s.length() == 0) return true;
       	HashMap<Character, Character> map = new HashMap<Character, Character>();
       	char c, b;
       	map.put(s.charAt(0), t.charAt(0));
       	for (int i = 1; i < s.length(); i++) {
			c = s.charAt(i);
			b = t.charAt(i);
			if(map.containsKey(c)) {
				if(map.get(c) != b)
					return false;
			}else if(map.containsValue(b)){
				return false;
			}else {
				map.put(c, b);
			}
				
		}
       	return true;
    }
	
	
	// 自己建立�?个映�?
	public static boolean isIsomorphic(String s, String t) {
		char[] mapS = new char[128];
        boolean[] mapT = new boolean[128];
        char[] sChArr = s.toCharArray();
        char[] tChArr = t.toCharArray();

        for (int i = 0; i < sChArr.length; i++) {
            char c1 = sChArr[i];
            char c2 = tChArr[i];
            
            if (mapS[c1] != '\0' || mapT[c2] == true) {
                if (mapS[c1] != c2) {
                    return false;
                }
            } else {
                mapS[c1] = c2;
                mapT[c2] = true;
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isIsomorphic("egglllooitt", "addbbbhheww"));
	}
	
}
