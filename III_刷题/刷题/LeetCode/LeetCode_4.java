package LeetCode;
/**
 * 缁欏畾涓や釜澶у皬涓� m 鍜� n 鐨勬湁搴忔暟缁劼爊ums1 鍜屄爊ums2銆�
 * 璇蜂綘鎵惧嚭杩欎袱涓湁搴忔暟缁勭殑涓綅鏁帮紝骞朵笖瑕佹眰绠楁硶鐨勬椂闂村鏉傚害涓郝燨(log(m + n))銆�
 * 浣犲彲浠ュ亣璁韭爊ums1聽鍜屄爊ums2聽涓嶄細鍚屾椂涓虹┖銆�
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�1鏈�31鏃�-涓嬪崍8:23:32
 */
import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_4 {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
		double ans = 0;
		nums1 = Arrays.copyOf(nums1, nums1.length+nums2.length);
		System.arraycopy(nums2, 0, nums1, nums1.length-nums2.length, nums2.length);
		Arrays.sort(nums1);
		if (nums1.length % 2 != 0) {
			ans = nums1[nums1.length/2];
		}else {
			ans = (double)(nums1[nums1.length/2] + nums1[nums1.length/2-1])/2;
		}
		return ans;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {1,2};
		int[] nums2 = new int[] {3,4};	
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

}
