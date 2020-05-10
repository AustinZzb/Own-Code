import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 	@author ���°�
 *
 * 	2020��5��10��-����3:05:39
 */
@SuppressWarnings("resource")
public class Main_1 {
	private static List<Integer> list;
	
	public static void main(String[] args) {
		list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()) {
			String temp = scan.nextLine();
			if (temp.contains("min")) {
				min();
			} else if (temp.contains("pop")) {
				pop();
			} else {
				String a = temp.substring(5, temp.length()-1);
				int val = Integer.parseInt(a);
				push(val);
			}
		}
	}
	
	public static void push(int val) {
		list.add(val);
	}
	
	public static void pop() {
		int index = list.size() - 1;
		if (index < 0) {
			System.out.println("����ջΪ�գ�");
			return ;
		}
		
		int temp = list.get(index);
		list.remove(index);
		System.out.println(temp);
	}
	
	public static void min() {
		int index = list.size() - 1;
		if (index < 0) {
			System.out.println("����ջΪ�գ�");
			return ;
		}
		
		int min = Integer.MAX_VALUE;
		for (Integer temp : list) {
			if (temp < min) {
				min = temp;
			}
		}
		System.out.println(min);
	}
}






























