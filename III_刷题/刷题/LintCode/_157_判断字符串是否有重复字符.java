package LintCode;

import java.util.Scanner;

public class _157_鍒ゆ柇瀛楃涓叉槸鍚︽湁閲嶅瀛楃 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		char[] arr = s.toCharArray();
		
		boolean flag = true;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				if(j == i)
					continue;
				else if(arr[i] == arr[j]){
					flag = false;
					break;
				}
			}
			
		}
	
	}

}
