package LeetCode;
/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 
 * @author 张致邦
 *
 * 2020年1月31日-下午8:23:32
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
