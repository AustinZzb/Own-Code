package LeetCode;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * @author 张致邦
 *
 * 2020年2月1日-下午3:52:56
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
