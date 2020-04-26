package 经典算法;
/**
 * 颠倒给定的 32 位无符号整数的二进制位。
 * LeetCode 190
 * @author 张致邦
 *
 * 2020年2月17日-上午10:36:44
 */
public class 位运算_二进制颠倒 {
	
	public int reverseBits_1(int i) {
        i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
        i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
        i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
        i = (i << 24) | ((i & 0xff00) << 8) |((i >>> 8) & 0xff00) | (i >>> 24);//第四
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
