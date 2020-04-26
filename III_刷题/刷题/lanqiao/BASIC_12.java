package lanqiao;

import java.util.Scanner;

//十六进制转八进制
public class BASIC_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i_1;
		for(i_1=0;i_1<n;i_1++) {
			String s_1 = scan.next();
			char[] s_01 = s_1.toCharArray();
			
			String s_12 = "";
			String s_11 = "";
			
			int i;
			for(i = 0;i<s_01.length;i++) {
				
				switch(s_01[i]) {
				
				case '0' : s_11 = "0000"; break;
				case '1' : s_11 = "0001"; break;
				case '2' : s_11 = "0010"; break;
				case '3' : s_11 = "0011"; break;
				case '4' : s_11 = "0100"; break;
				case '5' : s_11 = "0101"; break;
				case '6' : s_11 = "0110"; break;
				case '7' : s_11 = "0111"; break;
				case '8' : s_11 = "1000"; break;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
				case '9' : s_11 = "1001"; break;
				case 'A' : s_11 = "1010"; break;
				case 'B' : s_11 = "1011"; break;
				case 'C' : s_11 = "1100"; break;
				case 'D' : s_11 = "1101"; break;
				case 'E' : s_11 = "1110"; break;
				case 'F' : s_11 = "1111"; break;
				
				}
				
				s_12 += s_11;
				
			}
			
			char[] s_21 = s_12.toCharArray();
			
			long a = 0;
			
			if(s_21.length%3==2) {
				a = (long)(s_21[0]-'0')*2 + (long)(s_21[0]-'0')*1;
				
				int j;
				for(j = 2;j<s_21.length;j+=3) {
					a = a*10 + (long)(s_21[j]-'0')*4 + (long)(s_21[j+1]-'0')*2+ (long)(s_21[j+2]-'0')*1;
				}
				
			}else if(s_21.length%3==1) {
				a = (long)(s_21[0]-'0')*1;
				
				int j;
				for(j = 1;j<s_21.length;j+=3) {
					a = a*10 + (long)(s_21[j]-'0')*4 + (long)(s_21[j+1]-'0')*2+ (long)(s_21[j+2]-'0')*1;
				}
				
			}else if(s_21.length%3==0) {
				
				int j;
				for(j = 0;j<s_21.length;j+=3) {
					a = a*10 + (long)(s_21[j]-'0')*4 + (long)(s_21[j+1]-'0')*2+ (long)(s_21[j+2]-'0')*1;
				}
				
			}
			
			System.out.println(a);
		}
		
		
		
	}
	

}























