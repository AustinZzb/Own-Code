package 博弈问题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. 轮到某人填的时候，只能在某个空格中填入L或O
 * 2. 谁先让字母组成了“LOL”的字样，谁获胜。
 * 3. 如果所有格子都填满了，仍无法组成LOL，则平局。
 * 输入格式：
 * 第一行，数字n（n<10），表示下面有n个初始局面。
 * 接下来，n行，每行一个串，表示开始的局面。
 * 比如：“******”, 表示有6个空格。“L****”, 表示左边是一个字母L，它的右边是4个空格。
 * 
 * 输出格式：
 * 要求输出n个数字，表示对每个局面，如果小明先填，当K大师总是用最强着法的时候，小明的最好结果。
 * 1 表示能赢	 -1 表示必输	0 表示可以逼平
 * 
 * @author 张致邦
 *
 * 2020年2月5日-下午5:00:03
 */
public class 神_填字母游戏 {
	
	private static int fun(char[] c) {
		
		String string = String.valueOf(c);
		if(string.contains("LOL")) return -1;
		if(!string.contains("*")) return 0;
		
		boolean flag = false;
		
		for (int i = 0; i < c.length; i++) {
			if(c[i] == '*') {
				try {
					c[i] = 'L';
					switch (fun(c)) {
						case -1: return 1;
						case 0: flag = true;
					}
					c[i] = 'O';
					switch (fun(c)) {
						case -1: return 1;
						case 0: flag = true;
					}
				}finally {
					c[i] = '*';
				}
			}
		}
		
		if(flag) return 0;
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		System.out.println(fun(string.toCharArray()));
	}

}
