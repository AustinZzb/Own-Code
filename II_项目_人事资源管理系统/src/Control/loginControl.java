/*
 *	��¼
 */
package Control;

import javax.swing.JOptionPane;

import Dao.loginDao;
import Entity.Login;
import View.userView;

/**
 * 	@author ���°�
 *
 * 	2020��5��8��-����11:18:54
 */
public class loginControl {
	
	public boolean loginControlFun(Login login) {
		loginDao loginDao = new loginDao();
		
		int flag = loginDao.loginDaoFun(login);
		if (flag == 0) {
			new userView(login);
			return true;
		} else if (flag == 1) {
			JOptionPane.showMessageDialog(null, "�û��������ڣ�", "ϵͳ��ʾ", JOptionPane.WARNING_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "�������", "ϵͳ��ʾ", JOptionPane.WARNING_MESSAGE);
		}
		
		return false;
	}
	
}
