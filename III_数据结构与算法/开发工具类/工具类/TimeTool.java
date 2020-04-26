package ������;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �ο����˹�����(��ѧϰ)
 * 
 * A ��������ʱ�乤����
 * @author 11586
 *
 */

public class TimeTool {
	
	private static final SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");
	
	public interface Task {
		void execute();
	}
	
	public static void check(String title, Task task) {
		
		if (task == null) return;
		title = (title == null) ? "" :("��" + title + "��");
		System.out.println(title);
		System.out.println("��ʼ: " + fmt.format(new Date()));
		long begin = System.currentTimeMillis();
		System.out.println();
		task.execute();
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println("����: " + fmt.format(new Date()));
		double delta = (end - begin) / 1000.0;
		System.out.println("��ʱ: " + delta + "��");
		System.out.println("-----------------------------------------------");
		
	}

}
