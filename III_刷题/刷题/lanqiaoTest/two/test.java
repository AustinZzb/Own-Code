/*
 *	
 */
package lanqiaoTest.two;

import org.junit.jupiter.api.Test;

/**
 * 	@author 张致邦
 *
 * 	2020年4月25日-下午5:06:34
 */
public class test {

	@Test
	public void fun() {
		for (int i = 0; i < 1000; i++) {
			System.out.println((int)(Math.random()*10000)+" "+(int)(Math.random()*10000)+" "+(int)(Math.random()*10000));
		}
	}
	
}
