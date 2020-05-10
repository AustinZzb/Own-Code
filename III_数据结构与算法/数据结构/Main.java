import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * 	@author 张致邦
 *
 * 	2020年5月10日-下午5:26:25
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String[] temp = scan.nextLine().split(" ");
			if (temp[0].equals("0") && temp[1].equals("0")) 
				break;
			
			List<String> list = fun(temp[0]);
			boolean flag = false;
			for (String string : list) {
				if (temp[1].contains(string)) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		scan.close();
	}
	
	private static List<String> fun(String s) {
		
		List<String> list = new Vector<String>();
		
		if(s.length() == 1) {
			list.add(""+s.charAt(0));
			return list;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char old = s.charAt(i);
			List<String> list2 = fun(s.substring(0,i)+s.substring(i+1));
			for (int j = 0; j < list2.size(); j++) {
				list.add("" + old + list2.get(j));
			}
		}
		
		return list;
		
	}
}
