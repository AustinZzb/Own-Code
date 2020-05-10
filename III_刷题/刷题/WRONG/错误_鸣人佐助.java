package WRONG;

import java.util.Scanner;

/**
 * 瓒呮椂
 * 宸茬煡涓�寮犲湴鍥撅紙浠ヤ簩缁寸煩闃电殑褰㈠紡琛ㄧず锛変互鍙婁綈鍔╁拰楦ｄ汉鐨勪綅缃�傚湴鍥句笂鐨勬瘡涓綅缃兘鍙互璧板埌锛屽彧涓嶈繃鏈変簺浣嶇疆涓婃湁澶ц泧涓哥殑鎵嬩笅锛岄渶瑕佸厛鎵撹触澶ц泧涓哥殑鎵嬩笅鎵嶈兘鍒拌繖浜涗綅缃�傞福浜烘湁涓�瀹氭暟閲忕殑鏌ュ厠鎷夛紝姣忎竴涓崟浣嶇殑鏌ュ厠鎷夊彲浠ユ墦璐ヤ竴涓ぇ铔囦父鐨勬墜涓嬨�傚亣璁鹃福浜哄彲浠ュ線涓婁笅宸﹀彸鍥涗釜鏂瑰悜绉诲姩锛屾瘡绉诲姩涓�涓窛绂婚渶瑕佽姳璐� 11 涓崟浣嶆椂闂达紝鎵撹触澶ц泧涓哥殑鎵嬩笅涓嶉渶瑕佹椂闂淬�傚鏋滈福浜烘煡鍏嬫媺娑堣�楀畬浜嗭紝鍒欏彧鍙互璧板埌娌℃湁澶ц泧涓告墜涓嬬殑浣嶇疆锛屼笉鍙互鍐嶇Щ鍔ㄥ埌鏈夊ぇ铔囦父鎵嬩笅鐨勪綅缃�備綈鍔╁湪姝ゆ湡闂翠笉绉诲姩锛屽ぇ铔囦父鐨勬墜涓嬩篃涓嶇Щ鍔ㄣ�傝闂紝楦ｄ汉瑕佽拷涓婁綈鍔╂渶灏戦渶瑕佽姳璐瑰灏戞椂闂达紵
 * 杈撳叆鏍煎紡
 * 杈撳叆鐨勭涓�琛屽寘鍚笁涓暣鏁帮細MM锛孨N锛孴T銆備唬琛� MM 琛� NN 鍒楃殑鍦板浘鍜岄福浜哄垵濮嬬殑鏌ュ厠鎷夋暟閲� TT銆�0 < M,N < 2000<M,N<200锛�0 \le T < 100鈮<10
 * 鍚庨潰鏄� MM 琛� NN 鍒楃殑鍦板浘锛屽叾涓� @ 浠ｈ〃楦ｄ汉锛�+ 浠ｈ〃浣愬姪銆�* 浠ｈ〃閫氳矾锛�# 浠ｈ〃澶ц泧涓哥殑鎵嬩笅銆�
 * 杈撳嚭鏍煎紡
 * 杈撳嚭鍖呭惈涓�涓暣鏁� RR锛屼唬琛ㄩ福浜鸿拷涓婁綈鍔╂渶灏戦渶瑕佽姳璐圭殑鏃堕棿銆傚鏋滈福浜烘棤娉曡拷涓婁綈鍔╋紝鍒欒緭鍑� -1鈭�1銆�
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�11鏃�-涓嬪崍4:19:45
 */
public class 閿欒_楦ｄ汉浣愬姪 {
	
	private static char[][] map;        // 瀛樺偍鍦板浘
	private static int[][] next = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};        // 涓嬩竴姝�
	private static int[][] book;			// 閫斿緞璁板綍
	private static int boom = 0;        // 鏌ュ厠鎷�
	private static int min = 10000;        // 鏈�灏忚矾閫�
	
	private static void found(int x, int y, int step) {
		if(map[x][y] == '#' && boom == 0)
			return;
		
		if (map[x][y] == '#') {
			boom --;
		}
		
		if(map[x][y] == '+' || step > min) {
			min = min < step ? min : step;
			return;
		}
		
		for (int i = 0; i < next.length; i++) {
			int old_1 = x + next[i][0];
			int old_2 = y + next[i][1];
			
			if(test(old_1, old_2)) {
				book[old_1][old_2] = 1;
				found(old_1, old_2, step + 1);
				book[old_1][old_2] = 0;
				if (map[old_1][old_2] == '#') {
					boom ++;
				}
			}
		
		}
		
	}

	private static boolean test(int x, int y) {
		// TODO Auto-generated method stub
		if(x >= 0 && x < map.length && y >= 0 && y < map[x].length) {
			if(book[x][y] == 0 && (map[x][y] == '*' || (map[x][y] == '#' && boom != 0) || map[x][y] == '+'))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		boom = scan.nextInt();
		map = new char[n][m];
		int x = 0, y = 0;
		
		for (int i = 0; i < n; i++) {
			map[i] = scan.next().toCharArray();
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(map[i][j] == '@') {
					x = i; y = j;
				}
			}
		}
		
		book = new int[n][m];
		book[x][y] = 1;
		
		found(x, y, 0);
		
		if(min == 10000)
			System.out.println(-1);
		else
			System.out.println(min);
	}

}










