package multithreading;
//ͨ���̳�Thread��ʵ�ֶ��߳�
public class ThreadUse extends Thread{
	private int a;        // �߳����
	public ThreadUse(String name,int a) {
		super(name);
		this.a = a;
	}
	
	public ThreadUse(String name) {
		this(name,0);
	}
	 
	public void run() {  // ��дThread�е�run�������̵߳�����
		int i = a;
		System.out.print("\n"+this.getName()+":");
		while(i<200) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.print(this.getName()+"������");
	}
	
	public static void main(String[] args) {
		ThreadUse t1 = new ThreadUse("���߳�",1);
		ThreadUse t2 = new ThreadUse("ż�߳�",2);
		t1.start();
		t2.start();
		t2.setPriority(10);
	}

}
