package Test;

import java.util.Arrays;

/**
 * ����һ�����飬ɾ�����ظ���Ԫ��  
 * Ҫ��  O��n��ʱ�临�Ӷ�  O��1���ռ�
 * @author ���°�
 *
 * 2020��2��27��-����10:40:42
 */
public class _ɾ�������е��ظ��� {

	private static int delet(int[] arr) {
		int i = 0, j = 1;
		if(arr.length == 0) return i;
		
		Arrays.sort(arr);
		while (j < arr.length) {
			if(arr[i] == arr[j])
				j++;
			else {
				arr[i+1] = arr[j];
				j++;
				i++;
			}
		}
		
		return i + 1;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,5,1,2,1,5,6,8,1,3,8,3,51,2,3};
		int len = delet(arr);
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
