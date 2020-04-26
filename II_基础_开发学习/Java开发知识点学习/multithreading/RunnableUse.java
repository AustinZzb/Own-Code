package multithreading;

public class RunnableUse implements Runnable{
	private int a;
	public RunnableUse(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		RunnableUse r1 = new RunnableUse(1);
		Thread t1 = new Thread(r1);
		t1.start();
		RunnableUse r2 = new RunnableUse(2);
		Thread t2 = new Thread(r2);
		t2.start();
	}
	
	public void run() {
		int i = a;
		System.out.println();
		while(i<200) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println("½áÊø£¡");
	}

}
