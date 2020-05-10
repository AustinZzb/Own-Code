package LeetCode;
/**
 * 缁欏畾涓�涓帓搴忔暟缁勶紝浣犻渶瑕佸湪鍘熷湴鍒犻櫎閲嶅鍑虹幇鐨勫厓绱狅紝浣垮緱姣忎釜鍏冪礌鍙嚭鐜颁竴娆★紝杩斿洖绉婚櫎鍚庢暟缁勭殑鏂伴暱搴︺��
 * 涓嶈浣跨敤棰濆鐨勬暟缁勭┖闂达紝浣犲繀椤诲湪鍘熷湴淇敼杈撳叆鏁扮粍骞跺湪浣跨敤 O(1) 棰濆绌洪棿鐨勬潯浠朵笅瀹屾垚銆�
 * 绀轰緥聽1:
 * 缁欏畾鏁扮粍 nums = [1,1,2], 
 * 鍑芥暟搴旇杩斿洖鏂扮殑闀垮害 2, 骞朵笖鍘熸暟缁� nums 鐨勫墠涓や釜鍏冪礌琚慨鏀逛负 1, 2銆� 
 * 浣犱笉闇�瑕佽�冭檻鏁扮粍涓秴鍑烘柊闀垮害鍚庨潰鐨勫厓绱犮��
 * 绀轰緥聽2:
 * 缁欏畾 nums = [0,0,1,1,1,2,2,3,3,4],
 * 鍑芥暟搴旇杩斿洖鏂扮殑闀垮害 5, 骞朵笖鍘熸暟缁� nums 鐨勫墠浜斾釜鍏冪礌琚慨鏀逛负 0, 1, 2, 3, 4銆�
 * 浣犱笉闇�瑕佽�冭檻鏁扮粍涓秴鍑烘柊闀垮害鍚庨潰鐨勫厓绱犮��
 * 
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�12鏃�-涓嬪崍9:31:39
 */
public class LeetCode_26 {
	
	// 鍙屾寚閽�
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
	
	
	// 鏆村姏瑙ｆ硶
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
