package zhujiemian;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import kefu.ServerClient_1;
import jiazaitiao.jiazaitiao;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.BorderLayout;

public class zhujiemian_1 extends Thread{

	public zhujiemian_1() {
		JFrame frame = new JFrame();
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setBackground(Color.BLACK);
		// @note 修改窗口图标
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("img/验证码背景.jpg"));
		frame.setBounds(100, 100, 1260, 776);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.PINK);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 65, 164, 672);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u6613\u4E66\u4E66\u9986");
		label.setForeground(Color.GRAY);
		label.setFont(new Font("宋体", Font.PLAIN, 12));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 7, 61, 33);
		panel.add(label);		
				
		JLabel label_1 = new JLabel("\u6613\u4E66\u7BA1\u7406");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("宋体", Font.PLAIN, 12));
		label_1.setBounds(0, 180, 61, 33);
		panel.add(label_1);
		
		JButton button_1 = new JButton("\u53D1\u73B0\u4E66\u7C4D");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("楷体", Font.BOLD, 16));
		button_1.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
		button_1.setBounds(0, 35, 164, 33);
		panel.add(button_1);
		button_1.setOpaque(false);  //设置控件是否透明
		button_1.setBorderPainted(false);
		
		JButton button_2 = new JButton("\u79C1\u4EBA\u4E66\u9986");
		button_2.setForeground(Color.GRAY);
		button_2.setFont(new Font("楷体", Font.PLAIN, 16));
		button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_2.setOpaque(false);
		button_2.setBorderPainted(false);
		button_2.setBounds(0, 68, 164, 34);
		panel.add(button_2);
		
		JButton button_3 = new JButton("\u9500\u552E\u7BA1\u7406");
		button_3.setForeground(Color.GRAY);
		button_3.setFont(new Font("楷体", Font.PLAIN, 16));
		button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_3.setOpaque(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(0, 252, 164, 33);
		panel.add(button_3);
		
		JButton button_4 = new JButton("\u91C7\u8D2D\u7BA1\u7406");
		button_4.setForeground(Color.GRAY);
		button_4.setFont(new Font("楷体", Font.PLAIN, 16));
		button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_4.setOpaque(false);
		button_4.setBorderPainted(false);
		button_4.setBounds(0, 223, 164, 33);
		panel.add(button_4);
		
		JButton button_5 = new JButton("\u5343\u9875\u85CF\u4E66");
		button_5.setForeground(Color.GRAY);
		button_5.setFont(new Font("楷体", Font.PLAIN, 16));
		button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_5.setOpaque(false);
		button_5.setBounds(0, 101, 164, 33);
		panel.add(button_5);
		
		JButton button_6 = new JButton("\u4EBA\u5458\u7BA1\u7406");
		button_6.setForeground(Color.GRAY);
		button_6.setFont(new Font("楷体", Font.PLAIN, 16));
		button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_6.setOpaque(false);
		button_6.setBorderPainted(false);
		button_6.setBounds(0, 319, 164, 33);
		panel.add(button_6);
		
		JButton button_7 = new JButton("\u5E93\u5B58\u7BA1\u7406");
		button_7.setForeground(Color.GRAY);
		button_7.setFont(new Font("楷体", Font.PLAIN, 16));
		button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_7.setOpaque(false);
		button_7.setBorderPainted(false);
		button_7.setBounds(0, 286, 164, 33);
		panel.add(button_7);
		
		JButton button_8 = new JButton("\u62A5\u8B66\u7BA1\u7406");
		button_8.setForeground(Color.GRAY);
		button_8.setFont(new Font("楷体", Font.PLAIN, 16));
		button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_8.setOpaque(false);
		button_8.setBorderPainted(false);
		button_8.setBounds(0, 386, 164, 33);
		panel.add(button_8);
		
		JButton button_9 = new JButton("\u8D26\u6B3E\u7BA1\u7406");
		button_9.setForeground(Color.GRAY);
		button_9.setFont(new Font("楷体", Font.PLAIN, 16));
		button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_9.setOpaque(false);
		button_9.setBorderPainted(false);
		button_9.setBounds(0, 353, 164, 33);
		panel.add(button_9);
		
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置 
		button_2.setHorizontalTextPosition(SwingConstants.CENTER);  
		button_3.setHorizontalTextPosition(SwingConstants.CENTER);  
		button_4.setHorizontalTextPosition(SwingConstants.CENTER);  
		button_5.setHorizontalTextPosition(SwingConstants.CENTER);
		button_6.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置 
		button_7.setHorizontalTextPosition(SwingConstants.CENTER);  
		button_8.setHorizontalTextPosition(SwingConstants.CENTER);  
		button_9.setHorizontalTextPosition(SwingConstants.CENTER);  
		
		button_1.setBorderPainted(false);//设置是否绘制边框 
		button_2.setBorderPainted(false);//设置是否绘制边框 
		button_3.setBorderPainted(false);
		button_4.setBorderPainted(false);
		button_5.setBorderPainted(false);
		button_6.setBorderPainted(false);
		button_7.setBorderPainted(false);
		button_8.setBorderPainted(false);
		button_9.setBorderPainted(false);
		
		JButton button_24 = new JButton("\u8054\u7CFB\u5BA2\u670D");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new ServerClient_1("游客");
				
			}
		});
		button_24.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_24.setOpaque(false);
		button_24.setHorizontalTextPosition(SwingConstants.CENTER);
		button_24.setForeground(Color.GRAY);
		button_24.setFont(new Font("楷体", Font.PLAIN, 16));
		button_24.setBorderPainted(false);
		button_24.setBounds(0, 135, 164, 33);
		panel.add(button_24);
		
		
		
		//主界面
		JPanel panel_0 = new JPanel();
		panel_0.setBounds(164, 65, 1080, 671);
		frame.getContentPane().add(panel_0);
		panel_0.setBackground(Color.WHITE);
		panel_0.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(0, 0, 1080, 35);
		panel_0.add(panel_11);
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(10, -85200, 1060, 616);
		panel_0.add(panel_13);
		
		JLabel label_6 = new JLabel("\u6700  \u65B0  \u4E66  \u7C4D");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("楷体", Font.BOLD, 44));
		panel_13.add(label_6);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(10, -85200, 1060, 616);
		panel_0.add(panel_14);
		
		JLabel label_5 = new JLabel("\u4F5C  \u8005");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("楷体", Font.BOLD, 44));
		panel_14.add(label_5);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(10, -95100, 1060, 616);
		panel_0.add(panel_15);
		
		JLabel label_3 = new JLabel("\u70ED  \u9500  \u699C  \u5355");
		panel_15.add(label_3);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("楷体", Font.BOLD, 44));
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(0, -85200, 1060, 616);
		panel_0.add(panel_16);
		panel_16.setBackground(Color.WHITE);
		
		JLabel label_4 = new JLabel("\u4E66  \u5355");
		panel_16.add(label_4);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("楷体", Font.BOLD, 44));
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(10, 45, 1060, 616);
		panel_0.add(panel_17);
		panel_17.setLayout(null);
		
		JPanel panel_16_1 = new JPanel();
		panel_16_1.setBackground(Color.WHITE);
		panel_16_1.setBounds(10, 10, 1050, 202);
		panel_17.add(panel_16_1);
		panel_16_1.setLayout(null);
		
		String[] s = {"img/书籍图片7.png","img/书籍图片6.png","img/书籍图片9.png","img/书籍图片10.png","img/书籍图片8.png"};
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(s[2]));
		label_11.setBounds(360, 12, 299, 164);
		panel_16_1.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(s[1]));
		label_12.setBounds(198, 25, 299, 151);
		panel_16_1.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(s[3]));
		label_13.setBounds(545, 25, 299, 151);
		panel_16_1.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(s[0]));
		label_14.setBounds(51, 33, 299, 143);
		panel_16_1.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(s[4]));
		label_15.setBounds(702, 33, 299, 143);
		panel_16_1.add(label_15);
		

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(414, 186, 28, 3);
		panel_16_1.add(btnNewButton_1);
		
		
		
		JButton button_20 = new JButton("");
		button_20.setBackground(Color.LIGHT_GRAY);
		button_20.setBounds(456, 186, 28, 3);
		panel_16_1.add(button_20);
		
		
		JButton button_21 = new JButton("");
		button_21.setBackground(Color.BLACK);
		button_21.setBounds(494, 186, 28, 3);
		panel_16_1.add(button_21);
		
		
		JButton button_22 = new JButton("");
		button_22.setBackground(Color.LIGHT_GRAY);
		button_22.setBounds(532, 186, 28, 3);
		panel_16_1.add(button_22);
		
		
		JButton button_23 = new JButton("");
		button_23.setBackground(Color.LIGHT_GRAY);
		button_23.setBounds(570, 186, 28, 3);
		panel_16_1.add(button_23);
		
		
		//个性推荐--小说
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setBackground(Color.BLACK);
				button_20.setBackground(Color.LIGHT_GRAY);
				button_21.setBackground(Color.LIGHT_GRAY);
				button_22.setBackground(Color.LIGHT_GRAY);
				button_23.setBackground(Color.LIGHT_GRAY);
				label_11.setIcon(new ImageIcon(s[0]));
				label_13.setIcon(new ImageIcon(s[1]));
				label_15.setIcon(new ImageIcon(s[2]));
				label_14.setIcon(new ImageIcon(s[3]));
				label_12.setIcon(new ImageIcon(s[4]));
			}
		});
		
		//个性推荐--杂货店
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_20.setBackground(Color.BLACK);
				btnNewButton_1.setBackground(Color.LIGHT_GRAY);
				button_21.setBackground(Color.LIGHT_GRAY);
				button_22.setBackground(Color.LIGHT_GRAY);
				button_23.setBackground(Color.LIGHT_GRAY);
				label_11.setIcon(new ImageIcon(s[1]));
				label_13.setIcon(new ImageIcon(s[2]));
				label_15.setIcon(new ImageIcon(s[3]));
				label_14.setIcon(new ImageIcon(s[4]));
				label_12.setIcon(new ImageIcon(s[0]));
			}
		});
		
		//个性推荐--活着
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_21.setBackground(Color.BLACK);
				btnNewButton_1.setBackground(Color.LIGHT_GRAY);
				button_20.setBackground(Color.LIGHT_GRAY);
				button_22.setBackground(Color.LIGHT_GRAY);
				button_23.setBackground(Color.LIGHT_GRAY);
				label_11.setIcon(new ImageIcon(s[2]));
				label_13.setIcon(new ImageIcon(s[3]));
				label_15.setIcon(new ImageIcon(s[4]));
				label_14.setIcon(new ImageIcon(s[0]));
				label_12.setIcon(new ImageIcon(s[1]));
			}
		});
		
		//个性推荐--瓦尔登湖
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_22.setBackground(Color.BLACK);
				btnNewButton_1.setBackground(Color.LIGHT_GRAY);
				button_20.setBackground(Color.LIGHT_GRAY);
				button_21.setBackground(Color.LIGHT_GRAY);
				button_23.setBackground(Color.LIGHT_GRAY);
				label_11.setIcon(new ImageIcon(s[3]));
				label_13.setIcon(new ImageIcon(s[4]));
				label_15.setIcon(new ImageIcon(s[0]));
				label_14.setIcon(new ImageIcon(s[1]));
				label_12.setIcon(new ImageIcon(s[2]));
			}
		});
		
		//个性推荐--优秀
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_23.setBackground(Color.BLACK);
				btnNewButton_1.setBackground(Color.LIGHT_GRAY);
				button_20.setBackground(Color.LIGHT_GRAY);
				button_21.setBackground(Color.LIGHT_GRAY);
				button_22.setBackground(Color.LIGHT_GRAY);
				label_11.setIcon(new ImageIcon(s[4]));
				label_13.setIcon(new ImageIcon(s[0]));
				label_15.setIcon(new ImageIcon(s[1]));
				label_14.setIcon(new ImageIcon(s[2]));
				label_12.setIcon(new ImageIcon(s[3]));
			}
		});
		
		
		JLabel label_7 = new JLabel("\u63A8\u8350\u4E66\u7C4D");
		label_7.setBounds(10, 222, 87, 30);
		panel_17.add(label_7);
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setFont(new Font("楷体", Font.BOLD, 18));
				
		JLabel lblNewLabel_3 = new JLabel("\u7EFF\u76AE\u4E66");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("楷体", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(79, 558, 108, 30);
		panel_17.add(lblNewLabel_3);
		
		JLabel label_8 = new JLabel("\u74E6\u5C14\u767B\u6E56");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.DARK_GRAY);
		label_8.setFont(new Font("楷体", Font.BOLD, 20));
		label_8.setBounds(348, 558, 108, 30);
		panel_17.add(label_8);
		
		JLabel label_9 = new JLabel("\u6D3B\u7740");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.DARK_GRAY);
		label_9.setFont(new Font("楷体", Font.BOLD, 20));
		label_9.setBounds(622, 558, 108, 30);
		panel_17.add(label_9);
		
		JLabel label_10 = new JLabel("\u7F57\u9A6C\u4EBA");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.DARK_GRAY);
		label_10.setFont(new Font("楷体", Font.BOLD, 20));
		label_10.setBounds(883, 558, 108, 30);
		panel_17.add(label_10);
		
				
		
		//书单
		JButton button_16 = new JButton("\u4E66\u5355\r\n");
		button_16.setForeground(Color.GRAY);
		button_16.setFont(new Font("楷体", Font.PLAIN, 16));
		button_16.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_16.setBounds(327, 0, 107, 35);
		panel_11.add(button_16);
		
		//热销榜单
		JButton button_15 = new JButton("\u70ED\u9500\u699C\u5355");
		button_15.setForeground(Color.GRAY);
		button_15.setFont(new Font("楷体", Font.PLAIN, 16));
		button_15.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_15.setBounds(462, 0, 107, 35);
		panel_11.add(button_15);
		
		//作者
		JButton button_14 = new JButton("\u4F5C\u8005");
		button_14.setForeground(Color.GRAY);
		button_14.setFont(new Font("楷体", Font.PLAIN, 16));
		button_14.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_14.setBounds(595, 0, 107, 35);
		panel_11.add(button_14);
		
		//最新书籍
		JButton button_13 = new JButton("\u6700\u65B0\u4E66\u7C4D");
		button_13.setForeground(Color.GRAY);
		button_13.setFont(new Font("楷体", Font.PLAIN, 16));
		button_13.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_13.setBounds(728, 0, 107, 35);
		panel_11.add(button_13);
		
		//个性推荐
		JButton button_17 = new JButton("\u4E2A\u6027\u63A8\u8350");
		button_17.setForeground(Color.BLACK);
		button_17.setFont(new Font("楷体", Font.BOLD, 16));
		button_17.setIcon(new ImageIcon("img/上方菜单 选中.png"));
		button_17.setBounds(199, 0, 107, 35);
		panel_11.add(button_17);
		
		//图片与文字的相对位置
		button_15.setHorizontalTextPosition(SwingConstants.CENTER);  
		button_14.setHorizontalTextPosition(SwingConstants.CENTER);
		button_13.setHorizontalTextPosition(SwingConstants.CENTER);
		button_16.setHorizontalTextPosition(SwingConstants.CENTER);
		button_17.setHorizontalTextPosition(SwingConstants.CENTER);
		
		//设置是否绘制边框
		button_15.setBorderPainted(false);  
		button_14.setBorderPainted(false);  
		button_13.setBorderPainted(false);  
		button_16.setBorderPainted(false);  
		button_17.setBorderPainted(false);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(22, -5360000, 1080, 672);
		frame.getContentPane().add(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(164, -852000, 1080, 671);
		frame.getContentPane().add(panel_4);
		panel_4.setForeground(Color.WHITE);
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(164, -522100, 1080, 671);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label_17 = new JLabel("\u6613               \u4E66\r\n");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.GRAY);
		label_17.setFont(new Font("楷体", Font.BOLD, 59));
		label_17.setBounds(0, 0, 670, 300);
		panel_5.add(label_17);
		
		JLabel label_2 = new JLabel("\u6613               \u4E66\r\n");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("楷体", Font.BOLD, 59));
		label_2.setBounds(0, 0, 670, 300);
		panel_2.add(label_2);
		
		JLabel lblNewLabel_2 = new JLabel("\u6B64 \u529F \u80FD \u767B \u5F55 \u540E \u65B9 \u53EF \u67E5 \u770B");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 42));
		lblNewLabel_2.setBounds(129, 145, 834, 388);
		panel_4.add(lblNewLabel_2);
		
		JButton button_10 = new JButton("\u767B \u9646");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new denglu();
				frame.dispose();
			}
		});
		button_10.setIcon(new ImageIcon("img/抬头logo.PNG"));
		button_10.setBackground(Color.BLACK);
		button_10.setForeground(Color.WHITE);
		button_10.setBounds(774, 38, 148, 23);
		frame.getContentPane().add(button_10);
		button_10.setFont(new Font("楷体", Font.BOLD, 16));
		button_10.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button_10.setBorderPainted(false);
		
		//注册
		JButton button_11 = new JButton("\u6CE8 \u518C");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new zhuce();
				frame.dispose();
			}
		});
		button_11.setIcon(new ImageIcon("img/抬头logo.PNG"));
		button_11.setHorizontalTextPosition(SwingConstants.CENTER);
		button_11.setForeground(Color.WHITE);
		button_11.setFont(new Font("楷体", Font.BOLD, 16));
		button_11.setBorderPainted(false);
		button_11.setBackground(Color.BLACK);
		button_11.setBounds(938, 39, 148, 23);
		frame.getContentPane().add(button_11);
		
		
		//绿皮书
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("img/书籍图片1.png"));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		btnNewButton.setBorderPainted(false);  //设置是否绘制边框
		btnNewButton.setBounds(49, 303, 174, 235);
		panel_17.add(btnNewButton);
				
		//瓦尔登湖
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("img/书籍图片2.png"));
		button.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button.setBorderPainted(false);  //设置是否绘制边框
		button.setBackground(Color.WHITE);
		button.setBounds(307, 303, 181, 235);
		panel_17.add(button);
				
		JButton button_18 = new JButton("");
		button_18.setIcon(new ImageIcon("img/书籍图片3.png"));
		button_18.setHorizontalTextPosition(SwingConstants.CENTER);
		button_18.setBorderPainted(false);
		button_18.setBackground(Color.WHITE);
		button_18.setBounds(577, 303, 174, 235);
		panel_17.add(button_18);
				
		JButton button_19 = new JButton("");
		button_19.setIcon(new ImageIcon("img/书籍图片4.png"));
		button_19.setHorizontalTextPosition(SwingConstants.CENTER);
		button_19.setBorderPainted(false);
		button_19.setBackground(Color.WHITE);
		button_19.setBounds(840, 303, 174, 235);
		panel_17.add(button_19);
		
		
		//主页键
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_1.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
				button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_1.setFont(new Font("楷体", Font.BOLD, 16));
				button_2.setFont(new Font("楷体", Font.PLAIN, 16));
				button_3.setFont(new Font("楷体", Font.PLAIN, 16));
				button_4.setFont(new Font("楷体", Font.PLAIN, 16));
				button_5.setFont(new Font("楷体", Font.PLAIN, 16));
				button_6.setFont(new Font("楷体", Font.PLAIN, 16));
				button_7.setFont(new Font("楷体", Font.PLAIN, 16));
				button_8.setFont(new Font("楷体", Font.PLAIN, 16));
				button_9.setFont(new Font("楷体", Font.PLAIN, 16));
				button_1.setForeground(Color.BLACK);
				button_2.setForeground(Color.DARK_GRAY);
				button_3.setForeground(Color.DARK_GRAY);
				button_4.setForeground(Color.DARK_GRAY);
				button_5.setForeground(Color.DARK_GRAY);
				button_6.setForeground(Color.DARK_GRAY);
				button_7.setForeground(Color.DARK_GRAY);
				button_8.setForeground(Color.DARK_GRAY);
				button_9.setForeground(Color.DARK_GRAY);
				panel_0.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(22, -5360000, 1080, 672);
				panel_5.setBounds(22, -5360000, 1080, 672);
				panel_4.setBounds(22, -5360000, 1080, 672);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("img/主页键.PNG"));
		btnNewButton_2.setBorderPainted(false);  //设置是否绘制边框
		btnNewButton_2.setBounds(33, 10, 224, 55);
		frame.getContentPane().add(btnNewButton_2);
		
		
		//个性推荐
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_17.setBounds(10, 45, 1060, 616);
				panel_16.setBounds(10, -85200, 1060, 616);
				panel_15.setBounds(10, -85200, 1060, 616);
				panel_14.setBounds(10, -85200, 1060, 616);
				panel_13.setBounds(10, -85200, 1060, 616);
				button_17.setForeground(Color.BLACK);
				button_16.setForeground(Color.GRAY);
				button_13.setForeground(Color.GRAY);
				button_14.setForeground(Color.GRAY);
				button_15.setForeground(Color.GRAY);
				button_17.setFont(new Font("楷体", Font.BOLD, 16));
				button_16.setFont(new Font("楷体", Font.PLAIN, 16));
				button_15.setFont(new Font("楷体", Font.PLAIN, 16));
				button_14.setFont(new Font("楷体", Font.PLAIN, 16));
				button_13.setFont(new Font("楷体", Font.PLAIN, 16));
				button_17.setIcon(new ImageIcon("img/上方菜单 选中.png"));
				button_16.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_13.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_14.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_15.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			}
		});
		
		//书单
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_16.setBounds(10, 45, 1060, 616);
				panel_17.setBounds(10, -85200, 1060, 616);
				panel_15.setBounds(10, -85200, 1060, 616);
				panel_14.setBounds(10, -85200, 1060, 616);
				panel_13.setBounds(10, -85200, 1060, 616);
				button_16.setForeground(Color.BLACK);
				button_17.setForeground(Color.GRAY);
				button_13.setForeground(Color.GRAY);
				button_14.setForeground(Color.GRAY);
				button_15.setForeground(Color.GRAY);
				button_16.setFont(new Font("楷体", Font.BOLD, 16));
				button_17.setFont(new Font("楷体", Font.PLAIN, 16));
				button_15.setFont(new Font("楷体", Font.PLAIN, 16));
				button_14.setFont(new Font("楷体", Font.PLAIN, 16));
				button_13.setFont(new Font("楷体", Font.PLAIN, 16));
				button_16.setIcon(new ImageIcon("img/上方菜单 选中.png"));
				button_17.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_13.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_14.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_15.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			}
		});
		
		//热销榜单
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_15.setBounds(10, 45, 1060, 616);
				panel_17.setBounds(10, -85200, 1060, 616);
				panel_16.setBounds(10, -85200, 1060, 616);
				panel_14.setBounds(10, -85200, 1060, 616);
				panel_13.setBounds(10, -85200, 1060, 616);
				button_13.setForeground(Color.BLACK);
				button_16.setForeground(Color.GRAY);
				button_17.setForeground(Color.GRAY);
				button_14.setForeground(Color.GRAY);
				button_15.setForeground(Color.GRAY);
				button_13.setFont(new Font("楷体", Font.BOLD, 16));
				button_16.setFont(new Font("楷体", Font.PLAIN, 16));
				button_15.setFont(new Font("楷体", Font.PLAIN, 16));
				button_14.setFont(new Font("楷体", Font.PLAIN, 16));
				button_17.setFont(new Font("楷体", Font.PLAIN, 16));
				button_13.setIcon(new ImageIcon("img/上方菜单 选中.png"));
				button_16.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_17.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_14.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_15.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			}
		});
		
		//作者
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_14.setBounds(10, 45, 1060, 616);
				panel_17.setBounds(10, -85200, 1060, 616);
				panel_16.setBounds(10, -85200, 1060, 616);
				panel_15.setBounds(10, -85200, 1060, 616);
				panel_13.setBounds(10, -85200, 1060, 616);
				button_14.setForeground(Color.BLACK);
				button_16.setForeground(Color.GRAY);
				button_17.setForeground(Color.GRAY);
				button_13.setForeground(Color.GRAY);
				button_15.setForeground(Color.GRAY);
				button_14.setFont(new Font("楷体", Font.BOLD, 16));
				button_16.setFont(new Font("楷体", Font.PLAIN, 16));
				button_15.setFont(new Font("楷体", Font.PLAIN, 16));
				button_17.setFont(new Font("楷体", Font.PLAIN, 16));
				button_13.setFont(new Font("楷体", Font.PLAIN, 16));
				button_14.setIcon(new ImageIcon("img/上方菜单 选中.png"));
				button_16.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_17.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_13.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_15.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			}
		});
		
		//最新书籍
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_13.setBounds(10, 45, 1060, 616);
				panel_17.setBounds(10, -85200, 1060, 616);
				panel_16.setBounds(10, -85200, 1060, 616);
				panel_15.setBounds(10, -85200, 1060, 616);
				panel_14.setBounds(10, -85200, 1060, 616);
				button_15.setForeground(Color.BLACK);
				button_16.setForeground(Color.GRAY);
				button_17.setForeground(Color.GRAY);
				button_13.setForeground(Color.GRAY);
				button_14.setForeground(Color.GRAY);
				button_15.setFont(new Font("楷体", Font.BOLD, 16));
				button_16.setFont(new Font("楷体", Font.PLAIN, 16));
				button_17.setFont(new Font("楷体", Font.PLAIN, 16));
				button_14.setFont(new Font("楷体", Font.PLAIN, 16));
				button_13.setFont(new Font("楷体", Font.PLAIN, 16));
				button_15.setIcon(new ImageIcon("img/上方菜单 选中.png"));
				button_16.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_17.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_13.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_14.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			}
		});
				
			
		//发现书籍
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_1.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
				button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_1.setFont(new Font("楷体", Font.BOLD, 16));
				button_2.setFont(new Font("楷体", Font.PLAIN, 16));
				button_3.setFont(new Font("楷体", Font.PLAIN, 16));
				button_4.setFont(new Font("楷体", Font.PLAIN, 16));
				button_5.setFont(new Font("楷体", Font.PLAIN, 16));
				button_6.setFont(new Font("楷体", Font.PLAIN, 16));
				button_7.setFont(new Font("楷体", Font.PLAIN, 16));
				button_8.setFont(new Font("楷体", Font.PLAIN, 16));
				button_9.setFont(new Font("楷体", Font.PLAIN, 16));
				button_1.setForeground(Color.BLACK);
				button_2.setForeground(Color.DARK_GRAY);
				button_3.setForeground(Color.DARK_GRAY);
				button_4.setForeground(Color.DARK_GRAY);
				button_5.setForeground(Color.DARK_GRAY);
				button_6.setForeground(Color.DARK_GRAY);
				button_7.setForeground(Color.DARK_GRAY);
				button_8.setForeground(Color.DARK_GRAY);
				button_9.setForeground(Color.DARK_GRAY);
				panel_0.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(22, -5360000, 1080, 672);
				panel_5.setBounds(22, -5360000, 1080, 672);
				panel_4.setBounds(22, -5360000, 1080, 672);
			}
		});
		
		
		//私人书馆
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_2.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
				button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_2.setFont(new Font("楷体", Font.BOLD, 16));
				button_1.setFont(new Font("楷体", Font.PLAIN, 16));
				button_3.setFont(new Font("楷体", Font.PLAIN, 16));
				button_4.setFont(new Font("楷体", Font.PLAIN, 16));
				button_5.setFont(new Font("楷体", Font.PLAIN, 16));
				button_6.setFont(new Font("楷体", Font.PLAIN, 16));
				button_7.setFont(new Font("楷体", Font.PLAIN, 16));
				button_8.setFont(new Font("楷体", Font.PLAIN, 16));
				button_9.setFont(new Font("楷体", Font.PLAIN, 16));
				button_2.setForeground(Color.BLACK);
				button_1.setForeground(Color.DARK_GRAY);
				button_3.setForeground(Color.DARK_GRAY);
				button_4.setForeground(Color.DARK_GRAY);
				button_5.setForeground(Color.DARK_GRAY);
				button_6.setForeground(Color.DARK_GRAY);
				button_7.setForeground(Color.DARK_GRAY);
				button_8.setForeground(Color.DARK_GRAY);
				button_9.setForeground(Color.DARK_GRAY);
				panel_2.setBounds(164, 65, 1080, 671);
				panel_0.setBounds(22, -5360000, 1080, 672);
				panel_5.setBounds(22, -5360000, 1080, 672);
				panel_4.setBounds(22, -5360000, 1080, 672);
			}
		});
		
		
		//销售管理
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_3.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
				button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_3.setFont(new Font("楷体", Font.BOLD, 16));
				button_2.setFont(new Font("楷体", Font.PLAIN, 16));
				button_1.setFont(new Font("楷体", Font.PLAIN, 16));
				button_4.setFont(new Font("楷体", Font.PLAIN, 16));
				button_5.setFont(new Font("楷体", Font.PLAIN, 16));
				button_6.setFont(new Font("楷体", Font.PLAIN, 16));
				button_7.setFont(new Font("楷体", Font.PLAIN, 16));
				button_8.setFont(new Font("楷体", Font.PLAIN, 16));
				button_9.setFont(new Font("楷体", Font.PLAIN, 16));
				button_3.setForeground(Color.BLACK);
				button_2.setForeground(Color.DARK_GRAY);
				button_1.setForeground(Color.DARK_GRAY);
				button_4.setForeground(Color.DARK_GRAY);
				button_5.setForeground(Color.DARK_GRAY);
				button_6.setForeground(Color.DARK_GRAY);
				button_7.setForeground(Color.DARK_GRAY);
				button_8.setForeground(Color.DARK_GRAY);
				button_9.setForeground(Color.DARK_GRAY);
				panel_4.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(22, -5360000, 1080, 672);
				panel_5.setBounds(22, -5360000, 1080, 672);
				panel_0.setBounds(22, -5360000, 1080, 672);
			}
		});
		
		
		//采购管理
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_4.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
				button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_4.setFont(new Font("楷体", Font.BOLD, 16));
				button_2.setFont(new Font("楷体", Font.PLAIN, 16));
				button_3.setFont(new Font("楷体", Font.PLAIN, 16));
				button_1.setFont(new Font("楷体", Font.PLAIN, 16));
				button_5.setFont(new Font("楷体", Font.PLAIN, 16));
				button_6.setFont(new Font("楷体", Font.PLAIN, 16));
				button_7.setFont(new Font("楷体", Font.PLAIN, 16));
				button_8.setFont(new Font("楷体", Font.PLAIN, 16));
				button_9.setFont(new Font("楷体", Font.PLAIN, 16));
				button_4.setForeground(Color.BLACK);
				button_2.setForeground(Color.DARK_GRAY);
				button_3.setForeground(Color.DARK_GRAY);
				button_1.setForeground(Color.DARK_GRAY);
				button_5.setForeground(Color.DARK_GRAY);
				button_6.setForeground(Color.DARK_GRAY);
				button_7.setForeground(Color.DARK_GRAY);
				button_8.setForeground(Color.DARK_GRAY);
				button_9.setForeground(Color.DARK_GRAY);
				panel_4.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(22, -5360000, 1080, 672);
				panel_5.setBounds(22, -5360000, 1080, 672);
				panel_0.setBounds(22, -5360000, 1080, 672);
			}
		});
		
		
		//千页藏书
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_5.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
				button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_5.setFont(new Font("楷体", Font.BOLD, 16));
				button_2.setFont(new Font("楷体", Font.PLAIN, 16));
				button_3.setFont(new Font("楷体", Font.PLAIN, 16));
				button_4.setFont(new Font("楷体", Font.PLAIN, 16));
				button_1.setFont(new Font("楷体", Font.PLAIN, 16));
				button_6.setFont(new Font("楷体", Font.PLAIN, 16));
				button_7.setFont(new Font("楷体", Font.PLAIN, 16));
				button_8.setFont(new Font("楷体", Font.PLAIN, 16));
				button_9.setFont(new Font("楷体", Font.PLAIN, 16));
				button_5.setForeground(Color.BLACK);
				button_2.setForeground(Color.DARK_GRAY);
				button_3.setForeground(Color.DARK_GRAY);
				button_4.setForeground(Color.DARK_GRAY);
				button_1.setForeground(Color.DARK_GRAY);
				button_6.setForeground(Color.DARK_GRAY);
				button_7.setForeground(Color.DARK_GRAY);
				button_8.setForeground(Color.DARK_GRAY);
				button_9.setForeground(Color.DARK_GRAY);
				panel_5.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(22, -5360000, 1080, 672);
				panel_4.setBounds(22, -5360000, 1080, 672);
				panel_0.setBounds(22, -5360000, 1080, 672);
			}
		});
		
		//人员管理
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_6.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
				button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_6.setFont(new Font("楷体", Font.BOLD, 16));
				button_2.setFont(new Font("楷体", Font.PLAIN, 16));
				button_3.setFont(new Font("楷体", Font.PLAIN, 16));
				button_4.setFont(new Font("楷体", Font.PLAIN, 16));
				button_5.setFont(new Font("楷体", Font.PLAIN, 16));
				button_1.setFont(new Font("楷体", Font.PLAIN, 16));
				button_7.setFont(new Font("楷体", Font.PLAIN, 16));
				button_8.setFont(new Font("楷体", Font.PLAIN, 16));
				button_9.setFont(new Font("楷体", Font.PLAIN, 16));
				button_6.setForeground(Color.BLACK);
				button_2.setForeground(Color.DARK_GRAY);
				button_3.setForeground(Color.DARK_GRAY);
				button_4.setForeground(Color.DARK_GRAY);
				button_5.setForeground(Color.DARK_GRAY);
				button_1.setForeground(Color.DARK_GRAY);
				button_7.setForeground(Color.DARK_GRAY);
				button_8.setForeground(Color.DARK_GRAY);
				button_9.setForeground(Color.DARK_GRAY);
				panel_4.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(22, -5360000, 1080, 672);
				panel_5.setBounds(22, -5360000, 1080, 672);
				panel_0.setBounds(22, -5360000, 1080, 672);
			}
		});
		
		//库存管理
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_7.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
				button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_7.setFont(new Font("楷体", Font.BOLD, 16));
				button_2.setFont(new Font("楷体", Font.PLAIN, 16));
				button_3.setFont(new Font("楷体", Font.PLAIN, 16));
				button_4.setFont(new Font("楷体", Font.PLAIN, 16));
				button_5.setFont(new Font("楷体", Font.PLAIN, 16));
				button_6.setFont(new Font("楷体", Font.PLAIN, 16));
				button_1.setFont(new Font("楷体", Font.PLAIN, 16));
				button_8.setFont(new Font("楷体", Font.PLAIN, 16));
				button_9.setFont(new Font("楷体", Font.PLAIN, 16));
				button_7.setForeground(Color.BLACK);
				button_2.setForeground(Color.DARK_GRAY);
				button_3.setForeground(Color.DARK_GRAY);
				button_4.setForeground(Color.DARK_GRAY);
				button_5.setForeground(Color.DARK_GRAY);
				button_6.setForeground(Color.DARK_GRAY);
				button_1.setForeground(Color.DARK_GRAY);
				button_8.setForeground(Color.DARK_GRAY);
				button_9.setForeground(Color.DARK_GRAY);
				panel_4.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(22, -5360000, 1080, 672);
				panel_5.setBounds(22, -5360000, 1080, 672);
				panel_0.setBounds(22, -5360000, 1080, 672);
			}
		});
		
		//报警管理
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_8.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
				button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_8.setFont(new Font("楷体", Font.BOLD, 16));
				button_2.setFont(new Font("楷体", Font.PLAIN, 16));
				button_3.setFont(new Font("楷体", Font.PLAIN, 16));
				button_4.setFont(new Font("楷体", Font.PLAIN, 16));
				button_5.setFont(new Font("楷体", Font.PLAIN, 16));
				button_6.setFont(new Font("楷体", Font.PLAIN, 16));
				button_7.setFont(new Font("楷体", Font.PLAIN, 16));
				button_1.setFont(new Font("楷体", Font.PLAIN, 16));
				button_9.setFont(new Font("楷体", Font.PLAIN, 16));
				button_8.setForeground(Color.BLACK);
				button_2.setForeground(Color.DARK_GRAY);
				button_3.setForeground(Color.DARK_GRAY);
				button_4.setForeground(Color.DARK_GRAY);
				button_5.setForeground(Color.DARK_GRAY);
				button_6.setForeground(Color.DARK_GRAY);
				button_7.setForeground(Color.DARK_GRAY);
				button_1.setForeground(Color.DARK_GRAY);
				button_9.setForeground(Color.DARK_GRAY);
				panel_4.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(22, -5360000, 1080, 672);
				panel_5.setBounds(22, -5360000, 1080, 672);
				panel_0.setBounds(22, -5360000, 1080, 672);
			}
		});
		
		// 账款管理
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_9.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
				button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_9.setFont(new Font("楷体", Font.BOLD, 16));
				button_2.setFont(new Font("楷体", Font.PLAIN, 16));
				button_3.setFont(new Font("楷体", Font.PLAIN, 16));
				button_4.setFont(new Font("楷体", Font.PLAIN, 16));
				button_5.setFont(new Font("楷体", Font.PLAIN, 16));
				button_6.setFont(new Font("楷体", Font.PLAIN, 16));
				button_7.setFont(new Font("楷体", Font.PLAIN, 16));
				button_8.setFont(new Font("楷体", Font.PLAIN, 16));
				button_1.setFont(new Font("楷体", Font.PLAIN, 16));
				button_9.setForeground(Color.BLACK);
				button_2.setForeground(Color.DARK_GRAY);
				button_3.setForeground(Color.DARK_GRAY);
				button_4.setForeground(Color.DARK_GRAY);
				button_5.setForeground(Color.DARK_GRAY);
				button_6.setForeground(Color.DARK_GRAY);
				button_7.setForeground(Color.DARK_GRAY);
				button_8.setForeground(Color.DARK_GRAY);
				button_1.setForeground(Color.DARK_GRAY);
				panel_4.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(22, -5360000, 1080, 672);
				panel_5.setBounds(22, -5360000, 1080, 672);
				panel_0.setBounds(22, -5360000, 1080, 672);
			}
		});
		
		
	}
}
