package lanqiao;

import java.math.BigInteger;

/**
 * 銆愰棶棰樻弿杩般��
 * 缁欏畾鏁板垪 1, 1, 1, 3, 5, 9, 17, 鈥︼紝浠庣 4 椤瑰紑濮嬶紝姣忛」閮芥槸鍓� 3 椤圭殑鍜屻�傛眰 绗� 20190324 椤圭殑鏈�鍚� 4 浣嶆暟瀛椼��
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�2鏃�-涓嬪崍9:29:09
 */
public class _鏁板垪姹傚�� {
	public static void fun() {
		
		int[] a = new int[20190324];
		a[0] = a[1] = a[2] = 1;
		int ans = 0;
		for(int i = 3;i <20190324; i++) {
			a[i] = (a[i-1] + a[i-2] + a[i-3]) % 1000000;
		}
		System.out.println(a[20190323]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}

}
