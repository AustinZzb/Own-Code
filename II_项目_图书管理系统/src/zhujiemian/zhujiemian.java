package zhujiemian;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import kefu.ServerClient;
import kefu.ServerClient_1;
import kefu.Client;

public class zhujiemian {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private int k = 0;

	public zhujiemian(String s00,String s01,String s02,String s03) {
		frame = new JFrame();
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setBackground(Color.BLACK);
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
		
		JButton button_1 = new JButton("\u53D1\u73B0\u4E66\u7C4D");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("楷体", Font.BOLD, 16));
		button_1.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
		button_1.setBounds(0, 35, 164, 33);
		panel.add(button_1);
		button_1.setOpaque(false);  //设置控件是否透明
		button_1.setBorderPainted(false);
		
		JButton button_2 = new JButton("\u79C1\u4EBA\u4E66\u9986");
		button_2.setForeground(Color.DARK_GRAY);
		button_2.setFont(new Font("楷体", Font.PLAIN, 16));
		button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_2.setOpaque(false);
		button_2.setBorderPainted(false);
		button_2.setBounds(0, 68, 164, 34);
		panel.add(button_2);
		
		JButton button_3 = new JButton("\u9500\u552E\u7BA1\u7406");
		button_3.setForeground(Color.DARK_GRAY);
		button_3.setFont(new Font("楷体", Font.PLAIN, 16));
		button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_3.setOpaque(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(0, 250, 164, 33);
		panel.add(button_3);
		
		JButton button_4 = new JButton("\u91C7\u8D2D\u7BA1\u7406");
		button_4.setForeground(Color.DARK_GRAY);
		button_4.setFont(new Font("楷体", Font.PLAIN, 16));
		button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_4.setOpaque(false);
		button_4.setBorderPainted(false);
		button_4.setBounds(0, 221, 164, 33);
		panel.add(button_4);
		
		JButton button_5 = new JButton("\u5343\u9875\u85CF\u4E66");
		button_5.setForeground(Color.DARK_GRAY);
		button_5.setFont(new Font("楷体", Font.PLAIN, 16));
		button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_5.setOpaque(false);
		button_5.setBounds(0, 101, 164, 33);
		panel.add(button_5);	
		
		button_1.setBorderPainted(false);//设置是否绘制边框 
		button_2.setBorderPainted(false);//设置是否绘制边框 
		button_3.setBorderPainted(false);
		button_4.setBorderPainted(false);
		button_5.setBorderPainted(false);
		
		
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置 
		button_2.setHorizontalTextPosition(SwingConstants.CENTER);  
		button_3.setHorizontalTextPosition(SwingConstants.CENTER);  
		button_4.setHorizontalTextPosition(SwingConstants.CENTER);  
		button_5.setHorizontalTextPosition(SwingConstants.CENTER);
		
		
		JLabel label_1 = new JLabel("\u6613\u4E66\u7BA1\u7406");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("宋体", Font.PLAIN, 12));
		label_1.setBounds(0, 178, 61, 33);
		panel.add(label_1);
		
		JButton button_6 = new JButton("\u4EBA\u5458\u7BA1\u7406");
		button_6.setForeground(Color.DARK_GRAY);
		button_6.setFont(new Font("楷体", Font.PLAIN, 16));
		button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_6.setOpaque(false);
		button_6.setHorizontalTextPosition(SwingConstants.CENTER);
		button_6.setBorderPainted(false);
		button_6.setBounds(0, 317, 164, 33);
		panel.add(button_6);
		
		JButton button_7 = new JButton("\u5E93\u5B58\u7BA1\u7406");
		button_7.setForeground(Color.DARK_GRAY);
		button_7.setFont(new Font("楷体", Font.PLAIN, 16));
		button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_7.setOpaque(false);
		button_7.setHorizontalTextPosition(SwingConstants.CENTER);
		button_7.setBorderPainted(false);
		button_7.setBounds(0, 284, 164, 33);
		panel.add(button_7);
		
		JButton button_8 = new JButton("\u62A5\u8B66\u7BA1\u7406");
		button_8.setForeground(Color.DARK_GRAY);
		button_8.setFont(new Font("楷体", Font.PLAIN, 16));
		button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_8.setOpaque(false);
		button_8.setHorizontalTextPosition(SwingConstants.CENTER);
		button_8.setBorderPainted(false);
		button_8.setBounds(0, 384, 164, 33);
		panel.add(button_8);
		
		JButton button_9 = new JButton("\u8D26\u6B3E\u7BA1\u7406");
		button_9.setForeground(Color.DARK_GRAY);
		button_9.setFont(new Font("楷体", Font.PLAIN, 16));
		button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_9.setOpaque(false);
		button_9.setHorizontalTextPosition(SwingConstants.CENTER);
		button_9.setBorderPainted(false);
		button_9.setBounds(0, 351, 164, 33);
		panel.add(button_9);
		
		JButton button_51 = new JButton("\u67E5\u8BE2\u62A5\u8868\r\n");
		button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_51.setOpaque(false);
		button_51.setHorizontalTextPosition(SwingConstants.CENTER);
		button_51.setForeground(Color.DARK_GRAY);
		button_51.setFont(new Font("楷体", Font.PLAIN, 16));
		button_51.setBorderPainted(false);
		button_51.setBounds(0, 416, 164, 33);
		panel.add(button_51);
		
		JButton button_61 = new JButton("\u8054\u7CFB\u5BA2\u670D");
		button_61.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_61.setOpaque(false);
		button_61.setHorizontalTextPosition(SwingConstants.CENTER);
		button_61.setForeground(Color.DARK_GRAY);
		button_61.setFont(new Font("楷体", Font.PLAIN, 16));
		button_61.setBorderPainted(false);
		button_61.setBounds(0, 135, 164, 33);
		panel.add(button_61);
		
		JButton button_62 = new JButton("\u6613\u4E66\u591A\u4EBA\u804A\u5929");
		button_62.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_62.setOpaque(false);
		button_62.setHorizontalTextPosition(SwingConstants.CENTER);
		button_62.setForeground(Color.DARK_GRAY);
		button_62.setFont(new Font("楷体", Font.PLAIN, 16));
		button_62.setBorderPainted(false);
		button_62.setBounds(0, 448, 164, 33);
		panel.add(button_62);
		
		
		//主界面
		JPanel panel_0 = new JPanel();
		panel_0.setBounds(164, 65, 1080, 671);
		frame.getContentPane().add(panel_0);
		panel_0.setBackground(Color.WHITE);
		panel_0.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 1080, 671);
		panel_0.add(panel_1);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 0, 1080, 35);
		panel_1.add(panel_10);
		
		JButton button_41 = new JButton("\u4E66\u5355\r\n");
		button_41.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_41.setHorizontalTextPosition(SwingConstants.CENTER);
		button_41.setForeground(Color.GRAY);
		button_41.setFont(new Font("楷体", Font.PLAIN, 16));
		button_41.setBorderPainted(false);
		button_41.setBounds(327, 0, 107, 35);
		panel_10.add(button_41);
		
		JButton button_40 = new JButton("\u70ED\u9500\u699C\u5355");
		button_40.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_40.setHorizontalTextPosition(SwingConstants.CENTER);
		button_40.setForeground(Color.GRAY);
		button_40.setFont(new Font("楷体", Font.PLAIN, 16));
		button_40.setBorderPainted(false);
		button_40.setBounds(462, 0, 107, 35);
		panel_10.add(button_40);
		
		JButton button_39 = new JButton("\u4F5C\u8005");
		button_39.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_39.setHorizontalTextPosition(SwingConstants.CENTER);
		button_39.setForeground(Color.GRAY);
		button_39.setFont(new Font("楷体", Font.PLAIN, 16));
		button_39.setBorderPainted(false);
		button_39.setBounds(595, 0, 107, 35);
		panel_10.add(button_39);
		
		JButton button_38 = new JButton("\u6700\u65B0\u4E66\u7C4D");
		button_38.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_38.setHorizontalTextPosition(SwingConstants.CENTER);
		button_38.setForeground(Color.GRAY);
		button_38.setFont(new Font("楷体", Font.PLAIN, 16));
		button_38.setBorderPainted(false);
		button_38.setBounds(728, 0, 107, 35);
		panel_10.add(button_38);
		
		JButton button_42 = new JButton("\u4E2A\u6027\u63A8\u8350");
		button_42.setIcon(new ImageIcon("img/上方菜单 选中.png"));
		button_42.setHorizontalTextPosition(SwingConstants.CENTER);
		button_42.setForeground(Color.BLACK);
		button_42.setFont(new Font("楷体", Font.BOLD, 16));
		button_42.setBorderPainted(false);
		button_42.setBounds(199, 0, 107, 35);
		panel_10.add(button_42);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(10, -85200, 1060, 616);
		panel_1.add(panel_11);
		
		JLabel label_15 = new JLabel("\u6700  \u65B0  \u4E66  \u7C4D");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("楷体", Font.BOLD, 44));
		panel_11.add(label_15);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(10, -85200, 1060, 616);
		panel_1.add(panel_12);
		
		JLabel label_16 = new JLabel("\u4F5C  \u8005");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("楷体", Font.BOLD, 44));
		panel_12.add(label_16);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(10, -95100, 1060, 616);
		panel_1.add(panel_13);
		
		JLabel label_17 = new JLabel("\u70ED  \u9500  \u699C  \u5355");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("楷体", Font.BOLD, 44));
		panel_13.add(label_17);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, -85200, 1060, 616);
		panel_1.add(panel_14);
		
		JLabel label_18 = new JLabel("\u4E66  \u5355");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("楷体", Font.BOLD, 44));
		panel_14.add(label_18);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(10, 45, 1060, 616);
		panel_1.add(panel_15);
		
		JLabel label_20 = new JLabel("\u63A8\u8350\u4E66\u7C4D");
		label_20.setForeground(Color.DARK_GRAY);
		label_20.setFont(new Font("楷体", Font.BOLD, 18));
		label_20.setBounds(10, 222, 87, 30);
		panel_15.add(label_20);
		
		JButton button_43 = new JButton("");
		button_43.setIcon(new ImageIcon("img/书籍图片1.png"));
		button_43.setHorizontalTextPosition(SwingConstants.CENTER);
		button_43.setBorderPainted(false);
		button_43.setBackground(Color.WHITE);
		button_43.setBounds(49, 303, 174, 235);
		panel_15.add(button_43);
		
		JButton button_44 = new JButton("");
		button_44.setIcon(new ImageIcon("img/书籍图片2.png"));
		button_44.setHorizontalTextPosition(SwingConstants.CENTER);
		button_44.setBorderPainted(false);
		button_44.setBackground(Color.WHITE);
		button_44.setBounds(307, 303, 181, 235);
		panel_15.add(button_44);
		
		JButton button_45 = new JButton("");
		button_45.setIcon(new ImageIcon("img/书籍图片3.png"));
		button_45.setHorizontalTextPosition(SwingConstants.CENTER);
		button_45.setBorderPainted(false);
		button_45.setBackground(Color.WHITE);
		button_45.setBounds(577, 303, 174, 235);
		panel_15.add(button_45);
		
		JButton button_46 = new JButton("");
		button_46.setIcon(new ImageIcon("img/书籍图片4.png"));
		button_46.setHorizontalTextPosition(SwingConstants.CENTER);
		button_46.setBorderPainted(false);
		button_46.setBackground(Color.WHITE);
		button_46.setBounds(840, 303, 174, 235);
		panel_15.add(button_46);
		
		JLabel label_21 = new JLabel("\u7EFF\u76AE\u4E66");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setForeground(Color.DARK_GRAY);
		label_21.setFont(new Font("楷体", Font.BOLD, 20));
		label_21.setBounds(79, 558, 108, 30);
		panel_15.add(label_21);
		
		JLabel label_22 = new JLabel("\u74E6\u5C14\u767B\u6E56");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(Color.DARK_GRAY);
		label_22.setFont(new Font("楷体", Font.BOLD, 20));
		label_22.setBounds(348, 558, 108, 30);
		panel_15.add(label_22);
		
		JLabel label_23 = new JLabel("\u6D3B\u7740");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setForeground(Color.DARK_GRAY);
		label_23.setFont(new Font("楷体", Font.BOLD, 20));
		label_23.setBounds(622, 558, 108, 30);
		panel_15.add(label_23);
		
		JLabel label_24 = new JLabel("\u7F57\u9A6C\u4EBA");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setForeground(Color.DARK_GRAY);
		label_24.setFont(new Font("楷体", Font.BOLD, 20));
		label_24.setBounds(883, 558, 108, 30);
		panel_15.add(label_24);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(10, 10, 1050, 202);
		panel_15.add(panel_16);
		
		String[] s = {"img/书籍图片7.png","img/书籍图片6.png","img/书籍图片9.png","img/书籍图片10.png","img/书籍图片8.png"};
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon(s[2]));
		label_19.setBounds(360, 12, 299, 164);
		panel_16.add(label_19);
		
		JLabel label_27 = new JLabel("");
		label_27.setIcon(new ImageIcon(s[1]));
		label_27.setBounds(198, 25, 299, 151);
		panel_16.add(label_27);
		
		JLabel label_28 = new JLabel("");
		label_28.setIcon(new ImageIcon(s[3]));
		label_28.setBounds(545, 25, 299, 151);
		panel_16.add(label_28);
		
		JLabel label_29 = new JLabel("");
		label_29.setIcon(new ImageIcon(s[0]));
		label_29.setBounds(51, 33, 299, 143);
		panel_16.add(label_29);
		
		JLabel label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon(s[4]));
		label_30.setBounds(702, 33, 299, 143);
		panel_16.add(label_30);
		
		JButton button_45_1 = new JButton("");
		button_45_1.setBackground(Color.LIGHT_GRAY);
		button_45_1.setBounds(416, 186, 28, 3);
		panel_16.add(button_45_1);
		
		JButton button_46_1 = new JButton("");
		button_46_1.setBackground(Color.LIGHT_GRAY);
		button_46_1.setBounds(458, 186, 28, 3);
		panel_16.add(button_46_1);
		
		JButton button_47 = new JButton("");
		button_47.setBackground(Color.BLACK);
		button_47.setBounds(496, 186, 28, 3);
		panel_16.add(button_47);
		
		JButton button_48 = new JButton("");
		button_48.setBackground(Color.LIGHT_GRAY);
		button_48.setBounds(534, 186, 28, 3);
		panel_16.add(button_48);
		
		JButton button_49 = new JButton("");
		button_49.setBackground(Color.LIGHT_GRAY);
		button_49.setBounds(572, 186, 28, 3);
		panel_16.add(button_49);
		
		//个性推荐--小说
		button_45_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_45_1.setBackground(Color.BLACK);
				button_46_1.setBackground(Color.LIGHT_GRAY);
				button_47.setBackground(Color.LIGHT_GRAY);
				button_48.setBackground(Color.LIGHT_GRAY);
				button_49.setBackground(Color.LIGHT_GRAY);
				label_19.setIcon(new ImageIcon(s[0]));
				label_27.setIcon(new ImageIcon(s[1]));
				label_28.setIcon(new ImageIcon(s[2]));
				label_29.setIcon(new ImageIcon(s[3]));
				label_30.setIcon(new ImageIcon(s[4]));
			}
		});
				
		//个性推荐--杂货店
		button_46_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_46_1.setBackground(Color.BLACK);
				button_45_1.setBackground(Color.LIGHT_GRAY);
				button_47.setBackground(Color.LIGHT_GRAY);
				button_48.setBackground(Color.LIGHT_GRAY);
				button_49.setBackground(Color.LIGHT_GRAY);
				label_19.setIcon(new ImageIcon(s[1]));
				label_27.setIcon(new ImageIcon(s[2]));
				label_28.setIcon(new ImageIcon(s[3]));
				label_29.setIcon(new ImageIcon(s[4]));
				label_30.setIcon(new ImageIcon(s[0]));
			}
		});
				
		//个性推荐--活着
		button_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_47.setBackground(Color.BLACK);
				button_46_1.setBackground(Color.LIGHT_GRAY);
				button_45_1.setBackground(Color.LIGHT_GRAY);
				button_48.setBackground(Color.LIGHT_GRAY);
				button_49.setBackground(Color.LIGHT_GRAY);
				label_19.setIcon(new ImageIcon(s[2]));
				label_27.setIcon(new ImageIcon(s[3]));
				label_28.setIcon(new ImageIcon(s[4]));
				label_29.setIcon(new ImageIcon(s[0]));
				label_30.setIcon(new ImageIcon(s[1]));
			}
		});
				
		//个性推荐--瓦尔登湖
		button_48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_48.setBackground(Color.BLACK);
				button_46_1.setBackground(Color.LIGHT_GRAY);
				button_47.setBackground(Color.LIGHT_GRAY);
				button_45_1.setBackground(Color.LIGHT_GRAY);
				button_49.setBackground(Color.LIGHT_GRAY);
				label_19.setIcon(new ImageIcon(s[3]));
				label_27.setIcon(new ImageIcon(s[4]));
				label_28.setIcon(new ImageIcon(s[0]));
				label_29.setIcon(new ImageIcon(s[1]));
				label_30.setIcon(new ImageIcon(s[2]));
			}
		});
		
		//个性推荐--优秀
		button_49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_49.setBackground(Color.BLACK);
				button_46_1.setBackground(Color.LIGHT_GRAY);
				button_47.setBackground(Color.LIGHT_GRAY);
				button_48.setBackground(Color.LIGHT_GRAY);
				button_45_1.setBackground(Color.LIGHT_GRAY);
				label_19.setIcon(new ImageIcon(s[4]));
				label_27.setIcon(new ImageIcon(s[0]));
				label_28.setIcon(new ImageIcon(s[1]));
				label_29.setIcon(new ImageIcon(s[2]));
				label_30.setIcon(new ImageIcon(s[3]));
			}
		});;
		
		button_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_15.setBounds(10, 45, 1060, 616);
				panel_14.setBounds(10, -85200, 1060, 616);
				panel_13.setBounds(10, -85200, 1060, 616);
				panel_12.setBounds(10, -85200, 1060, 616);
				panel_11.setBounds(10, -85200, 1060, 616);
				button_42.setForeground(Color.BLACK);
				button_41.setForeground(Color.GRAY);
				button_40.setForeground(Color.GRAY);
				button_39.setForeground(Color.GRAY);
				button_38.setForeground(Color.GRAY);
				button_42.setFont(new Font("楷体", Font.BOLD, 16));
				button_41.setFont(new Font("楷体", Font.PLAIN, 16));
				button_40.setFont(new Font("楷体", Font.PLAIN, 16));
				button_39.setFont(new Font("楷体", Font.PLAIN, 16));
				button_38.setFont(new Font("楷体", Font.PLAIN, 16));
				button_42.setIcon(new ImageIcon("img/上方菜单 选中.png"));
				button_41.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_40.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_39.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_38.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			}
		});
		
		button_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_14.setBounds(10, 45, 1060, 616);
				panel_15.setBounds(10, -85200, 1060, 616);
				panel_13.setBounds(10, -85200, 1060, 616);
				panel_12.setBounds(10, -85200, 1060, 616);
				panel_11.setBounds(10, -85200, 1060, 616);
				button_41.setForeground(Color.BLACK);
				button_42.setForeground(Color.GRAY);
				button_40.setForeground(Color.GRAY);
				button_39.setForeground(Color.GRAY);
				button_38.setForeground(Color.GRAY);
				button_41.setFont(new Font("楷体", Font.BOLD, 16));
				button_42.setFont(new Font("楷体", Font.PLAIN, 16));
				button_40.setFont(new Font("楷体", Font.PLAIN, 16));
				button_39.setFont(new Font("楷体", Font.PLAIN, 16));
				button_38.setFont(new Font("楷体", Font.PLAIN, 16));
				button_41.setIcon(new ImageIcon("img/上方菜单 选中.png"));
				button_42.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_40.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_39.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_38.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			}
		});
		
		button_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_13.setBounds(10, 45, 1060, 616);
				panel_15.setBounds(10, -85200, 1060, 616);
				panel_14.setBounds(10, -85200, 1060, 616);
				panel_12.setBounds(10, -85200, 1060, 616);
				panel_11.setBounds(10, -85200, 1060, 616);
				button_40.setForeground(Color.BLACK);
				button_42.setForeground(Color.GRAY);
				button_41.setForeground(Color.GRAY);
				button_39.setForeground(Color.GRAY);
				button_38.setForeground(Color.GRAY);
				button_40.setFont(new Font("楷体", Font.BOLD, 16));
				button_42.setFont(new Font("楷体", Font.PLAIN, 16));
				button_41.setFont(new Font("楷体", Font.PLAIN, 16));
				button_39.setFont(new Font("楷体", Font.PLAIN, 16));
				button_38.setFont(new Font("楷体", Font.PLAIN, 16));
				button_40.setIcon(new ImageIcon("img/上方菜单 选中.png"));
				button_42.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_41.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_39.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_38.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			}
		});
		
		button_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_12.setBounds(10, 45, 1060, 616);
				panel_15.setBounds(10, -85200, 1060, 616);
				panel_14.setBounds(10, -85200, 1060, 616);
				panel_13.setBounds(10, -85200, 1060, 616);
				panel_11.setBounds(10, -85200, 1060, 616);
				button_39.setForeground(Color.BLACK);
				button_42.setForeground(Color.GRAY);
				button_40.setForeground(Color.GRAY);
				button_41.setForeground(Color.GRAY);
				button_39.setForeground(Color.GRAY);
				button_39.setFont(new Font("楷体", Font.BOLD, 16));
				button_42.setFont(new Font("楷体", Font.PLAIN, 16));
				button_40.setFont(new Font("楷体", Font.PLAIN, 16));
				button_41.setFont(new Font("楷体", Font.PLAIN, 16));
				button_38.setFont(new Font("楷体", Font.PLAIN, 16));
				button_39.setIcon(new ImageIcon("img/上方菜单 选中.png"));
				button_42.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_40.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_41.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_38.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			}
		});
		
		button_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_11.setBounds(10, 45, 1060, 616);
				panel_15.setBounds(10, -85200, 1060, 616);
				panel_14.setBounds(10, -85200, 1060, 616);
				panel_12.setBounds(10, -85200, 1060, 616);
				panel_13.setBounds(10, -85200, 1060, 616);
				button_38.setForeground(Color.BLACK);
				button_42.setForeground(Color.GRAY);
				button_41.setForeground(Color.GRAY);
				button_39.setForeground(Color.GRAY);
				button_40.setForeground(Color.GRAY);
				button_38.setFont(new Font("楷体", Font.BOLD, 16));
				button_42.setFont(new Font("楷体", Font.PLAIN, 16));
				button_41.setFont(new Font("楷体", Font.PLAIN, 16));
				button_39.setFont(new Font("楷体", Font.PLAIN, 16));
				button_40.setFont(new Font("楷体", Font.PLAIN, 16));
				button_38.setIcon(new ImageIcon("img/上方菜单 选中.png"));
				button_42.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_41.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_39.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_40.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			}
		});
		
		
		//界面二
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(22, -5360000, 1080, 672);
		frame.getContentPane().add(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		
		JLabel label_25 = new JLabel("\u4E0D\u60F3\u505A\u4E86");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setForeground(Color.GRAY);
		label_25.setFont(new Font("楷体", Font.BOLD, 59));
		label_25.setBounds(0, 0, 670, 300);
		panel_2.add(label_25);
		
		// 创建按钮数组
		ButtonGroup bg = new ButtonGroup();
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(164, -85200, 1080, 671);
		frame.getContentPane().add(panel_3);
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		
		JLabel label_3 = new JLabel("\u9009\u62E9\u6240\u5728\u5730\u533A");
		label_3.setForeground(Color.DARK_GRAY);
		label_3.setFont(new Font("楷体", Font.PLAIN, 17));
		label_3.setBounds(10, 10, 179, 33);
		panel_3.add(label_3);
		
		JRadioButton radioButton_4 = new JRadioButton("\u6CB3\u5357\u5206\u90E8");
		radioButton_4.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton_4.setBackground(Color.WHITE);
		radioButton_4.setBounds(10, 49, 121, 23);
		panel_3.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("\u5317\u4EAC\u5206\u90E8");
		radioButton_5.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton_5.setBackground(Color.WHITE);
		radioButton_5.setBounds(131, 49, 121, 23);
		panel_3.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("\u4E0A\u6D77\u5206\u90E8");
		radioButton_6.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton_6.setBackground(Color.WHITE);
		radioButton_6.setBounds(254, 49, 121, 23);
		panel_3.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("\u897F\u5357\u5730\u533A");
		radioButton_7.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton_7.setBackground(Color.WHITE);
		radioButton_7.setBounds(377, 49, 121, 23);
		panel_3.add(radioButton_7);
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(radioButton_7);
		bg1.add(radioButton_6);
		bg1.add(radioButton_5);
		bg1.add(radioButton_4);
		
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(0, -25157, 1080, 514);
		panel_3.add(panel_19);
		panel_19.setLayout(new BorderLayout(0, 0));
		
		table_1 = new JTable();
		table_1.setShowHorizontalLines(false);
		table_1.setShowVerticalLines(false);
		table_1.setSurrendersFocusOnKeystroke(false);
		scrollPane_1 = new JScrollPane();
		panel_19.add(scrollPane_1);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setViewportView(table_1);
		
		
		//销售面板 查询数据库
		JButton button_24 = new JButton("\u786E\u5B9A");
		button_24.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_24.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			Connection con;
			ku k1 = new ku();
			try {
				con = k1.SQLku();
				Statement state = con.createStatement();
				ResultSet rs = null;
				if(radioButton_4.isSelected()) {
					rs = state.executeQuery("select * from xiaoshou_hn");
				}else if(radioButton_5.isSelected()) {
					rs = state.executeQuery("select * from xiaoshou_bj");
				}else if(radioButton_6.isSelected()) {
					rs = state.executeQuery("select * from xiaoshou_sh");
				}else if(radioButton_7.isSelected()) {
					rs = state.executeQuery("select * from xiaoshou_xn");
				}
				rs.last();
				int n = rs.getRow();
				Object[][] s = new Object[n][10];
				int i = 0;
				rs.beforeFirst();
				while(rs.next()) {
					s[i][0] = rs.getString(1);
					s[i][1] = rs.getString(2);
					s[i][2] = rs.getString(3);
					s[i][3] = rs.getString(4);
					s[i][4] = rs.getString(5);
					s[i][5] = rs.getString(6);
					s[i][6] = rs.getString(7);
					s[i][7] = rs.getString(8);
					s[i][8] = rs.getString(9);
					s[i][9] = rs.getString(10);
					i++;
				}
				panel_19.setBounds(0, 157, 1080, 514);
				table_1.setModel(new DefaultTableModel(
						s,
						new String[] {
								"\u7F16\u53F7", "\u4E66\u7C4D\u540D\u79F0", "\u4F5C\u8005", "\u4E66\u7C4D\u7C7B\u522B", "销售\u5355\u53F7", "销售\u4EBA\u5458", "销售\u5355\u4EF7", "销售\u603B\u6570", "销售\u603B\u989D","销售日期"
						}
						));
				
				rs.close();
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			
			}
		});
		button_24.setHorizontalTextPosition(SwingConstants.CENTER);
		button_24.setFont(new Font("楷体", Font.BOLD, 14));
		button_24.setBorderPainted(false);
		button_24.setBounds(503, 49, 93, 23);
		panel_3.add(button_24);
		
		// 刷新数据库
		JButton button_25 = new JButton("\u5237\u65B0");
		button_25.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_25.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			Connection con;
			ku k1 = new ku();
			try {
				con = k1.SQLku();
				Statement state = con.createStatement();
				ResultSet rs = null;
				if(radioButton_4.isSelected()) {
					rs = state.executeQuery("select * from xiaoshou_hn");
				}else if(radioButton_5.isSelected()) {
					rs = state.executeQuery("select * from xiaoshou_bj");
				}else if(radioButton_6.isSelected()) {
					rs = state.executeQuery("select * from xiaoshou_sh");
				}else if(radioButton_7.isSelected()) {
					rs = state.executeQuery("select * from xiaoshou_xn");
				}
				rs.last();
				int n = rs.getRow();
				Object[][] s = new Object[n][10];
				int i = 0;
				rs.beforeFirst();
				while(rs.next()) {
					s[i][0] = rs.getString(1);
					s[i][1] = rs.getString(2);
					s[i][2] = rs.getString(3);
					s[i][3] = rs.getString(4);
					s[i][4] = rs.getString(5);
					s[i][5] = rs.getString(6);
					s[i][6] = rs.getString(7);
					s[i][7] = rs.getString(8);
					s[i][8] = rs.getString(9);
					s[i][9] = rs.getString(10);
					i++;
				}
				table_1.setModel(new DefaultTableModel(
						s,
						new String[] {
								"\u7F16\u53F7", "\u4E66\u7C4D\u540D\u79F0", "\u4F5C\u8005", "\u4E66\u7C4D\u7C7B\u522B", "销售\u5355\u53F7", "销售\u4EBA\u5458", "销售\u5355\u4EF7", "销售\u603B\u6570", "销售\u603B\u989D","销售日期"
						}
						));
				rs.close();
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			
			}
		});
		button_25.setHorizontalTextPosition(SwingConstants.CENTER);
		button_25.setFont(new Font("楷体", Font.BOLD, 14));
		button_25.setBorderPainted(false);
		button_25.setBounds(606, 49, 93, 23);
		panel_3.add(button_25);
		
		
		// 添加销售记录
		JButton button_10 = new JButton("\u6DFB\u52A0\u9500\u552E\u8BB0\u5F55");
		button_10.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton_4.isSelected()) {
					new addcaigou(0,0);
				}else if(radioButton_5.isSelected()) {
					new addcaigou(1,1);
				}else if(radioButton_6.isSelected()) {
					new addcaigou(2,2);
				}else if(radioButton_7.isSelected()) {
					new addcaigou(3,3);
				}
			}
		});
		button_10.setHorizontalTextPosition(SwingConstants.CENTER);
		button_10.setFont(new Font("楷体", Font.BOLD, 14));
		button_10.setBorderPainted(false);
		button_10.setBounds(10, 91, 140, 33);
		panel_3.add(button_10);
		
			
			// 删除销售记录
			JButton button_21 = new JButton("\u5220\u9664\u9500\u552E\u8BB0\u5F55");
			button_21.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(radioButton_4.isSelected()) {
						new chaxun(0,0,0,0);
					}else if(radioButton_5.isSelected()) {
						new chaxun(1,1,1,1);
					}else if(radioButton_6.isSelected()) {
						new chaxun(2,2,2,2);
					}else if(radioButton_7.isSelected()) {
						new chaxun(3,3,3,3);
					}
				}
			});
			button_21.setHorizontalTextPosition(SwingConstants.CENTER);
			button_21.setFont(new Font("楷体", Font.BOLD, 14));
			button_21.setBorderPainted(false);
			button_21.setBounds(183, 91, 140, 33);
			panel_3.add(button_21);
			
			
			//修改销售记录
			JButton button_22 = new JButton("\u4FEE\u6539\u9500\u552E\u8BB0\u5F55");
			button_22.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(radioButton_4.isSelected()) {
						new chaxun(0,0,0,0,0);
					}else if(radioButton_5.isSelected()) {
						new chaxun(1,0,0,0,0);
					}else if(radioButton_6.isSelected()) {
						new chaxun(2,0,0,0,0);
					}else if(radioButton_7.isSelected()) {
						new chaxun(3,0,0,0,0);
					}
				}
			});
			button_22.setHorizontalTextPosition(SwingConstants.CENTER);
			button_22.setFont(new Font("楷体", Font.BOLD, 14));
			button_22.setBorderPainted(false);
			button_22.setBounds(358, 91, 140, 33);
			panel_3.add(button_22);
			
			
			
			
			
			// 查询销售记录
			JButton button_23 = new JButton("\u67E5\u8BE2\u9500\u552E\u8BB0\u5F55");
			button_23.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_23.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(radioButton_4.isSelected()) {
						new chaxun(0,0,1,1,1,1);
					}else if(radioButton_5.isSelected()) {
						new chaxun(1,0,1,1,1,1);
					}else if(radioButton_6.isSelected()) {
						new chaxun(2,2,2,2,2,2);
					}else if(radioButton_7.isSelected()) {
						new chaxun(3,3,3,3,3,3);
					}
				}
			});
			button_23.setHorizontalTextPosition(SwingConstants.CENTER);
			button_23.setFont(new Font("楷体", Font.BOLD, 14));
			button_23.setBorderPainted(false);
			button_23.setBounds(532, 91, 140, 33);
			panel_3.add(button_23);
			
			button_10.setBorderPainted(false);  //设置是否绘制边框
			button_21.setBorderPainted(false);  
			button_22.setBorderPainted(false);  
			button_23.setBorderPainted(false); 
			button_24.setBorderPainted(false);  
			button_25.setBorderPainted(false);
			
			
			//导出销售记录
			JButton button_56 = new JButton("\u5BFC\u51FA");
			button_56.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int m = 0;
					String s1 = null;
					if(radioButton_4.isSelected()) {
						m = 1;
						s1 = "河南分区";
					}else if(radioButton_5.isSelected()) {
						m = 2;
						s1 = "北京分区";
					}else if(radioButton_6.isSelected()) {
						m = 3;
						s1 = "上海分区";
					}else if(radioButton_7.isSelected()) {
						m = 4;
						s1 = "西南分区";
					}
					
					if(m == 0) {
						JOptionPane.showMessageDialog(null, "请选择所在地区！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
					}else {
						
						
						JFrame jf = null;
						FileDialog fd = new FileDialog(jf,"易书导出保存",FileDialog.SAVE);
						fd.setVisible(true);
						fd.setAlwaysOnTop(true);

						

						try {
							BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
									fd.getDirectory()+fd.getFile()+".csv"), "GB2312"), 1024);
							
							String[] s2 = new String[] {
									"\u7F16\u53F7", "\u4E66\u7C4D\u540D\u79F0", "\u4F5C\u8005", "\u4E66\u7C4D\u7C7B\u522B", "销售\u5355\u53F7", "销售\u4EBA\u5458", "销售\u5355\u4EF7", "销售\u603B\u6570", "销售\u603B\u989D","销售日期"
							};
							
							for(int i_1 = 0;i_1<s2.length;i_1++) {
								bw.write(s2[i_1]+",");
							}
							bw.newLine();
							
							Connection con;
							ku k1 = new ku();
							try {
								con = k1.SQLku();
								Statement state = con.createStatement();
								ResultSet rs = null;
								if(radioButton_4.isSelected()) {
									rs = state.executeQuery("select * from xiaoshou_hn");
								}else if(radioButton_5.isSelected()) {
									rs = state.executeQuery("select * from xiaoshou_bj");
								}else if(radioButton_6.isSelected()) {
									rs = state.executeQuery("select * from xiaoshou_sh");
								}else if(radioButton_7.isSelected()) {
									rs = state.executeQuery("select * from xiaoshou_xn");
								}
								rs.last();
								int n = rs.getRow();
								String[][] s = new String[n][10];
								int i = 0;
								rs.beforeFirst();
								while(rs.next()) {
									s[i][0] = rs.getString(1);
									s[i][1] = rs.getString(2);
									s[i][2] = rs.getString(3);
									s[i][3] = rs.getString(4);
									s[i][4] = rs.getString(5);
									s[i][5] = rs.getString(6);
									s[i][6] = rs.getString(7);
									s[i][7] = rs.getString(8);
									s[i][8] = rs.getString(9);
									s[i][9] = rs.getString(10);
									
									for(int i_2=0;i_2<s[i].length;i_2++) {
										if(s[i][i_2]==null)
											s[i][i_2] = " ";
										bw.write(s[i][i_2]+",");
									}
										
									bw.newLine();
									i++;
								}
								rs.close();
								con.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
							
							bw.close();
						} catch (IOException e2) {
							e2.printStackTrace();
						}
						
					}
					
				}
			});
			button_56.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_56.setHorizontalTextPosition(SwingConstants.CENTER);
			button_56.setFont(new Font("楷体", Font.BOLD, 14));
			button_56.setBorderPainted(false);
			button_56.setBounds(682, 96, 93, 23);
			panel_3.add(button_56);
			
			
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(164, -52800, 1080, 671);
		frame.getContentPane().add(panel_4);
		panel_4.setForeground(Color.WHITE);
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		
		JLabel label_2 = new JLabel("\u9009\u62E9\u6240\u5728\u5730\u533A");
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("楷体", Font.PLAIN, 17));
		label_2.setBounds(10, 10, 179, 33);
		panel_4.add(label_2);
		
		JRadioButton radioButton = new JRadioButton("\u6CB3\u5357\u5206\u90E8");
		radioButton.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(10, 49, 121, 23);
		panel_4.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u5317\u4EAC\u5206\u90E8");
		radioButton_1.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(131, 49, 121, 23);
		panel_4.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u4E0A\u6D77\u5206\u90E8");
		radioButton_2.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton_2.setBackground(Color.WHITE);
		radioButton_2.setBounds(254, 49, 121, 23);
		panel_4.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("\u897F\u5357\u5730\u533A");
		radioButton_3.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton_3.setBackground(Color.WHITE);
		radioButton_3.setBounds(377, 49, 121, 23);
		panel_4.add(radioButton_3);
		bg.add(radioButton_3);
		bg.add(radioButton_2);
		bg.add(radioButton_1);
		bg.add(radioButton);
		
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, -25157, 1080, 514);
		panel_4.add(panel_21);
		panel_21.setLayout(new BorderLayout(0, 0));
		
		
		table_2 = new JTable();
		table_2.setShowHorizontalLines(false);
		table_2.setShowVerticalLines(false);
		table_2.setSurrendersFocusOnKeystroke(false);
		scrollPane_2 = new JScrollPane();
		panel_21.add(scrollPane_2, BorderLayout.CENTER);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setViewportView(table_2);
		
		
		//采购面板  连接数据库  查询采购
		
		JButton button_11 = new JButton("\u786E\u5B9A");
		button_11.setFont(new Font("楷体", Font.BOLD, 14));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				ku k1 = new ku();
				try {
					con = k1.SQLku();
					Statement state = con.createStatement();
					ResultSet rs = null;
					if(radioButton.isSelected()) {
						rs = state.executeQuery("select * from caigou_hn");
					}else if(radioButton_1.isSelected()) {
						rs = state.executeQuery("select * from caigou_bj");
					}else if(radioButton_2.isSelected()) {
						rs = state.executeQuery("select * from caigou_sh");
					}else if(radioButton_3.isSelected()) {
						rs = state.executeQuery("select * from caigou_xn");
					}
					rs.last();
					int n = rs.getRow();
					Object[][] s = new Object[n][10];
					int i = 0;
					rs.beforeFirst();
					while(rs.next()) {
						s[i][0] = rs.getString(1);
						s[i][1] = rs.getString(2);
						s[i][2] = rs.getString(3);
						s[i][3] = rs.getString(4);
						s[i][4] = rs.getString(5);
						s[i][5] = rs.getString(6);
						s[i][6] = rs.getString(7);
						s[i][7] = rs.getString(8);
						s[i][8] = rs.getString(9);
						s[i][9] = rs.getString(10);
						i++;
					}
					panel_21.setBounds(0, 157, 1080, 514);
					table_2.setModel(new DefaultTableModel(
							s,
							new String[] {
									"\u7F16\u53F7", "\u4E66\u7C4D\u540D\u79F0", "\u4F5C\u8005", "\u4E66\u7C4D\u7C7B\u522B", "\u91C7\u8D2D\u5355\u53F7", "\u91C7\u8D2D\u4EBA\u5458", "\u91C7\u8D2D\u5355\u4EF7", "\u91C7\u8D2D\u603B\u6570", "\u91C7\u8D2D\u603B\u989D", "采购日期"
							}
							));
					
					
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		button_11.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_11.setBounds(503, 49, 93, 23);
		panel_4.add(button_11);
		// button_11.setBorderPainted(false);
		button_11.setHorizontalTextPosition(SwingConstants.CENTER);
		button_11.setBorderPainted(false);  //设置是否绘制边框
		
		//添加采购记录
		JButton button_14 = new JButton("\u6DFB\u52A0\u91C7\u8D2D\u8BB0\u5F55");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton.isSelected()) {
					addcaigou t1 = new addcaigou(0);
				}else if(radioButton_1.isSelected()) {
					addcaigou t1 = new addcaigou(1);
				}else if(radioButton_2.isSelected()) {
					addcaigou t1 = new addcaigou(2);
				}else if(radioButton_3.isSelected()) {
					addcaigou t1 = new addcaigou(3);
				}
				
			}
		});
		button_14.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_14.setFont(new Font("楷体", Font.BOLD, 14));
		button_14.setBounds(10, 91, 140, 33);
		panel_4.add(button_14);
		button_14.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button_14.setBorderPainted(false);  //设置是否绘制边框
		
		//删除采购记录
		JButton button_17 = new JButton("\u5220\u9664\u91C7\u8D2D\u8BB0\u5F55");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton.isSelected()) {
					chaxun t1 = new chaxun(0);
				}else if(radioButton_1.isSelected()) {
					chaxun t1 = new chaxun(1);
				}else if(radioButton_2.isSelected()) {
					chaxun t1 = new chaxun(2);
				}else if(radioButton_3.isSelected()) {
					chaxun t1 = new chaxun(3);
				}
			}
		});
		button_17.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_17.setFont(new Font("楷体", Font.BOLD, 14));
		button_17.setBounds(183, 91, 140, 33);
		panel_4.add(button_17);
		button_17.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button_17.setBorderPainted(false);  //设置是否绘制边框
		
		//修改采购记录
		JButton button_18 = new JButton("\u4FEE\u6539\u91C7\u8D2D\u8BB0\u5F55");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton.isSelected()) {
					new chaxun(0,0,0);
				}else if(radioButton_1.isSelected()) {
					new chaxun(0,0,1);
				}else if(radioButton_2.isSelected()) {
					new chaxun(0,0,2);
				}else if(radioButton_3.isSelected()) {
					new chaxun(0,0,3);
				}
			}
		});
		button_18.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_18.setFont(new Font("楷体", Font.BOLD, 14));
		button_18.setBounds(358, 91, 140, 33);
		panel_4.add(button_18);
		button_18.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button_18.setBorderPainted(false);  //设置是否绘制边框
		
		// 刷新数据库
		JButton button_19 = new JButton("\u5237\u65B0");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				ku k1 = new ku();
				try {
					con = k1.SQLku();
					Statement state = con.createStatement();
					ResultSet rs = null;
					if(radioButton.isSelected()) {
						rs = state.executeQuery("select * from caigou_hn");
					}else if(radioButton_1.isSelected()) {
						rs = state.executeQuery("select * from caigou_bj");
					}else if(radioButton_2.isSelected()) {
						rs = state.executeQuery("select * from caigou_sh");
					}else if(radioButton_3.isSelected()) {
						rs = state.executeQuery("select * from caigou_xn");
					}
					rs.last();
					int n = rs.getRow();
					Object[][] s = new Object[n][10];
					int i = 0;
					rs.beforeFirst();
					while(rs.next()) {
						s[i][0] = rs.getString(1);
						s[i][1] = rs.getString(2);
						s[i][2] = rs.getString(3);
						s[i][3] = rs.getString(4);
						s[i][4] = rs.getString(5);
						s[i][5] = rs.getString(6);
						s[i][6] = rs.getString(7);
						s[i][7] = rs.getString(8);
						s[i][8] = rs.getString(9);
						s[i][9] = rs.getString(10);
						i++;
					}
					table_2.setModel(new DefaultTableModel(
							s,
							new String[] {
									"\u7F16\u53F7", "\u4E66\u7C4D\u540D\u79F0", "\u4F5C\u8005", "\u4E66\u7C4D\u7C7B\u522B", "\u91C7\u8D2D\u5355\u53F7", "\u91C7\u8D2D\u4EBA\u5458", "\u91C7\u8D2D\u5355\u4EF7", "\u91C7\u8D2D\u603B\u6570", "\u91C7\u8D2D\u603B\u989D", "采购日期"
							}
							));
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		button_19.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_19.setHorizontalTextPosition(SwingConstants.CENTER);
		button_19.setFont(new Font("楷体", Font.BOLD, 14));
		button_19.setBounds(606, 49, 93, 23);
		panel_4.add(button_19);
		button_19.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置\
		button_19.setBorderPainted(false);  //设置是否绘制边框
		
		//查询采购记录
		JButton button_20 = new JButton("\u67E5\u8BE2\u91C7\u8D2D\u8BB0\u5F55");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton.isSelected()) {
					new chaxun(0,0);
				}else if(radioButton_1.isSelected()) {
					new chaxun(0,1);
				}else if(radioButton_2.isSelected()) {
					new chaxun(0,2);
				}else if(radioButton_3.isSelected()) {
					new chaxun(0,3);
				}
			}
		});
		button_20.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_20.setHorizontalTextPosition(SwingConstants.CENTER);
		button_20.setFont(new Font("楷体", Font.BOLD, 14));
		button_20.setBorderPainted(false);
		button_20.setBounds(532, 91, 140, 33);
		panel_4.add(button_20);
		button_20.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置\
		button_20.setBorderPainted(false);  //设置是否绘制边框
		
		//导出采购记录
		JButton button_55 = new JButton("\u5BFC\u51FA");
		button_55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int m = 0;
				String s1 = null;
				if(radioButton.isSelected()) {
					m = 1;
					s1 = "河南分区";
				}else if(radioButton_1.isSelected()) {
					m = 2;
					s1 = "北京分区";
				}else if(radioButton_2.isSelected()) {
					m = 3;
					s1 = "上海分区";
				}else if(radioButton_3.isSelected()) {
					m = 4;
					s1 = "西南分区";
				}
				
				if(m == 0) {
					JOptionPane.showMessageDialog(null, "请选择所在地区！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
				}else {
					
					
					JFrame jf = null;
					FileDialog fd = new FileDialog(jf,"title",FileDialog.SAVE);
					fd.setVisible(true);
					fd.setAlwaysOnTop(true);

					

					try {
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
								fd.getDirectory()+fd.getFile()+".csv"), "GB2312"), 1024);
						
						String[] s2 = new String[] {
								"\u7F16\u53F7", "\u4E66\u7C4D\u540D\u79F0", "\u4F5C\u8005", "\u4E66\u7C4D\u7C7B\u522B", "\u91C7\u8D2D\u5355\u53F7", "\u91C7\u8D2D\u4EBA\u5458", "\u91C7\u8D2D\u5355\u4EF7", "\u91C7\u8D2D\u603B\u6570", "\u91C7\u8D2D\u603B\u989D", "采购日期"
						};
						
						for(int i_1 = 0;i_1<s2.length;i_1++) {
							bw.write(s2[i_1]+",");
						}
						bw.newLine();
						
						Connection con;
						ku k1 = new ku();
						try {
							con = k1.SQLku();
							Statement state = con.createStatement();
							ResultSet rs = null;
							if(radioButton.isSelected()) {
								rs = state.executeQuery("select * from caigou_hn");
							}else if(radioButton_1.isSelected()) {
								rs = state.executeQuery("select * from caigou_bj");
							}else if(radioButton_2.isSelected()) {
								rs = state.executeQuery("select * from caigou_sh");
							}else if(radioButton_3.isSelected()) {
								rs = state.executeQuery("select * from caigou_xn");
							}
							rs.last();
							int n = rs.getRow();
							String[][] s = new String[n][10];
							int i = 0;
							rs.beforeFirst();
							while(rs.next()) {
								s[i][0] = rs.getString(1);
								s[i][1] = rs.getString(2);
								s[i][2] = rs.getString(3);
								s[i][3] = rs.getString(4);
								s[i][4] = rs.getString(5);
								s[i][5] = rs.getString(6);
								s[i][6] = rs.getString(7);
								s[i][7] = rs.getString(8);
								s[i][8] = rs.getString(9);
								s[i][9] = rs.getString(10);
								
								for(int i_2=0;i_2<s[i].length;i_2++) {
									if(s[i][i_2]==null)
										s[i][i_2] = " ";
									bw.write(s[i][i_2]+",");
								}
									
								bw.newLine();
								i++;
							}
							rs.close();
							con.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						bw.close();
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					
				}
				
			}
		});
		button_55.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_55.setHorizontalTextPosition(SwingConstants.CENTER);
		button_55.setFont(new Font("楷体", Font.BOLD, 14));
		button_55.setBorderPainted(false);
		button_55.setBounds(682, 96, 93, 23);
		panel_4.add(button_55);
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(164, -522100, 1080, 671);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label_26 = new JLabel("\u4E0D\u60F3\u505A\u4E86");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setForeground(Color.GRAY);
		label_26.setFont(new Font("楷体", Font.BOLD, 59));
		label_26.setBounds(0, 0, 670, 300);
		panel_5.add(label_26);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(164, -85200, 1080, 671);
		frame.getContentPane().add(panel_6);
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		
		JLabel label_5 = new JLabel("\u9009\u62E9\u6240\u5728\u5730\u533A");
		label_5.setForeground(Color.DARK_GRAY);
		label_5.setFont(new Font("楷体", Font.PLAIN, 17));
		label_5.setBounds(10, 10, 179, 33);
		panel_6.add(label_5);
		
		JRadioButton radioButton_12 = new JRadioButton("\u4F9B\u8D27\u5546");
		radioButton_12.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton_12.setBackground(Color.WHITE);
		radioButton_12.setBounds(10, 49, 121, 23);
		panel_6.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("\u7ECF\u9500\u5546");
		radioButton_13.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton_13.setBackground(Color.WHITE);
		radioButton_13.setBounds(131, 49, 121, 23);
		panel_6.add(radioButton_13);
		
		JRadioButton radioButton_15 = new JRadioButton("\u5206\u533A\u5458\u5DE5");
		radioButton_15.setFont(new Font("楷体", Font.BOLD, 14));
		radioButton_15.setBackground(Color.WHITE);
		radioButton_15.setBounds(377, 49, 121, 23);
		panel_6.add(radioButton_15);
		
		// 创建按钮数组
		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(radioButton_12);
		bg3.add(radioButton_13);
		bg3.add(radioButton_15);
		
		table_3 = new JTable();
		table_3.setShowHorizontalLines(false);
		table_3.setShowVerticalLines(false);
		table_3.setSurrendersFocusOnKeystroke(false);
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(0, -25157, 1080, 514);
		panel_6.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));
		scrollPane_3 = new JScrollPane();
		panel_20.add(scrollPane_3);
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setViewportView(table_3);
		
		
		//人员管理面板  查询数据库
		JButton button_15 = new JButton("\u786E\u5B9A");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Connection con;
				ku k1 = new ku();
				try {
					Object[][] s = null;
					con = k1.SQLku();
					Statement state = con.createStatement();
					ResultSet rs = null;
					if(radioButton_12.isSelected()) {
						rs = state.executeQuery("select * from gonghuoshang");
						rs.last();
						int n = rs.getRow();
						s = new Object[n][10];
						int i = 0;
						rs.beforeFirst();
						while(rs.next()) {
							s[i][0] = rs.getString(1);
							s[i][1] = rs.getString(2);
							s[i][2] = rs.getString(3);
							s[i][3] = rs.getString(4);
							s[i][4] = rs.getString(5);
							s[i][5] = rs.getString(6);
							s[i][6] = rs.getString(7);
							s[i][7] = rs.getString(8);
							s[i][8] = rs.getString(9);
							s[i][9] = rs.getString(10);
							i++;
						}
						panel_20.setBounds(0, 157, 1080, 514);
						table_3.setModel(new DefaultTableModel(
								s,
								new String[] {
										"编号", "名称", "联系方式", "地址", "电子邮箱", "供货商负责人", "性别",  "联系方式", "收款银行", "银行账号"
								}
								));
					}else if(radioButton_13.isSelected()) {
						rs = state.executeQuery("select * from jingxiaoshang");
						rs.last();
						int n = rs.getRow();
						s = new Object[n][10];
						int i = 0;
						rs.beforeFirst();
						while(rs.next()) {
							s[i][0] = rs.getString(1);
							s[i][1] = rs.getString(2);
							s[i][2] = rs.getString(3);
							s[i][3] = rs.getString(4);
							s[i][4] = rs.getString(5);
							s[i][5] = rs.getString(6);
							s[i][6] = rs.getString(7);
							s[i][7] = rs.getString(8);
							s[i][8] = rs.getString(9);
							s[i][9] = rs.getString(10);
							i++;
						}
						panel_20.setBounds(0, 157, 1080, 514);
						table_3.setModel(new DefaultTableModel(
								s,
								new String[] {
										"编号", "名称", "联系方式", "地址", "电子邮箱", "地区邮编", "经销商负责人", "性别",  "联系方式","负责分区"
								}
								));
					}else if(radioButton_15.isSelected()) {
						rs = state.executeQuery("select * from fenquyuangong");
						rs.last();
						int n = rs.getRow();
						s = new Object[n][10];
						int i = 0;
						rs.beforeFirst();
						while(rs.next()) {
							s[i][0] = rs.getString(1);
							s[i][1] = rs.getString(2);
							s[i][2] = rs.getString(3);
							s[i][3] = rs.getString(4);
							s[i][4] = rs.getString(5);
							s[i][5] = rs.getString(6);
							s[i][6] = rs.getString(7);
							s[i][7] = rs.getString(8);
							s[i][8] = rs.getString(9);
							s[i][9] = rs.getString(10);
							i++;
						}
						panel_20.setBounds(0, 157, 1080, 514);
						table_3.setModel(new DefaultTableModel(
								s,
								new String[] {
										"工号", "性别", "姓名", "工龄", "职位", "薪资", "联系方式", "电子邮箱", "所属分区", "银行卡号"
								}
								));
					}
					
					
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		button_15.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_15.setHorizontalTextPosition(SwingConstants.CENTER);
		button_15.setFont(new Font("楷体", Font.BOLD, 14));
		button_15.setBorderPainted(false);
		button_15.setBounds(503, 49, 93, 23);
		panel_6.add(button_15);
		
		
		//刷讯数据库
		JButton button_31 = new JButton("\u5237\u65B0");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con;
				ku k1 = new ku();
				try {
					Object[][] s = null;
					JTable table = new JTable();
					con = k1.SQLku();
					Statement state = con.createStatement();
					ResultSet rs = null;
					if(radioButton_12.isSelected()) {
						rs = state.executeQuery("select * from gonghuoshang");
						rs.last();
						int n = rs.getRow();
						s = new Object[n][10];
						int i = 0;
						rs.beforeFirst();
						while(rs.next()) {
							s[i][0] = rs.getString(1);
							s[i][1] = rs.getString(2);
							s[i][2] = rs.getString(3);
							s[i][3] = rs.getString(4);
							s[i][4] = rs.getString(5);
							s[i][5] = rs.getString(6);
							s[i][6] = rs.getString(7);
							s[i][7] = rs.getString(8);
							s[i][8] = rs.getString(9);
							s[i][9] = rs.getString(10);
							i++;
						}
						table_3.setModel(new DefaultTableModel(
								s,
								new String[] {
										"编号", "名称", "联系方式", "地址", "电子邮箱", "供货商负责人", "性别",  "联系方式", "收款银行", "银行账号"
								}
								));
					}else if(radioButton_13.isSelected()) {
						rs = state.executeQuery("select * from jingxiaoshang");
						rs.last();
						int n = rs.getRow();
						s = new Object[n][10];
						int i = 0;
						rs.beforeFirst();
						while(rs.next()) {
							s[i][0] = rs.getString(1);
							s[i][1] = rs.getString(2);
							s[i][2] = rs.getString(3);
							s[i][3] = rs.getString(4);
							s[i][4] = rs.getString(5);
							s[i][5] = rs.getString(6);
							s[i][6] = rs.getString(7);
							s[i][7] = rs.getString(8);
							s[i][8] = rs.getString(9);
							s[i][9] = rs.getString(10);
							i++;
						}
						table_3.setModel(new DefaultTableModel(
								s,
								new String[] {
										"编号", "名称", "联系方式", "地址", "电子邮箱", "地区邮编", "经销商负责人", "性别",  "联系方式","负责分区"
								}
								));
					}else if(radioButton_15.isSelected()) {
						rs = state.executeQuery("select * from fenquyuangong");
						rs.last();
						int n = rs.getRow();
						s = new Object[n][10];
						int i = 0;
						rs.beforeFirst();
						while(rs.next()) {
							s[i][0] = rs.getString(1);
							s[i][1] = rs.getString(2);
							s[i][2] = rs.getString(3);
							s[i][3] = rs.getString(4);
							s[i][4] = rs.getString(5);
							s[i][5] = rs.getString(6);
							s[i][6] = rs.getString(7);
							s[i][7] = rs.getString(8);
							s[i][8] = rs.getString(9);
							s[i][9] = rs.getString(10);
							i++;
						}
						table_3.setModel(new DefaultTableModel(
								s,
								new String[] {
										"工号", "性别", "姓名", "工龄", "职位", "薪资", "联系方式", "电子邮箱", "所属分区", "银行卡号"
								}
								));
					}
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		button_31.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_31.setHorizontalTextPosition(SwingConstants.CENTER);
		button_31.setFont(new Font("楷体", Font.BOLD, 14));
		button_31.setBorderPainted(false);
		button_31.setBounds(606, 49, 93, 23);
		panel_6.add(button_31);
		
		
		//添加人员记录
		JButton button_32 = new JButton("\u6DFB\u52A0\u4EBA\u5458\u8BB0\u5F55");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton_12.isSelected()) {
					new addcaigou(0,0,0,0);
				}else if(radioButton_13.isSelected()) {
					new addcaigou(1,0,0,0);
				}else if(radioButton_15.isSelected()) {
					new addcaigou(3,0,0,0);
				}
			}
		});
		button_32.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_32.setHorizontalTextPosition(SwingConstants.CENTER);
		button_32.setFont(new Font("楷体", Font.BOLD, 14));
		button_32.setBorderPainted(false);
		button_32.setBounds(10, 91, 140, 33);
		panel_6.add(button_32);
		
		//删除人员记录
		JButton button_33 = new JButton("\u5220\u9664\u4EBA\u5458\u8BB0\u5F55");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton_12.isSelected()) {
					chaxun t1 = new chaxun(0,0,0,0,0,0,0,0,0,0);
				}else if(radioButton_13.isSelected()) {
					chaxun t1 = new chaxun(1,0,0,0,0,0,0,0,0,0);
				}else if(radioButton_15.isSelected()) {
					chaxun t1 = new chaxun(3,0,0,0,0,0,0,0,0,0);
				}
				
			}
		});
		button_33.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_33.setHorizontalTextPosition(SwingConstants.CENTER);
		button_33.setFont(new Font("楷体", Font.BOLD, 14));
		button_33.setBorderPainted(false);
		button_33.setBounds(183, 91, 140, 33);
		panel_6.add(button_33);
		
		//修改人员记录
		JButton button_34 = new JButton("\u4FEE\u6539\u4EBA\u5458\u8BB0\u5F55");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton_12.isSelected()) {
					new chaxun(0,0,0,0,0,0,0,0,0,0,0);
				}else if(radioButton_13.isSelected()) {
					new chaxun(1,0,0,0,0,0,0,0,0,0,0);
				}else if(radioButton_15.isSelected()) {
					new chaxun(3,0,0,0,0,0,0,0,0,0,0);
				}
			}
		});
		button_34.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_34.setHorizontalTextPosition(SwingConstants.CENTER);
		button_34.setFont(new Font("楷体", Font.BOLD, 14));
		button_34.setBorderPainted(false);
		button_34.setBounds(358, 91, 140, 33);
		panel_6.add(button_34);
		
		JButton button_35 = new JButton("\u67E5\u8BE2\u4EBA\u5458\u8BB0\u5F55");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton_12.isSelected()) {
					new chaxun(0,0,0,0,0,0,0,0,0,0,0,0);
				}else if(radioButton_13.isSelected()) {
					new chaxun(0,1,0,0,0,0,0,0,0,0,0,0);
				}else if(radioButton_15.isSelected()) {
					new chaxun(0,3,0,0,0,0,0,0,0,0,0,0);
				}
				
			}
		});
		button_35.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_35.setHorizontalTextPosition(SwingConstants.CENTER);
		button_35.setFont(new Font("楷体", Font.BOLD, 14));
		button_35.setBorderPainted(false);
		button_35.setBounds(532, 91, 140, 33);
		panel_6.add(button_35);
		
		
		//导出人员记录
		JButton button_58 = new JButton("\u5BFC\u51FA");
		button_58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int m = 0;
				String s1 = null;
				if(radioButton_12.isSelected()) {
					m = 1;
					s1 = "河南分区";
				}else if(radioButton_13.isSelected()) {
					m = 2;
					s1 = "北京分区";
				}else if(radioButton_15.isSelected()) {
					m = 3;
					s1 = "上海分区";
				}
				
				if(m == 0) {
					JOptionPane.showMessageDialog(null, "请选择所在地区！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
				}else {
					
					
					JFrame jf = null;
					FileDialog fd = new FileDialog(jf,"易书导出保存",FileDialog.SAVE);
					fd.setVisible(true);
					fd.setAlwaysOnTop(true);

					

					try {
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
								fd.getDirectory()+fd.getFile()+".csv"), "GB2312"), 1024);
						
						
						Connection con;                                                                               
						ku k1 = new ku();
						try {
							Object[][] s = null;
							JTable table = new JTable();
							con = k1.SQLku();
							Statement state = con.createStatement();
							ResultSet rs = null;
							if(radioButton_12.isSelected()) {
								
								String[] s2 = new String[] {
										"编号", "名称", "联系方式", "地址", "电子邮箱", "供货商负责人", "性别",  "联系方式", "收款银行", "银行账号"
								};
								
								for(int i_1 = 0;i_1<s2.length;i_1++) {
									bw.write(s2[i_1]+",");
								}
								bw.newLine();
								
								rs = state.executeQuery("select * from gonghuoshang");
								rs.last();
								int n = rs.getRow();
								s = new Object[n][10];
								int i = 0;
								rs.beforeFirst();
								while(rs.next()) {
									s[i][0] = rs.getString(1);
									s[i][1] = rs.getString(2);
									s[i][2] = rs.getString(3);
									s[i][3] = rs.getString(4);
									s[i][4] = rs.getString(5);
									s[i][5] = rs.getString(6);
									s[i][6] = rs.getString(7);
									s[i][7] = rs.getString(8);
									s[i][8] = rs.getString(9);
									s[i][9] = rs.getString(10);
									
									for(int i_1 = 0;i_1<s[i].length;i_1++) {
										bw.write(s[i][i_1]+",");
									}
									bw.newLine();
									
									i++;
								}
										
							}else if(radioButton_13.isSelected()) {
								
								String[] s2 = new String[] {
										"编号", "名称", "联系方式", "地址", "电子邮箱", "供货商负责人", "性别",  "联系方式", "收款银行", "银行账号"
								};
								
								for(int i_1 = 0;i_1<s2.length;i_1++) {
									bw.write(s2[i_1]+",");
								}
								bw.newLine();
								
								rs = state.executeQuery("select * from jingxiaoshang");
								rs.last();
								int n = rs.getRow();
								s = new Object[n][10];
								int i = 0;
								rs.beforeFirst();
								while(rs.next()) {
									s[i][0] = rs.getString(1);
									s[i][1] = rs.getString(2);
									s[i][2] = rs.getString(3);
									s[i][3] = rs.getString(4);
									s[i][4] = rs.getString(5);
									s[i][5] = rs.getString(6);
									s[i][6] = rs.getString(7);
									s[i][7] = rs.getString(8);
									s[i][8] = rs.getString(9);
									s[i][9] = rs.getString(10);
									
									for(int i_1 = 0;i_1<s[i].length;i_1++) {
										bw.write(s[i][i_1]+",");
									}
									bw.newLine();
									
									i++;
								}
							}else if(radioButton_15.isSelected()) {
								
								String[] s2 = new String[] {
										"工号", "性别", "姓名", "工龄", "职位", "薪资", "联系方式", "电子邮箱", "所属分区", "银行卡号"
								};
								
								for(int i_1 = 0;i_1<s2.length;i_1++) {
									bw.write(s2[i_1]+",");
								}
								bw.newLine();
								
								rs = state.executeQuery("select * from fenquyuangong");
								rs.last();
								int n = rs.getRow();
								s = new Object[n][10];
								int i = 0;
								rs.beforeFirst();
								while(rs.next()) {
									s[i][0] = rs.getString(1);
									s[i][1] = rs.getString(2);
									s[i][2] = rs.getString(3);
									s[i][3] = rs.getString(4);
									s[i][4] = rs.getString(5);
									s[i][5] = rs.getString(6);
									s[i][6] = rs.getString(7);
									s[i][7] = rs.getString(8);
									s[i][8] = rs.getString(9);
									s[i][9] = rs.getString(10);
									
									for(int i_1 = 0;i_1<s[i].length;i_1++) {
										bw.write(s[i][i_1]+",");
									}
									bw.newLine();
									
									i++;
								}
							}
							rs.close();
							con.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						bw.close();
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					
				}
				
			}
		});
		button_58.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_58.setHorizontalTextPosition(SwingConstants.CENTER);
		button_58.setFont(new Font("楷体", Font.BOLD, 14));
		button_58.setBorderPainted(false);
		button_58.setBounds(682, 96, 93, 23);
		panel_6.add(button_58);
		
				
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(164, -85200, 1080, 671);
		frame.getContentPane().add(panel_7);
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		
			
			JLabel label_4 = new JLabel("\u9009\u62E9\u6240\u5728\u5730\u533A");
			label_4.setForeground(Color.DARK_GRAY);
			label_4.setFont(new Font("楷体", Font.PLAIN, 17));
			label_4.setBounds(10, 10, 179, 33);
			panel_7.add(label_4);
			
			JRadioButton radioButton_8 = new JRadioButton("\u6CB3\u5357\u5206\u90E8");
			radioButton_8.setFont(new Font("楷体", Font.BOLD, 14));
			radioButton_8.setBackground(Color.WHITE);
			radioButton_8.setBounds(10, 49, 121, 23);
			panel_7.add(radioButton_8);
			
			JRadioButton radioButton_9 = new JRadioButton("\u5317\u4EAC\u5206\u90E8");
			radioButton_9.setFont(new Font("楷体", Font.BOLD, 14));
			radioButton_9.setBackground(Color.WHITE);
			radioButton_9.setBounds(131, 49, 121, 23);
			panel_7.add(radioButton_9);
			
			JRadioButton radioButton_10 = new JRadioButton("\u4E0A\u6D77\u5206\u90E8");
			radioButton_10.setFont(new Font("楷体", Font.BOLD, 14));
			radioButton_10.setBackground(Color.WHITE);
			radioButton_10.setBounds(254, 49, 121, 23);
			panel_7.add(radioButton_10);
			
			JRadioButton radioButton_11 = new JRadioButton("\u897F\u5357\u5730\u533A");
			radioButton_11.setFont(new Font("楷体", Font.BOLD, 14));
			radioButton_11.setBackground(Color.WHITE);
			radioButton_11.setBounds(377, 49, 121, 23);
			panel_7.add(radioButton_11);
			

			// 创建按钮数组
			ButtonGroup bg2 = new ButtonGroup();
			bg2.add(radioButton_8);
			bg2.add(radioButton_9);
			bg2.add(radioButton_10);
			bg2.add(radioButton_11);
			
			
			//库存管理面板
			JButton button_13 = new JButton("\u786E\u5B9A");
			button_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Connection con;
					ku k1 = new ku();
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						ResultSet rs = null;
						if(radioButton_8.isSelected()) {
							rs = state.executeQuery("select * from kucun_hn");
						}else if(radioButton_9.isSelected()) {
							rs = state.executeQuery("select * from kucun_bj");
						}else if(radioButton_10.isSelected()) {
							rs = state.executeQuery("select * from kucun_sh");
						}else if(radioButton_11.isSelected()) {
							rs = state.executeQuery("select * from kucun_xn");
						}
						rs.last();
						int n = rs.getRow();
						Object[][] s = new Object[n][9];
						int i = 0;
						rs.beforeFirst();
						while(rs.next()) {
							s[i][0] = rs.getString(1);
							s[i][1] = rs.getString(2);
							s[i][2] = rs.getString(3);
							s[i][3] = rs.getString(4);
							s[i][4] = rs.getString(5);
							s[i][5] = rs.getString(6);
							s[i][6] = rs.getString(7);
							s[i][7] = rs.getString(8);
							i++;
						}
						JTable table = new JTable();
						table.setModel(new DefaultTableModel(
								s,
								new String[] {
										"编号", "书籍名称", "销售总数", "销售额", "库存总数", "库总总额", "采购日期", "畅销度"
								}
								));
						table.getColumnModel().getColumn(0).setPreferredWidth(15);
						table.getColumnModel().getColumn(0).setMinWidth(0);
						table.getColumnModel().getColumn(1).setPreferredWidth(120);
						table.getColumnModel().getColumn(2).setPreferredWidth(87);
						table.getColumnModel().getColumn(3).setPreferredWidth(91);
						table.getColumnModel().getColumn(4).setPreferredWidth(113);
						table.setShowHorizontalLines(false);
						table.setShowVerticalLines(false);
						table.setSurrendersFocusOnKeystroke(false);
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
						scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						scrollPane.setViewportView(table);
						scrollPane.setBounds(0, 152, 1080, 519);
						panel_7.add(scrollPane);
						rs.close();
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
			});
			button_13.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_13.setHorizontalTextPosition(SwingConstants.CENTER);
			button_13.setFont(new Font("楷体", Font.BOLD, 14));
			button_13.setBorderPainted(false);
			button_13.setBounds(503, 49, 93, 23);
			panel_7.add(button_13);
			
			// 刷新库存记录
			JButton button_26 = new JButton("\u5237\u65B0");
			button_26.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					Connection con;
					ku k1 = new ku();
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						ResultSet rs = null;
						if(radioButton_8.isSelected()) {
							rs = state.executeQuery("select * from kucun_hn");
						}else if(radioButton_9.isSelected()) {
							rs = state.executeQuery("select * from kucun_bj");
						}else if(radioButton_10.isSelected()) {
							rs = state.executeQuery("select * from kucun_sh");
						}else if(radioButton_11.isSelected()) {
							rs = state.executeQuery("select * from kucun_xn");
						}
						rs.last();
						int n = rs.getRow();
						Object[][] s = new Object[n][9];
						int i = 0;
						rs.beforeFirst();
						while(rs.next()) {
							s[i][0] = rs.getString(1);
							s[i][1] = rs.getString(2);
							s[i][2] = rs.getString(3);
							s[i][3] = rs.getString(4);
							s[i][4] = rs.getString(5);
							s[i][5] = rs.getString(6);
							s[i][6] = rs.getString(7);
							s[i][7] = rs.getString(8);
							i++;
						}
						JTable table = new JTable();
						table.setModel(new DefaultTableModel(
								s,
								new String[] {
										"编号", "书籍名称", "销售总数", "销售额", "库存总数", "库总总额", "采购日期", "畅销度"
								}
								));
						table.getColumnModel().getColumn(0).setPreferredWidth(15);
						table.getColumnModel().getColumn(0).setMinWidth(0);
						table.getColumnModel().getColumn(1).setPreferredWidth(120);
						table.getColumnModel().getColumn(2).setPreferredWidth(87);
						table.getColumnModel().getColumn(3).setPreferredWidth(91);
						table.getColumnModel().getColumn(4).setPreferredWidth(113);
						table.setShowHorizontalLines(false);
						table.setShowVerticalLines(false);
						table.setSurrendersFocusOnKeystroke(false);
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
						scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						scrollPane.setViewportView(table);
						scrollPane.setBounds(0, 152, 1080, 519);
						panel_7.add(scrollPane);
						rs.close();
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					
				}
			});
			button_26.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_26.setHorizontalTextPosition(SwingConstants.CENTER);
			button_26.setFont(new Font("楷体", Font.BOLD, 14));
			button_26.setBorderPainted(false);
			button_26.setBounds(606, 49, 93, 23);
			panel_7.add(button_26);
			
			
			
			//添加库存记录
			JButton button_27 = new JButton("\u6DFB\u52A0\u5E93\u5B58\u8BB0\u5F55");
			button_27.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(radioButton_8.isSelected()) {
						new addcaigou(0,0,0);
					}else if(radioButton_9.isSelected()) {
						new addcaigou(1,0,0);
					}else if(radioButton_10.isSelected()) {
						new addcaigou(2,0,0);
					}else if(radioButton_11.isSelected()) {
						new addcaigou(3,0,0);
					}
				}
			});
			button_27.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_27.setHorizontalTextPosition(SwingConstants.CENTER);
			button_27.setFont(new Font("楷体", Font.BOLD, 14));
			button_27.setBorderPainted(false);
			button_27.setBounds(10, 91, 140, 33);
			panel_7.add(button_27);
			
			
			//删除库存记录
			JButton button_28 = new JButton("\u5220\u9664\u5E93\u5B58\u8BB0\u5F55");
			button_28.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(radioButton_8.isSelected()) {
						chaxun t1 = new chaxun(0,0,0,0,0,0,0);
					}else if(radioButton_9.isSelected()) {
						chaxun t1 = new chaxun(1,0,0,0,0,0,0);
					}else if(radioButton_10.isSelected()) {
						chaxun t1 = new chaxun(2,0,0,0,0,0,0);
					}else if(radioButton_11.isSelected()) {
						chaxun t1 = new chaxun(3,0,0,0,0,0,0);
					}
				}
			});
			button_28.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_28.setHorizontalTextPosition(SwingConstants.CENTER);
			button_28.setFont(new Font("楷体", Font.BOLD, 14));
			button_28.setBorderPainted(false);
			button_28.setBounds(183, 91, 140, 33);
			panel_7.add(button_28);
			
			
			//修改库存记录
			JButton button_29 = new JButton("\u4FEE\u6539\u5E93\u5B58\u8BB0\u5F55");
			button_29.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(radioButton_8.isSelected()) {
						new chaxun(0,0,0,0,0,0,0,0);
					}else if(radioButton_9.isSelected()) {
						new chaxun(0,0,1,0,0,0,0,0);
					}else if(radioButton_10.isSelected()) {
						new chaxun(0,0,2,0,0,0,0,0);
					}else if(radioButton_11.isSelected()) {
						new chaxun(0,0,3,0,0,0,0,0);
					}
					
				}
			});
			button_29.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_29.setHorizontalTextPosition(SwingConstants.CENTER);
			button_29.setFont(new Font("楷体", Font.BOLD, 14));
			button_29.setBorderPainted(false);
			button_29.setBounds(358, 91, 140, 33);
			panel_7.add(button_29);
			
			JButton button_30 = new JButton("\u67E5\u8BE2\u5E93\u5B58\u8BB0\u5F55");
			button_30.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(radioButton_8.isSelected()) {
						new chaxun(0,0,0,0,0,0,0,0,0);
					}else if(radioButton_9.isSelected()) {
						new chaxun(0,1,0,0,0,0,0,0,0);
					}else if(radioButton_10.isSelected()) {
						new chaxun(0,2,0,0,0,0,0,0,0);
					}else if(radioButton_11.isSelected()) {
						new chaxun(0,3,0,0,0,0,0,0,0);
					}
					
				}
			});
			button_30.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_30.setHorizontalTextPosition(SwingConstants.CENTER);
			button_30.setFont(new Font("楷体", Font.BOLD, 14));
			button_30.setBorderPainted(false);
			button_30.setBounds(532, 91, 140, 33);
			panel_7.add(button_30);
			
			
			//库存导出
			JButton button_57 = new JButton("\u5BFC\u51FA");
			button_57.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int m = 0;
					String s1 = null;
					if(radioButton_8.isSelected()) {
						m = 1;
						s1 = "河南分区";
					}else if(radioButton_9.isSelected()) {
						m = 2;
						s1 = "北京分区";
					}else if(radioButton_10.isSelected()) {
						m = 3;
						s1 = "上海分区";
					}else if(radioButton_11.isSelected()) {
						m = 4;
						s1 = "西南分区";
					}
					
					if(m == 0) {
						JOptionPane.showMessageDialog(null, "请选择所在地区！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
					}else {
						
						
						JFrame jf = null;
						FileDialog fd = new FileDialog(jf,"易书导出保存",FileDialog.SAVE);
						fd.setVisible(true);
						fd.setAlwaysOnTop(true);

						

						try {
							BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
									fd.getDirectory()+fd.getFile()+".csv"), "GB2312"), 1024);
							
							String[] s2 = new String[] {
									"编号", "书籍名称", "销售总数", "销售额", "库存总数", "库总总额", "采购日期", "畅销度"
							};
							
							for(int i_1 = 0;i_1<s2.length;i_1++) {
								bw.write(s2[i_1]+",");
							}
							bw.newLine();
							
							Connection con;
							ku k1 = new ku();
							try {
								con = k1.SQLku();
								Statement state = con.createStatement();
								ResultSet rs = null;
								if(radioButton_8.isSelected()) {
									rs = state.executeQuery("select * from kucun_hn");
								}else if(radioButton_9.isSelected()) {
									rs = state.executeQuery("select * from kucun_bj");
								}else if(radioButton_10.isSelected()) {
									rs = state.executeQuery("select * from kucun_sh");
								}else if(radioButton_11.isSelected()) {
									rs = state.executeQuery("select * from kucun_xn");
								}
								rs.last();
								int n = rs.getRow();
								String[][] s = new String[n][8];
								int i = 0;
								rs.beforeFirst();
								while(rs.next()) {
									s[i][0] = rs.getString(1);
									s[i][1] = rs.getString(2);
									s[i][2] = rs.getString(3);
									s[i][3] = rs.getString(4);
									s[i][4] = rs.getString(5);
									s[i][5] = rs.getString(6);
									s[i][6] = rs.getString(7);
									s[i][7] = rs.getString(8);
									
									for(int i_2=0;i_2<s[i].length;i_2++) {
										if(s[i][i_2]==null)
											s[i][i_2] = " ";
										bw.write(s[i][i_2]+",");
									}
										
									bw.newLine();
									i++;
								}
								rs.close();
								con.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
							
							bw.close();
						} catch (IOException e2) {
							e2.printStackTrace();
						}
						
					}
					
				}
			});
			button_57.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_57.setHorizontalTextPosition(SwingConstants.CENTER);
			button_57.setFont(new Font("楷体", Font.BOLD, 14));
			button_57.setBorderPainted(false);
			button_57.setBounds(682, 96, 93, 23);
			panel_7.add(button_57);
		
		
		
		
		
		
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(164, -85200, 1080, 671);
		frame.getContentPane().add(panel_8);
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		
		JLabel label_7 = new JLabel("\u62A5\u8B66\u4FE1\u606F\r\n");
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setFont(new Font("楷体", Font.PLAIN, 17));
		label_7.setBounds(10, 10, 179, 33);
		panel_8.add(label_7);
		
		JButton button_12 = new JButton("\u67E5\u8BE2\u62A5\u8B66\u8BB0\u5F55");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				new chaxun(0,0,0,3,0,0,0,0,0,0,0,0,0,0);
				
			}
		});
		button_12.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_12.setHorizontalTextPosition(SwingConstants.CENTER);
		button_12.setFont(new Font("楷体", Font.BOLD, 14));
		button_12.setBorderPainted(false);
		button_12.setBounds(10, 54, 161, 23);
		panel_8.add(button_12);
		
		//刷新报警界面
		JButton button_50 = new JButton("\u5237\u65B0");
		button_50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con;
				ku k1 = new ku();
				try {
					con = k1.SQLku();
					Statement state = con.createStatement();
					ResultSet rs = state.executeQuery("select * from baojing");
					
					rs.last();
					int n = rs.getRow();
					Object[][] s = new Object[n][7];
					int i = 0;
					rs.beforeFirst();
					while(rs.next()) {
						s[i][0] = rs.getString(1);
						s[i][1] = rs.getString(2);
						s[i][2] = rs.getString(3);
						s[i][3] = rs.getString(4);
						s[i][4] = rs.getString(5);
						s[i][5] = rs.getString(6);
						s[i][6] = rs.getString(7);
						i++;
					}
					JTable table = new JTable();
					table.setModel(new DefaultTableModel(
							s,
							new String[] {
									"编号", "书籍ID", "书籍名称", "报警类型", "报警信息", "时间", "分区"
							}
							));
					table.getColumnModel().getColumn(0).setPreferredWidth(50);
					table.getColumnModel().getColumn(0).setMinWidth(0);
					table.getColumnModel().getColumn(1).setPreferredWidth(55);
					table.getColumnModel().getColumn(2).setPreferredWidth(87);
					table.getColumnModel().getColumn(3).setPreferredWidth(91);
					table.getColumnModel().getColumn(4).setPreferredWidth(113);
					table.setShowHorizontalLines(false);
					table.setShowVerticalLines(false);
					table.setSurrendersFocusOnKeystroke(false);
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
					scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					scrollPane.setViewportView(table);
					scrollPane.setBounds(0, 152, 1080, 519);
					panel_8.add(scrollPane);
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		button_50.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_50.setHorizontalTextPosition(SwingConstants.CENTER);
		button_50.setFont(new Font("楷体", Font.BOLD, 14));
		button_50.setBorderPainted(false);
		button_50.setBounds(181, 54, 93, 23);
		panel_8.add(button_50);
		
		//导出报警记录
		JButton button_59 = new JButton("\u5BFC\u51FA");
		button_59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame jf = null;
				FileDialog fd = new FileDialog(jf,"易书导出保存",FileDialog.SAVE);
				fd.setVisible(true);
				fd.setAlwaysOnTop(true);
				fd.setLocationRelativeTo(null);

				
				Connection con;
				ku k1 = new ku();
				
				try {
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
							fd.getDirectory()+fd.getFile()+".csv"), "GB2312"), 1024);
					
					
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						ResultSet rs = state.executeQuery("select * from baojing");
						
						String[] s_1 = new String[] {
								"编号", "书籍ID", "书籍名称", "报警类型", "报警信息", "时间", "分区"
						};
						
						for(int i_1 = 0;i_1<s_1.length;i_1++)
							bw.write(s_1[i_1]+",");
						bw.newLine();
						
						rs.last();
						int n = rs.getRow();
						String[][] s = new String[n][7];
						int i = 0;
						rs.beforeFirst();
						while(rs.next()) {
							s[i][0] = rs.getString(1);
							s[i][1] = rs.getString(2);
							s[i][2] = rs.getString(3);
							s[i][3] = rs.getString(4);
							s[i][4] = rs.getString(5);
							s[i][5] = rs.getString(6);
							s[i][6] = rs.getString(7);
							
							for(int i_1 = 0;i_1<s[i].length;i_1++) {
								if(s[i][i_1]==null)
									s[i][i_1] = " ";
								bw.write(s[i][i_1]+",");
							}
								
							bw.newLine();
							
							i++;
						}
						
						bw.close();
										
						rs.close();
						con.close();
					} catch (SQLException e_1) {
						e_1.printStackTrace();
					}
					
					
					
				}catch(IOException e1) {
					System.out.println(e1);
				}
				
				
			}
		});
		button_59.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_59.setHorizontalTextPosition(SwingConstants.CENTER);
		button_59.setFont(new Font("楷体", Font.BOLD, 14));
		button_59.setBorderPainted(false);
		button_59.setBounds(300, 54, 93, 23);
		panel_8.add(button_59);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(164, -5280, 1080, 671);
		frame.getContentPane().add(panel_9);
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		
		JLabel label_6 = new JLabel("\u6613 \u4E66 \u8D26 \u6B3E");
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setFont(new Font("楷体", Font.PLAIN, 17));
		label_6.setBounds(35, 10, 179, 33);
		panel_9.add(label_6);
		
		
		//账款面板 查询数据库
		JButton button_16 = new JButton("\u67E5\u8BE2\u8D26\u5355");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new chaxun(0,0,0,3,0,0,0,0,0,0,0,0,0);
			}
		});
		button_16.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_16.setHorizontalTextPosition(SwingConstants.CENTER);
		button_16.setFont(new Font("楷体", Font.BOLD, 14));
		button_16.setBorderPainted(false);
		button_16.setBounds(35, 53, 108, 23);
		panel_9.add(button_16);
		
		//刷新账款
		JButton button_36 = new JButton("\u5237\u65B0");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				ku k1 = new ku();
				try {
					con = k1.SQLku();
					Statement state = con.createStatement();
					ResultSet rs = state.executeQuery("select * from zhangkuan");
					
					rs.last();
					int n = rs.getRow();
					Object[][] s = new Object[n][11];
					int i = 0;
					rs.beforeFirst();
					while(rs.next()) {
						s[i][0] = rs.getString(1);
						s[i][1] = rs.getString(2);
						s[i][2] = rs.getString(3);
						s[i][3] = rs.getString(4);
						s[i][4] = rs.getString(5);
						s[i][5] = rs.getString(6);
						s[i][6] = rs.getString(7);
						s[i][7] = rs.getString(8);
						s[i][8] = rs.getString(9);
						s[i][9] = rs.getString(10);
						s[i][10] = rs.getString(11);
						i++;
					}
					JTable table = new JTable();
					table.setModel(new DefaultTableModel(
							s,
							new String[] {
									"编号", "进账类型", "金额", "负责人编号", "书籍编号", "进销单号", "明细", "时间", "库存", "分区"
							}
							));
					table.getColumnModel().getColumn(0).setPreferredWidth(80);
					table.getColumnModel().getColumn(0).setMinWidth(0);
					table.getColumnModel().getColumn(1).setPreferredWidth(55);
					table.getColumnModel().getColumn(2).setPreferredWidth(87);
					table.getColumnModel().getColumn(3).setPreferredWidth(91);
					table.getColumnModel().getColumn(4).setPreferredWidth(113);
					table.setShowHorizontalLines(false);
					table.setShowVerticalLines(false);
					table.setSurrendersFocusOnKeystroke(false);
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
					scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					scrollPane.setViewportView(table);
					scrollPane.setBounds(0, 152, 1080, 519);
					panel_9.add(scrollPane);
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		button_36.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_36.setHorizontalTextPosition(SwingConstants.CENTER);
		button_36.setFont(new Font("楷体", Font.BOLD, 14));
		button_36.setBorderPainted(false);
		button_36.setBounds(206, 53, 93, 23);
		panel_9.add(button_36);
		
		
		// 导出账款
		JButton button_54 = new JButton("\u5BFC\u51FA");
		button_54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame jf = null;
				FileDialog fd = new FileDialog(jf,"易书导出保存",FileDialog.SAVE);
				fd.setVisible(true);
				fd.setAlwaysOnTop(true);
				fd.setLocationRelativeTo(null);

				
				Connection con;
				ku k1 = new ku();
				
				try {
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
							fd.getDirectory()+fd.getFile()+".csv"), "GB2312"), 1024);
					
					
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						ResultSet rs = state.executeQuery("select * from zhangkuan");
						
						String[] s_1 = new String[] {
								"编号", "进账类型", "金额", "负责人编号", "书籍编号", "进销单号", "明细", "时间", "库存", "分区"
						};
						
						for(int i_1 = 0;i_1<10;i_1++)
							bw.write(s_1[i_1]+",");
						bw.newLine();
						rs.last();
						int n = rs.getRow();
						String[][] s = new String[n][10];
						int i = 0;
						rs.beforeFirst();
						while(rs.next()) {
							s[i][0] = rs.getString(1);
							s[i][1] = rs.getString(2);
							s[i][2] = rs.getString(3);
							s[i][3] = rs.getString(4);
							s[i][4] = rs.getString(5);
							s[i][5] = rs.getString(6);
							s[i][6] = rs.getString(7);
							s[i][7] = rs.getString(8);
							s[i][8] = rs.getString(9);
							s[i][9] = rs.getString(10);
							
							for(int i_1 = 0;i_1<10;i_1++) {
								if(s[i][i_1]==null)
									s[i][i_1] = " ";
								bw.write(s[i][i_1]+",");
							}
								
							bw.newLine();
							
							i++;
						}
						
						bw.close();
										
						rs.close();
						con.close();
					} catch (SQLException e_1) {
						e_1.printStackTrace();
					}
					
					
					
				}catch(IOException e1) {
					System.out.println(e1);
				}
				
				
				
				
				
			}
		});
		button_54.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_54.setHorizontalTextPosition(SwingConstants.CENTER);
		button_54.setFont(new Font("楷体", Font.BOLD, 14));
		button_54.setBorderPainted(false);
		button_54.setBounds(366, 53, 93, 23);
		panel_9.add(button_54);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(164, -25800, 1080, 671);
		frame.getContentPane().add(panel_17);
		panel_17.setLayout(null);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2\u62A5\u8868");
		btnNewButton.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		btnNewButton.setFont(new Font("楷体", Font.BOLD, 15));
		btnNewButton.setBounds(157, 114, 121, 23);
		panel_17.add(btnNewButton);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		btnNewButton.setBorderPainted(false);  //设置是否绘制边框
		
		JLabel label_31 = new JLabel("\u6613 \u4E66 \u8D26 \u6B3E \u62A5 \u8868");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setForeground(Color.DARK_GRAY);
		label_31.setFont(new Font("楷体", Font.PLAIN, 25));
		label_31.setBounds(366, 10, 315, 33);
		panel_17.add(label_31);
		
		JLabel label_32 = new JLabel("\u5E74\u5EA6\u603B\u62A5\u8868");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setForeground(Color.GRAY);
		label_32.setFont(new Font("宋体", Font.PLAIN, 12));
		label_32.setBounds(10, 74, 61, 33);
		panel_17.add(label_32);
		
		JLabel label_33 = new JLabel("\u672C\u5E74\u5EA6\u5B63\u5EA6\u62A5\u8868");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setForeground(Color.GRAY);
		label_33.setFont(new Font("宋体", Font.PLAIN, 12));
		label_33.setBounds(281, 74, 92, 33);
		panel_17.add(label_33);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("楷体", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2013-2014\u5E74\u5EA6", "2014-2015\u5E74\u5EA6", "2015-2016\u5E74\u5EA6", "2016-2017\u5E74\u5EA6", "2017-2018\u5E74\u5EA6", "2018-2019\u5E74\u5EA6", "2019-2020\u5E74\u5EA6", "2020-2021\u5E74\u5EA6"}));
		comboBox.setEditable(true);
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.BLACK);
		comboBox.setBounds(10, 114, 137, 21);
		panel_17.add(comboBox);
		
		JLabel label_34 = new JLabel("\u672C\u5E74\u5EA6\u6708\u4EFD\u62A5\u8868");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setForeground(Color.GRAY);
		label_34.setFont(new Font("宋体", Font.PLAIN, 12));
		label_34.setBounds(604, 74, 92, 33);
		panel_17.add(label_34);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u4E00\u6708", "\u4E8C\u6708", "\u4E09\u6708", "\u56DB\u6708", "\u4E94\u6708", "\u516D\u6708", "\u4E03\u6708", "\u516B\u6708", "\u4E5D\u6708", "\u5341\u6708", "\u5341\u4E00\u6708", "\u5341\u4E8C\u6708"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("楷体", Font.BOLD, 14));
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(604, 117, 137, 21);
		panel_17.add(comboBox_1);
		
		JButton button_53 = new JButton("\u67E5\u8BE2\u62A5\u8868");
		button_53.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_53.setHorizontalTextPosition(SwingConstants.CENTER);
		button_53.setFont(new Font("楷体", Font.BOLD, 15));
		button_53.setBorderPainted(false);
		button_53.setBounds(767, 114, 121, 23);
		panel_17.add(button_53);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u7B2C\u4E00\u5B63\u5EA6", "\u7B2C\u4E8C\u5B63\u5EA6", "\u7B2C\u4E09\u5B63\u5EA6", "\u7B2C\u56DB\u5B63\u5EA6"}));
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setFont(new Font("楷体", Font.BOLD, 14));
		comboBox_2.setEditable(true);
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(285, 117, 137, 21);
		panel_17.add(comboBox_2);
		
		JButton button_52 = new JButton("\u67E5\u8BE2\u62A5\u8868");
		button_52.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_52.setHorizontalTextPosition(SwingConstants.CENTER);
		button_52.setFont(new Font("楷体", Font.BOLD, 15));
		button_52.setBorderPainted(false);
		button_52.setBounds(432, 114, 121, 23);
		panel_17.add(button_52);
		
		
		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(902, 10, 45, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label_8 = new JLabel("\u5DE5\u9F84\uFF1A");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("楷体", Font.BOLD, 14));
		label_8.setBounds(902, 39, 45, 16);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("\u5DE5\u53F7\uFF1A");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("楷体", Font.BOLD, 14));
		label_9.setBounds(1035, 11, 45, 16);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("\u804C\u4F4D\uFF1A");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("楷体", Font.BOLD, 14));
		label_10.setBounds(1035, 39, 45, 16);
		frame.getContentPane().add(label_10);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, -25155, 1080, 516);
		panel_17.add(panel_18);
		panel_18.setLayout(new BorderLayout(0, 0));
		table = new JTable();
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		table.setSurrendersFocusOnKeystroke(false);
		scrollPane = new JScrollPane();
		panel_18.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setViewportView(table);
		
		
		//导出当前报表
		JButton button_60 = new JButton("\u5BFC\u51FA\u5F53\u524D\u62A5\u8868");
		button_60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame jf = null;
				FileDialog fd = new FileDialog(jf,"易书导出保存",FileDialog.SAVE);
				fd.setVisible(true);
				fd.setAlwaysOnTop(true);
				fd.setLocationRelativeTo(null);

				
				Connection con;
				ku k1 = new ku();
				
				try {
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
							fd.getDirectory()+fd.getFile()+".csv"), "GB2312"), 1024);
					
					
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						ResultSet rs = state.executeQuery("select * from baojing");
						
						String[] s_1 = new String[] {
								"编号", "进账类型", "金额", "负责人编号", "书籍编号", "进销单号", "明细", "时间", "库存", "分区"
						};
						
						for(int i_1 = 0;i_1<s_1.length;i_1++)
							bw.write(s_1[i_1]+",");
						bw.newLine();
						
						int cols = table.getRowCount();
						String[][] s_3 = new String[cols][10];
						for(int i = 0;i<cols;i++) {
							for(int j = 0;j<10;j++) {
								
								if(table.getValueAt(i, j).toString()==null)
									s_3[i][j] = " ";
								s_3[i][j] = table.getValueAt(i, j).toString();
							}
						}
								
						for(int i_1 = 0;i_1<cols;i_1++) {
							for(int j_1=0;j_1<10;j_1++) {
								bw.write(s_3[i_1][j_1]+",");
							}
							bw.newLine();
						}
							
						
						
						
						bw.close();
						rs.close();
						con.close();
					} catch (SQLException e_1) {
						e_1.printStackTrace();
					}
					
					
					
				}catch(IOException e1) {
					System.out.println(e1);
				}
				
			}
		});
		button_60.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_60.setHorizontalTextPosition(SwingConstants.CENTER);
		button_60.setFont(new Font("楷体", Font.BOLD, 15));
		button_60.setBorderPainted(false);
		button_60.setBounds(898, 114, 149, 23);
		panel_17.add(button_60);
		
		
		//查询年度报表
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object s_1 = comboBox.getSelectedItem();
				Object s_12 = comboBox_2.getSelectedItem();
				String s12 = (String) s_12;
				String s111 = (String) s_1;
				char[] s_2 = s111.toCharArray();
				String s_3 = s_2[0]+""+s_2[1]+""+s_2[2]+""+s_2[3]+"";
				new baobiao1(0,s_3,s12,"sdfg");
				
				
				// 查询年度数据库
				
				Connection con;
				ku k1 = new ku();
				try {
					con = k1.SQLku();
					Statement state = con.createStatement();
					ResultSet rs = state.executeQuery("select * from zhangkuan where year = '"+s_3+"'");
					
					rs.last();
					int n = rs.getRow();
					Object[][] s = new Object[n][10];
					int i = 0;
					rs.beforeFirst();
					if(rs.next()) {
						s[i][0] = rs.getString("id");
						s[i][1] = rs.getString("type");
						s[i][2] = rs.getString("sum_0");
						s[i][3] = rs.getString("fuzerenid");
						s[i][4] = rs.getString("bookid");
						s[i][5] = rs.getString("danhao");
						s[i][6] = rs.getString("mingxi");
						s[i][7] = rs.getString("time");
						s[i][8] = rs.getString("kucun");
						s[i][9] = rs.getString("fenqu");
						i++;
						
						while(rs.next()) {
							s[i][0] = rs.getString("id");
							s[i][1] = rs.getString("type");
							s[i][2] = rs.getString("sum_0");
							s[i][3] = rs.getString("fuzerenid");
							s[i][4] = rs.getString("bookid");
							s[i][5] = rs.getString("danhao");
							s[i][6] = rs.getString("mingxi");
							s[i][7] = rs.getString("time");
							s[i][8] = rs.getString("kucun");
							s[i][9] = rs.getString("fenqu");
							i++;
						}
						
						panel_18.setBounds(0, 155, 1080, 516);
						table.setModel(new DefaultTableModel(
								s,
								new String[] {
										"编号", "进账类型", "金额", "负责人编号", "书籍编号", "进销单号", "明细", "时间", "库存", "分区"
								}
								));
						
					}
					
					
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		
		
		
		
		//查询季度报表
		button_52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object s_1 = comboBox.getSelectedItem();
				Object s_12 = comboBox_2.getSelectedItem();
				String s111 = (String) s_1;
				String s12 = (String) s_12;
				char[] s_2 = s111.toCharArray();
				String s_3 = s_2[0]+""+s_2[1]+""+s_2[2]+""+s_2[3]+"";
				new baobiao1(1,s_3,s12,"dsfg");
				
				String[] t = new String[3];
				if(s12.equals("第一季度")) {
					t[0] = "一月";
					t[1] = "二月";
					t[2] = "三月";
				}else if(s12.equals("第二季度")) {
					t[0] = "五月";
					t[1] = "六月";
					t[2] = "七月";
				}else if(s12.equals("第三季度")) {
					t[0] = "八月";
					t[1] = "九月";
					t[2] = "七月";
				}else if(s12.equals("第四季度")) {
					t[0] = "十一月";
					t[1] = "十二月";
					t[2] = "十月";
				}
				
				
				
// 查询度数据库
				
				Connection con;
				ku k1 = new ku();
				try {
					con = k1.SQLku();
					Statement state = con.createStatement();
					ResultSet rs = state.executeQuery("select * from zhangkuan where year = '"+s_3+"'");
					
					rs.last();
					int n = rs.getRow();
					Object[][] s = new Object[n][11];
					Object[][] s_0 = new Object[n][10];
					int i = 0,j = 0;
					rs.beforeFirst();
					if(rs.next()) {
						s[i][0] = rs.getString("id");
						s[i][1] = rs.getString("type");
						s[i][2] = rs.getString("sum_0");
						s[i][3] = rs.getString("fuzerenid");
						s[i][4] = rs.getString("bookid");
						s[i][5] = rs.getString("danhao");
						s[i][6] = rs.getString("mingxi");
						s[i][7] = rs.getString("time");
						s[i][8] = rs.getString("kucun");
						s[i][9] = rs.getString("fenqu");
						s[i][10] = rs.getString("month");
						if(s[i][10].equals(t[0])||s[i][10].equals(t[2])||s[i][10].equals(t[2])) {
							s_0[j][0] = s[i][0];
							s_0[j][1] = s[i][1];
							s_0[j][2] = s[i][2];
							s_0[j][3] = s[i][3];
							s_0[j][4] = s[i][4];
							s_0[j][5] = s[i][5];
							s_0[j][6] = s[i][6];
							s_0[j][7] = s[i][7];
							s_0[j][8] = s[i][8];
							s_0[j][9] = s[i][9];
							j++;
						}
						i++;
						
						while(rs.next()) {
							s[i][0] = rs.getString("id");
							s[i][1] = rs.getString("type");
							s[i][2] = rs.getString("sum_0");
							s[i][3] = rs.getString("fuzerenid");
							s[i][4] = rs.getString("bookid");
							s[i][5] = rs.getString("danhao");
							s[i][6] = rs.getString("mingxi");
							s[i][7] = rs.getString("time");
							s[i][8] = rs.getString("kucun");
							s[i][9] = rs.getString("fenqu");
							s[i][10] = rs.getString("month");
							if(s[i][10].equals(t[0])||s[i][10].equals(t[2])||s[i][10].equals(t[2])) {
								s_0[j][0] = s[i][0];
								s_0[j][1] = s[i][1];
								s_0[j][2] = s[i][2];
								s_0[j][3] = s[i][3];
								s_0[j][4] = s[i][4];
								s_0[j][5] = s[i][5];
								s_0[j][6] = s[i][6];
								s_0[j][7] = s[i][7];
								s_0[j][8] = s[i][8];
								s_0[j][9] = s[i][9];
								j++;
							}
							i++;
						}
						
						
						
						panel_18.setBounds(0, 155, 1080, 516);
						table.setModel(new DefaultTableModel(
								s_0,
								new String[] {
										"编号", "进账类型", "金额", "负责人编号", "书籍编号", "进销单号", "明细", "时间", "库存", "分区"
								}
								));
						
					}
					
					
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		
		//查询月度报表
		button_53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object s_1 = comboBox.getSelectedItem();
				Object s_12 = comboBox_2.getSelectedItem();
				Object s_13 = comboBox_1.getSelectedItem();
				String s1 = (String) s_1;
				String s12 = (String) s_12;
				String s4 = (String) s_13;
				char[] s_2 = s1.toCharArray();
				String s_3 = s_2[0]+""+s_2[1]+""+s_2[2]+""+s_2[3]+"";
				new baobiao1(2,s_3,s12,s4);
				
				
// 查询月度数据库
				
				Connection con;
				ku k1 = new ku();
				try {
					con = k1.SQLku();
					Statement state = con.createStatement();
					ResultSet rs = state.executeQuery("select * from zhangkuan where year = '"+s_3+"'");
					
					rs.last();
					int n = rs.getRow();
					Object[][] s = new Object[n][11];
					Object[][] s_0 = new Object[n][10];
					int i = 0,j = 0;
					rs.beforeFirst();
					if(rs.next()) {
						s[i][0] = rs.getString("id");
						s[i][1] = rs.getString("type");
						s[i][2] = rs.getString("sum_0");
						s[i][3] = rs.getString("fuzerenid");
						s[i][4] = rs.getString("bookid");
						s[i][5] = rs.getString("danhao");
						s[i][6] = rs.getString("mingxi");
						s[i][7] = rs.getString("time");
						s[i][8] = rs.getString("kucun");
						s[i][9] = rs.getString("fenqu");
						s[i][10] = rs.getString("month");
						if(s[i][10].equals(s4)) {
							s_0[j][0] = s[i][0];
							s_0[j][1] = s[i][1];
							s_0[j][2] = s[i][2];
							s_0[j][3] = s[i][3];
							s_0[j][4] = s[i][4];
							s_0[j][5] = s[i][5];
							s_0[j][6] = s[i][6];
							s_0[j][7] = s[i][7];
							s_0[j][8] = s[i][8];
							s_0[j][9] = s[i][9];
							j++;
						}
						i++;
						
						while(rs.next()) {
							s[i][0] = rs.getString("id");
							s[i][1] = rs.getString("type");
							s[i][2] = rs.getString("sum_0");
							s[i][3] = rs.getString("fuzerenid");
							s[i][4] = rs.getString("bookid");
							s[i][5] = rs.getString("danhao");
							s[i][6] = rs.getString("mingxi");
							s[i][7] = rs.getString("time");
							s[i][8] = rs.getString("kucun");
							s[i][9] = rs.getString("fenqu");
							s[i][10] = rs.getString("month");
							if(s[i][10].equals(s4)) {
								s_0[j][0] = s[i][0];
								s_0[j][1] = s[i][1];
								s_0[j][2] = s[i][2];
								s_0[j][3] = s[i][3];
								s_0[j][4] = s[i][4];
								s_0[j][5] = s[i][5];
								s_0[j][6] = s[i][6];
								s_0[j][7] = s[i][7];
								s_0[j][8] = s[i][8];
								s_0[j][9] = s[i][9];
								j++;
							}
							i++;
						}
						
						
					
						panel_18.setBounds(0, 155, 1080, 516);
						table.setModel(new DefaultTableModel(
								s_0,
								new String[] {
										"编号", "进账类型", "金额", "负责人编号", "书籍编号", "进销单号", "明细", "时间", "库存", "分区"
								}
								));
						
					}
					
					
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		
		//注销
		JButton button_37 = new JButton("[\u6CE8\u9500]");
		button_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new zhujiemian_1();
				frame.dispose();
			}
		});
		button_37.setFont(new Font("楷体", Font.BOLD, 15));
		button_37.setIcon(new ImageIcon("img/抬头logo.PNG"));
		button_37.setForeground(Color.WHITE);
		button_37.setBounds(1151, 36, 93, 23);
		frame.getContentPane().add(button_37);
		button_37.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button_37.setBorderPainted(false);  //设置是否绘制边框
		
		JLabel label_11 = new JLabel("");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("楷体", Font.BOLD, 14));
		label_11.setBounds(957, 11, 68, 16);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("楷体", Font.BOLD, 14));
		label_12.setBounds(957, 39, 68, 16);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("楷体", Font.BOLD, 14));
		label_13.setBounds(1090, 11, 68, 16);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("楷体", Font.BOLD, 14));
		label_14.setBounds(1090, 39, 68, 16);
		frame.getContentPane().add(label_14);
		
		label_11.setText(s00);
		label_12.setText(s02);
		label_13.setText(s01);
		label_14.setText(s03);
		
		//联系客服
		button_61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String[] s1 = new String[1];
				
				ku k = new ku();
				Connection con = k.SQLku();
				try {
					Statement state = con.createStatement();
					ResultSet rs = state.executeQuery("select * from fenquyuangong where id='"+label_13.getText()+"'");
					rs.last();
					rs.beforeFirst();
					while(rs.next()) {
						s1[0] = rs.getString("name");
					}
					state.close();
					con.close();
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				new ServerClient_1(s1[0]);
				
			}
		});
		
		
		button_62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			new Client();
				
			}
		});
		
		
		//主页键
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
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
				button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
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
				button_51.setForeground(Color.DARK_GRAY);
				button_51.setFont(new Font("楷体", Font.PLAIN, 16));
				panel_0.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(164, -66000, 1080, 671);
				panel_3.setBounds(164, -66000, 1080, 671);
				panel_4.setBounds(164, -66000, 1080, 671);
				panel_5.setBounds(164, -66000, 1080, 671);
				panel_6.setBounds(164, -66000, 1080, 671);
				panel_7.setBounds(164, -66000, 1080, 671);
				panel_8.setBounds(164, -66000, 1080, 671);
				panel_9.setBounds(164, -66000, 1080, 671);
				panel_17.setBounds(164, -66000, 1080, 671);
			}
		});
		button.setIcon(new ImageIcon("img/主页键.PNG"));
		button.setBorderPainted(false);
		button.setBounds(32, 10, 224, 55);
		frame.getContentPane().add(button);
		
		// 创建按钮数组
		ButtonGroup bg4 = new ButtonGroup();
		
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
				button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
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
				button_51.setForeground(Color.DARK_GRAY);
				button_51.setFont(new Font("楷体", Font.PLAIN, 16));
				panel_0.setBounds(164, 65, 1080, 671);
				panel_2.setBounds(164, -66000, 1080, 671);
				panel_3.setBounds(164, -66000, 1080, 671);
				panel_4.setBounds(164, -66000, 1080, 671);
				panel_5.setBounds(164, -66000, 1080, 671);
				panel_6.setBounds(164, -66000, 1080, 671);
				panel_7.setBounds(164, -66000, 1080, 671);
				panel_8.setBounds(164, -66000, 1080, 671);
				panel_9.setBounds(164, -66000, 1080, 671);
				panel_17.setBounds(164, -66000, 1080, 671);
				
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
				button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
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
				button_51.setForeground(Color.DARK_GRAY);
				button_51.setFont(new Font("楷体", Font.PLAIN, 16));
				panel_2.setBounds(164, 65, 1080, 671);
				panel_0.setBounds(164, -66000, 1080, 671);
				panel_3.setBounds(164, -66000, 1080, 671);
				panel_4.setBounds(164, -66000, 1080, 671);
				panel_5.setBounds(164, -66000, 1080, 671);
				panel_6.setBounds(164, -66000, 1080, 671);
				panel_7.setBounds(164, -66000, 1080, 671);
				panel_8.setBounds(164, -66000, 1080, 671);
				panel_9.setBounds(164, -66000, 1080, 671);
				panel_17.setBounds(164, -66000, 1080, 671);
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
				button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
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
				button_51.setForeground(Color.DARK_GRAY);
				button_51.setFont(new Font("楷体", Font.PLAIN, 16));
				panel_3.setBounds(164, 65, 1080, 671);
				panel_0.setBounds(164, -66000, 1080, 671);
				panel_2.setBounds(164, -66000, 1080, 671);
				panel_4.setBounds(164, -66000, 1080, 671);
				panel_5.setBounds(164, -66000, 1080, 671);
				panel_6.setBounds(164, -66000, 1080, 671);
				panel_7.setBounds(164, -66000, 1080, 671);
				panel_8.setBounds(164, -66000, 1080, 671);
				panel_9.setBounds(164, -66000, 1080, 671);
				panel_17.setBounds(164, -66000, 1080, 671);
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
				button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
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
				button_51.setForeground(Color.DARK_GRAY);
				button_51.setFont(new Font("楷体", Font.PLAIN, 16));
				panel_4.setBounds(164, 65, 1080, 671);
				panel_0.setBounds(164, -66000, 1080, 671);
				panel_2.setBounds(164, -66000, 1080, 671);
				panel_3.setBounds(164, -66000, 1080, 671);
				panel_5.setBounds(164, -66000, 1080, 671);
				panel_6.setBounds(164, -66000, 1080, 671);
				panel_7.setBounds(164, -66000, 1080, 671);
				panel_8.setBounds(164, -66000, 1080, 671);
				panel_9.setBounds(164, -66000, 1080, 671);
				panel_17.setBounds(164, -66000, 1080, 671);
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
				button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
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
				button_51.setForeground(Color.DARK_GRAY);
				button_51.setFont(new Font("楷体", Font.PLAIN, 16));
				panel_5.setBounds(164, 65, 1080, 671);
				panel_0.setBounds(164, -66000, 1080, 671);
				panel_2.setBounds(164, -66000, 1080, 671);
				panel_3.setBounds(164, -66000, 1080, 671);
				panel_4.setBounds(164, -66000, 1080, 671);
				panel_6.setBounds(164, -66000, 1080, 671);
				panel_7.setBounds(164, -66000, 1080, 671);
				panel_8.setBounds(164, -66000, 1080, 671);
				panel_9.setBounds(164, -66000, 1080, 671);
				panel_17.setBounds(164, -66000, 1080, 671);
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
				button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
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
				button_51.setForeground(Color.DARK_GRAY);
				button_51.setFont(new Font("楷体", Font.PLAIN, 16));
				panel_6.setBounds(164, 65, 1080, 671);
				panel_0.setBounds(164, -66000, 1080, 671);
				panel_2.setBounds(164, -66000, 1080, 671);
				panel_3.setBounds(164, -66000, 1080, 671);
				panel_4.setBounds(164, -66000, 1080, 671);
				panel_5.setBounds(164, -66000, 1080, 671);
				panel_7.setBounds(164, -66000, 1080, 671);
				panel_8.setBounds(164, -66000, 1080, 671);
				panel_9.setBounds(164, -66000, 1080, 671);
				panel_17.setBounds(164, -66000, 1080, 671);
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
				button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
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
				button_51.setForeground(Color.DARK_GRAY);
				button_51.setFont(new Font("楷体", Font.PLAIN, 16));
				panel_7.setBounds(164, 65, 1080, 671);
				panel_0.setBounds(164, -66000, 1080, 671);
				panel_2.setBounds(164, -66000, 1080, 671);
				panel_3.setBounds(164, -66000, 1080, 671);
				panel_4.setBounds(164, -66000, 1080, 671);
				panel_5.setBounds(164, -66000, 1080, 671);
				panel_6.setBounds(164, -66000, 1080, 671);
				panel_8.setBounds(164, -66000, 1080, 671);
				panel_9.setBounds(164, -66000, 1080, 671);
				panel_17.setBounds(164, -66000, 1080, 671);
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
				button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
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
				button_51.setForeground(Color.DARK_GRAY);
				button_51.setFont(new Font("楷体", Font.PLAIN, 16));
				panel_8.setBounds(164, 65, 1080, 671);
				panel_0.setBounds(164, -66000, 1080, 671);
				panel_2.setBounds(164, -66000, 1080, 671);
				panel_3.setBounds(164, -66000, 1080, 671);
				panel_4.setBounds(164, -66000, 1080, 671);
				panel_5.setBounds(164, -66000, 1080, 671);
				panel_6.setBounds(164, -66000, 1080, 671);
				panel_7.setBounds(164, -66000, 1080, 671);
				panel_9.setBounds(164, -66000, 1080, 671);
				panel_17.setBounds(164, -66000, 1080, 671);
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
				button_51.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
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
				button_51.setForeground(Color.DARK_GRAY);
				button_51.setFont(new Font("楷体", Font.PLAIN, 16));
				panel_9.setBounds(164, 65, 1080, 671);
				panel_0.setBounds(164, -66000, 1080, 671);
				panel_2.setBounds(164, -66000, 1080, 671);
				panel_3.setBounds(164, -66000, 1080, 671);
				panel_4.setBounds(164, -66000, 1080, 671);
				panel_5.setBounds(164, -66000, 1080, 671);
				panel_6.setBounds(164, -66000, 1080, 671);
				panel_7.setBounds(164, -66000, 1080, 671);
				panel_8.setBounds(164, -66000, 1080, 671);
				panel_17.setBounds(164, -66000, 1080, 671);
			}
		});
		
		
		// 查询报表
				button_51.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						button_51.setIcon(new ImageIcon("img/左侧菜单 选中.PNG"));
						button_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
						button_3.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
						button_4.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
						button_5.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
						button_6.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
						button_7.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
						button_8.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
						button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
						button_9.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
						button_51.setFont(new Font("楷体", Font.BOLD, 16));
						button_2.setFont(new Font("楷体", Font.PLAIN, 16));
						button_3.setFont(new Font("楷体", Font.PLAIN, 16));
						button_4.setFont(new Font("楷体", Font.PLAIN, 16));
						button_5.setFont(new Font("楷体", Font.PLAIN, 16));
						button_6.setFont(new Font("楷体", Font.PLAIN, 16));
						button_7.setFont(new Font("楷体", Font.PLAIN, 16));
						button_8.setFont(new Font("楷体", Font.PLAIN, 16));
						button_1.setFont(new Font("楷体", Font.PLAIN, 16));
						button_9.setFont(new Font("楷体", Font.PLAIN, 16));
						button_51.setForeground(Color.BLACK);
						button_2.setForeground(Color.DARK_GRAY);
						button_3.setForeground(Color.DARK_GRAY);
						button_4.setForeground(Color.DARK_GRAY);
						button_5.setForeground(Color.DARK_GRAY);
						button_6.setForeground(Color.DARK_GRAY);
						button_7.setForeground(Color.DARK_GRAY);
						button_8.setForeground(Color.DARK_GRAY);
						button_1.setForeground(Color.DARK_GRAY);
						button_9.setForeground(Color.DARK_GRAY);
						panel_17.setBounds(164, 65, 1080, 671);
						panel_0.setBounds(164, -66000, 1080, 671);
						panel_2.setBounds(164, -66000, 1080, 671);
						panel_3.setBounds(164, -66000, 1080, 671);
						panel_4.setBounds(164, -66000, 1080, 671);
						panel_5.setBounds(164, -66000, 1080, 671);
						panel_6.setBounds(164, -66000, 1080, 671);
						panel_7.setBounds(164, -66000, 1080, 671);
						panel_8.setBounds(164, -66000, 1080, 671);
						panel_9.setBounds(164, -66000, 1080, 671);
						
						
						
					}
				});
		
		
	}
}
