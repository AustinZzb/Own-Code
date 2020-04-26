package zhujiemian;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class updatecaigou {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	int m;
	
	
	// 修改采购记录
	public updatecaigou(int m,String s_1) {
		JFrame frame;
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 377, 614);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img/抬头logo_1.PNG"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 368, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u4FEE  \u6539  \u91C7  \u8D2D  \u8BB0  \u5F55");
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
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("楷体", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(131, 156, 199, 21);
		frame.getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("\u4F5C\u8005");
		label_1.setFont(new Font("楷体", Font.BOLD, 15));
		label_1.setBounds(31, 205, 90, 15);
		frame.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("楷体", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(131, 202, 199, 21);
		frame.getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("\u4E66\u7C4D\u7C7B\u522B");
		label_2.setFont(new Font("楷体", Font.BOLD, 15));
		label_2.setBounds(31, 247, 90, 15);
		frame.getContentPane().add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("楷体", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(131, 244, 199, 21);
		frame.getContentPane().add(textField_3);
		
		JLabel label_3 = new JLabel("\u91C7\u8D2D\u5355\u53F7");
		label_3.setFont(new Font("楷体", Font.BOLD, 15));
		label_3.setBounds(31, 290, 90, 15);
		frame.getContentPane().add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("楷体", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(131, 287, 199, 21);
		frame.getContentPane().add(textField_4);
		
		JLabel label_4 = new JLabel("\u91C7\u8D2D\u4EBA\u5458");
		label_4.setFont(new Font("楷体", Font.BOLD, 15));
		label_4.setBounds(31, 332, 90, 15);
		frame.getContentPane().add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("楷体", Font.BOLD, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(131, 329, 199, 21);
		frame.getContentPane().add(textField_5);
		
		JLabel label_5 = new JLabel("\u91C7\u8D2D\u5355\u4EF7");
		label_5.setFont(new Font("楷体", Font.BOLD, 15));
		label_5.setBounds(31, 371, 90, 15);
		frame.getContentPane().add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("楷体", Font.BOLD, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(131, 368, 199, 21);
		frame.getContentPane().add(textField_6);
		
		JLabel label_6 = new JLabel("\u91C7\u8D2D\u603B\u6570");
		label_6.setFont(new Font("楷体", Font.BOLD, 15));
		label_6.setBounds(31, 409, 90, 15);
		frame.getContentPane().add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("楷体", Font.BOLD, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(131, 406, 199, 21);
		frame.getContentPane().add(textField_7);
		
		JLabel label_7 = new JLabel("\u91C7\u8D2D\u603B\u989D");
		label_7.setFont(new Font("楷体", Font.BOLD, 15));
		label_7.setBounds(31, 453, 90, 15);
		frame.getContentPane().add(label_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("楷体", Font.BOLD, 15));
		textField_8.setColumns(10);
		textField_8.setBounds(131, 450, 199, 21);
		frame.getContentPane().add(textField_8);
		
		String[] s1 = new String[9];
		ku k = new ku();
		Connection con = k.SQLku();
		try {
			Statement state = con.createStatement();
			ResultSet rs = null;
			if(m==0) {
				rs = state.executeQuery("select * from caigou_hn where bookid='"+s_1+"'");
			}else if(m==1) {
				rs = state.executeQuery("select * from caigou_bj where bookid='"+s_1+"'");
			}else if(m==2) {
				rs = state.executeQuery("select * from caigou_sh where bookid='"+s_1+"'");
			}else if(m==3) {
				rs = state.executeQuery("select * from caigou_xn where bookid='"+s_1+"'");
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

		textField_1.setText(s1[1]);
		textField_2.setText(s1[2]);
		textField_3.setText(s1[3]);
		textField_4.setText(s1[4]);
		textField_5.setText(s1[5]);
		textField_6.setText(s1[6]);
		textField_7.setText(s1[7]);
		textField_8.setText(s1[8]);
		
		
		String[] s = new String[9];
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "修改成功！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
				Connection con;
				ku k1 = new ku();
				try {
					con = k1.SQLku();
					Statement state = con.createStatement();
					if(m == 0) {
						state.executeUpdate("update caigou_hn set bookname = '"+textField_1.getText()+"',"+"anthor = '"+textField_2.getText()+"',"+"leibie = '"+textField_3.getText()+"',"+"danhao = '"+textField_4.getText()+"',"+"renyuan = '"+textField_5.getText()+"',"+"price = '"+textField_6.getText()+"',"+"sum_0 = '"+textField_7.getText()+"',"+"sum_1 = '"+textField_8.getText()+"'"+"where bookid ='"+s_1+"'");                                            
					}else if(m == 1) {
						state.executeUpdate("update caigou_bj set bookname = '"+textField_1.getText()+"',"+"anthor = '"+textField_2.getText()+"',"+"leibie = '"+textField_3.getText()+"',"+"danhao = '"+textField_4.getText()+"',"+"renyuan = '"+textField_5.getText()+"',"+"price = '"+textField_6.getText()+"',"+"sum_0 = '"+textField_7.getText()+"',"+"sum_1 = '"+textField_8.getText()+"'"+"where bookid ='"+s_1+"'");
					}else if(m == 2) {
						state.executeUpdate("update caigou_sh set bookname = '"+textField_1.getText()+"',"+"anthor = '"+textField_2.getText()+"',"+"leibie = '"+textField_3.getText()+"',"+"danhao = '"+textField_4.getText()+"',"+"renyuan = '"+textField_5.getText()+"',"+"price = '"+textField_6.getText()+"',"+"sum_0 = '"+textField_7.getText()+"',"+"sum_1 = '"+textField_8.getText()+"'"+"where bookid ='"+s_1+"'");
					}else if(m == 3) {
						state.executeUpdate("update caigou_xn set bookname = '"+textField_1.getText()+"',"+"anthor = '"+textField_2.getText()+"',"+"leibie = '"+textField_3.getText()+"',"+"danhao = '"+textField_4.getText()+"',"+"renyuan = '"+textField_5.getText()+"',"+"price = '"+textField_6.getText()+"',"+"sum_0 = '"+textField_7.getText()+"',"+"sum_1 = '"+textField_8.getText()+"'"+"where bookid ='"+s_1+"'");
					}
					state.close();
					con.close();
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					textField_7.setText(null);
					textField_8.setText(null);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		button.setFont(new Font("楷体", Font.BOLD, 15));
		button.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button.setBounds(55, 508, 93, 23);
		frame.getContentPane().add(button);
		button.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button.setBorderPainted(false);  //设置是否绘制边框
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new chaxun(m);
			}
		});
		button_1.setFont(new Font("楷体", Font.BOLD, 15));
		button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_1.setBounds(220, 508, 93, 23);
		frame.getContentPane().add(button_1);
		frame.setVisible(true);
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button_1.setBorderPainted(false);  //设置是否绘制边框
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel_3.setBounds(131, 115, 199, 21);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setText(s1[0]);
	}
	
	
	
	
	// 修改销售记录
		public updatecaigou(int m,String s_1,int m_1) {
			JFrame frame;
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBackground(Color.WHITE);
			frame.setBounds(100, 100, 377, 614);
			frame.setLocationRelativeTo(null);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("img/抬头logo_1.PNG"));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBackground(Color.BLACK);
			lblNewLabel.setBounds(0, 0, 368, 39);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("\u4FEE  \u6539  销  售  \u8BB0  \u5F55");
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
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("楷体", Font.BOLD, 15));
			textField_1.setColumns(10);
			textField_1.setBounds(131, 156, 199, 21);
			frame.getContentPane().add(textField_1);
			
			JLabel label_1 = new JLabel("\u4F5C\u8005");
			label_1.setFont(new Font("楷体", Font.BOLD, 15));
			label_1.setBounds(31, 205, 90, 15);
			frame.getContentPane().add(label_1);
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("楷体", Font.BOLD, 15));
			textField_2.setColumns(10);
			textField_2.setBounds(131, 202, 199, 21);
			frame.getContentPane().add(textField_2);
			
			JLabel label_2 = new JLabel("\u4E66\u7C4D\u7C7B\u522B");
			label_2.setFont(new Font("楷体", Font.BOLD, 15));
			label_2.setBounds(31, 247, 90, 15);
			frame.getContentPane().add(label_2);
			
			textField_3 = new JTextField();
			textField_3.setFont(new Font("楷体", Font.BOLD, 15));
			textField_3.setColumns(10);
			textField_3.setBounds(131, 244, 199, 21);
			frame.getContentPane().add(textField_3);
			
			JLabel label_3 = new JLabel("\u91C7\u8D2D\u5355\u53F7");
			label_3.setFont(new Font("楷体", Font.BOLD, 15));
			label_3.setBounds(31, 290, 90, 15);
			frame.getContentPane().add(label_3);
			
			textField_4 = new JTextField();
			textField_4.setFont(new Font("楷体", Font.BOLD, 15));
			textField_4.setColumns(10);
			textField_4.setBounds(131, 287, 199, 21);
			frame.getContentPane().add(textField_4);
			
			JLabel label_4 = new JLabel("\u91C7\u8D2D\u4EBA\u5458");
			label_4.setFont(new Font("楷体", Font.BOLD, 15));
			label_4.setBounds(31, 332, 90, 15);
			frame.getContentPane().add(label_4);
			
			textField_5 = new JTextField();
			textField_5.setFont(new Font("楷体", Font.BOLD, 15));
			textField_5.setColumns(10);
			textField_5.setBounds(131, 329, 199, 21);
			frame.getContentPane().add(textField_5);
			
			JLabel label_5 = new JLabel("\u91C7\u8D2D\u5355\u4EF7");
			label_5.setFont(new Font("楷体", Font.BOLD, 15));
			label_5.setBounds(31, 371, 90, 15);
			frame.getContentPane().add(label_5);
			
			textField_6 = new JTextField();
			textField_6.setFont(new Font("楷体", Font.BOLD, 15));
			textField_6.setColumns(10);
			textField_6.setBounds(131, 368, 199, 21);
			frame.getContentPane().add(textField_6);
			
			JLabel label_6 = new JLabel("\u91C7\u8D2D\u603B\u6570");
			label_6.setFont(new Font("楷体", Font.BOLD, 15));
			label_6.setBounds(31, 409, 90, 15);
			frame.getContentPane().add(label_6);
			
			textField_7 = new JTextField();
			textField_7.setFont(new Font("楷体", Font.BOLD, 15));
			textField_7.setColumns(10);
			textField_7.setBounds(131, 406, 199, 21);
			frame.getContentPane().add(textField_7);
			
			JLabel label_7 = new JLabel("\u91C7\u8D2D\u603B\u989D");
			label_7.setFont(new Font("楷体", Font.BOLD, 15));
			label_7.setBounds(31, 453, 90, 15);
			frame.getContentPane().add(label_7);
			
			textField_8 = new JTextField();
			textField_8.setFont(new Font("楷体", Font.BOLD, 15));
			textField_8.setColumns(10);
			textField_8.setBounds(131, 450, 199, 21);
			frame.getContentPane().add(textField_8);
			
			String[] s1 = new String[9];
			ku k = new ku();
			Connection con = k.SQLku();
			try {
				Statement state = con.createStatement();
				ResultSet rs = null;
				if(m==0) {
					rs = state.executeQuery("select * from xiaoshou_hn where bookid='"+s_1+"'");
				}else if(m==1) {
					rs = state.executeQuery("select * from xiaoshou_bj where bookid='"+s_1+"'");
				}else if(m==2) {
					rs = state.executeQuery("select * from xiaoshou_sh where bookid='"+s_1+"'");
				}else if(m==3) {
					rs = state.executeQuery("select * from xiaoshou_xn where bookid='"+s_1+"'");
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

			textField_1.setText(s1[1]);
			textField_2.setText(s1[2]);
			textField_3.setText(s1[3]);
			textField_4.setText(s1[4]);
			textField_5.setText(s1[5]);
			textField_6.setText(s1[6]);
			textField_7.setText(s1[7]);
			textField_8.setText(s1[8]);
			
			
			String[] s = new String[9];
			
			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "修改成功！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
					Connection con;
					ku k1 = new ku();
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						if(m == 0) {
							state.executeUpdate("update xiaoshou_hn set bookname = ' "+textField_1.getText()+"',"+"anthor = ' "+textField_2.getText()+"',"+"leibie = ' "+textField_3.getText()+"',"+"danhao = ' "+textField_4.getText()+"',"+"renyuan = ' "+textField_5.getText()+"',"+"price = ' "+textField_6.getText()+"',"+"sum_0 = ' "+textField_7.getText()+"',"+"sum_1 = ' "+textField_8.getText()+"'"+"where bookid ='"+s_1+"'");                                            
						}else if(m == 1) {
							state.executeUpdate("update xiaoshou_bj set bookname = ' "+textField_1.getText()+"',"+"anthor = ' "+textField_2.getText()+"',"+"leibie = ' "+textField_3.getText()+"',"+"danhao = ' "+textField_4.getText()+"',"+"renyuan = ' "+textField_5.getText()+"',"+"price = ' "+textField_6.getText()+"',"+"sum_0 = ' "+textField_7.getText()+"',"+"sum_1 = ' "+textField_8.getText()+"'"+"where bookid ='"+s_1+"'");
						}else if(m == 2) {
							state.executeUpdate("update xiaoshou_sh set bookname = ' "+textField_1.getText()+"',"+"anthor = ' "+textField_2.getText()+"',"+"leibie = ' "+textField_3.getText()+"',"+"danhao = ' "+textField_4.getText()+"',"+"renyuan = ' "+textField_5.getText()+"',"+"price = ' "+textField_6.getText()+"',"+"sum_0 = ' "+textField_7.getText()+"',"+"sum_1 = ' "+textField_8.getText()+"'"+"where bookid ='"+s_1+"'");
						}else if(m == 3) {
							state.executeUpdate("update xiaoshou_xn set bookname = ' "+textField_1.getText()+"',"+"anthor = ' "+textField_2.getText()+"',"+"leibie = ' "+textField_3.getText()+"',"+"danhao = ' "+textField_4.getText()+"',"+"renyuan = ' "+textField_5.getText()+"',"+"price = ' "+textField_6.getText()+"',"+"sum_0 = ' "+textField_7.getText()+"',"+"sum_1 = ' "+textField_8.getText()+"'"+"where bookid ='"+s_1+"'");
						}
						state.close();
						con.close();
						textField_1.setText(null);
						textField_2.setText(null);
						textField_3.setText(null);
						textField_4.setText(null);
						textField_5.setText(null);
						textField_6.setText(null);
						textField_7.setText(null);
						textField_8.setText(null);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					
				}
			});
			button.setFont(new Font("楷体", Font.BOLD, 15));
			button.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button.setBounds(55, 508, 93, 23);
			frame.getContentPane().add(button);
			button.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			button.setBorderPainted(false);  //设置是否绘制边框
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					new chaxun(m);
				}
			});
			button_1.setFont(new Font("楷体", Font.BOLD, 15));
			button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_1.setBounds(220, 508, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			button_1.setBorderPainted(false);  //设置是否绘制边框
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setFont(new Font("楷体", Font.BOLD, 15));
			lblNewLabel_3.setBounds(131, 115, 199, 21);
			frame.getContentPane().add(lblNewLabel_3);
			lblNewLabel_3.setText(s1[0]);
		}
	
		
		
		// 修改库存记录
		public updatecaigou(int m,String s_1,int m_1,int m_2) {
			JFrame frame;
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBackground(Color.WHITE);
			frame.setBounds(100, 100, 377, 614);
			frame.setLocationRelativeTo(null);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("img/抬头logo_1.PNG"));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBackground(Color.BLACK);
			lblNewLabel.setBounds(0, 0, 368, 39);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("\u4FEE  \u6539  库  存  \u8BB0  \u5F55");
			lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 15));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(55, 49, 258, 39);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("编号");
			lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 15));
			lblNewLabel_2.setBounds(31, 121, 90, 15);
			frame.getContentPane().add(lblNewLabel_2);
			
			JLabel label = new JLabel("书籍名称");
			label.setFont(new Font("楷体", Font.BOLD, 15));
			label.setBounds(31, 159, 90, 15);
			frame.getContentPane().add(label);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("楷体", Font.BOLD, 15));
			textField_1.setColumns(10);
			textField_1.setBounds(131, 156, 199, 21);
			frame.getContentPane().add(textField_1);
			
			JLabel label_1 = new JLabel("销售总数");
			label_1.setFont(new Font("楷体", Font.BOLD, 15));
			label_1.setBounds(31, 205, 90, 15);
			frame.getContentPane().add(label_1);
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("楷体", Font.BOLD, 15));
			textField_2.setColumns(10);
			textField_2.setBounds(131, 202, 199, 21);
			frame.getContentPane().add(textField_2);
			
			JLabel label_2 = new JLabel("销售额");
			label_2.setFont(new Font("楷体", Font.BOLD, 15));
			label_2.setBounds(31, 247, 90, 15);
			frame.getContentPane().add(label_2);
			
			textField_3 = new JTextField();
			textField_3.setFont(new Font("楷体", Font.BOLD, 15));
			textField_3.setColumns(10);
			textField_3.setBounds(131, 244, 199, 21);
			frame.getContentPane().add(textField_3);
			
			JLabel label_3 = new JLabel("库存总数");
			label_3.setFont(new Font("楷体", Font.BOLD, 15));
			label_3.setBounds(31, 290, 90, 15);
			frame.getContentPane().add(label_3);
			
			textField_4 = new JTextField();
			textField_4.setFont(new Font("楷体", Font.BOLD, 15));
			textField_4.setColumns(10);
			textField_4.setBounds(131, 287, 199, 21);
			frame.getContentPane().add(textField_4);
			
			JLabel label_4 = new JLabel("库存总额");
			label_4.setFont(new Font("楷体", Font.BOLD, 15));
			label_4.setBounds(31, 332, 90, 15);
			frame.getContentPane().add(label_4);
			
			textField_5 = new JTextField();
			textField_5.setFont(new Font("楷体", Font.BOLD, 15));
			textField_5.setColumns(10);
			textField_5.setBounds(131, 329, 199, 21);
			frame.getContentPane().add(textField_5);
			
			JLabel label_5 = new JLabel("采购日期");
			label_5.setFont(new Font("楷体", Font.BOLD, 15));
			label_5.setBounds(31, 371, 90, 15);
			frame.getContentPane().add(label_5);
			
			textField_6 = new JTextField();
			textField_6.setFont(new Font("楷体", Font.BOLD, 15));
			textField_6.setColumns(10);
			textField_6.setBounds(131, 368, 199, 21);
			frame.getContentPane().add(textField_6);
			
			JLabel label_6 = new JLabel("畅销度");
			label_6.setFont(new Font("楷体", Font.BOLD, 15));
			label_6.setBounds(31, 409, 90, 15);
			frame.getContentPane().add(label_6);
			
			textField_7 = new JTextField();
			textField_7.setFont(new Font("楷体", Font.BOLD, 15));
			textField_7.setColumns(10);
			textField_7.setBounds(131, 406, 199, 21);
			frame.getContentPane().add(textField_7);
			
			String[] s1 = new String[9];
			ku k = new ku();
			Connection con = k.SQLku();
			try {
				Statement state = con.createStatement();
				ResultSet rs = null;
				if(m==0) {
					rs = state.executeQuery("select * from kucun_hn where bookid='"+s_1+"'");
				}else if(m==1) {
					rs = state.executeQuery("select * from kucun_bj where bookid='"+s_1+"'");
				}else if(m==2) {
					rs = state.executeQuery("select * from kucun_sh where bookid='"+s_1+"'");
				}else if(m==3) {
					rs = state.executeQuery("select * from kucun_xn where bookid='"+s_1+"'");
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
				}
				state.close();
				con.close();
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			textField_1.setText(s1[1]);
			textField_2.setText(s1[2]);
			textField_3.setText(s1[3]);
			textField_4.setText(s1[4]);
			textField_5.setText(s1[5]);
			textField_6.setText(s1[6]);
			textField_7.setText(s1[7]);
			
			
			String[] s = new String[8];
			
			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "修改成功！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
					Connection con;
					ku k1 = new ku();
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						if(m == 0) {
							state.executeUpdate("update kucun_hn set bookname = ' "+textField_1.getText()+"',"+"xiaoshou_0 = ' "+textField_2.getText()+"',"+"xiaoshou_1 = ' "+textField_3.getText()+"',"+"kucun_0 = ' "+textField_4.getText()+"',"+"kucun_1 = ' "+textField_5.getText()+"',"+"caigouriqi = ' "+textField_6.getText()+"',"+"changxiaodu = ' "+textField_7.getText()+"'"+"where bookid ='"+s_1+"'");                                            
						}else if(m == 1) {
							state.executeUpdate("update kucun_hn set bookname = ' "+textField_1.getText()+"',"+"xiaoshou_0 = ' "+textField_2.getText()+"',"+"xiaoshou_1 = ' "+textField_3.getText()+"',"+"kucun_0 = ' "+textField_4.getText()+"',"+"kucun_1 = ' "+textField_5.getText()+"',"+"caigouriqi = ' "+textField_6.getText()+"',"+"changxiaodu = ' "+textField_7.getText()+"'"+"where bookid ='"+s_1+"'");
						}else if(m == 2) {
							state.executeUpdate("update kucun_hn set bookname = ' "+textField_1.getText()+"',"+"xiaoshou_0 = ' "+textField_2.getText()+"',"+"xiaoshou_1 = ' "+textField_3.getText()+"',"+"kucun_0 = ' "+textField_4.getText()+"',"+"kucun_1 = ' "+textField_5.getText()+"',"+"caigouriqi = ' "+textField_6.getText()+"',"+"changxiaodu = ' "+textField_7.getText()+"'"+"where bookid ='"+s_1+"'");
						}else if(m == 3) {
							state.executeUpdate("update kucun_hn set bookname = ' "+textField_1.getText()+"',"+"xiaoshou_0 = ' "+textField_2.getText()+"',"+"xiaoshou_1 = ' "+textField_3.getText()+"',"+"kucun_0 = ' "+textField_4.getText()+"',"+"kucun_1 = ' "+textField_5.getText()+"',"+"caigouriqi = ' "+textField_6.getText()+"',"+"changxiaodu = ' "+textField_7.getText()+"'"+"where bookid ='"+s_1+"'");
						}
						state.close();
						con.close();
						textField_1.setText(null);
						textField_2.setText(null);
						textField_3.setText(null);
						textField_4.setText(null);
						textField_5.setText(null);
						textField_6.setText(null);
						textField_7.setText(null);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					
				}
			});
			button.setFont(new Font("楷体", Font.BOLD, 15));
			button.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button.setBounds(55, 508, 93, 23);
			frame.getContentPane().add(button);
			button.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			button.setBorderPainted(false);  //设置是否绘制边框
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					new chaxun(m);
				}
			});
			button_1.setFont(new Font("楷体", Font.BOLD, 15));
			button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_1.setBounds(220, 508, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			button_1.setBorderPainted(false);  //设置是否绘制边框
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setFont(new Font("楷体", Font.BOLD, 15));
			lblNewLabel_3.setBounds(131, 115, 199, 21);
			frame.getContentPane().add(lblNewLabel_3);
			lblNewLabel_3.setText(s1[0]);
		}
		
		
		
		
		// 修改人员记录
		public updatecaigou(int m,String s_1,int m_1,int m_2,int m_3) {
			JFrame frame;
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBackground(Color.WHITE);
			frame.setBounds(100, 100, 377, 614);
			frame.setLocationRelativeTo(null);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("img/抬头logo_1.PNG"));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBackground(Color.BLACK);
			lblNewLabel.setBounds(0, 0, 368, 39);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("\u4FEE  \u6539  \u91C7  \u8D2D  \u8BB0  \u5F55");
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
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("楷体", Font.BOLD, 15));
			textField_1.setColumns(10);
			textField_1.setBounds(131, 156, 199, 21);
			frame.getContentPane().add(textField_1);
			
			JLabel label_1 = new JLabel("\u4F5C\u8005");
			label_1.setFont(new Font("楷体", Font.BOLD, 15));
			label_1.setBounds(31, 205, 90, 15);
			frame.getContentPane().add(label_1);
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("楷体", Font.BOLD, 15));
			textField_2.setColumns(10);
			textField_2.setBounds(131, 202, 199, 21);
			frame.getContentPane().add(textField_2);
			
			JLabel label_2 = new JLabel("\u4E66\u7C4D\u7C7B\u522B");
			label_2.setFont(new Font("楷体", Font.BOLD, 15));
			label_2.setBounds(31, 247, 90, 15);
			frame.getContentPane().add(label_2);
			
			textField_3 = new JTextField();
			textField_3.setFont(new Font("楷体", Font.BOLD, 15));
			textField_3.setColumns(10);
			textField_3.setBounds(131, 244, 199, 21);
			frame.getContentPane().add(textField_3);
			
			JLabel label_3 = new JLabel("\u91C7\u8D2D\u5355\u53F7");
			label_3.setFont(new Font("楷体", Font.BOLD, 15));
			label_3.setBounds(31, 290, 90, 15);
			frame.getContentPane().add(label_3);
			
			textField_4 = new JTextField();
			textField_4.setFont(new Font("楷体", Font.BOLD, 15));
			textField_4.setColumns(10);
			textField_4.setBounds(131, 287, 199, 21);
			frame.getContentPane().add(textField_4);
			
			JLabel label_4 = new JLabel("\u91C7\u8D2D\u4EBA\u5458");
			label_4.setFont(new Font("楷体", Font.BOLD, 15));
			label_4.setBounds(31, 332, 90, 15);
			frame.getContentPane().add(label_4);
			
			textField_5 = new JTextField();
			textField_5.setFont(new Font("楷体", Font.BOLD, 15));
			textField_5.setColumns(10);
			textField_5.setBounds(131, 329, 199, 21);
			frame.getContentPane().add(textField_5);
			
			JLabel label_5 = new JLabel("\u91C7\u8D2D\u5355\u4EF7");
			label_5.setFont(new Font("楷体", Font.BOLD, 15));
			label_5.setBounds(31, 371, 90, 15);
			frame.getContentPane().add(label_5);
			
			textField_6 = new JTextField();
			textField_6.setFont(new Font("楷体", Font.BOLD, 15));
			textField_6.setColumns(10);
			textField_6.setBounds(131, 368, 199, 21);
			frame.getContentPane().add(textField_6);
			
			JLabel label_6 = new JLabel("\u91C7\u8D2D\u603B\u6570");
			label_6.setFont(new Font("楷体", Font.BOLD, 15));
			label_6.setBounds(31, 409, 90, 15);
			frame.getContentPane().add(label_6);
			
			textField_7 = new JTextField();
			textField_7.setFont(new Font("楷体", Font.BOLD, 15));
			textField_7.setColumns(10);
			textField_7.setBounds(131, 406, 199, 21);
			frame.getContentPane().add(textField_7);
			
			JLabel label_7 = new JLabel("\u91C7\u8D2D\u603B\u989D");
			label_7.setFont(new Font("楷体", Font.BOLD, 15));
			label_7.setBounds(31, 453, 90, 15);
			frame.getContentPane().add(label_7);
			
			textField_8 = new JTextField();
			textField_8.setFont(new Font("楷体", Font.BOLD, 15));
			textField_8.setColumns(10);
			textField_8.setBounds(131, 450, 199, 21);
			frame.getContentPane().add(textField_8);
			
			JLabel label_8 = new JLabel("\u91C7\u8D2D\u603B\u989D");
			label_8.setFont(new Font("楷体", Font.BOLD, 15));
			label_8.setBounds(31, 489, 90, 15);
			frame.getContentPane().add(label_8);
			
			textField_10 = new JTextField();
			textField_10.setText((String) null);
			textField_10.setFont(new Font("楷体", Font.BOLD, 15));
			textField_10.setColumns(10);
			textField_10.setBounds(131, 486, 199, 21);
			frame.getContentPane().add(textField_10);
			
			String[] s_11 = {"编号", "名称", "联系方式", "地址", "电子邮箱", "供货商负责人", "性别",  "联系方式", "收款银行", "银行账号"};
			String[] s_12 = {"编号", "名称", "联系方式", "地址", "电子邮箱", "地区邮编", "经销商负责人", "性别",  "联系方式","负责分区"};
			String[] s_13 = {"工号", "性别", "姓名", "工龄", "职位", "薪资", "联系方式", "电子邮箱", "所属分区", "银行卡号"};
			
			if(m==0) {
				lblNewLabel_2.setText(s_11[0]);
				label.setText(s_11[1]);
				label_1.setText(s_11[2]);
				label_2.setText(s_11[3]);
				label_3.setText(s_11[4]);
				label_4.setText(s_11[5]);
				label_5.setText(s_11[6]);
				label_6.setText(s_11[7]);
				label_7.setText(s_11[8]);
				label_8.setText(s_11[9]);
			}else if(m==1) {
				lblNewLabel_2.setText(s_12[0]);
				label.setText(s_12[1]);
				label_1.setText(s_12[2]);
				label_2.setText(s_12[3]);
				label_3.setText(s_12[4]);
				label_4.setText(s_12[5]);
				label_5.setText(s_12[6]);
				label_6.setText(s_12[7]);
				label_7.setText(s_12[8]);
				label_8.setText(s_12[9]);
			}else {
				lblNewLabel_2.setText(s_13[0]);
				label.setText(s_13[1]);
				label_1.setText(s_13[2]);
				label_2.setText(s_13[3]);
				label_3.setText(s_13[4]);
				label_4.setText(s_13[5]);
				label_5.setText(s_13[6]);
				label_6.setText(s_13[7]);
				label_7.setText(s_13[8]);
				label_8.setText(s_13[9]);
			}
			
			
			String[] s1 = new String[10];
			ku k = new ku();
			Connection con = k.SQLku();
			try {
				Statement state = con.createStatement();
				ResultSet rs = null;
				if(m==0) {
					rs = state.executeQuery("select * from gonghuoshang where id='"+s_1+"'");
				}else if(m==1) {
					rs = state.executeQuery("select * from jingxiaoshang where id='"+s_1+"'");
				}else if(m==2) {
					rs = state.executeQuery("select * from fenqujingli where id='"+s_1+"'");
				}else if(m==3) {
					rs = state.executeQuery("select * from fenquyuangong where id='"+s_1+"'");
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
					s1[9] = rs.getString(10);
				}
				state.close();
				con.close();
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			textField_1.setText(s1[1]);
			textField_2.setText(s1[2]);
			textField_3.setText(s1[3]);
			textField_4.setText(s1[4]);
			textField_5.setText(s1[5]);
			textField_6.setText(s1[6]);
			textField_7.setText(s1[7]);
			textField_8.setText(s1[8]);
			textField_10.setText(s1[9]);
			
			
			String[] s = new String[10];
			
			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "修改成功！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
					Connection con;
					ku k1 = new ku();
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						if(m == 0) {
							state.executeUpdate("update gonghuoshang set name = ' "+textField_1.getText()+"',"+"phone = ' "+textField_2.getText()+"',"+"adress = ' "+textField_3.getText()+"',"+"email = ' "+textField_4.getText()+"',"+"fuzeren = ' "+textField_5.getText()+"',"+"sex = ' "+textField_6.getText()+"',"+"phone_1 = ' "+textField_7.getText()+"',"+"bank = ' "+textField_8.getText()+"',"+"bankid = ' "+textField_10.getText()+"'"+"where id ='"+s_1+"'");                                            
						}else if(m == 1) {
							state.executeUpdate("update jingxiaoshang set name = ' "+textField_1.getText()+"',"+"phone = ' "+textField_2.getText()+"',"+"adress = ' "+textField_3.getText()+"',"+"email = ' "+textField_4.getText()+"',"+"youbian = ' "+textField_5.getText()+"',"+"fuzeren = ' "+textField_6.getText()+"',"+"sex = ' "+textField_7.getText()+"',"+"phone_1 = ' "+textField_8.getText()+"',"+"fenqu = ' "+textField_10.getText()+"'"+"where bookid ='"+s_1+"'");
						}else if(m == 2) {
							state.executeUpdate("update fenqujingli set	sex = ' "+textField_1.getText()+"',"+"name = ' "+textField_2.getText()+"',"+"age = ' "+textField_3.getText()+"',"+"zhiwei = ' "+textField_4.getText()+"',"+"xinzi = ' "+textField_5.getText()+"',"+"phone = ' "+textField_6.getText()+"',"+"email = ' "+textField_7.getText()+"',"+"fenqu = ' "+textField_8.getText()+"',"+"bankid = ' "+textField_10.getText()+"'"+"where id ='"+s_1+"'");
						}else if(m == 3) {
							state.executeUpdate("update fenquyuangong set bookname = ' "+textField_1.getText()+"',"+"name = ' "+textField_2.getText()+"',"+"age = ' "+textField_3.getText()+"',"+"zhiwei = ' "+textField_4.getText()+"',"+"xinzi = ' "+textField_5.getText()+"',"+"phone = ' "+textField_6.getText()+"',"+"email = '"+textField_7.getText()+"',"+"fenqu = ' "+textField_8.getText()+"',"+"bankid = ' "+textField_10.getText()+"'"+"where id ='"+s_1+"'");
						}
						state.close();
						con.close();
						textField_1.setText(null);
						textField_2.setText(null);
						textField_3.setText(null);
						textField_4.setText(null);
						textField_5.setText(null);
						textField_6.setText(null);
						textField_7.setText(null);
						textField_8.setText(null);
						textField_10.setText(null);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					
				}
			});
			button.setFont(new Font("楷体", Font.BOLD, 15));
			button.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button.setBounds(55, 529, 93, 23);
			frame.getContentPane().add(button);
			button.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			button.setBorderPainted(false);  //设置是否绘制边框
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					new chaxun(m);
				}
			});
			button_1.setFont(new Font("楷体", Font.BOLD, 15));
			button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_1.setBounds(220, 529, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			button_1.setBorderPainted(false);  //设置是否绘制边框
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setFont(new Font("楷体", Font.BOLD, 15));
			lblNewLabel_3.setBounds(131, 115, 199, 21);
			frame.getContentPane().add(lblNewLabel_3);
			lblNewLabel_3.setText(s1[0]);
			
		}
	
}



































