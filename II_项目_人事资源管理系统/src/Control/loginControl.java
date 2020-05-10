/*
 *	登录
 */
package Control;

import Util.DButil;

/**
 * 	@author 张致邦
 *
 * 	2020年5月8日-上午11:18:54
 */
public class LoginControl {
	private DButil dButil;
	
	public void login(String id, String upwd) {
		dButil = new DButil();
		
		String sql = "select count(1) from user where id = ? and upwd = ?";
	}
}
