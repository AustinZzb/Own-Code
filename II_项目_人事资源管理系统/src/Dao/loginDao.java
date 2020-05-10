/*
 *	��¼��֤
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.Login;
import Util.DButil;

/**
 * 	@author ���°�
 *
 * 	2020��5��9��-����12:54:00
 */
public class loginDao {
	private DButil dButil;
	private ResultSet rs;
	
	/**
	 * @method ��¼��֤
	 * @return 0��¼�ɹ�	1�û���������	2�������
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
		
		if (flag <= 0) { // @note �û���������
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

















