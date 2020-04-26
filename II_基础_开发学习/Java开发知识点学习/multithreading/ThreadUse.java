package multithreading;
//通过继承Thread类实现多线程
public class ThreadUse extends Thread{
	private int a;        // 线程序号
	public ThreadUse(String name,int a) {
		super(name);
		this.a = a;
	}
	
	public ThreadUse(String name) {
		this(name,0);
	}
	 
	public void run() {  // 重写Thread中的run方法及线程的内容
		int i = a;
		System.out.print("\n"+this.getName()+":");
		while(i<200) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.print(this.getName()+"结束！");
	}
	
	public static void main(String[] args) {
		ThreadUse t1 = new ThreadUse("奇线程",1);
		ThreadUse t2 = new ThreadUse("偶线程",2);
		t1.start();
		t2.start();
		t2.setPriority(10);
	}

}
