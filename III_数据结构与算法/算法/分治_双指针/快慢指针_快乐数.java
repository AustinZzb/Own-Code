package ����_˫ָ��;
/**
 * ��дһ���㷨���ж�һ�����ǲ��ǡ�����������
 * һ����������������Ϊ������һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���ͣ�Ȼ���ظ��������ֱ���������Ϊ 1��Ҳ����������ѭ����ʼ�ձ䲻�� 1��������Ա�Ϊ 1����ô��������ǿ�������

 * @author ���°�
 *
 * 2020��2��17��-����12:35:16
 */
public class ����ָ��_������ {
	// ����ָ��������Ч���㷨  ��β������������4��ʼ��ѭ��
	public static boolean isHappy(int n) {
        int low = n;
        int fast = n;
        do {
        	low = squareSum(low);
        	fast = squareSum(fast);
        	fast = squareSum(fast);
        }while(low != fast);
        if(fast == 1)
        	return true;
        else return false;
    }
    
    private static int squareSum(int m){
        int ans = 0;
        while(m != 0) {
        	ans += (m%10) * (m%10);
        	m /= 10;
        }
        return ans;
    }
	
}
