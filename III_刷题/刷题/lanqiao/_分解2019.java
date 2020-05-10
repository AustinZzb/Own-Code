package lanqiao;
/**
 * 銆愰棶棰樻弿杩般��
 * 鎶� 2019 鍒嗚В鎴� 3 涓悇涓嶇浉鍚岀殑姝ｆ暣鏁颁箣鍜岋紝骞朵笖瑕佹眰姣忎釜姝ｆ暣鏁伴兘涓嶅寘 鍚暟瀛� 2 鍜� 4锛屼竴鍏辨湁澶氬皯绉嶄笉鍚岀殑鍒嗚В鏂规硶锛�
 * 娉ㄦ剰浜ゆ崲 3 涓暣鏁扮殑椤哄簭琚涓哄悓涓�绉嶆柟娉曪紝渚嬪 1000+1001+18 鍜� 1001+1000+18 琚涓哄悓涓�绉嶃��
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�3鏃�-涓婂崍9:03:27
 */
public class _鍒嗚В2019 {
	
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
