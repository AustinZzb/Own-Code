/*
 *	登录验证
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.Login;
import Util.DButil;

/**
 * 	@author 张致邦
 *
 * 	2020年5月9日-下午12:54:00
 */
public class loginDao {
	private DButil dButil;
	private ResultSet rs;
	
	/**
	 * @method 登录验证
	 * @return 0登录成功	1用户名不存在	2密码错误
	 */
	public int loginDaoFun(Login login) {
		dButil = new DButil();
		
		String id = login.getId();
		String upwd = login.getUpwd();
		String sql_0 = "select count(1) from user where id=?";
		String sql_1 = "select count(1) from user where id=? and upwd=?";
		String sql_2 = "select admin from user where id=?";
 		Object[] params_0 = {id};
		Object[] params_1 = {id, upwd};
		
		int flag = -1;
		rs = dButil.executeQurey(sql_0, params_0);
		try {
			if (rs.next()) {
				flag = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (flag <= 0) { // @note 用户名不存在
			return 1;
		} else {
			flag = -1;
			rs = dButil.executeQurey(sql_1, params_1);
			try {
				if (rs.next()) {
					flag = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (flag > 0) {
			rs = dButil.executeQurey(sql_2, params_0);
			try {
				if (rs.next()) {
					int admin = rs.getInt(1);
					login.setAdmin(admin);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return 0;
		}
		
		return 2;
	}
	
}

















