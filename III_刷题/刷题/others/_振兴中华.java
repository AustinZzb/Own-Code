package others;
/**
 * 从我做起振                  20个格子，只能纵向或横向的跳跃，求“从我做起振兴中华”有多少中可能
 * 我做起振兴
 * 做起振兴中
 * 起振兴中华
 * 
 * @author 张致邦
 *
 * 2020年2月1日-下午4:15:21
 */
public class _振兴中华 {
	
	private static char[][] a = {{'从','我','做','起','振'},
		      					 {'我','做','起','振','兴'},
		      					 {'做','起','振','兴','中'},
		      					 {'起','振','兴','中','华'}};
	
	private static char[] b = {'从','我','做','起','振','兴','中','华'};
	
	static int count = 0,sum = 0;
	
	private static void fun(int x, int y, int count) {
		
		if(x > 3 || y > 4)
			return ;
		
		if(b[count] == '华') {
			sum ++;
			return ;
		}
			
		fun(x+1, y, count + 1);
		fun(x, y+1, count + 1);			
		
	}
	
	private static int fun(int x, int y) {
		
		if(x == 3 || y == 4)
			return 1;
		
		return fun(x+1, y) + fun(x, y+1);		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(0, 0, count);
		System.out.println(sum);
		System.out.println(fun(0, 0));
	}

}
