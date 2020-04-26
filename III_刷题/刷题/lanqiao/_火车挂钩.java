package lanqiao;
//火车挂钩

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _火车挂钩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s_0 = scan.next();
		String s_1 = scan.next();
		char[] s_00 = s_0.toCharArray();
		char[] s_10 = s_1.toCharArray();
				
		ArrayList<Character> A = new ArrayList<Character>();
		ArrayList<Character> B = new ArrayList<Character>();
		ArrayList<Character> AB = new ArrayList<Character>();
		
		for(int i=0;i<s_00.length;i++)
			A.add(s_00[i]);
		for(int i=0;i<s_10.length;i++)
			B.add(s_10[i]);
		
		int n = 0;
		while(true) {
			if(n%2 == 0) {  // A 出牌
				
				if(n == 0) { // 第一次A出牌  
					System.out.println(A.get(0));
					AB.add(A.get(0));
					A.remove(n);
					n++;
					
				}else {
					int i_0 = 0;
					char c = A.get(0);
					System.out.println(A.get(0));
					for(int i=0;i<AB.size();i++) {
						if(c == AB.get(i)) {  // 可以收牌
							
							A.remove(0);
							A.add(c);
							
							for(int j=AB.size()-1;j>=0;j--) { 
								
									if(AB.get(j) == c) {
										A.add(AB.get(j));
										AB.remove(j);
										break;
									}
									A.add(AB.get(j));
									AB.remove(j);
								
								
							}
								
							
							i_0 ++;
							
							break;
							
						}
					}
					
					if(i_0 == 0) {  //  无相同牌
						AB.add(A.get(0));
						A.remove(0);
						if(A.size() == 0) {
							for(int i=0;i<B.size();i++)
								System.out.print(B.get(i));
							break;
						}
						n++;
					}
					
				}
				
			}else {  //  B出牌
				
				int i_0 = 0;
				char c = B.get(0);
				System.out.println(B.get(0));
				for(int i=0;i<AB.size();i++) {
					if(c == AB.get(i)) {  // 可以收牌
						
						B.remove(0);
						B.add(c);
						
						for(int j=(AB.size()-1);j>=0;j--) { 
							
								if(AB.get(j) == c) {
									B.add(AB.get(j));
									AB.remove(j);
									break;
								}
								B.add(AB.get(j));
								AB.remove(j);
							
						}
							
						
						i_0 ++;
						
						break;
						
					}
				}
				
				if(i_0 == 0) {  //  无相同牌
					AB.add(B.get(0));
					B.remove(0);
					if(B.size() == 0) {
						for(int i=0;i<A.size();i++)
							System.out.print(A.get(i));
						break;
					}
					n++;
					
				}
				
			}
			
		}

	}

}
