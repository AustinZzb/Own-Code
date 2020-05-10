package lanqiaoTest.one;
import java.util.Scanner;

/*
 *
 */

/**
 * @author 张致邦
 *
 * 2020年3月14日-下午2:37:35
 */
public class _7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = scan.next(), count = "aeiou";
		boolean befor = false;
		int ans = 0;
		
		//lanqiao
		for (int i = 0; i < string.length(); i++) {
			String now = string.charAt(i)+"";
			if (count.contains(string.charAt(0)+"")) 
				break;
			
			if (count.contains(now)) {
				if (!befor)
					ans++;
				befor = true;
			}else
				befor = false;
	
		}
		
		if (ans == 2)
			System.out.println("yes");
		else 
			System.out.println("no");
		
	}

}
