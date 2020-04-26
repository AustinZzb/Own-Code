package 分治_双指针;
/**
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。

 * @author 张致邦
 *
 * 2020年2月17日-下午12:35:16
 */
public class 快慢指针_快乐数 {
	// 快慢指针是最有效的算法  其次不快乐数会进入4开始的循环
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
