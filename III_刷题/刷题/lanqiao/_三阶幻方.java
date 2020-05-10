package lanqiao;

import java.util.Scanner;
/**
 * 缁欏畾涓�涓畫缂虹殑涓夐樁骞绘柟锛屾眰鍑哄畬鏁寸殑涓夐樁骞绘柟
 * @author 寮犺嚧閭�
 *
 * 2020骞�2鏈�2鏃�-涓嬪崍9:05:04
 */
public class _涓夐樁骞绘柟 {
	static int arr[] = new int[9];
    static int ans[] = new int[9];
    static int flag = 0;
    static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        for(int i = 0; i < 9; i++){
	            arr[i] = sc.nextInt();
	        }
	        dfs(0);
	        if(flag == 1){
	            for(int i = 0; i < 9; i++){
	                if(i % 3 == 0 && i != 0) 
	                System.out.print("\n");
	                System.out.print(ans[i] + " ");
	            }
	        }else{
	            System.out.println("Too Many");
	        }
	                sc.close();


	}
	
	 private static void dfs(int cur) {
	        if(cur == 9){
	            if(judgeSum()){
	                flag++;
	                if(flag == 1){
	                    for(int i = 0; i < 9; i++){
	                        ans[i] = arr[i];
	                    }
	                }
	            }
	            return;
	        }
	        if(arr[cur] != 0){
	            dfs(cur + 1);
	        }else{
	            for(int i = 0; i < 9; i++){
	                if(arr[cur] == 0 && judge(i + 1)){
	                    arr[cur] = i + 1;
	                    dfs(cur + 1);
	                    //鍥炴函   
	                    arr[cur] = 0;
	                }
	            }
	        }    
	    }

	    private static boolean judge(int index) {
	        for(int i = 0; i < 9; i++){
	            if(arr[i] == index)return false;
	        }
	        return true;
	    }
	    
	    private static boolean judgeSum() {
	        int sum1 = arr[0] + arr[1] + arr[2];
	        int sum2 = arr[3] + arr[4] + arr[5];
	        int sum3 = arr[6] + arr[7] + arr[8];
	        int sum4 = arr[0] + arr[3] + arr[6];
	        int sum5 = arr[1] + arr[4] + arr[7];
	        int sum6 = arr[2] + arr[5] + arr[8];
	        int sum7 = arr[0] + arr[4] + arr[8];
	        int sum8 = arr[2] + arr[4] + arr[6];
	        return (sum1 == sum2 && sum2 == sum3 && sum3 == sum4 && sum4 == sum5 && sum5 == sum6 && sum6 == sum7
	            && sum7 == sum8);         
	    }


}
