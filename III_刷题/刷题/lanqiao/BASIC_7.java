package lanqiao;

public class BASIC_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i < 1000; i++) {
			
			char[] c = (i+"").toCharArray();
			if(Math.pow(Integer.parseInt(c[0]+""), 3)+Math.pow(Integer.parseInt(c[1]+""), 3)+Math.pow(Integer.parseInt(c[2]+""), 3) == i) {
				System.out.println(i);
			}
			
		}
		
	}

}
