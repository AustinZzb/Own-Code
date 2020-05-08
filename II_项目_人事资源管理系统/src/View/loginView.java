/*
 *	
 */
package View;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Control.Login;

/**
 * 	@author ÕÅÖÂ°î
 *
 * 	2020Äê5ÔÂ8ÈÕ-ÏÂÎç1:43:56
 */
public class loginView {

	private JFrame frmDdd;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public loginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDdd = new JFrame();
		frmDdd.setTitle("\u4EBA\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		frmDdd.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\favicon.png"));
		frmDdd.setBackground(Color.WHITE);
		frmDdd.getContentPane().setBackground(Color.WHITE);
		frmDdd.setBounds(100, 100, 399, 236);
		frmDdd.getContentPane().setLayout(null);
		frmDdd.setLocationRelativeTo(null);
		
		// @note ÕËºÅ
		JLabel label = new JLabel("\u8D26\u53F7");
		label.setBounds(65, 59, 54, 15);
		frmDdd.getContentPane().add(label);
		
		// @note ÃÜÂë
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(65, 102, 54, 15);
		frmDdd.getContentPane().add(label_1);
		
		// @note ÕËºÅ
		textField = new JTextField();
		textField.setBounds(145, 56, 144, 21);
		frmDdd.getContentPane().add(textField);
		textField.setColumns(10);
		
		// @note ÃÜÂë
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 99, 144, 21);
		frmDdd.getContentPane().add(passwordField);
		
		// @note µÇÂ¼
		JButton button = new JButton("\u767B\u5F55");
		button.setBounds(80, 151, 93, 23);
		frmDdd.getContentPane().add(button);
		
		// @note ·µ»Ø
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.setBounds(211, 151, 93, 23);
		frmDdd.getContentPane().add(button_1);
		frmDdd.setVisible(true);
		
		// @note Ìí¼Ó¼àÌýÆ÷
		button.addActionListener(e -> login());
		button_1.addActionListener(e -> fanhui());
	}
	
	/**
	 * @method ¹Ø±Õµ±Ç°´°¿Ú
	 */
	public void close() {
		this.frmDdd.dispose();
	}
	
	/**
	 * @method ·µ»Øview_Daka½çÃæ
	 */
	private void fanhui() {
		new dakaView();
		this.close();
	}
	
	/**
	 * @method µÇÂ¼
	 */
	private void login() {
		Login login = new Login();
		login.login(textField.getText(), String.valueOf(passwordField.getPassword()));
	}
}

























