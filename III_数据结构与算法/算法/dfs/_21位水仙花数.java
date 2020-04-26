package dfs;

import java.math.BigInteger;
import java.util.Arrays;

public class _21λˮ�ɻ��� {
	private static BigInteger[] bn = new BigInteger[10];  //��������21�η�
	
	static void test(int[] a) {
		
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < bn.length; i++) {
			sum = sum.add(bn[i].multiply(BigInteger.valueOf(a[i])));
		}
		
		String string = sum.toString();
		
		if (string.length() != 21) return ;
		
		int[] b = new int[10];
		for (int i = 0; i < string.length(); i++) {
			b[string.charAt(i) - '0']++;
		}
		
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				return ;
			}
		}
		
		System.out.println(sum);
		
	}
	
	static void basic_21(int[] a, int k, int sum) {
		
		if (sum == 0) {
			test(a);
			return ;
		}
		
		if (k == a.length-1) {
			a[k] = sum;
			test(a);
			return ;
		}
		
		for (int i = 0; i <= sum; i++) {
			a[k] = i; 
			basic_21(a, k+1, sum-i);
			a[k] = 0;
		}
		
	}
	
	static void pow_21() {
		
		for (int i = 0; i < bn.length; i++) {
			BigInteger bn_0 = BigInteger.ONE;
			for (int j = 0; j < 21; j++) {
				bn_0 = bn_0.multiply(BigInteger.valueOf(i));
			}
			bn[i] = bn_0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10]; //ÿ�����ֳ��ֵĴ���
		pow_21();
		basic_21(a, 0, 21);

	}

}
