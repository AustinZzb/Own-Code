package 工具类;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 参考别人工具类(待学习)
 * 
 * A 测量运行时间工具类
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
		title = (title == null) ? "" :("【" + title + "】");
		System.out.println(title);
		System.out.println("开始: " + fmt.format(new Date()));
		long begin = System.currentTimeMillis();
		System.out.println();
		task.execute();
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println("结束: " + fmt.format(new Date()));
		double delta = (end - begin) / 1000.0;
		System.out.println("耗时: " + delta + "秒");
		System.out.println("-----------------------------------------------");
		
	}

}
