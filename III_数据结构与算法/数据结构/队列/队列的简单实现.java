package ����;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/** 
 * @author ���°�
 *
 * 2020��2��9��-����3:00:55
 */
public class ���еļ�ʵ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		
		// ���Ԫ��(ʹ��add����������쳣�����Ƽ�)
		queue.offer("a0");
		queue.offer("a1");
		queue.offer("a2");
		queue.offer("a3");
		queue.offer("a4");
		queue.offer("a5");
		queue.offer("a6");
		
		System.out.println("��ʼ���� ��                                      ");
		System.out.println(queue);
		System.out.println();
		
		// �Ӷ���ͷ������һ��Ԫ�أ�remove����ͬ��������쳣�����Ƽ���
		System.out.println("��������ͷ��Ԫ�� ��poll     " + queue.poll());
		System.out.println(queue);
		System.out.println();
		
		// �鿴����ͷ��Ԫ��
		System.out.println("�鿴����ͷ��Ԫ�� ��element  " + queue.element(                                                                                                                                                                                                                                                                                                                                                                                                                   ));
		System.out.println(queue);
		System.out.println();
		
		// ���Ԫ��(ʹ��add����������쳣�����Ƽ�)
		System.out.println("��Ӷ���Ԫ��                                    ");
		queue.offer("a0");
		System.out.println(queue);
		
		Queue<Integer> queue1 = new LinkedList<Integer>();
		int n = 1;
		queue1.offer(n);
		System.out.println(queue1);

	}

}
