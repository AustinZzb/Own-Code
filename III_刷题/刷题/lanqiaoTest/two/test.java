/*
 *	
 */
package lanqiaoTest.two;

import org.junit.jupiter.api.Test;

/**
 * 	@author ���°�
 *
 * 	2020��4��25��-����5:06:34
 */
public class test {

	@Test
	public void fun() {
		for (int i = 0; i < 1000; i++) {
			System.out.println((int)(Math.random()*10000)+" "+(int)(Math.random()*10000)+" "+(int)(Math.random()*10000));
		}
	}
	
}
