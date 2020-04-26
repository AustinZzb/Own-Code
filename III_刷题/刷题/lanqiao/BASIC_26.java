package lanqiao;

import java.util.Scanner;

public class BASIC_26 {
	
	private static String fun(int m, int n) {
		String string = "";
		
		string += time(m) + " ";
		if(n == 0) string += "o'clock";
		else string += time(n);
		
		return string;
		
	}
	
	private static String time(int n) {
		
		if(n <= 20) {
			switch (n) {
				case 0:return "zero"; 
				case 1:return "one"; 
				case 2:return "two"; 
				case 3:return "three";
				case 4:return "four";
				case 5:return "five"; 
				case 6:return "six";  
				case 7:return "seven";  
				case 8:return "eight";  
				case 9:return "nine";  
				case 10:return "ten";  
				case 11:return "eleven";  
				case 12:return "twelve";  
				case 13:return "thirteen";  
				case 14:return "fourteen";  
				case 15:return "fifteen";  
				case 16:return "sixteen";  
				case 17:return "seventeen";  
				case 18:return "eighteen";
				case 19:return "nineteen"; 
				case 20:return "twenty";
			}
		}else {
			if(n < 30) return "twenty " + time(n % 10); 
			else if(n < 40) return "thirty " + time(n % 10);
			else if(n < 50) return "forty " + time(n % 10); 
			else return "fifty " + time(n % 10); 
		}
		
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		System.out.println(fun(n, m));
	}

}
