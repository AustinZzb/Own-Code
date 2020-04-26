package ����_˫ָ��;
/**
 * 给定�?个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数�?
 * 函数应该返回这两个下标�?? index1 �? index2，其�? index1 必须小于 index2�?
 * 返回的下标�?�（index1 �? index2）不是从零开始的�?
 *
 * @author 张致�?
 *
 * 2020�?2�?16�?-下午5:37:16
 */
public class _�����������в�������֮�� {
	
	public int[] twoSum(int[] numbers, int target) {
		
		int[] a = new int[2];
		int i = 0, j = numbers.length - 1;
		while(i < j){
		  	int ans = numbers[i] + numbers[j];
		  	if(numbers[i] + numbers[j] == target){
				a[0] = i + 1;
				a[1] = j + 1;
				break;
			}else if(ans > target){
				j--;
			}else{
				i++;
			}
			
		}
		
		return a;
		        
	}
	
}
