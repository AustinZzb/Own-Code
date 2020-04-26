package zhujiemian;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class zhuce {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public zhuce() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 408, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D");
		lblNewLabel.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel.setBounds(67, 102, 54, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("楷体", Font.BOLD, 15));
		textField.setBounds(203, 102, 115, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u6027\u522B");
		label.setFont(new Font("楷体", Font.BOLD, 15));
		label.setBounds(67, 153, 54, 15);
		frame.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("楷体", Font.BOLD, 15));
		textField_1.setBounds(203, 153, 115, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u90AE\u7BB1");
		lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel_1.setBounds(67, 201, 54, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("楷体", Font.BOLD, 15));
		textField_2.setBounds(203, 201, 115, 21);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u624B\u673A\u53F7");
		lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel_2.setBounds(67, 327, 54, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("楷体", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(203, 327, 115, 21);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(98, 354, 54, 15);
		frame.getContentPane().add(lblNewLabel_3);
		frame.setVisible(true);
		
		
				
				JLabel label_3 = new JLabel("\u9A8C\u8BC1\u7801");
				label_3.setFont(new Font("楷体", Font.BOLD, 15));
				label_3.setBounds(65, 464, 54, 15);
				frame.getContentPane().add(label_3);
				
				textField_4 = new JTextField();
				textField_4.setFont(new Font("楷体", Font.BOLD, 15));
				textField_4.setColumns(10);
				textField_4.setBounds(203, 463, 115, 21);
				frame.getContentPane().add(textField_4);
				
								
				JLabel lblNewLabel_5 = new JLabel("");
				lblNewLabel_5.setIcon(new ImageIcon("img/抬头logo_1.PNG"));
				lblNewLabel_5.setBounds(0, 0, 398, 39);
				frame.getContentPane().add(lblNewLabel_5);
				
				JLabel label_1 = new JLabel("\u5DE5\u53F7");
				label_1.setFont(new Font("楷体", Font.BOLD, 15));
				label_1.setBounds(67, 240, 54, 15);
				frame.getContentPane().add(label_1);
				
				textField_5 = new JTextField();
				textField_5.setFont(new Font("楷体", Font.BOLD, 15));
				textField_5.setColumns(10);
				textField_5.setBounds(203, 240, 115, 21);
				frame.getContentPane().add(textField_5);
				
				JLabel label_2 = new JLabel("\u5206\u533A");
				label_2.setFont(new Font("楷体", Font.BOLD, 15));
				label_2.setBounds(67, 282, 54, 15);
				frame.getContentPane().add(label_2);
				
				//返回键
				JButton btnNewButton_3 = new JButton("");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new zhujiemian_1();
						frame.dispose();
					}
				});
				btnNewButton_3.setIcon(new ImageIcon("img/返回键.png"));
				btnNewButton_3.setBounds(0, 49, 41, 26);
				frame.getContentPane().add(btnNewButton_3);
				btnNewButton_3.setBorderPainted(false);  //设置是否绘制边框
				
				
				JComboBox comboBox = new JComboBox();
				comboBox.setFont(new Font("楷体", Font.BOLD, 15));
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "\u6CB3\u5357\u5206\u90E8", "\u5317\u4EAC\u5206\u90E8", "\u4E0A\u6D77\u5206\u90E8", "\u897F\u5357\u5206\u90E8", "\u6682    \u5B9A"}));
				comboBox.setToolTipText("");
				comboBox.setEditable(true);
				comboBox.setBackground(Color.WHITE);
				comboBox.setForeground(Color.BLACK);
				comboBox.setBounds(203, 282, 115, 21);
				frame.getContentPane().add(comboBox);
				
				
				JLabel lblNewLabel_21 = new JLabel("1");
				lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_21.setFont(new Font("宋体", Font.BOLD, 28));
				lblNewLabel_21.setBounds(203, 376, 26, 23);
				frame.getContentPane().add(lblNewLabel_21);
				
				JLabel lblNewLabel_31 = new JLabel("2");
				lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_31.setFont(new Font("华文琥珀", Font.ITALIC, 20));
				lblNewLabel_31.setBounds(226, 401, 33, 26);
				frame.getContentPane().add(lblNewLabel_31);
				
				JLabel lblNewLabel_11 = new JLabel("3");
				lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_11.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 23));
				lblNewLabel_11.setBounds(255, 375, 33, 28);
				frame.getContentPane().add(lblNewLabel_11);
				
				JLabel lblNewLabel_4 = new JLabel("4");
				lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 24));
				lblNewLabel_4.setBounds(283, 397, 26, 26);
				frame.getContentPane().add(lblNewLabel_4);
				
				
				int n = (int)(Math.random()*21);
				int n_1 = (int)(Math.random()*10);
				int n_2  = (int)(Math.random()*5);
				
				if(n%2==0) {
					lblNewLabel_21.setText((n_2+3)+"");
					lblNewLabel_21.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17+n_1));
					lblNewLabel_21.setBounds(203, 376+n, 26, 23);
					
					
					lblNewLabel_31.setText((n_2+1)+"");
					lblNewLabel_31.setFont(new Font("华文琥珀", Font.ITALIC, 23-n_1));
					lblNewLabel_31.setBounds(226, 401-n, 33, 26);
					
					lblNewLabel_11.setText(n_2+"");
					lblNewLabel_11.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 17+n_1));
					lblNewLabel_11.setBounds(255, 375+n, 33, 28);
					
					lblNewLabel_4.setText((n_2+5)+"");
					lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22-n_1));
					lblNewLabel_4.setBounds(283, 397-n, 26, 26);
				}else {
					lblNewLabel_21.setText((n_2+1)+"");
					lblNewLabel_21.setFont(new Font("华文琥珀", Font.BOLD, 17-n_1));
					lblNewLabel_21.setBounds(203, 376-n, 26, 23);
					
					lblNewLabel_31.setText((n_2+3)+"");
					lblNewLabel_31.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 23+n_1));
					lblNewLabel_31.setBounds(226, 401+n, 33, 26);
					
					lblNewLabel_11.setText((n_2+1)+"");
					lblNewLabel_11.setFont(new Font("宋体d", Font.BOLD | Font.ITALIC, 17-n_1));
					lblNewLabel_11.setBounds(255, 375-n, 33, 28);
					
					lblNewLabel_4.setText((n_2+2)+"");
					lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22+n_1));
					lblNewLabel_4.setBounds(283, 397+n, 26, 26);
				}
				
				
				//验证码
				JButton button = new JButton("\u5237\u65B0");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						int n = (int)(Math.random()*21);
						int n_1 = (int)(Math.random()*10);
						int n_2  = (int)(Math.random()*5);
						
						if(n%2==0) {
							lblNewLabel_21.setText((n_2+3)+"");
							lblNewLabel_21.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17+n_1));
							lblNewLabel_21.setBounds(203, 376+n, 26, 23);
							
							
							lblNewLabel_31.setText((n_2+1)+"");
							lblNewLabel_31.setFont(new Font("华文琥珀", Font.ITALIC, 23-n_1));
							lblNewLabel_31.setBounds(226, 401-n, 33, 26);
							
							lblNewLabel_11.setText(n_2+"");
							lblNewLabel_11.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 17+n_1));
							lblNewLabel_11.setBounds(255, 375+n, 33, 28);
							
							lblNewLabel_4.setText((n_2+5)+"");
							lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22-n_1));
							lblNewLabel_4.setBounds(283, 397-n, 26, 26);
						}else {
							lblNewLabel_21.setText((n_2+1)+"");
							lblNewLabel_21.setFont(new Font("华文琥珀", Font.BOLD, 17-n_1));
							lblNewLabel_21.setBounds(203, 376-n, 26, 23);
							
							lblNewLabel_31.setText((n_2+3)+"");
							lblNewLabel_31.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 23+n_1));
							lblNewLabel_31.setBounds(226, 402+n, 33, 26);
							
							lblNewLabel_11.setText((n_2+1)+"");
							lblNewLabel_11.setFont(new Font("宋体d", Font.BOLD | Font.ITALIC, 17-n_1));
							lblNewLabel_11.setBounds(255, 375-n, 33, 28);
							
							lblNewLabel_4.setText((n_2+2)+"");
							lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22+n_1));
							lblNewLabel_4.setBounds(283, 397+n, 26, 26);
						}
						
					}
				});
				button.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button.setHorizontalTextPosition(SwingConstants.CENTER);
				button.setFont(new Font("楷体", Font.BOLD, 15));
				button.setBorderPainted(false);
				button.setBounds(225, 547, 93, 23);
				frame.getContentPane().add(button);
				
				JLabel lblNewLabel_6 = new JLabel("");
				lblNewLabel_6.setIcon(new ImageIcon("img/验证码背景.jpg"));
				lblNewLabel_6.setBounds(203, 358, 115, 82);
				frame.getContentPane().add(lblNewLabel_6);
				
				
				// 注册
				JButton button_1 = new JButton("\u6CE8\u518C");
				button_1.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
				button_1.setFont(new Font("楷体", Font.BOLD, 15));
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						ku k = new ku();
						Connection con = k.SQLku();
						try {
							Statement stmt = con.createStatement();
							ResultSet rs = stmt.executeQuery("select password from userid where id = "+"'"+textField_5.getText()+"'");
							if(rs.next()) {
								JOptionPane.showMessageDialog(null, "此工号已注册！", "系统提示",JOptionPane.WARNING_MESSAGE);
								textField_5.setText("");
							}else {
								ResultSet rs1 = stmt.executeQuery("select * from fenquyuangong where id = "+"'"+textField_5.getText()+"'");
								
								if(!rs1.next()) {
									
									JOptionPane.showMessageDialog(null, "查询无此工号！", "系统提示",JOptionPane.WARNING_MESSAGE);
									textField_5.setText("");
									
									
								}else {
									//验证码
									String s = textField_4.getText();
									String s_1 = lblNewLabel_21.getText()+lblNewLabel_31.getText()+lblNewLabel_11.getText()+lblNewLabel_4.getText(); 
									if(s.equals(s_1)) {
										
										frame.dispose();
										
										JFrame frame;
										JTextField textField;
										JTextField textField_1;
										JTextField textField_2;
										frame = new JFrame();
										frame.getContentPane().setBackground(Color.WHITE);
										frame.setBounds(100, 100, 408, 366);
										frame.setVisible(true);
										frame.setLocationRelativeTo(null);
										frame.getContentPane().setLayout(null);
										
										JLabel lblNewLabel = new JLabel("");
										lblNewLabel.setIcon(new ImageIcon("img/抬头logo_1.PNG"));
										lblNewLabel.setBounds(0, 0, 392, 39);
										frame.getContentPane().add(lblNewLabel);
										
										JLabel label = new JLabel("\u8D26\u53F7\uFF1A");
										label.setFont(new Font("楷体", Font.BOLD, 15));
										label.setBounds(78, 116, 54, 15);
										frame.getContentPane().add(label);
										
										JLabel label_11 = new JLabel("");
										label_11.setFont(new Font("楷体", Font.BOLD, 15));
										label_11.setBounds(189, 116, 92, 15);
										frame.getContentPane().add(label_11);
										label_11.setText(textField_5.getText());
										
										JLabel label_2 = new JLabel("\u5BC6\u7801\uFF1A");
										label_2.setFont(new Font("楷体", Font.BOLD, 15));
										label_2.setBounds(78, 167, 54, 15);
										frame.getContentPane().add(label_2);
										
										JLabel label_3 = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
										label_3.setFont(new Font("楷体", Font.BOLD, 15));
										label_3.setBounds(78, 213, 80, 15);
										frame.getContentPane().add(label_3);
										
										JPasswordField passwordField = new JPasswordField();
										passwordField.setBounds(189, 164, 92, 21);
										frame.getContentPane().add(passwordField);
										
										JPasswordField passwordField_1 = new JPasswordField();
										passwordField_1.setBounds(189, 210, 92, 21);
										frame.getContentPane().add(passwordField_1);
										
										//返回键
										JButton btnNewButton_3 = new JButton("");
										btnNewButton_3.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												new zhuce();
												frame.dispose();
											}
										});
										btnNewButton_3.setIcon(new ImageIcon("img/返回键.png"));
										btnNewButton_3.setBounds(0, 49, 41, 26);
										frame.getContentPane().add(btnNewButton_3);
										btnNewButton_3.setBorderPainted(false);  //设置是否绘制边框
										
										
										//确认
										JButton button = new JButton("\u786E\u8BA4");
										button.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												if(passwordField.getText().equals(passwordField_1.getText())) {
													
													ku k = new ku();
													Connection con = k.SQLku();
													try {
														Statement stmt = con.createStatement();
														stmt.executeUpdate("insert into userid "+"(id,password)"+"values( '"+textField_5.getText()+"'"+","+"'"+passwordField.getText()+"')");
														stmt.close();
														con.close();
								
													} catch (SQLException e1) {
														e1.printStackTrace();
													}
													
													new denglu();
													frame.dispose();
												}else {
													JOptionPane.showMessageDialog(null, "两次密码不同！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
													passwordField.setText("");
													passwordField.setText("");
													
												}
												
											}
										});
										button.setFont(new Font("楷体", Font.BOLD, 15));
										button.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
										button.setBounds(137, 268, 93, 23);
										frame.getContentPane().add(button);
										button.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
										button.setBorderPainted(false);  //设置是否绘制边框
										
									}else {
										JOptionPane.showMessageDialog(null, "验证码错误！", "系统提示",JOptionPane.WARNING_MESSAGE);
										int n = (int)(Math.random()*21);
										int n_1 = (int)(Math.random()*10);
										int n_2  = (int)(Math.random()*5);
										lblNewLabel_21.setText((n_2+1)+"");
										lblNewLabel_21.setFont(new Font("华文琥珀", Font.BOLD, 17-n_1));
										lblNewLabel_21.setBounds(203, 376-n, 26, 23);
										
										lblNewLabel_31.setText((n_2+3)+"");
										lblNewLabel_31.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 23+n_1));
										lblNewLabel_31.setBounds(226, 402+n, 33, 26);
										
										lblNewLabel_11.setText((n_2+1)+"");
										lblNewLabel_11.setFont(new Font("宋体d", Font.BOLD | Font.ITALIC, 17-n_1));
										lblNewLabel_11.setBounds(255, 375-n, 33, 28);
										
										lblNewLabel_4.setText((n_2+2)+"");
										lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22+n_1));
										lblNewLabel_4.setBounds(283, 397+n, 26, 26);
										
										textField_2.setText("");
									}
								}
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
					}
				});
				button_1.setBounds(67, 547, 93, 23);
				button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
				button_1.setBorderPainted(false);  //设置是否绘制边框
				frame.getContentPane().add(button_1);
				
		
	}
}










