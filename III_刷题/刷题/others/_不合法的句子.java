package others;

import java.util.Arrays;
/**
 * ����һƪ�ɴ�д��ĸ��Сд��ĸ�����š������ɵ����£���ʹ���²��Ϸ�����ĸ����
 * ���²��Ϸ���2�������
 * 1.���ӵĵ�һ����ĸ����Сд��
 * 2.���ǵ��ʵ�����ĸ���˴�д��
 * 
 * @author ���°�
 *
 * 2020��2��15��-����9:02:51
 */
public class _���Ϸ��ľ��� {
	//�ҵ����Ϸ��ľ���
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
