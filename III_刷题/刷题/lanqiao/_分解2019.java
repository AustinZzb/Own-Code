package lanqiao;
/**
 * 【问题描述】
 * 把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不包 含数字 2 和 4，一共有多少种不同的分解方法？
 * 注意交换 3 个整数的顺序被视为同一种方法，例如 1000+1001+18 和 1001+1000+18 被视为同一种。
 * 
 * @author 张致邦
 *
 * 2020年2月3日-上午9:03:27
 */
public class _分解2019 {
	
	public static int fun() {
		
		int num = 0;
		for (int i = 1; i <=2019 ; i++) {
			if((i+"").indexOf("2") != -1 && (i+"").indexOf("4") != -1) continue;
			for (int j = i+1; j <= 2019; j++) {
				if((j+"").indexOf("2") != -1 && (j+"").indexOf("4") != -1) continue;
				int k = 2019 - i - j;
				if(k > i && k > j) num++;
			}
		}
		
		return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun());
	}

}
