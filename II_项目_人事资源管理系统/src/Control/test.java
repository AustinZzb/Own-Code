package Control;
import java.awt.Component;

import javax.swing.JPanel;

import View.userView;

/*
 *	
 */

/**
 * 	@author ���°�
 *
 * 	2020��5��10��-����11:16:07
 */
public class test {
	private userView userView;
	
	public void fun(userView userView) {
		this.userView = userView;
		JPanel temp = (JPanel)this.userView.getContentPane();
		Component[] Components =  temp.getComponents();
		
		for (Component component : Components) {
			System.out.println(component);
		}
	}
}
