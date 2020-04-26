package LeetCode;
/**
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 * 注意：整数序列中的每一项将表示为一个字符串。
 * 
 * @author 张致邦
 *
 * 2020年2月13日-上午9:48:23
 */
public class LeetCode_38 {

	//StringBuilder解法，效率高    StringBuilder和StringBuffer基本类似，但是StringBuffer实现了线程安全，所以StringBuilder更快一些
	public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
			result = fun(result);
		}
        return result;
    }
	
	
	private String fun(String result) {
		// TODO Auto-generated method stub
		StringBuilder stringBuffer = new StringBuilder();
		char c = result.charAt(0);
		int sum = 1;
		
		for (int i = 1; i < result.length(); i++) {
			
			if(c == result.charAt(i)) {
				sum ++;
			}else {
				stringBuffer.append(sum);
				stringBuffer.append(c);
				c = result.charAt(i);
				sum = 1;
			}
			
		}
		stringBuffer.append(sum);
		stringBuffer.append(c);
		
		return stringBuffer.toString();
	}


	// 普通解法，效率有点慢
	public String countAndSay_1(int n) {
        String[] strings = new String[30];
        strings[0] = "1";
        for (int i = 1; i < strings.length; i++) {
                if(i == n) return strings[n-1];
			    int sum = 1;
                strings[i] = "";
			    for (int j = 1; j < strings[i-1].length(); j++) {
			    	if(strings[i-1].charAt(j) == strings[i-1].charAt(j-1))
				    	sum++;
				    else {
			    		strings[i] += sum + "" + strings[i-1].charAt(j-1) + "";
			    		sum = 1;
			    	}
		    	}
                strings[i] += sum + "" + strings[i-1].charAt(strings[i-1].length()-1) + "";
	    	}
        
        return strings[n-1];
    }

}
