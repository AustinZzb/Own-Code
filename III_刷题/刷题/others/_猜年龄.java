package others;
/**
 * 一个数的三次方是四位数，四次方是六位数，并且这是十个数正好是0-9，求这个数
 * 
 * @author 张致邦
 *
 * 2020年2月1日-下午3:27:57
 */
public class _猜年龄 {
	
	//竞赛简便方法
	public static void fun() {
		
		for (int i = 11; i < 100; i++) {
			int a = (int)Math.pow(i, 3);
			int b = (int)Math.pow(i, 4);
			if((a+"").length() != 4) continue;
			if((b+"").length() != 6) continue;
			System.out.println(i+" "+a+" "+b);
		}
		
	}
	
	
	//常规方法
//	public static int fun() {
//		int n = 11;
//		String[] s_1 = {"0","1","2","3","4","5","6","7","8","9"};
//		
//		
//		while(true) {
//			
//			boolean flag = true;
//			int m_0 = (int) Math.pow(n, 3);
//			int m_1 = (int) Math.pow(n, 4);
//			String s = m_0 + "" + m_1 + "";
//			for (int i = 0; i < s_1.length; i++) {
//				if(!s.contains(s_1[i])) {
//					flag = false;
//					n++;
//					break;
//				}	
//			}
//			
//			if (flag) {
//				break;
//			}
//			
//		}
//		
//		return n;
//	}

	public static void main(String[] args) {
		fun();
	}
	
}
