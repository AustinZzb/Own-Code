/*
 *	Java8新特性Lambda -> 接口的实例
 *
 *	使用Lambda实现四种经典的函数行结构接口。
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
 * 	@author 张致邦
 *
 * 	2020年3月27日-下午3:51:47
 */
public class Function {
	
	@Test
	public void test_1() {
		Consumer<Integer> con = money -> System.out.println("花了"+money);
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






































