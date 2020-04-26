package LeetCode;

import java.util.Scanner;
/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * 示例 1:
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 
 * @author 张致邦
 *
 * 2020年2月11日-下午9:44:43
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
