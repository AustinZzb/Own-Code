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
		// ʵ���������������
		
		// ���붯̬�˵�
	}	
	
	// �ҵ���̬�˵�
	private void createMenu() {
		// '_'Ϊͨ��������ǲ�ѯidΪ�����ֶε�menu   menuId����10��1010��1011��20�ķ�ʽ����
		String sql = "select * from menu where menuId like '__'";
		List<Menu> list = new IMenuDAOimpl().queryBuSql(sql);
		
		for(Menu menu : list) {
			// ��ѯ�˵����ݿ�
			String sql2 = "select * from menu where menuId like '" + "һ���˵���menuId" +"__'";
			List<Menu> list_1 = new IMenuDAOimpl().queryBuSql(sql2);
			
			for(Menu menu1 : list_1) {
				// ��ѯ�˵����ݿ�
								
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
