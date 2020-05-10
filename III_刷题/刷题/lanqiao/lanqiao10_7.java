package lanqiao;

import java.util.Scanner;

// 坐标系机器人
public class lanqiao10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float y = 0;
		int x_1 = scan.nextInt(); 
		int y_1 = scan.nextInt(); 
		int x_2 = scan.nextInt(); 
		int y_2 = scan.nextInt(); 
		
		if(y_2-y_1>0) {
			
			int k = (y_2-y_1)/(x_2-x_1);
			float k_1 = (-1)/(float)k;
			float b = y_2 - k_1*x_2;
			
			while(true) {
				y = ++x_2*k_1 + b;
				if(y==(int)y)
					break;
			}
			
		}else {
			int k = (y_2-y_1)/(x_2-x_1);
			float k_1 = (-1)/(float)k;
			float b = y_2 - k_1*x_2;
			
			while(true) {
				y = --x_2*k_1 + b;
				if(y==(int)y)
					break;
			}
		}
		
		System.out.print(x_2+" "+(int)y);

	}

}
