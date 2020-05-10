package lanqiao;

// 生日蜡烛
public class lanqiao16_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 236;
		int i = 0;
		
		for(int j = 0;j<n;j++) {
			int sum = 0;
			for(i =j+1;i<=n;i++) {
				sum += i;
				if(sum >= n) {
					break;
				}
			}
			
			if(sum == n) {
				System.out.println(j+1);
				break;
			}
			
		}

	}

}
