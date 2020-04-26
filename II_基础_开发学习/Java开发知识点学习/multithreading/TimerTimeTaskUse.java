package multithreading;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTimeTaskUse extends TimerTask {
	private int a;
	public TimerTimeTaskUse(int a) {
		this.a = a;
	}
	
	
	
	public static void main(String[] args) {
		Timer t = new Timer();
		TimerTimeTaskUse t1 = new TimerTimeTaskUse(2);
		t.schedule(t1,1000);
	}

	public void run() {
		int i = a;
		while(i<200) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.print("½áÊøÏß³Ì");
	}

}

