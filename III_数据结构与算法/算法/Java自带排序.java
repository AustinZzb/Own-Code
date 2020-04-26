import java.util.ArrayList;
import java.util.Arrays;

public class Java×Ô´øÅÅÐò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {2,5,1,8,8,9,1,2,5,4,2,6,5,8,4,5};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(i+(int)(Math.random()*99));
		}
		java.util.Collections.sort(list);
		System.out.println(list);
		java.util.Collections.reverse(list);
		System.out.println(list);
	}

}
