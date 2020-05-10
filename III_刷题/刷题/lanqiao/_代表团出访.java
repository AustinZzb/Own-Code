package lanqiao;

/**
 * 鍙傝�冿細others 鈥斺�斺�斺�� Set_鏈夐噸澶嶅厓绱燺浠庢暟缁勪腑鍙杗涓厓绱�
 * X鏄熺悆瑕佹淳鍑轰竴涓�5浜虹粍鎴愮殑瑙傚療鍥㈠墠寰�W鏄熴��
 * 鍏朵腑锛�
 * A鍥芥渶澶氬彲浠ユ淳鍑�4浜恒�侭鍥芥渶澶氬彲浠ユ淳鍑�2浜恒��
 * C鍥芥渶澶氬彲浠ユ淳鍑�2浜恒�侱鍥芥渶澶氬彲浠ユ淳鍑�1浜恒��
 * E鍥芥渶澶氬彲浠ユ淳鍑�1浜恒�侳鍥芥渶澶氬彲浠ユ淳鍑�3浜恒��
 * 閭ｄ箞鏈�缁堟淳寰�W鏄熺殑瑙傚療鍥細鏈夊灏戠鍥藉埆鐨勪笉鍚岀粍鍚堝憿锛�
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�4鏃�-涓嬪崍4:22:20
 */
public class _浠ｈ〃鍥㈠嚭璁� {
	private static int sum = 0;
	
	private static void fun(int[] a, int[] b, int n, int m) {
		
		if(n == b.length) {
			if(m == 0) {
				sum++;
				for (int i = 0; i < b.length; i++) {
					for(int j = 0; j < b[i]; j++)
						System.out.print((char)('A'+i));
				}
				System.out.println();
			}
			return ;
		}
		
		for (int i = 0; i <= Math.min(a[n], m) ; i++) {
			b[n] = i;
			fun(a, b, n+1, m-i);
		}
		b[n] = 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 2, 2, 1, 1, 3};
		int[] b = new int[6];
		fun(a, b, 0, 5);
		System.out.println(sum);
	}

}
