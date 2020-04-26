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
		PriorityUse t1 = new PriorityUse("线程一",6);
		PriorityUse t2 = new PriorityUse("线程二",1);
		PriorityUse t3 = new PriorityUse("线程三",10);
		t1.start();
		t2.start();
		t3.start();
	}

}
