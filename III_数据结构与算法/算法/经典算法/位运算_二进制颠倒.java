package �����㷨;
/**
 * �ߵ������� 32 λ�޷��������Ķ�����λ��
 * LeetCode 190
 * @author ���°�
 *
 * 2020��2��17��-����10:36:44
 */
public class λ����_�����Ƶߵ� {
	
	public int reverseBits_1(int i) {
        i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
        i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
        i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
        i = (i << 24) | ((i & 0xff00) << 8) |((i >>> 8) & 0xff00) | (i >>> 24);//����
        return i;
    }
	
	public static int reverseBits(int n) {
	   	int i = 0, res = 0;
	    while(i < 32){
	    	int temp = n & 1;
	    	n >>= 1;
	    	res = res<<1 | temp;
	        i++;
	    }
	    return res;
	}

}
