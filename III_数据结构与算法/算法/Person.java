import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class Person {

	@Test
	protected void finalize() {
		// TODO Auto-generated method stub
		int[] n = { 9, 8, 0, 7, 4, 9, 8, 6, 9, 0, 8, 6, 5, 87, 69, 8, 8967, 68, 8 };

		ArrayList<Integer> list = new ArrayList<>();
		for (int i : n) {
			list.add(i);
		}
		list.forEach(x -> System.out.print(x));

	}
	
	@Test
	public void test1() {
		System.out.println("ddd" == "ddd");
	}

}
