package LeetCode;
/**
 * 缁欏畾涓�涓暟缁勶紝瀹冪殑绗爄 涓厓绱犳槸涓�鏀粰瀹氳偂绁ㄧ i 澶╃殑浠锋牸銆�
 * 濡傛灉浣犳渶澶氬彧鍏佽瀹屾垚涓�绗斾氦鏄擄紙鍗充拱鍏ュ拰鍗栧嚭涓�鏀偂绁級锛岃璁′竴涓畻娉曟潵璁＄畻浣犳墍鑳借幏鍙栫殑鏈�澶у埄娑︺��
 * 娉ㄦ剰浣犱笉鑳藉湪涔板叆鑲＄エ鍓嶅崠鍑鸿偂绁ㄣ��
 * 杈撳叆: [7,1,5,3,6,4]
 * 杈撳嚭: 5
 * 瑙ｉ噴: 鍦ㄧ 2 澶╋紙鑲＄エ浠锋牸 = 1锛夌殑鏃跺�欎拱鍏ワ紝鍦ㄧ 5 澶╋紙鑲＄エ浠锋牸 = 6锛夌殑鏃跺�欏崠鍑猴紝鏈�澶у埄娑� = 6-1 = 5 銆�
 * 娉ㄦ剰鍒╂鼎涓嶈兘鏄� 7-1 = 6, 鍥犱负鍗栧嚭浠锋牸闇�瑕佸ぇ浜庝拱鍏ヤ环鏍笺��
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�16鏃�-涓婂崍9:37:45
 */
public class LeetCode_121 {
	//鏆村姏娉�
	public int maxProfit_1(int[] prices) {
		
		int max = 0;
		for(int i = prices.length - 1; i >= 0; i--){
			for(int j = i - 1; j >= 0; j--){
				if(prices[i] - prices[j] > max)
					max = prices[i] - prices[j];
			}
		}
		
		return max;
		        
	}

	// 鍔ㄦ�佽鍒�
	public int maxProfit(int[] prices) {
		
		int max = 0, min = prices[0];
		for(int i = 1; i < prices.length; i++){
			max = Math.max(prices[i] - min, max);
			min = Math.min(prices[i], min);
		}
		return max;      
	}
}
