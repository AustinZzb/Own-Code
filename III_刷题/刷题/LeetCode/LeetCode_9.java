package LeetCode;
/**
 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 * 
 * @author ���°�
 *
 * 2020��1��31��-����8:23:32
 */
public class LeetCode_9 {

 public boolean isPalindrome(int x) {
        
        String arr = x + "";
				boolean flag = true;
				for (int j = arr.length()-1, j2 = 0; j >= 0; j--, j2++) {
					if (arr.charAt(j) != arr.charAt(j2)) {
						flag = false;
						break;
					}
				}
				
				return flag;
	
         
    }
	
}
