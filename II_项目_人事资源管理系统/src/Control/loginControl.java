/*
 *	登录
 */
package Control;

import javax.swing.JOptionPane;

import Dao.loginDao;
import Entity.Login;
import View.userView;

/**
 * 	@author 张致邦
 *
 * 	2020年5月8日-上午11:18:54
 */
public class loginControl {
	
	public boolean loginControlFun(Login login) {
		loginDao loginDao = new loginDao();
		
		int flag = loginDao.loginDaoFun(login);
		if (flag == 0) {
			new userView(login);
			return true;
		} else if (flag == 1) {
			JOptionPane.showMessageDialog(null, "用户名不存在！", "系统提示", JOptionPane.WARNING_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "密码错误！", "系统提示", JOptionPane.WARNING_MESSAGE);
		}
		
		return false;
	}
	
}
