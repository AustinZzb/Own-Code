package com.zzb.control.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.zzb.model.entity.MisUser;
import com.zzb.view.MainFrame;

public class MenuListener implements ActionListener{
	private MainFrame mainFrame = null;
	private MisUser misUser = null;        // Ȩ��
	
	private JPanel panelBody = null;
	
	public MenuListener() {
		// TODO Auto-generated constructor stub
	}
	
	public MenuListener(MainFrame mainFrame, MisUser misUser) {
		// TODO Auto-generated constructor stub
		this.mainFrame = mainFrame;
		this.misUser = misUser;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.panelBody = (JPanel)this.mainFrame.getContentPane();  // ��ȡmainFrame���������
		// Component[] components = this.panelBody.getComponents();  // ��ȡ�������
	
		// Ϊ��̬�˵�ʵ�ּ���
	}

}
