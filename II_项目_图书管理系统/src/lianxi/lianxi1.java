package lianxi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

import zhujiemian.chaxun;
import zhujiemian.ku;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class lianxi1 {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	int m;
	String s;
	private JTextField textField_9_1;
	
	public lianxi1() {
		JFrame frame;
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 377, 614);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img/抬头logo_1.PNG"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 368, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u67E5  \u8BE2  \u91C7  \u8D2D  \u8BB0  \u5F55");
		lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(55, 49, 258, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u7F16\u53F7");
		lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel_2.setBounds(31, 121, 90, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("\u4E66\u7C4D\u540D\u79F0");
		label.setFont(new Font("楷体", Font.BOLD, 15));
		label.setBounds(31, 159, 90, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u4F5C\u8005");
		label_1.setFont(new Font("楷体", Font.BOLD, 15));
		label_1.setBounds(31, 205, 90, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u4E66\u7C4D\u7C7B\u522B");
		label_2.setFont(new Font("楷体", Font.BOLD, 15));
		label_2.setBounds(31, 247, 90, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u91C7\u8D2D\u5355\u53F7");
		label_3.setFont(new Font("楷体", Font.BOLD, 15));
		label_3.setBounds(31, 290, 90, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u91C7\u8D2D\u4EBA\u5458");
		label_4.setFont(new Font("楷体", Font.BOLD, 15));
		label_4.setBounds(31, 332, 90, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\u91C7\u8D2D\u5355\u4EF7");
		label_5.setFont(new Font("楷体", Font.BOLD, 15));
		label_5.setBounds(31, 371, 90, 15);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u91C7\u8D2D\u603B\u6570");
		label_6.setFont(new Font("楷体", Font.BOLD, 15));
		label_6.setBounds(31, 409, 90, 15);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\u91C7\u8D2D\u603B\u989D");
		label_7.setFont(new Font("楷体", Font.BOLD, 15));
		label_7.setBounds(31, 453, 90, 15);
		frame.getContentPane().add(label_7);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new chaxun(m);
			}
		});
		button_1.setFont(new Font("楷体", Font.BOLD, 15));
		button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_1.setBounds(131, 527, 93, 23);
		frame.getContentPane().add(button_1);
		frame.setVisible(true);
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button_1.setBorderPainted(false);  //设置是否绘制边框
		
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel_3.setBounds(131, 115, 182, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label_8 = new JLabel();
		label_8.setFont(new Font("楷体", Font.BOLD, 15));
		label_8.setBounds(131, 151, 182, 23);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel();
		label_9.setFont(new Font("楷体", Font.BOLD, 15));
		label_9.setBounds(131, 197, 182, 23);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel();
		label_10.setFont(new Font("楷体", Font.BOLD, 15));
		label_10.setBounds(131, 239, 182, 23);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel();
		label_11.setFont(new Font("楷体", Font.BOLD, 15));
		label_11.setBounds(131, 282, 182, 23);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel();
		label_12.setFont(new Font("楷体", Font.BOLD, 15));
		label_12.setBounds(131, 324, 182, 23);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel();
		label_13.setFont(new Font("楷体", Font.BOLD, 15));
		label_13.setBounds(131, 363, 182, 23);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel();
		label_14.setFont(new Font("楷体", Font.BOLD, 15));
		label_14.setBounds(131, 401, 182, 23);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel();
		label_15.setFont(new Font("楷体", Font.BOLD, 15));
		label_15.setBounds(131, 445, 182, 23);
		frame.getContentPane().add(label_15);
		
		String[] s1 = new String[9];
		
		ku k = new ku();
		Connection con = k.SQLku();
		try {
			Statement state = con.createStatement();
			ResultSet rs = null;
			if(m==0) {
				rs = state.executeQuery("select * from caigou_hn where bookid='"+s+"'");
			}else if(m==1) {
				rs = state.executeQuery("select * from caigou_bj where bookid='"+s+"'");
			}else if(m==2) {
				rs = state.executeQuery("select * from caigou_sh where bookid='"+s+"'");
			}else if(m==3) {
				rs = state.executeQuery("select * from caigou_xn where bookid='"+s+"'");
			}
			rs.last();
			rs.beforeFirst();
			while(rs.next()) {
				s1[0] = rs.getString(1);
				s1[1] = rs.getString(2);
				s1[2] = rs.getString(3);
				s1[3] = rs.getString(4);
				s1[4] = rs.getString(5);
				s1[5] = rs.getString(6);
				s1[6] = rs.getString(7);
				s1[7] = rs.getString(8);
				s1[8] = rs.getString(9);
			}
			state.close();
			con.close();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		lblNewLabel_3.setText(s1[0]);
		label_8.setText(s1[1]);
		label_9.setText(s1[2]);
		label_10.setText(s1[3]);
		label_11.setText(s1[4]);
		label_12.setText(s1[5]);
		label_13.setText(s1[6]);
		label_14.setText(s1[7]);
		label_15.setText(s1[8]);
		
		JLabel label_16 = new JLabel("\u91C7\u8D2D\u603B\u989D");
		label_16.setFont(new Font("楷体", Font.BOLD, 15));
		label_16.setBounds(31, 486, 90, 15);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel();
		label_17.setText((String) null);
		label_17.setFont(new Font("楷体", Font.BOLD, 15));
		label_17.setBounds(131, 478, 182, 23);
		frame.getContentPane().add(label_17);
	}
	}




































