package 经典算法;
/**
 * 建立一个1 * 1的正方形，和一个1/4圆，落在他们的点数之比 * 4 则为圆周率。
 * 
 * @author 张致邦
 *
 * 2020年2月6日-上午10:34:35
 */
public class _利用概率求圆周率 {
	private static final int N = 20000 * 1000;
	private static double X = 0;  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		for (int i = 0; i < N; i++) {
			double x = Math.random();
			double y = Math.random();
			double ans = Math.sqrt(x*x + y*y);
			if(ans <= 1) X++;
		}
		
		System.out.println(X * 4 / N);
		
	}

}
