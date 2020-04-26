package multithreading;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class sleepUse {
	
	public sleepUse(){
		JFrame jf = new JFrame();
	    Container c1 = jf.getContentPane();
	    c1.setLayout(new BorderLayout());
	    
	    JLabel clock = new JLabel();
	    c1.add(clock);
	    jf.setVisible(true);
	    jf.setBounds(0, 0, 200,200);
	    
	    MyThread t = new MyThread(clock);
	    t.start();
	}
	
	class MyThread extends Thread{
		private JLabel clock;
		
		public MyThread(JLabel clock) {
			this.clock = clock;
		}
		
		public void run() {
			clock.setText(sleepUse.this.getTime());
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public String getTime() {
		
		String time;
		Calendar c1 = new GregorianCalendar();
		time = c1.get(Calendar.YEAR)+"-"+(c1.get(Calendar.MONTH)+1)+"-"+c1.get(Calendar.DATE);
		int h = c1.get(Calendar.HOUR);
		int m = c1.get(Calendar.MINUTE);
		if(m<10)
			time+=" "+h+":0"+m;
		else
			time+=" "+h+":"+m;
		int s = c1.get(Calendar.SECOND);
		if(s<10)
			time+=":0"+s;
		else
			time+=":"+s;
		return time;
		
	}
	
	public static void main(String[] args) {
		new sleepUse();
	}

}




















