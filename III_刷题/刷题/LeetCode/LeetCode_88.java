package LeetCode;import java.util.Arrays;

/**
 * 缁欏畾涓や釜鏈夊簭鏁存暟鏁扮粍聽nums1 鍜� nums2锛屽皢 nums2 鍚堝苟鍒奥爊ums1聽涓紝浣垮緱聽num1 鎴愪负涓�涓湁搴忔暟缁勩��
 * 璇存槑:
 * 鍒濆鍖柭爊ums1 鍜� nums2 鐨勫厓绱犳暟閲忓垎鍒负聽m 鍜� n銆�
 * 浣犲彲浠ュ亣璁韭爊ums1聽鏈夎冻澶熺殑绌洪棿锛堢┖闂村ぇ灏忓ぇ浜庢垨绛変簬聽m + n锛夋潵淇濆瓨 nums2 涓殑鍏冪礌銆�
 * nums1 = [1,2,3,1,2,2,3,5,6], m = 3
   nums2 = [2,5,6],       n = 3
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�15鏃�-涓婂崍9:27:33
 */
public class LeetCode_88 {
	// 娉ㄦ剰 : nums1绌洪棿澶т簬m+n
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-- + n-- - 1;
        while(m >= 0 && n >= 0) {
        	nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        
        while (n >= 0) {
			nums1[p--] = nums2[n--];
		}
        
    }
	
}
