package 队列;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/** 
 * @author 张致邦
 *
 * 2020年2月9日-下午3:00:55
 */
public class 队列的简单实现 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		
		// 添加元素(使用add（）会产生异常，不推荐)
		queue.offer("a0");
		queue.offer("a1");
		queue.offer("a2");
		queue.offer("a3");
		queue.offer("a4");
		queue.offer("a5");
		queue.offer("a6");
		
		System.out.println("初始队列 ：                                      ");
		System.out.println(queue);
		System.out.println();
		
		// 从队列头部弹出一个元素（remove（）同样会产生异常，不推荐）
		System.out.println("弹出队列头部元素 ：poll     " + queue.poll());
		System.out.println(queue);
		System.out.println();
		
		// 查看队列头部元素
		System.out.println("查看队列头部元素 ：element  " + queue.element(                                                                                                                                                                                                                                                                                                                                                                                                                   ));
		System.out.println(queue);
		System.out.println();
		
		// 添加元素(使用add（）会产生异常，不推荐)
		System.out.println("添加队列元素                                    ");
		queue.offer("a0");
		System.out.println(queue);
		
		Queue<Integer> queue1 = new LinkedList<Integer>();
		int n = 1;
		queue1.offer(n);
		System.out.println(queue1);

	}

}
