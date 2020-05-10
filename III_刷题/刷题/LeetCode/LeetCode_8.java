package LeetCode;
/**
 * 璇蜂綘鏉ュ疄鐜颁竴涓燼toi聽鍑芥暟锛屼娇鍏惰兘灏嗗瓧绗︿覆杞崲鎴愭暣鏁般��
 * 棣栧厛锛岃鍑芥暟浼氭牴鎹渶瑕佷涪寮冩棤鐢ㄧ殑寮�澶寸┖鏍煎瓧绗︼紝鐩村埌瀵绘壘鍒扮涓�涓潪绌烘牸鐨勫瓧绗︿负姝€��
 * 褰撴垜浠鎵惧埌鐨勭涓�涓潪绌哄瓧绗︿负姝ｆ垨鑰呰礋鍙锋椂锛屽垯灏嗚绗﹀彿涓庝箣鍚庨潰灏藉彲鑳藉鐨勮繛缁暟瀛楃粍鍚堣捣鏉ワ紝浣滀负璇ユ暣鏁扮殑姝ｈ礋鍙凤紱鍋囧绗竴涓潪绌哄瓧绗︽槸鏁板瓧锛屽垯鐩存帴灏嗗叾涓庝箣鍚庤繛缁殑鏁板瓧瀛楃缁勫悎璧锋潵锛屽舰鎴愭暣鏁般��
 * 璇ュ瓧绗︿覆闄や簡鏈夋晥鐨勬暣鏁伴儴鍒嗕箣鍚庝篃鍙兘浼氬瓨鍦ㄥ浣欑殑瀛楃锛岃繖浜涘瓧绗﹀彲浠ヨ蹇界暐锛屽畠浠浜庡嚱鏁颁笉搴旇閫犳垚褰卞搷銆�
 * 娉ㄦ剰锛氬亣濡傝瀛楃涓蹭腑鐨勭涓�涓潪绌烘牸瀛楃涓嶆槸涓�涓湁鏁堟暣鏁板瓧绗︺�佸瓧绗︿覆涓虹┖鎴栧瓧绗︿覆浠呭寘鍚┖鐧藉瓧绗︽椂锛屽垯浣犵殑鍑芥暟涓嶉渶瑕佽繘琛岃浆鎹€��
 * 鍦ㄤ换浣曟儏鍐典笅锛岃嫢鍑芥暟涓嶈兘杩涜鏈夋晥鐨勮浆鎹㈡椂锛岃杩斿洖 0銆�
 * 璇存槑锛�
 * 鍋囪鎴戜滑鐨勭幆澧冨彧鑳藉瓨鍌� 32 浣嶅ぇ灏忕殑鏈夌鍙锋暣鏁帮紝閭ｄ箞鍏舵暟鍊艰寖鍥翠负聽[鈭�231,聽 231聽鈭� 1]銆傚鏋滄暟鍊艰秴杩囪繖涓寖鍥达紝璇疯繑鍥� 聽INT_MAX (231聽鈭� 1) 鎴柭營NT_MIN (鈭�231) 銆�
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�1鏈�31鏃�-涓嬪崍8:23:32
 */
import java.util.Scanner;

public class LeetCode_8 {
	
	  public static int myAtoi(String str) {
	        long ans = 0, index = 0, ans_1 = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') continue;
				else if(index == 0){
					if((str.charAt(i) < '0' || str.charAt(i) > '9') && (str.charAt(i) != '-') && (str.charAt(i) != '+')) {
						return (int) ans;
					}else if (str.charAt(i) == '-') {
						ans_1 = -1;
					}else if (str.charAt(i) == '+') {
						ans_1 = 1;
					}else{
						ans = ans * 10 + Integer.parseInt(String.valueOf(str.charAt(i)));
					}
					index++;
				}else { //2234-ddf25
					if(str.charAt(i) < '0' || str.charAt(i) > '9' || (str.charAt(i) == '0' && ans_1 == 1)) {
						break;
					}
					ans = ans * 10 + Integer.parseInt(String.valueOf(str.charAt(i)));
				}
				
			}
			
			if (ans_1 == 0) {
				ans_1 = 1;
			}
			ans *= ans_1;
			
			if (ans > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}else if(ans < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}else {
				return (int) ans;
			}
	    }
		
    
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string  = scan.next();
		System.out.println(myAtoi(string));
	}
	
}
