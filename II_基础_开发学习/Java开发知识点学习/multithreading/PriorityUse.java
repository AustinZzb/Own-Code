package multithreading;

public class PriorityUse extends Thread {
	public PriorityUse(String name,int a) {
		setName(name);
		this.setPriority(a);
	}
	
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(this.getName()+" "+this.getPriority());
			try {
				this.sleep(3000);
			}catch(InterruptedException e) {
				System.err.print(e);
			}
		}
	}
	
	public static void main(String[] args) {
		PriorityUse t1 = new PriorityUse("�߳�һ",6);
		PriorityUse t2 = new PriorityUse("�̶߳�",1);
		PriorityUse t3 = new PriorityUse("�߳���",10);
		t1.start();
		t2.start();
		t3.start();
	}

}
