/*
 *	��¼
 */
package Control;

import Util.DButil;

/**
 * 	@author ���°�
 *
 * 	2020��5��8��-����11:18:54
 */
public class LoginControl {
	private DButil dButil;
	
	public void login(String id, String upwd) {
		dButil = new DButil();
		
		String sql = "select count(1) from user where id = ? and upwd = ?";
	}
}
