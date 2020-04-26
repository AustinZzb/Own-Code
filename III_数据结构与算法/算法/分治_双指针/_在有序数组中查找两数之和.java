package 分治_双指针;
/**
 * 缁欏畾涓?涓凡鎸夌収鍗囧簭鎺掑垪聽鐨勬湁搴忔暟缁勶紝鎵惧埌涓や釜鏁颁娇寰楀畠浠浉鍔犱箣鍜岀瓑浜庣洰鏍囨暟銆?
 * 鍑芥暟搴旇杩斿洖杩欎袱涓笅鏍囧?? index1 鍜? index2锛屽叾涓? index1聽蹇呴』灏忎簬聽index2銆?
 * 杩斿洖鐨勪笅鏍囧?硷紙index1 鍜? index2锛変笉鏄粠闆跺紑濮嬬殑銆?
 *
 * @author 寮犺嚧閭?
 *
 * 2020骞?2鏈?16鏃?-涓嬪崍5:37:16
 */
public class _在有序数组中查找两数之和 {
	
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
