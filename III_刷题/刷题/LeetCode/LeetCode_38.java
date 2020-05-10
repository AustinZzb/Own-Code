package LeetCode;
/**
 * 銆屽瑙傛暟鍒椼�嶆槸涓�涓暣鏁板簭鍒楋紝浠庢暟瀛� 1 寮�濮嬶紝搴忓垪涓殑姣忎竴椤归兘鏄鍓嶄竴椤圭殑鎻忚堪銆傚墠浜旈」濡備笅锛�
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1聽琚浣溌犅�"one 1"聽聽("涓�涓竴") , 鍗陈�11銆�
 * 11 琚浣溌�"two 1s"聽("涓や釜涓�"锛�, 鍗陈�21銆�
 * 21 琚浣溌�"one 2", 聽"one 1"聽锛�"涓�涓簩"聽,聽聽"涓�涓竴")聽, 鍗陈�1211銆�
 * 缁欏畾涓�涓鏁存暟 n锛�1 鈮ぢ爊聽鈮� 30锛夛紝杈撳嚭澶栬鏁板垪鐨勭 n 椤广��
 * 娉ㄦ剰锛氭暣鏁板簭鍒椾腑鐨勬瘡涓�椤瑰皢琛ㄧず涓轰竴涓瓧绗︿覆銆�
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�13鏃�-涓婂崍9:48:23
 */
public class LeetCode_38 {

	//StringBuilder瑙ｆ硶锛屾晥鐜囬珮    StringBuilder鍜孲tringBuffer鍩烘湰绫讳技锛屼絾鏄疭tringBuffer瀹炵幇浜嗙嚎绋嬪畨鍏紝鎵�浠tringBuilder鏇村揩涓�浜�
	public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
			result = fun(result);
		}
        return result;
    }
	
	
	private String fun(String result) {
		// TODO Auto-generated method stub
		StringBuilder stringBuffer = new StringBuilder();
		char c = result.charAt(0);
		int sum = 1;
		
		for (int i = 1; i < result.length(); i++) {
			
			if(c == result.charAt(i)) {
				sum ++;
			}else {
				stringBuffer.append(sum);
				stringBuffer.append(c);
				c = result.charAt(i);
				sum = 1;
			}
			
		}
		stringBuffer.append(sum);
		stringBuffer.append(c);
		
		return stringBuffer.toString();
	}


	// 鏅�氳В娉曪紝鏁堢巼鏈夌偣鎱�
	public String countAndSay_1(int n) {
        String[] strings = new String[30];
        strings[0] = "1";
        for (int i = 1; i < strings.length; i++) {
                if(i == n) return strings[n-1];
			    int sum = 1;
                strings[i] = "";
			    for (int j = 1; j < strings[i-1].length(); j++) {
			    	if(strings[i-1].charAt(j) == strings[i-1].charAt(j-1))
				    	sum++;
				    else {
			    		strings[i] += sum + "" + strings[i-1].charAt(j-1) + "";
			    		sum = 1;
			    	}
		    	}
                strings[i] += sum + "" + strings[i-1].charAt(strings[i-1].length()-1) + "";
	    	}
        
        return strings[n-1];
    }

}
