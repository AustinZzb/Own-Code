/*
 *	Java8������Lambda -> �ӿڵ�ʵ��
 *
 *	ʹ��Lambdaʵ�����־���ĺ����нṹ�ӿڡ�
 */
package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

/**
 * 	@author ���°�
 *
 * 	2020��3��27��-����3:51:47
 */
public class Function {
	
	@Test
	public void test_1() {
		Consumer<Integer> con = money -> System.out.println("����"+money);
		spend(200, con);
	}
	
	private void spend(int money, Consumer<Integer> con) {
		con.accept(money);
	}
	
	@Test
	public void test_2() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		
		List<Integer> temp = decide(list, x -> x%2==0);
		System.out.println(temp);
	}
	
	private List<Integer> decide(List<Integer> list, Predicate<Integer> predicate) {
		List<Integer> temp = new ArrayList<Integer>();
		
		for (Integer integer : list) {
			if (predicate.test(integer))
				temp.add(integer);
		}
		
		return temp;
	}
	
}






































