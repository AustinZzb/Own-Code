package com.zzb.view;

import java.util.List;

import javax.swing.JFrame;

import com.zzb.model.dao.impl.IMenuDAO;
import com.zzb.model.dao.impl.IMenuDAOimpl;
import com.zzb.model.entity.Menu;
import com.zzb.model.entity.MisUser;

public class MainFrame extends JFrame{
	private MisUser misUser = null;
	
	public void init() {
		// 实例化各个组件对象
		
		// 加入动态菜单
	}	
	
	// 找到动态菜单
	private void createMenu() {
		// '_'为通配符，就是查询id为两个字段的menu   menuId利用10、1010、1011、20的方式命名
		String sql = "select * from menu where menuId like '__'";
		List<Menu> list = new IMenuDAOimpl().queryBuSql(sql);
		
		for(Menu menu : list) {
			// 查询菜单数据库
			String sql2 = "select * from menu where menuId like '" + "一级菜单的menuId" +"__'";
			List<Menu> list_1 = new IMenuDAOimpl().queryBuSql(sql2);
			
			for(Menu menu1 : list_1) {
				// 查询菜单数据库
								
			}
			
		}
	}
	
	public MainFrame() {
		  
	}
	
	public MainFrame(MisUser misUser) {
		this.misUser = misUser;
		this.init();
	}
}
