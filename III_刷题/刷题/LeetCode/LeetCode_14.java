package LeetCode;

/**
 * 缂栧啓涓�涓嚱鏁版潵鏌ユ壘瀛楃涓叉暟缁勪腑鐨勬渶闀垮叕鍏卞墠缂�銆�
 * 濡傛灉涓嶅瓨鍦ㄥ叕鍏卞墠缂�锛岃繑鍥炵┖瀛楃涓猜�""銆�
 * 绀轰緥聽1:
 * 杈撳叆: ["flower","flow","flight"]
 * 杈撳嚭: "fl"
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�12鏃�-涓婂崍9:51:31
 */
public class LeetCode_14 {
	// @note 瀹樻柟棰樿В锛氭按骞虫壂鎻忔硶   LCP
	public String longestCommonPrefix(String[] strs) {
        
		String string = strs[0];
		
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(string) != 0) {
				string = string.substring(0,string.length() - 1);
				if(string.equals("")) return "";
			}
		}
		
		return string;
		
    }

	
	// @note 鏅�氭毚鍔涙硶
	public String longestCommonPrefix_1(String[] strs) {
        
		String string = "";
		boolean flag = true;
		
		for (int i = 0; i < strs[0].length(); i++) {
		
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if(i >= strs[j].length() || strs[j].charAt(i) != c) {
					flag = false;
					break;
				}
			}
			if(!flag) break;
			string += c;
			
		}
		
		return string;
		
    }
	
}
