package others;

/**
 * 有一种赌局是这样的：桌子上放六个匣子，编号是1至6。
 * 多位参与者（以下称玩家）可以把任意数量的钱押在某个编号的匣子上。
 * 所有玩家都下注后，庄家同时掷出3个骰子（骰子上的数字都是1至6）。
 * 
 * 输赢规则如下：
 * 1.若只有1个骰子上的数字与玩家所押注的匣子号相同，则玩家拿回自己的押注，庄家按他押注的数目赔付（即1比1的赔率）。
 * 2.若2个骰子上的数字与玩家所押注的匣子号相同，则玩家拿回自己的押注，庄家按他押注的数目的2倍赔付（即1比2的赔率）。
 * 3.若3个骰子上的数字都与玩家押注的匣子号相同，则玩家拿回自己的押注，庄家按他押注的数目的10倍赔付（即1比10的赔率）。
 *  
 *   模拟50万次，假定只有1个玩家，他每次的押注都是1元钱，其押注的匣子号是随机的。最后计算出庄家的盈率（庄家盈利金额/押注总金额）。
 * 
 * @author 张致邦
 *
 * 2020年2月6日-上午10:21:12
 */
public class _古代赌局问题 {
	private static final int SUM = 500 * 1000 ;
	
	private static int game() {
		
		int a = (int) (Math.random()*6 + 1);
		int b = (int) (Math.random()*6 + 1);
		int c = (int) (Math.random()*6 + 1);
		
		int t = (int) (Math.random()*6 + 1);
		
		int n = 0;
		if(a == t) n++;
		if(b == t) n++;
		if(c == t) n++;
		
		if(n == 0) return 1;
		if(n == 1) return -1;
		if(n == 2) return -2;
		return -10;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < SUM; i++) {
			sum += game();
		}
		
		System.out.println(sum / SUM);
		
	}

}









