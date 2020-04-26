package �����㷨;

import java.util.ArrayList;
import java.util.List;

public class _������ǵ�n�� {
	/**
	 * ��ȡ������ǵ�ָ����
	 * ֱ��ʹ����Ϲ�ʽC(n,i) = n!/(i!*(n-i)!)
	 * ���(i+1)���ǵ�i��ı���=(n-i)/(i+1);
	 */
	public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        long cur = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) cur);
            cur = cur * (rowIndex-i)/(i+1);
        }
        return res; 
    }
	
}
