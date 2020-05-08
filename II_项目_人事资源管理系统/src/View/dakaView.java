/*
 *	系统打卡界面
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Control.Daka;

/**
 * 	@author 张致邦
 *
 * 	2020年5月8日-上午11:05:36
 */
public class dakaView {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public dakaView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("楷体", Font.PLAIN, 83));
		frame.setBackground(Color.WHITE);
		frame.setTitle("\u4EBA\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\favicon.png"));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 404, 201);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblName = new JLabel("ID:");
		lblName.setFont(new Font("楷体", Font.BOLD, 16));
		lblName.setBounds(132, 63, 54, 23);
		frame.getContentPane().add(lblName);
		
		// @note 登录
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setFont(new Font("楷体", Font.BOLD, 16));
		btnNewButton.setBounds(0, 0, 77, 23);
		frame.getContentPane().add(btnNewButton);
		
		// @note 打卡
		JButton button = new JButton("\u6253\u5361");
		button.setFont(new Font("楷体", Font.BOLD, 16));
		button.setBounds(147, 113, 93, 23);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(174, 65, 66, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// @note 添加监听器
		btnNewButton.addActionListener(e -> login());
		button.addActionListener(e -> daka());
	}
	
	/**
	 * @method 关闭当前窗口
	 */
	public void close() {
		this.frame.dispose();
	}
	
	/**
	 * @method 登录按钮监听器
	 */
	private void login() {
		new loginView();
		this.close();
	}
	
	/**
	 * @method	打卡按钮监听器
	 */
	private void daka() {
		Daka daka = new Daka();
		daka.daka();
		this.close();
	}
}




























