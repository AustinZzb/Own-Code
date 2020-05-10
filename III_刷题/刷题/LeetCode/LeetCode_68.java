package LeetCode;
/**
 * 瀹炵幇聽int sqrt(int x)聽鍑芥暟銆�
 * 璁＄畻骞惰繑鍥灺爔聽鐨勫钩鏂规牴锛屽叾涓爔 鏄潪璐熸暣鏁般��
 * 鐢变簬杩斿洖绫诲瀷鏄暣鏁帮紝缁撴灉鍙繚鐣欐暣鏁扮殑閮ㄥ垎锛屽皬鏁伴儴鍒嗗皢琚垗鍘汇��
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�13鏃�-涓嬪崍4:59:06
 */
public class LeetCode_68 {
	
	// 鍒╃敤pow锛堬級鍐呯疆鍑芥暟
	private static int mySqrt(int x) {
		if(x < 2) return x;
		
		int left = (int) Math.pow(Math.E, 0.5 * Math.log(x));
		int right = left + 1;
		return (long)(right * right) > x ? left : right; 
	}
	
	
	// 鏁堢巼浣�
	public static int mySqrt_1(int x) {
		if(x == 0) return 0;
		long ans = 1;
        for (long i = 1; i <= x/2; i++) {
        	ans = i;
			if(i * i > x) return (int)i - 1;
			if(i * i == x ) return (int)i;
		}
        return (int)ans;
    }
	
	public static void main(String[] args) {
		System.out.println(mySqrt(2147483647));
	}
	
}
