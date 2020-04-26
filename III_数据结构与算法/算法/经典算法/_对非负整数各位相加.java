package 经典算法;
/**
 * 给定一个非负整数，对其进行各位相加，直到结果为一位数
 * 
 * @author 张致邦
 *
 * 2020年2月24日-上午10:29:53
 */
public class _对非负整数各位相加 {
	/*
	 * 每次相加之后的结果与原数的差值都是9的倍数
	 * X = a*9999 + b*999 + c*99 + d*9 +(a + b + c + d + e)
	 */
	public int addDigits(int num) {
        if(num == 0) return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }
	
}
