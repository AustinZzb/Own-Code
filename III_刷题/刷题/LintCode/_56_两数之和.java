package LintCode;

import java.util.Arrays;
import java.util.Scanner;

public class _56_两数之和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] s_1 = s.split("\\s+");
		int n[] = new int[s_1.length];
		
		for(int i=0;i<s_1.length;i++)
			n[i] = Integer.parseInt(s_1[i]);
			
		
		int n_1 = scan.nextInt();
		
		int[] m = twoSum(n,n_1);
		
		System.out.print(Arrays.toString(m));

	}
	
	public static int[] twoSum(int[] numbers, int target) {
        // write your code here
        
        int i=0;
        int j=0;
        for(i=0;i<numbers.length;i++){
            for(j = i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j] == target)
                 break;
            }
            if(j!=numbers.length)
            break;
        }
        
        int[] n = new int[]{i,j};
        return n;
        
    }

}
