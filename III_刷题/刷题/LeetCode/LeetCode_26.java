package LeetCode;
/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 示例 1:
 * 给定数组 nums = [1,1,2], 
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 
 * @author 张致邦
 *
 * 2020年2月12日-下午9:31:39
 */
public class LeetCode_26 {
	
	// 双指针
	public static int removeDuplicates(int[] nums) {
		
		int i = 0, j = 1;
		while(j < nums.length) {
			if(nums[i] == nums[j])
				j++;
			else {
				nums[i+1] = nums[j];
				i++;
				j++;
			}
		}
		
		return i+1;
		
    }
	
	
	// 暴力解法
	public static int removeDuplicates_1(int[] nums) {
		int i = 1, j = 0;
		for (i = 1; i < nums.length; i++) {
			if(nums[i] <= nums[i-1]) {
				for (j = i+1; j < nums.length; j++) {
					if(nums[j] > nums[i-1]) {
						nums[i] = nums[j];
						break;
					}
				}
				if(j == nums.length)
					break;
			}
		}
		
		return i;
		
    }
	
	public static void main(String[] args) {         //0 1 2 3 4
		System.out.println(removeDuplicates(new int[] {0,0,1}));
	}
	
}
