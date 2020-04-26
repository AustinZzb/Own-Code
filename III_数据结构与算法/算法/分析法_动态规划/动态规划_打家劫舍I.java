/*	LeetCode
 * ����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݡ�ÿ�䷿�ڶ�����һ�����ֽ�Ӱ����͵�Ե�Ψһ��Լ���ؾ������ڵķ���װ���໥��ͨ�ķ���ϵͳ������������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������
 * ����һ������ÿ�����ݴ�Ž��ķǸ��������飬�������ڲ���������װ�õ�����£��ܹ�͵�Ե�����߽�
 * ʾ�� 1:
 * ����: [1,2,3,1]
 * ���: 4
 * ����: ͵�� 1 �ŷ��� (��� = 1) ��Ȼ��͵�� 3 �ŷ��� (��� = 3)��
 * ͵�Ե�����߽�� = 1 + 3 = 4 ��
 */
package ������_��̬�滮;

/**
 * @author ���°�
 *
 * 2020��3��19��-����11:54:08
 */
public class ��̬�滮_��ҽ���I {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * ����˼�룺
	 * Math.max(dp[i-1], dp[i-2]+nums[i])
	 */
	private static int fun(int[] nums){

		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
			
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(dp[0], nums[1]);
		
		for (int i = 2; i < nums.length; i++){
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
		
		return dp[dp.length - 1];
	    	
	}

}
