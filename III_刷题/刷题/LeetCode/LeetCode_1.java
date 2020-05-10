package LeetCode;

/**
 * 缁欏畾涓�涓暣鏁版暟缁� nums聽鍜屼竴涓洰鏍囧�� target锛岃浣犲湪璇ユ暟缁勪腑鎵惧嚭鍜屼负鐩爣鍊肩殑閭Ｂ犱袱涓犳暣鏁帮紝骞惰繑鍥炰粬浠殑鏁扮粍涓嬫爣銆�
 * 浣犲彲浠ュ亣璁炬瘡绉嶈緭鍏ュ彧浼氬搴斾竴涓瓟妗堛�備絾鏄紝浣犱笉鑳介噸澶嶅埄鐢ㄨ繖涓暟缁勪腑鍚屾牱鐨勫厓绱犮��
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�1鏃�-涓嬪崍3:52:56
 */

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_1 {
	
	public static int[] twoSum(int[] nums, int target) {
        
		int[] arr = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j)
					continue;
				else if (nums[i]+nums[j] == target) {
					arr[0] = i < j ? i : j;
					arr[1] = i > j ? i : j;
				}
			}
		}
		
		return arr;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr_1 = new int[n];
		
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = scan.nextInt();
		}
		int target = scan.nextInt();
		
		System.out.println(Arrays.toString(twoSum(arr_1, target)));

	}

}
