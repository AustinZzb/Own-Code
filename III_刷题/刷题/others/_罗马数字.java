package others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 * 将用户输入的罗马数字转化为十进制
 *  I --> 1        大数在右边表示大数-小数    eg：IV = 5；
	V --> 5
	X --> 10
	L --> 50
	C --> 100
	D --> 500
	M --> 1000
 * 
 * @author 张致邦
 *
 * 2020年2月1日-下午2:45:24
 */

public class _罗马数字 {
	
	// 时间最优解
	public static int getvalue(char c) {
		
		switch (c) {
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
		}
		
		return 0;
	}
	
	// 利用哈希表
	public static int fun_1(String s) {
		int ans = 0;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		map.put("IV", 4);
		map.put("IX", 9);
		map.put("XL", 40);
		map.put("XC", 90);
		map.put("CD", 400);
		map.put("CM", 900);
		
		for (int i = 0; i < s.length(); i++) {
			if((i + 1) < s.length() && map.containsKey(s.substring(i, i+2))) {
				ans += map.get(s.substring(i, i+2));
				i += 1;
			}else {
				ans += map.get(s.substring(i, i+1)); 	
			}
		}
		
		return ans;
	}
	
	
	// 普通解法
	public static int fun(String s) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
				case 'I': list.add("1") ; break;
				case 'V': list.add("5") ; break;
				case 'X': list.add("10") ; break;
				case 'L': list.add("50") ; break;
				case 'C': list.add("100") ; break;
				case 'D': list.add("500") ; break;
				case 'M': list.add("1000") ; break;
			}
		}
		
		int sum = 0;
		for (int i = list.size() - 1; i >= 0; i--) {
			int m_0 = Integer.parseInt(list.get(i));
			if(i == 0) {
				 sum += m_0;
				 break;
			}
			int m_1 = Integer.parseInt(list.get(i-1));
			
			if(m_1 < m_0) {
				sum += m_0 - m_1;
				i--;
			}else {
				sum += m_0;
			}
			
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = scan.next();
			System.out.println(fun(strings[i]));
		}
		
		
		
		//时间最优解
		String string = scan.next();
		int up = getvalue(string.charAt(0));
		int ans = 0;
		for (int i = 1; i < string.length(); i++) {
			
			int now = getvalue(string.charAt(i));
			if(up < now)
				ans -= up;
			else
				ans += up;
			
			up = now;
			
		}
		
		ans += up;
		System.out.println(ans);

	}

}















