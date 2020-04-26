package lanqiao;

// ¥’À„ Ω
public class lanqiao16_3 {
	private static int count = 0;
	private static int[] n = new int[] {0,0,0,0,0,0,0,0,0};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs(0);
		System.out.println(count);
		
	}
	
	static void dfs(int cur) {
		
		if(cur==9) {
			if(check()) {
				count ++;
			}
			return;
		}
		
		if(n[cur]!=0) {
			dfs(cur+1);
		}else {
			for(int i=0;i<n.length;i++) {
				if(check_1(i+1) && n[cur]==0) {
					n[cur] = i+1;
					dfs(cur+1);
					n[cur] = 0;
				}
				
			}
		}
	}
	
	static boolean check_1(int n_1) {
		for(int i=0;i<n.length;i++) {
			if(n_1 == n[i]) return false;
		}
		return true;
	}
	
	static boolean check() {
		double a = n[1]*1.00 / n[2];
		double b = (n[3]*100+n[4]*10+n[5])*1.00 / (n[6]*100+n[7]*10+n[8]);
		if((n[0]*1.00 + a + b) == 10.00) {
			return true;
		}
		
		return false;
	}

}
