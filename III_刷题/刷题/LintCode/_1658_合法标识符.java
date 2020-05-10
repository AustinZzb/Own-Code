package LintCode;

import java.util.Scanner;
/**
 * 璇峰垽鏂瓧绗︿覆 str 鏄笉鏄竴涓悎娉曠殑鏍囪瘑绗︺��
 * 鍚堟硶鐨勬爣璇嗙鐢卞瓧姣嶏紙A-Z锛宎-z锛夈�佹暟瀛楋紙0-9锛夊拰涓嬪垝绾跨粍鎴愶紝骞朵笖棣栧瓧绗︿笉鑳戒负鏁板瓧銆�
 * 鏍蜂緥
 * 鏍蜂緥 1锛�
 * 杈撳叆锛歴tr= "LintCode"
 * 杈撳嚭锛歵rue
 * 瑙ｉ噴锛�
 * 鍥犱负 "LintCode" 鐢卞瓧姣嶇粍鎴愩��
 * 鏍蜂緥 2锛�
 * 杈撳叆锛歴tr = "123_abc"
 * 杈撳嚭锛歠alse
 * 瑙ｉ噴锛�
 * 铏界劧 "123_abc" 鐢卞瓧姣嶃�佹暟瀛楀拰涓嬪垝绾跨粍鎴愶紝浣嗘槸瀹冪殑棣栧瓧绗︿负鏁板瓧銆�
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�11鏃�-涓嬪崍8:56:33
 */
public class _1658_鍚堟硶鏍囪瘑绗� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		boolean flag_1 = true;
		if(string.equals("")) {
			flag_1 = false;
			System.out.println(false);
		}
		
		if(string.charAt(0) >= '0' && string.charAt(0) <= '9') {
			flag_1 = false;
			System.out.println(false);
		}
			
		
		for (int i = 0; i < string.length(); i++) {
			if(!flag(string.charAt(i))) {
				flag_1 = false;
				System.out.println(false);
			}
				
		}
		
		if (flag_1) {
			System.out.println(true);
		}

	}
	
	private static boolean flag(char c) {
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z') || c == '_' || (c>='1' && c<='9'))
			return true;
		
		return false;
	}

}
