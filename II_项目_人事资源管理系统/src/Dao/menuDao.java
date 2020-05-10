/*
 *	动态提取菜单
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Menu;
import Util.DButil;

/**
 * 	@author 张致邦
 *
 * 	2020年5月9日-下午4:25:38
 */
public class menuDao {
	private DButil dButil;
	private Menu menu;
	private ResultSet rs;
	
	public List<Menu> menuDaoFun(String sql, Object[] params) {
		List<Menu> list = new ArrayList<Menu>();
		dButil = new DButil();
		
		rs = dButil.executeQurey(sql, params);
		try {
			while (rs.next()) {
				menu = new Menu();
				menu.setMenuId(rs.getInt("menuId"));
				menu.setMenuName(rs.getString("menuName"));
				menu.setMenuMemo(rs.getString("menuMemo"));
				list.add(menu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}




















































