package zhujiemian;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class addcaigou {
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
	
	//添加采购记录
	public addcaigou(int m) {
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
		
		JLabel lblNewLabel_1 = new JLabel("\u6DFB  \u52A0  采  购  \u8BB0  \u5F55");
		lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(55, 49, 258, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u7F16\u53F7");
		lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel_2.setBounds(31, 131, 90, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(131, 128, 199, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u4E66\u7C4D\u540D\u79F0");
		label.setFont(new Font("楷体", Font.BOLD, 15));
		label.setBounds(31, 174, 90, 15);
		frame.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 171, 199, 21);
		frame.getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("\u4F5C\u8005");
		label_1.setFont(new Font("楷体", Font.BOLD, 15));
		label_1.setBounds(31, 220, 90, 15);
		frame.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(131, 217, 199, 21);
		frame.getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("\u4E66\u7C4D\u7C7B\u522B");
		label_2.setFont(new Font("楷体", Font.BOLD, 15));
		label_2.setBounds(31, 262, 90, 15);
		frame.getContentPane().add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(131, 259, 199, 21);
		frame.getContentPane().add(textField_3);
		
		JLabel label_3 = new JLabel("\u91C7\u8D2D\u5355\u53F7");
		label_3.setFont(new Font("楷体", Font.BOLD, 15));
		label_3.setBounds(31, 305, 90, 15);
		frame.getContentPane().add(label_3);
		
	
		int i = (int)(Math.random()*100000);
		DecimalFormat df_1=new DecimalFormat("000000"); // 字符串长度<=6时带前导零，>6时照常显示
		String s000 = df_1.format(i);
		JLabel label_4_1 = new JLabel(s000);
		label_4_1.setFont(new Font("楷体", Font.BOLD, 15));
		label_4_1.setBounds(131, 300, 199, 21);
		frame.getContentPane().add(label_4_1);
		
		JLabel label_4 = new JLabel("\u91C7\u8D2D\u4EBA\u5458");
		label_4.setFont(new Font("楷体", Font.BOLD, 15));
		label_4.setBounds(31, 347, 90, 15);
		frame.getContentPane().add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(131, 345, 199, 21);
		frame.getContentPane().add(textField_5);
		
		JLabel label_5 = new JLabel("\u91C7\u8D2D\u5355\u4EF7");
		label_5.setFont(new Font("楷体", Font.BOLD, 15));
		label_5.setBounds(31, 395, 90, 15);
		frame.getContentPane().add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(131, 395, 199, 21);
		frame.getContentPane().add(textField_6);
		
		JLabel label_6 = new JLabel("\u91C7\u8D2D\u603B\u6570");
		label_6.setFont(new Font("楷体", Font.BOLD, 15));
		label_6.setBounds(31, 445, 90, 15);
		frame.getContentPane().add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(131, 445, 199, 21);
		frame.getContentPane().add(textField_7);
		
		String[] s = new String[10];
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s[0] = textField.getText();
				s[1] = textField_1.getText();
			    s[2] = textField_2.getText();
				s[3] = textField_3.getText();
				s[4] = label_4_1.getText();
				s[5] = textField_5.getText();
				s[6] = textField_6.getText();
				s[7] = textField_7.getText();
				long a = Integer.valueOf(s[6]);
				long a_1 = Integer.valueOf(s[7]);
				s[8] = a*a_1+"";
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
				s[9] = df.format(new Date());
				
				baojing t = new baojing();
				int n_1 = t.baojing_1(m,1,s[0], s[7],s[1]);
				if(n_1==0) {
					Connection con;
					ku k1 = new ku();
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						if(m == 0) {
							state.execute("INSERT INTO caigou_hn"+"(bookid,bookname,anthor,leibie,danhao,renyuan,price,sum_0,sum_1,time)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
						}else if(m == 1) {
							state.execute("INSERT INTO caigou_bj"+"(bookid,bookname,anthor,leibie,danhao,renyuan,price,sum_0,sum_1,time)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
						}else if(m == 2) {
							state.execute("INSERT INTO caigou_sh"+"(bookid,bookname,anthor,leibie,danhao,renyuan,price,sum_0,sum_1,time)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
						}else if(m == 3) {
							state.execute("INSERT INTO caigou_xn"+"(bookid,bookname,anthor,leibie,danhao,renyuan,price,sum_0,sum_1,time)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
						}
						state.close();
						con.close();
						JOptionPane.showMessageDialog(null, "添加成功！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					new jinxiaoku(m,0,s[0]);
					new zhangkuan(m,0,s[0]);
					
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					label_4_1.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					textField_7.setText(null);
					
				}else {

					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					label_4_1.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					textField_7.setText(null);
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
			}
		});
		button_1.setFont(new Font("楷体", Font.BOLD, 15));
		button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_1.setBounds(220, 508, 93, 23);
		frame.getContentPane().add(button_1);
		frame.setVisible(true);
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button_1.setBorderPainted(false);  //设置是否绘制边框
		
		
	}
	
	
	
	
	
	//添加销售记录
	public addcaigou(int m,int m_1) {
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
		
		JLabel lblNewLabel_1 = new JLabel("\u6DFB  \u52A0  销  售  \u8BB0  \u5F55");
		lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(55, 49, 258, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u7F16\u53F7");
		lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel_2.setBounds(31, 121, 90, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(131, 118, 199, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JLabel label_3 = new JLabel("销售\u5355\u53F7");
		label_3.setFont(new Font("楷体", Font.BOLD, 15));
		label_3.setBounds(31, 305, 90, 15);
		frame.getContentPane().add(label_3);
		
		int i = (int)(Math.random()*100000);
		DecimalFormat df_1=new DecimalFormat("000000"); // 字符串长度<=6时带前导零，>6时照常显示
		String s000 = df_1.format(i);
		JLabel label_4_1 = new JLabel(s000);
		label_4_1.setFont(new Font("楷体", Font.BOLD, 15));
		label_4_1.setBounds(131, 300, 199, 21);
		frame.getContentPane().add(label_4_1);
		
		JLabel label_4 = new JLabel("销售\u4EBA\u5458");
		label_4.setFont(new Font("楷体", Font.BOLD, 15));
		label_4.setBounds(31, 345, 90, 15);
		frame.getContentPane().add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(131, 345, 199, 21);
		frame.getContentPane().add(textField_5);
		
		JLabel label_5 = new JLabel("销售\u5355\u4EF7");
		label_5.setFont(new Font("楷体", Font.BOLD, 15));
		label_5.setBounds(31, 385, 90, 15);
		frame.getContentPane().add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(131, 385, 199, 21);
		frame.getContentPane().add(textField_6);
		
		JLabel label_6 = new JLabel("销售\u603B\u6570");
		label_6.setFont(new Font("楷体", Font.BOLD, 15));
		label_6.setBounds(31, 435, 90, 15);
		frame.getContentPane().add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(131, 435, 199, 21);
		frame.getContentPane().add(textField_7);
		
		String[] s = new String[10];
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ku k2 = new ku();
				Connection con = k2.SQLku();
				Statement state;
				String[] s3 = new String[10];
				try {
					state = con.createStatement();
					ResultSet rs_2 = null;
					if(m==0) {
						rs_2 = state.executeQuery("select * from caigou_hn where bookid='"+textField.getText()+"'");
					}else if(m==1) {
						rs_2 = state.executeQuery("select * from caigou_bj where bookid='"+textField.getText()+"'");
					}else if(m==2) {
						rs_2 = state.executeQuery("select * from caigou_sh where bookid='"+textField.getText()+"'");
					}else if(m==3) {
						rs_2 = state.executeQuery("select * from caigou_xn where bookid='"+textField.getText()+"'");
					}
					rs_2.last();
					rs_2.beforeFirst();
					
					while(rs_2.next()) {
						s3[0] = rs_2.getString(1);
						s3[1] = rs_2.getString(2);
						s3[2] = rs_2.getString(3);
						s3[3] = rs_2.getString(4);
						s3[4] = rs_2.getString(5);
						s3[5] = rs_2.getString(6);
						s3[6] = rs_2.getString(7);
						s3[7] = rs_2.getString(8);
						s3[8] = rs_2.getString(9);
						s3[9] = rs_2.getString(10);
					}
					rs_2.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
				
				
				
				s[0] = textField.getText();
				s[1] = s3[1];
				s[2] = s3[2];
				s[3] = s3[3];
				s[4] = label_4_1.getText();
				s[5] = textField_5.getText();
				s[6] = textField_6.getText();
				s[7] = textField_7.getText();
				int a = Integer.valueOf(s[6]);
				int a_1 = Integer.valueOf(s[7]);
				s[8] = a*a_1+"";
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
				s[9] = df.format(new Date());
				
					try {
						ResultSet rs = null;
						state = con.createStatement();
						if(m == 0) {
							rs = state.executeQuery("select kucun_0 from kucun_hn where bookid='"+s[0]+"'");
						}else if(m == 1) {
							rs = state.executeQuery("select kucun_0 from kucun_bj where bookid='"+s[0]+"'");
						}else if(m == 2) {
							rs = state.executeQuery("select kucun_0 from kucun_sh where bookid='"+s[0]+"'");
						}else if(m == 3) {
							rs = state.executeQuery("select kucun_0 from kucun_xn where bookid='"+s[0]+"'");
						}
						
						
						if(rs.next()) {
							baojing t = new baojing();
							int n_1 = t.baojing_1(m,0,s[0], s[7],s[1]);
							if(n_1 == 0) {
								JOptionPane.showMessageDialog(null, "添加成功！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
								if(m == 0) {
									state.execute("INSERT INTO xiaoshou_hn"+"(bookid,bookname,anthor,leibie,danhao,renyuan,price,sum_0,sum_1,time)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
								}else if(m == 1) {
									state.execute("INSERT INTO xiaoshou_bj"+"(bookid,bookname,anthor,leibie,danhao,renyuan,price,sum_0,sum_1,time)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
								}else if(m == 2) {
									state.execute("INSERT INTO xiaoshou_sh"+"(bookid,bookname,anthor,leibie,danhao,renyuan,price,sum_0,sum_1,time)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
								}else if(m == 3) {
									state.execute("INSERT INTO xiaoshou_xn"+"(bookid,bookname,anthor,leibie,danhao,renyuan,price,sum_0,sum_1,time)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
								}
								state.close();
								con.close();
								
								new jinxiaoku(m,1,s[0]);
								new zhangkuan(m,1,s[0]);
							}else {
								;
							}
							
						}else {
							JOptionPane.showMessageDialog(null, "查无此书！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
						}
						
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					
					
					textField.setText("");
					label_4_1.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
				
				
				
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
			}
		});
		button_1.setFont(new Font("楷体", Font.BOLD, 15));
		button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		button_1.setBounds(220, 508, 93, 23);
		frame.getContentPane().add(button_1);
		frame.setVisible(true);
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		button_1.setBorderPainted(false);  //设置是否绘制边框
	}
	
	
	
	//添加库存记录
		public addcaigou(int m,int m_1,int m_2) {
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
			
			JLabel lblNewLabel_1 = new JLabel("\u6DFB  \u52A0  库  存  \u8BB0  \u5F55");
			lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 15));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(55, 49, 258, 39);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("编号");
			lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 15));
			lblNewLabel_2.setBounds(31, 125, 90, 15);
			frame.getContentPane().add(lblNewLabel_2);
			
			textField = new JTextField();
			textField.setBounds(131, 123, 199, 21);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			JLabel label = new JLabel("书籍名称");
			label.setFont(new Font("楷体", Font.BOLD, 15));
			label.setBounds(31, 164, 90, 15);
			frame.getContentPane().add(label);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(131, 161, 199, 21);
			frame.getContentPane().add(textField_1);
			
			JLabel label_1 = new JLabel("销售总数");
			label_1.setFont(new Font("楷体", Font.BOLD, 15));
			label_1.setBounds(31, 210, 90, 15);
			frame.getContentPane().add(label_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(131, 207, 199, 21);
			frame.getContentPane().add(textField_2);
			
			JLabel label_2 = new JLabel("销售额");
			label_2.setFont(new Font("楷体", Font.BOLD, 15));
			label_2.setBounds(31, 252, 90, 15);
			frame.getContentPane().add(label_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(131, 249, 199, 21);
			frame.getContentPane().add(textField_3);
			
			JLabel label_3 = new JLabel("库存总数");
			label_3.setFont(new Font("楷体", Font.BOLD, 15));
			label_3.setBounds(31, 295, 90, 15);
			frame.getContentPane().add(label_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(131, 292, 199, 21);
			frame.getContentPane().add(textField_4);
			
			JLabel label_4 = new JLabel("库存总额");
			label_4.setFont(new Font("楷体", Font.BOLD, 15));
			label_4.setBounds(31, 337, 90, 15);
			frame.getContentPane().add(label_4);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(131, 334, 199, 21);
			frame.getContentPane().add(textField_5);
			
			JLabel label_5 = new JLabel("采购日期");
			label_5.setFont(new Font("楷体", Font.BOLD, 15));
			label_5.setBounds(31, 376, 90, 15);
			frame.getContentPane().add(label_5);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(131, 373, 199, 21);
			frame.getContentPane().add(textField_6);
			
			JLabel label_6 = new JLabel("畅销度");
			label_6.setFont(new Font("楷体", Font.BOLD, 15));
			label_6.setBounds(31, 411, 90, 15);
			frame.getContentPane().add(label_6);
			
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(131, 411, 199, 21);
			frame.getContentPane().add(textField_7);
			
			String[] s = new String[8];
			
			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "添加成功！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
					s[0] = textField.getText();
					s[1] = textField_1.getText();
				    s[2] = textField_2.getText();
					s[3] = textField_3.getText();
					s[4] = textField_4.getText();
					s[5] = textField_5.getText();
					s[6] = textField_6.getText();
					s[7] = textField_7.getText();
					
					Connection con;
					ku k1 = new ku();
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						if(m == 0) {
							state.execute("INSERT INTO kucun_hn"+"(bookid,bookname,xiaoshou_0,xiaoshou_1,kucun_0,kucun_1,caigouriqi,changxiaodu)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+")");
						}else if(m == 1) {
							state.execute("INSERT INTO kucun_bj"+"(bookid,bookname,xiaoshou_0,xiaoshou_1,kucun_0,kucun_1,caigouriqi,changxiaodu)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+")");
						}else if(m == 2) {
							state.execute("INSERT INTO kucun_sh"+"(bookid,bookname,xiaoshou_0,xiaoshou_1,kucun_0,kucun_1,caigouriqi,changxiaodu)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+")");
						}else if(m == 3) {
							state.execute("INSERT INTO kucun_xn"+"(bookid,bookname,xiaoshou_0,xiaoshou_1,kucun_0,kucun_1,caigouriqi,changxiaodu)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+")");
						}
						state.close();
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					textField_7.setText(null);
					
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
				}
			});
			button_1.setFont(new Font("楷体", Font.BOLD, 15));
			button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_1.setBounds(220, 508, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			button_1.setBorderPainted(false);  //设置是否绘制边框
		}
		
		
		
		
		//添加人员记录
		public addcaigou(int m,int _1,int m_2,int m_3) {
			JFrame frame;
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBackground(Color.WHITE);
			frame.setBounds(100, 100, 377, 614);
			frame.setLocationRelativeTo(null);
			frame.getContentPane().setLayout(null);
			String[] s_11 = {"编号", "名称", "联系方式", "地址", "电子邮箱", "供货商负责人", "性别",  "联系方式", "收款银行", "银行账号"};
			String[] s_12 = {"编号", "名称", "联系方式", "地址", "电子邮箱", "地区邮编", "经销商负责人", "性别",  "联系方式","负责分区"};
			String[] s_13 = {"工号", "性别", "姓名", "工龄", "职位", "薪资", "联系方式", "电子邮箱", "所属分区", "银行卡号"};
	
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("img/抬头logo_1.PNG"));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBackground(Color.BLACK);
			lblNewLabel.setBounds(0, 0, 368, 39);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("\u6DFB  \u52A0  人  员  \u8BB0  \u5F55");
			lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 15));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(55, 49, 258, 39);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("\u7F16\u53F7");
			lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 15));
			lblNewLabel_2.setBounds(34, 101, 90, 15);
			frame.getContentPane().add(lblNewLabel_2);
			
			textField = new JTextField();
			textField.setBounds(134, 98, 199, 21);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			textField.setFont(new Font("楷体", Font.BOLD, 15));
			
			JLabel label = new JLabel("\u4E66\u7C4D\u540D\u79F0");
			label.setFont(new Font("楷体", Font.BOLD, 15));
			label.setBounds(34, 139, 90, 15);
			frame.getContentPane().add(label);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(134, 136, 199, 21);
			textField_1.setFont(new Font("楷体", Font.BOLD, 15));
			frame.getContentPane().add(textField_1);
			
			JLabel label_1 = new JLabel("\u4F5C\u8005");
			label_1.setFont(new Font("楷体", Font.BOLD, 15));
			label_1.setBounds(34, 185, 90, 15);
			frame.getContentPane().add(label_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(134, 182, 199, 21);
			textField_2.setFont(new Font("楷体", Font.BOLD, 15));
			frame.getContentPane().add(textField_2);
			
			JLabel label_2 = new JLabel("\u4E66\u7C4D\u7C7B\u522B");
			label_2.setFont(new Font("楷体", Font.BOLD, 15));
			label_2.setBounds(34, 227, 90, 15);
			frame.getContentPane().add(label_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(134, 224, 199, 21);
			textField_3.setFont(new Font("楷体", Font.BOLD, 15));
			frame.getContentPane().add(textField_3);
			
			JLabel label_3 = new JLabel("\u91C7\u8D2D\u5355\u53F7");
			label_3.setFont(new Font("楷体", Font.BOLD, 15));
			label_3.setBounds(34, 270, 90, 15);
			frame.getContentPane().add(label_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(134, 267, 199, 21);
			textField_4.setFont(new Font("楷体", Font.BOLD, 15));
			frame.getContentPane().add(textField_4);
			
			JLabel label_4 = new JLabel("\u91C7\u8D2D\u4EBA\u5458");
			label_4.setFont(new Font("楷体", Font.BOLD, 15));
			label_4.setBounds(34, 312, 103, 15);
			frame.getContentPane().add(label_4);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(134, 309, 199, 21);
			textField_5.setFont(new Font("楷体", Font.BOLD, 15));
			frame.getContentPane().add(textField_5);
			
			JLabel label_5 = new JLabel("\u91C7\u8D2D\u5355\u4EF7");
			label_5.setFont(new Font("楷体", Font.BOLD, 15));
			label_5.setBounds(34, 351, 103, 15);
			frame.getContentPane().add(label_5);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(134, 348, 199, 21);
			textField_6.setFont(new Font("楷体", Font.BOLD, 15));
			frame.getContentPane().add(textField_6);
			
			JLabel label_6 = new JLabel("\u91C7\u8D2D\u603B\u6570");
			label_6.setFont(new Font("楷体", Font.BOLD, 15));
			label_6.setBounds(34, 389, 90, 15);
			frame.getContentPane().add(label_6);
			
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(134, 386, 199, 21);
			textField_7.setFont(new Font("楷体", Font.BOLD, 15));
			frame.getContentPane().add(textField_7);
			
			JLabel label_7 = new JLabel("\u91C7\u8D2D\u603B\u989D");
			label_7.setFont(new Font("楷体", Font.BOLD, 15));
			label_7.setBounds(34, 433, 90, 15);
			frame.getContentPane().add(label_7);
			
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(134, 430, 199, 21);
			textField_8.setFont(new Font("楷体", Font.BOLD, 15));
			frame.getContentPane().add(textField_8);
			
			JLabel label_8 = new JLabel("\u91C7\u8D2D\u603B\u989D");
			label_8.setFont(new Font("楷体", Font.BOLD, 15));
			label_8.setBounds(34, 482, 90, 15);
			frame.getContentPane().add(label_8);
			
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(134, 479, 199, 21);
			textField_9.setFont(new Font("楷体", Font.BOLD, 15));
			frame.getContentPane().add(textField_9);
			
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
			
			
			String[] s = new String[10];
			
			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "添加成功！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
					s[0] = textField.getText();
					s[1] = textField_1.getText();
				    s[2] = textField_2.getText();
					s[3] = textField_3.getText();
					s[4] = textField_4.getText();
					s[5] = textField_5.getText();
					s[6] = textField_6.getText();
					s[7] = textField_7.getText();
					s[8] = textField_8.getText();
					s[9] = textField_9.getText();
					
					Connection con;
					ku k1 = new ku();
					try {
						con = k1.SQLku();
						Statement state = con.createStatement();
						if(m == 0) {
							state.execute("INSERT INTO gonghuoshang"+"(id,name,phone,adress,email,fuzeren,sex,phone_1,bank,bankid)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
						}else if(m == 1) {
							state.execute("INSERT INTO jingxiaoshang"+"(id,name,phone,adress,email,youbian,fuzeren,sex,phone_1,fenqu)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
						}else if(m == 3) {
							state.execute("INSERT INTO fenquyuangong"+"(id,sex,name,age,zhiwei,xinzi,phone,email,fenqu,bankid)"+"VALUES("+"'"+s[0]+"'"+","+"'"+s[1]+"'"+","+"'"+s[2]+"'"+","+"'"+s[3]+"'"+","+"'"+s[4]+"'"+","+"'"+s[5]+"'"+","+"'"+s[6]+"'"+","+"'"+s[7]+"'"+","+"'"+s[8]+"'"+","+"'"+s[9]+"'"+")");
						}
						state.close();
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					textField_7.setText(null);
					textField_8.setText(null);
					textField_9.setText(null);
					
				}
			});
			button.setFont(new Font("楷体", Font.BOLD, 15));
			button.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button.setBounds(55, 526, 93, 23);
			frame.getContentPane().add(button);
			button.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			button.setBorderPainted(false);  //设置是否绘制边框
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
				}
			});
			button_1.setFont(new Font("楷体", Font.BOLD, 15));
			button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button_1.setBounds(220, 526, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			button_1.setBorderPainted(false);  //设置是否绘制边框
		}
		
	
	
}



































