package lanqiao;

import java.util.ArrayList;
import java.util.Scanner;

public class BASIC_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		
		int num = 0;
		 
		

	}
	
}


/**
利用Java自带的大数类BigInteger进行解决

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			BigInteger s=BigInteger.ONE;
			for(int i=1;i<=n;i++){
				s=s.multiply(BigInteger.valueOf(i));
			}
			System.out.println(s);
		}
	}
	
}
*/