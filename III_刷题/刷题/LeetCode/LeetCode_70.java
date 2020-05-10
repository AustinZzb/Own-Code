package LeetCode;
/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 
 * @author 张致邦
 *
 * 2020年2月14日-上午10:15:22
 */
public class LeetCode_70 {
	// 神奇的解法，利用斐波那契额函数的思想
	public int climbStairs(int n) {
        
		if(n < 3) return n;
		int i = 1, m = 2;
		while(n - 2 > 0) {
			int temp = m;
			m = temp + i;
			i = temp;
			n--;
		}
		return m;
    }
	
}
