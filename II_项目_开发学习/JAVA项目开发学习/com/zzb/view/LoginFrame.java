package com.zzb.view;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.zzb.model.entity.MisUser;

public class LoginFrame extends JFrame implements ActionListener{
	// ����һЩ�е�˽�����ʵ��
	private MisUser misUser = null;
	
	private boolean checkUser(String account, String password) {
		
		boolean flag = false;
		//   com.zzb.model.entity.MisUser У���û����
		if(true) {
			this.misUser = misUser;
		}
		return flag;
	}
	
	private void init() {
		// ��ʼ��˽�ж���ʵ��
	}
	
	public LoginFrame() {
		this.init();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String account = "";
		String password = "";
		if(checkUser(account, password)) {
			JOptionPane.showMessageDialog(null, "��¼�ɹ�");
			MainFrame mainFrame = new MainFrame(misUser);
		}else {
			JOptionPane.showMessageDialog(null, "��¼ʧ��");
		}
	}

}
