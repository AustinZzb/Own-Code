/*
 *	普通用户权限界面
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;

import Control.test;
import Dao.menuDao;
import Entity.Login;
import Entity.Menu;

/**
 * 	@author 张致邦
 *
 * 	2020年5月9日-下午1:14:27
 */
@SuppressWarnings("serial")
public class userView extends JFrame{

	private JMenuBar menuBar;
	private menuDao menuDao;
//	private Menu menu;

	/**
	 * Create the application.
	 */
	public userView(Login login) {
		initialize(login);
	}
	
	/**
	 * @method 动态的挂菜单
	 */
	private void creatMenu() {
		List<Menu> list = new ArrayList<Menu>();
		menuDao = new menuDao();
		
		String sql1 = "select * from menu where menuId like ?";
		Object[] params1 = {"__"};
		list = menuDao.menuDaoFun(sql1, params1);
		
		for (Menu tempMenu : list) {
			JMenu jMenu = new JMenu();
			jMenu.setText(tempMenu.getMenuName());
			jMenu.setToolTipText(tempMenu.getMenuMemo());
			jMenu.setActionCommand(tempMenu.getMenuId()+"");
			menuBar.add(jMenu);
		}
	}

	/**
	 * Initialize the contents of the this.
	 */
	private void initialize(Login login) {
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("\u4EBA\u4E8B\u8D44\u6E90\u7BA1\u7406\u7CFB\u7EDF");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\favicon.png"));
		this.setBounds(100, 100, 633, 421);
		this.getContentPane().setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 617, 23);
		this.getContentPane().add(menuBar);
		
		// @note 动态挂菜单
		creatMenu();
		
		JLabel lblNewLabel = new JLabel("\u5458\u5DE5\u76F8\u7247");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 75, 106, 137);
		this.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u5DE5\u53F7");
		label.setFont(new Font("楷体", Font.BOLD, 16));
		label.setBounds(164, 75, 54, 15);
		this.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u5DE5\u53F7");
		label_1.setFont(new Font("楷体", Font.BOLD, 16));
		label_1.setBounds(368, 76, 54, 15);
		this.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u5DE5\u53F7");
		label_2.setFont(new Font("楷体", Font.BOLD, 16));
		label_2.setBounds(164, 133, 54, 15);
		this.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u5DE5\u53F7");
		label_3.setFont(new Font("楷体", Font.BOLD, 16));
		label_3.setBounds(368, 134, 54, 15);
		this.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u5DE5\u53F7");
		label_4.setFont(new Font("楷体", Font.BOLD, 16));
		label_4.setBounds(164, 185, 54, 15);
		this.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\u5DE5\u53F7");
		label_5.setFont(new Font("楷体", Font.BOLD, 16));
		label_5.setBounds(368, 186, 54, 15);
		this.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u5DE5\u53F7");
		label_6.setFont(new Font("楷体", Font.BOLD, 16));
		label_6.setBounds(164, 237, 54, 15);
		this.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\u5DE5\u53F7");
		label_7.setFont(new Font("楷体", Font.BOLD, 16));
		label_7.setBounds(368, 238, 54, 15);
		this.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("\u5DE5\u53F7");
		label_8.setFont(new Font("楷体", Font.BOLD, 16));
		label_8.setBounds(164, 282, 54, 15);
		this.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("\u5DE5\u53F7");
		label_9.setFont(new Font("楷体", Font.BOLD, 16));
		label_9.setBounds(368, 283, 54, 15);
		this.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("\u5DE5\u53F7");
		label_10.setFont(new Font("楷体", Font.BOLD, 16));
		label_10.setBounds(164, 333, 54, 15);
		this.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("\u5DE5\u53F7");
		label_11.setFont(new Font("楷体", Font.BOLD, 16));
		label_11.setBounds(368, 334, 54, 15);
		this.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("\u7528\u6237");
		label_12.setFont(new Font("楷体", Font.BOLD, 16));
		label_12.setBounds(190, 33, 54, 15);
		this.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setFont(new Font("楷体", Font.BOLD, 16));
		label_13.setBounds(245, 33, 54, 15);
		this.getContentPane().add(label_13);
		
		JButton button = new JButton("\u9000\u51FA");
		button.setBounds(317, 30, 93, 23);
		this.getContentPane().add(button);
		
		test test = new test();
		test.fun(this);
		
		JButton button_1 = new JButton("\u6CE8\u9500");
		button_1.setBounds(420, 30, 93, 23);
		this.getContentPane().add(button_1);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}




























