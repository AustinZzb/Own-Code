package others;

import java.util.Arrays;
/**
 * 给定一篇由大写字母、小写字母、逗号、句号组成的文章，求使文章不合法的字母数。
 * 文章不合法有2种情况：
 * 1.句子的第一个字母用了小写。
 * 2.不是单词的首字母用了大写。
 * 
 * @author 张致邦
 *
 * 2020年2月15日-下午9:02:51
 */
public class _不合法的句子 {
	//找到不合法的句子
	public static int count(String s) {
	    
	    String[] str = s.split("\\.");
	    System.out.println(Arrays.toString(str));
	    int i = 0;
	    for(i = 0; i < str.length; i++){
	    	if(!(str[i].charAt(0) >= 'A' && str[i].charAt(0) <= 'Z')) {	
	    		System.out.println(str[i]);
	    		break;
	    	}
	    	else if(test(str[i].substring(1))) {
	    		System.out.println(str[i].substring(1));
	    		break;
	    	}
	    }
	    
	    return i+1;
	    
	}

	private static boolean test(String s){
		return    s.contains("A") || s.contains("B") || s.contains("C") || s.contains("D") || s.contains("E") || s.contains("F") 
			   || s.contains("G") || s.contains("H") || s.contains("I") || s.contains("J") || s.contains("K") || s.contains("L") 
			   || s.contains("P") || s.contains("Q") || s.contains("R") || s.contains("S") || s.contains("T") || s.contains("U")
			   || s.contains("V") || s.contains("W") || s.contains("X") || s.contains("Y") || s.contains("Z") || s.contains("M") 
			   || s.contains("N") || s.contains("O");	
	}
	
	public static void main(String[] args) {
		System.out.println(count("This won iz correkt. It has, No Mistakes et Oll. But there are two BIG mistakes in this sentence. and here is one more."));
	}
}
