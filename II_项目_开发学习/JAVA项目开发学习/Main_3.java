import java.util.Scanner;

/**
 * 	@author 张致邦
 *
 * 	2020年5月10日-下午4:48:13
 */
public class Main_3 {
	private static final int SIZE = 200;
	private static int[] Queue;
	private static int rear;
	private static int front;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue = new int[SIZE];
		rear = 0; front = 0;
		
		String[] nString = scan.nextLine().split(" ");
		for (int i = 0; i < nString.length; i++) {
			int n = Integer.parseInt(nString[i]);
			if (n == 0)
				break;
			
			if (i != 0)
				System.out.println();
			
			for (int j = 1; j <= n; j++) {
				int m = Integer.parseInt(nString[i+j]);
				enQueue(Queue, m);
			}
			
			System.out.print(deQueue(Queue));
			while (!isEmpty())
				System.out.print(" "+deQueue(Queue));
			
			i += n;
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
























