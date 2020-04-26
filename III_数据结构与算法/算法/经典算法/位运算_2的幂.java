package 经典算法;

public class 位运算_2的幂 {

	public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }
	
}
