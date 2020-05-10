package LeetCode;

import java.util.Scanner;
/**
 * 缁欏畾涓�涓帓搴忔暟缁勫拰涓�涓洰鏍囧�硷紝鍦ㄦ暟缁勪腑鎵惧埌鐩爣鍊硷紝骞惰繑鍥炲叾绱㈠紩銆傚鏋滅洰鏍囧�间笉瀛樺湪浜庢暟缁勪腑锛岃繑鍥炲畠灏嗕細琚寜椤哄簭鎻掑叆鐨勪綅缃��
 * 浣犲彲浠ュ亣璁炬暟缁勪腑鏃犻噸澶嶅厓绱犮��
 * 绀轰緥 1:
 * 杈撳叆: [1,3,5,6], 5
 * 杈撳嚭: 2
 * 绀轰緥聽2:
 * 杈撳叆: [1,3,5,6], 2
 * 杈撳嚭: 1
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�11鏃�-涓嬪崍9:44:43
 */
public class LeetCode_35 {
	
	public static int searchInsert(int[] nums, int target) {
        
		if(target > nums[nums.length-1]) return nums.length;
        if(target == nums[nums.length-1]) return nums.length - 1;
		if(target <= nums[0]) return 0;
		return fun(nums, target, 0, nums.length-1);
		
    }
	
	private static int fun(int[] nums, int target, int from, int to) {
		
		if(to - from == 1) {
			if(nums[from] >= target) return from;
			else return to;
		}
		
		int middle = (from + to) /  2;
		
		if(nums[middle] > target) return fun(nums, target, from, middle);
		else return fun(nums, target, middle, to);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
		System.out.println(searchInsert(new int[] {1,5,8,9,15,18,19,20,25,35,39,41,45,48,50,59,60,99}, 37));
	}

}
