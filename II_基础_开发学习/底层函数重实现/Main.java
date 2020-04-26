import java.util.ArrayList;
import java.util.List;

/*
 *
 */

/**
 * @author 张致邦
 *
 * 2020年3月17日-上午9:34:58
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		int sum = 0;
		System.out.println(sum+list.get(0));
//		StringBuilder string = new StringBuilder();
//		dfs(5, string);
//		System.out.println(string);
	}

	/**
	 * @param i
	 */
	private static void dfs(int i, StringBuilder string) {
		// TODO Auto-generated method stub
		if (i == 0) return ;
		string.append("asdfasf");
		dfs(i-1, string);
	}

}
