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
	// 界面一些列的私有组件实例
	private MisUser misUser = null;
	
	private boolean checkUser(String account, String password) {
		
		boolean flag = false;
		//   com.zzb.model.entity.MisUser 校验用户身份
		if(true) {
			this.misUser = misUser;
		}
		return flag;
	}
	
	private void init() {
		// 初始化私有对象实例
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
			JOptionPane.showMessageDialog(null, "登录成功");
			MainFrame mainFrame = new MainFrame(misUser);
		}else {
			JOptionPane.showMessageDialog(null, "登录失败");
		}
	}

}
