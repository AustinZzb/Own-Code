import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 	@author 张致邦
 *
 * 	2020年5月10日-下午4:48:13
 */
public class Main_4 {
	private static final int SIZE = 200;
	private static int[] Queue;
	private static int rear;
	private static int front;
	private static List<String> list;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue = new int[SIZE];
		list = new ArrayList<>();
		rear = 0; front = 0;
		
		while (scan.hasNextInt()) {
			StringBuilder sb = new StringBuilder();
			int n = scan.nextInt();
			if (n == 0)
				break;
			
			for (int i = 0; i < n; i++) 
				enQueue(Queue, scan.nextInt());
			
			sb.append(deQueue(Queue)+"");
			while (!isEmpty())
				sb.append(" "+deQueue(Queue));
			
			list.add(sb.toString());
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		scan.close();
	}
	
	public static void enQueue(int[] Queue, int val) {
		if (rear == (front-1+SIZE)%SIZE) 
			return ;
		
		Queue[front] = val;
		front = (front-1+SIZE)%SIZE;
	}
	
	public static int deQueue(int[] Queue) {
		int val = Queue[rear];
		rear = (rear-1+SIZE)%SIZE;
		return val;
	}
	
	public static boolean isEmpty() {
		return front == rear ? true :false;
	}
}
























