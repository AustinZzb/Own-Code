package lanqiao;

// ·½¸ñÌîÊı
public class lanqiao16_6 {
	static int[] n = new int[] {0,0,0,0,0,0,0,0,0,0};
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dfs(0);
		System.out.println(count);

	}
	
	static void dfs(int cur) {
		
		if(cur == 10) {
			if(check()) {
				count++;
				if(count<5) {
					for(int i=0;i<n.length;i++)
						System.out.print(n[i]+" ");
					System.out.println();
				}
			}
			return ;
		}
		
		for(int i=0;i<n.length;i++) {
			if(check_1(i+1) && n[cur] == 0) {
				n[cur] = i+1;
				dfs(cur+1);
				n[cur] = 0;
			}
		}
		
	}
	
	static boolean check_1(int k) {
		for(int i=0;i<n.length;i++) {
			if(n[i] == k) return false;
		}
		return true;
	}
	
	static boolean check() {
		if(Math.abs(n[0]-n[1])==1 || Math.abs(n[0]-n[3])==1 || Math.abs(n[0]-n[4])==1 || Math.abs(n[0]-n[5])==1 ||
		   Math.abs(n[1]-n[4])==1 || Math.abs(n[1]-n[5])==1 || Math.abs(n[1]-n[2])==1 || Math.abs(n[1]-n[6])==1 ||
		   Math.abs(n[3]-n[4])==1 || Math.abs(n[4]-n[5])==1 || Math.abs(n[5]-n[2])==1 || Math.abs(n[6]-n[5])==1 ||
		   Math.abs(n[2]-n[6])==1 || Math.abs(n[7]-n[3])==1 || Math.abs(n[7]-n[4])==1 ||
		   Math.abs(n[8]-n[3])==1 || Math.abs(n[8]-n[4])==1 || Math.abs(n[8]-n[5])==1 || Math.abs(n[8]-n[9])==1 ||
		   Math.abs(n[9]-n[4])==1 || Math.abs(n[9]-n[5])==1 || Math.abs(n[9]-n[6])==1 || Math.abs(n[7]-n[8])==1
		   ) {
			return false;
		}
		
		return true;
	}

}
