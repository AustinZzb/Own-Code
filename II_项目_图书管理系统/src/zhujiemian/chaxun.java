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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class chaxun {

	private JFrame frame;
	private JTextField textField;
	
	
	
	// �޸Ĳɹ���¼
	public chaxun(int n,int n_1,int m) {
	frame = new JFrame();
	frame.getContentPane().setBackground(Color.WHITE);
	frame.setBounds(100, 100, 377, 258);
	frame.getContentPane().setLayout(null);
	frame.setLocationRelativeTo(null);
	
	JLabel lblNewLabel = new JLabel("New label");
	lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
	lblNewLabel.setBounds(0, 0, 361, 39);
	frame.getContentPane().add(lblNewLabel);
	
	JLabel label = new JLabel("\u67E5  \u8BE2  \u91C7  \u8D2D  \u5355  \u53F7");
	label.setHorizontalAlignment(SwingConstants.CENTER);
	label.setFont(new Font("����", Font.BOLD, 15));
	label.setBounds(53, 38, 258, 39);
	frame.getContentPane().add(label);
	
	JLabel label_1 = new JLabel("\u7F16\u53F7");
	label_1.setFont(new Font("����", Font.BOLD, 15));
	label_1.setBounds(35, 108, 90, 15);
	frame.getContentPane().add(label_1);
	
	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(135, 105, 199, 21);
	frame.getContentPane().add(textField);
	
	JButton button = new JButton("\u786E\u5B9A");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			ku k = new ku();
			Connection con = k.SQLku();
			try {
				Statement state = con.createStatement();
				ResultSet rs = null;
				if(m==0) {
					rs = state.executeQuery("select * from caigou_hn where bookid='"+textField.getText()+"'");
				}else if(m==1) {
					rs = state.executeQuery("select * from caigou_bj where bookid='"+textField.getText()+"'");
				}else if(m==2) {
					rs = state.executeQuery("select * from caigou_sh where bookid='"+textField.getText()+"'");
				}else if(m==3) {
					rs = state.executeQuery("select * from caigou_xn where bookid='"+textField.getText()+"'");
				}
				if(!rs.next()) {
					JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
					textField.setText(null);
				}else {
					new updatecaigou(m,textField.getText());
					frame.dispose();
				}
				rs.last();
				rs.beforeFirst();
				state.close();
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
	});
	button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
	button.setHorizontalTextPosition(SwingConstants.CENTER);
	button.setFont(new Font("����", Font.BOLD, 15));
	button.setBorderPainted(false);
	button.setBounds(53, 159, 93, 23);
	frame.getContentPane().add(button);
	
	JButton button_1 = new JButton("\u8FD4\u56DE");
	button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
	});
	button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
	button_1.setHorizontalTextPosition(SwingConstants.CENTER);
	button_1.setFont(new Font("����", Font.BOLD, 15));
	button_1.setBorderPainted(false);
	button_1.setBounds(218, 159, 93, 23);
	frame.getContentPane().add(button_1);
	frame.setVisible(true);
		
	}
	
	
	
	// �޸����ۼ�¼
		public chaxun(int m,int n_1,int m_3,int m_1,int m_2) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 377, 258);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
		lblNewLabel.setBounds(0, 0, 361, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u67E5  \u8BE2  ��  ��  \u5355  \u53F7");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("����", Font.BOLD, 15));
		label.setBounds(53, 38, 258, 39);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u7F16\u53F7");
		label_1.setFont(new Font("����", Font.BOLD, 15));
		label_1.setBounds(35, 108, 90, 15);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 105, 199, 21);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ku k = new ku();
				Connection con = k.SQLku();
				try {
					Statement state = con.createStatement();
					ResultSet rs = null;
					if(m==0) {
						rs = state.executeQuery("select * from xiaoshou_hn where bookid='"+textField.getText()+"'");
					}else if(m==1) {
						rs = state.executeQuery("select * from xiaoshou_bj where bookid='"+textField.getText()+"'");
					}else if(m==2) {
						rs = state.executeQuery("select * from xiaoshou_sh where bookid='"+textField.getText()+"'");
					}else if(m==3) {
						rs = state.executeQuery("select * from xiaoshou_xn where bookid='"+textField.getText()+"'");
					}
					if(!rs.next()) {
						JOptionPane.showMessageDialog(null, "���Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
						textField.setText(null);
					}else {
						new updatecaigou(m,textField.getText(),0);
						frame.dispose();
					}
					rs.last();
					rs.beforeFirst();
					state.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("����", Font.BOLD, 15));
		button.setBorderPainted(false);
		button.setBounds(53, 159, 93, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setFont(new Font("����", Font.BOLD, 15));
		button_1.setBorderPainted(false);
		button_1.setBounds(218, 159, 93, 23);
		frame.getContentPane().add(button_1);
		frame.setVisible(true);
			
		}
		
		
		
		// �޸Ŀ���¼
				public chaxun(int m,int n_1,int m_3,int m_1,int m_2,int m_31,int m_4,int m_5) {
				frame = new JFrame();
				frame.getContentPane().setBackground(Color.WHITE);
				frame.setBounds(100, 100, 377, 258);
				frame.getContentPane().setLayout(null);
				frame.setLocationRelativeTo(null);
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
				lblNewLabel.setBounds(0, 0, 361, 39);
				frame.getContentPane().add(lblNewLabel);
				
				JLabel label = new JLabel("\u67E5  \u8BE2  ��  ��  \u5355  \u53F7");
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setFont(new Font("����", Font.BOLD, 15));
				label.setBounds(53, 38, 258, 39);
				frame.getContentPane().add(label);
				
				JLabel label_1 = new JLabel("\u7F16\u53F7");
				label_1.setFont(new Font("����", Font.BOLD, 15));
				label_1.setBounds(35, 108, 90, 15);
				frame.getContentPane().add(label_1);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(135, 105, 199, 21);
				frame.getContentPane().add(textField);
				
				JButton button = new JButton("\u786E\u5B9A");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						ku k = new ku();
						Connection con = k.SQLku();
						try {
							Statement state = con.createStatement();
							ResultSet rs = null;
							if(m==0) {
								rs = state.executeQuery("select * from kucun_hn where bookid='"+textField.getText()+"'");
							}else if(m==1) {
								rs = state.executeQuery("select * from kucun_bj where bookid='"+textField.getText()+"'");
							}else if(m==2) {
								rs = state.executeQuery("select * from kucun_sh where bookid='"+textField.getText()+"'");
							}else if(m==3) {
								rs = state.executeQuery("select * from kucun_xn where bookid='"+textField.getText()+"'");
							}
							if(!rs.next()) {
								JOptionPane.showMessageDialog(null, "���Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
								textField.setText(null);
							}else {
								new updatecaigou(m,textField.getText(),0,0);
								frame.dispose();
							}
							rs.last();
							rs.beforeFirst();
							state.close();
							con.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
					}
				});
				button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
				button.setHorizontalTextPosition(SwingConstants.CENTER);
				button.setFont(new Font("����", Font.BOLD, 15));
				button.setBorderPainted(false);
				button.setBounds(53, 159, 93, 23);
				frame.getContentPane().add(button);
				
				JButton button_1 = new JButton("\u8FD4\u56DE");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
					}
				});
				button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
				button_1.setHorizontalTextPosition(SwingConstants.CENTER);
				button_1.setFont(new Font("����", Font.BOLD, 15));
				button_1.setBorderPainted(false);
				button_1.setBounds(218, 159, 93, 23);
				frame.getContentPane().add(button_1);
				frame.setVisible(true);
					
				}
				
				
				
				
				// �޸���Ա��¼
				public chaxun(int m,int m_1,int m_2,int m_3,int m_4,int m_5,int m_6,int m_7,int m_8,int m_9,int m_10) {
				frame = new JFrame();
				frame.getContentPane().setBackground(Color.WHITE);
				frame.setBounds(100, 100, 377, 258);
				frame.getContentPane().setLayout(null);
				frame.setLocationRelativeTo(null);
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
				lblNewLabel.setBounds(0, 0, 361, 39);
				frame.getContentPane().add(lblNewLabel);
				
				JLabel label = new JLabel("\u67E5  \u8BE2  ��  Ա  ��  Ϣ");
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setFont(new Font("����", Font.BOLD, 15));
				label.setBounds(53, 38, 258, 39);
				frame.getContentPane().add(label);
				
				JLabel label_1 = new JLabel("\u7F16\u53F7");
				label_1.setFont(new Font("����", Font.BOLD, 15));
				label_1.setBounds(35, 108, 90, 15);
				frame.getContentPane().add(label_1);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(135, 105, 199, 21);
				frame.getContentPane().add(textField);
				
				JButton button = new JButton("\u786E\u5B9A");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						ku k = new ku();
						Connection con = k.SQLku();
						try {
							Statement state = con.createStatement();
							ResultSet rs = null;
							if(m==0) {
								rs = state.executeQuery("select * from gonghuoshang where id='"+textField.getText()+"'");
							}else if(m==1) {
								rs = state.executeQuery("select * from jingxiaoshang where id='"+textField.getText()+"'");
							}else if(m==2) {
								rs = state.executeQuery("select * from fenqujingli where id='"+textField.getText()+"'");
							}else if(m==3) {
								rs = state.executeQuery("select * from fenquyuangong where id='"+textField.getText()+"'");
							}
							if(!rs.next()) {
								JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
								textField.setText(null);
							}else {
								new updatecaigou(m,textField.getText(),0,0,0);
								frame.dispose();
							}
							rs.last();
							rs.beforeFirst();
							state.close();
							con.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
					}
				});
				button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
				button.setHorizontalTextPosition(SwingConstants.CENTER);
				button.setFont(new Font("����", Font.BOLD, 15));
				button.setBorderPainted(false);
				button.setBounds(53, 159, 93, 23);
				frame.getContentPane().add(button);
				
				JButton button_1 = new JButton("\u8FD4\u56DE");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
					}
				});
				button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
				button_1.setHorizontalTextPosition(SwingConstants.CENTER);
				button_1.setFont(new Font("����", Font.BOLD, 15));
				button_1.setBorderPainted(false);
				button_1.setBounds(218, 159, 93, 23);
				frame.getContentPane().add(button_1);
				frame.setVisible(true);
					
				}
		
	
	
	
	//��ѯ�ɹ���¼
	
	public chaxun(int n,int m) {
	frame = new JFrame();
	frame.getContentPane().setBackground(Color.WHITE);
	frame.setBounds(100, 100, 377, 258);
	frame.getContentPane().setLayout(null);
	frame.setLocationRelativeTo(null);
	
	JLabel lblNewLabel = new JLabel("New label");
	lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
	lblNewLabel.setBounds(0, 0, 361, 39);
	frame.getContentPane().add(lblNewLabel);
	
	JLabel label = new JLabel("\u67E5  \u8BE2  \u91C7  \u8D2D  \u5355  \u53F7");
	label.setHorizontalAlignment(SwingConstants.CENTER);
	label.setFont(new Font("����", Font.BOLD, 15));
	label.setBounds(53, 38, 258, 39);
	frame.getContentPane().add(label);
	
	JLabel label_1 = new JLabel("\u7F16\u53F7");
	label_1.setFont(new Font("����", Font.BOLD, 15));
	label_1.setBounds(35, 108, 90, 15);
	frame.getContentPane().add(label_1);
	
	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(135, 105, 199, 21);
	frame.getContentPane().add(textField);
	
	JButton button = new JButton("\u786E\u5B9A");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			ku k = new ku();
			Connection con = k.SQLku();
			try {
				Statement state = con.createStatement();
				ResultSet rs = null;
				if(m==0) {
					rs = state.executeQuery("select * from caigou_hn where bookid='"+textField.getText()+"'");
				}else if(m==1) {
					rs = state.executeQuery("select * from caigou_bj where bookid='"+textField.getText()+"'");
				}else if(m==2) {
					rs = state.executeQuery("select * from caigou_sh where bookid='"+textField.getText()+"'");
				}else if(m==3) {
					rs = state.executeQuery("select * from caigou_xn where bookid='"+textField.getText()+"'");
				}
				if(!rs.next()) {
					JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
					textField.setText(null);
				}else {
					new selectcaigou(m,textField.getText());
					frame.dispose();
				}
				rs.last();
				rs.beforeFirst();
				state.close();
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
	});
	button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
	button.setHorizontalTextPosition(SwingConstants.CENTER);
	button.setFont(new Font("����", Font.BOLD, 15));
	button.setBorderPainted(false);
	button.setBounds(53, 159, 93, 23);
	frame.getContentPane().add(button);
	
	JButton button_1 = new JButton("\u8FD4\u56DE");
	button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
	});
	button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
	button_1.setHorizontalTextPosition(SwingConstants.CENTER);
	button_1.setFont(new Font("����", Font.BOLD, 15));
	button_1.setBorderPainted(false);
	button_1.setBounds(218, 159, 93, 23);
	frame.getContentPane().add(button_1);
	frame.setVisible(true);
		
	}
	
	
	
	//��ѯ���ۼ�¼
	
		public chaxun(int m,int m_1,int m_2,int m_3,int m_4,int m_5) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 377, 258);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
		lblNewLabel.setBounds(0, 0, 361, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u67E5  \u8BE2  ��  ��  \u5355  \u53F7");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("����", Font.BOLD, 15));
		label.setBounds(53, 38, 258, 39);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u7F16\u53F7");
		label_1.setFont(new Font("����", Font.BOLD, 15));
		label_1.setBounds(35, 108, 90, 15);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 105, 199, 21);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ku k = new ku();
				Connection con = k.SQLku();
				try {
					Statement state = con.createStatement();
					ResultSet rs = null;
					if(m==0) {
						rs = state.executeQuery("select * from xiaoshou_hn where bookid='"+textField.getText()+"'");
					}else if(m==1) {
						rs = state.executeQuery("select * from xiaoshou_bj where bookid='"+textField.getText()+"'");
					}else if(m==2) {
						rs = state.executeQuery("select * from xiaoshou_sh where bookid='"+textField.getText()+"'");
					}else if(m==3) {
						rs = state.executeQuery("select * from xiaoshou_xn where bookid='"+textField.getText()+"'");
					}
					if(!rs.next()) {
						JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
						textField.setText(null);
					}else {
						new selectcaigou(m,textField.getText(),0);
						frame.dispose();
					}
					rs.last();
					rs.beforeFirst();
					state.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("����", Font.BOLD, 15));
		button.setBorderPainted(false);
		button.setBounds(53, 159, 93, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setFont(new Font("����", Font.BOLD, 15));
		button_1.setBorderPainted(false);
		button_1.setBounds(218, 159, 93, 23);
		frame.getContentPane().add(button_1);
		frame.setVisible(true);
			
		}
		
		
		
		//��ѯ����¼
		
			public chaxun(int m,int m_1,int m_2,int m_3,int m_4,int m_5,int m_6,int m_7,int m_8) {
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBounds(100, 100, 377, 258);
			frame.getContentPane().setLayout(null);
			frame.setLocationRelativeTo(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
			lblNewLabel.setBounds(0, 0, 361, 39);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel label = new JLabel("\u67E5  \u8BE2  ��  ��  \u5355  \u53F7");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("����", Font.BOLD, 15));
			label.setBounds(53, 38, 258, 39);
			frame.getContentPane().add(label);
			
			JLabel label_1 = new JLabel("\u7F16\u53F7");
			label_1.setFont(new Font("����", Font.BOLD, 15));
			label_1.setBounds(35, 108, 90, 15);
			frame.getContentPane().add(label_1);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(135, 105, 199, 21);
			frame.getContentPane().add(textField);
			
			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ku k = new ku();
					Connection con = k.SQLku();
					try {
						Statement state = con.createStatement();
						ResultSet rs = null;
						if(m==0) {
							rs = state.executeQuery("select * from kucun_hn where bookid='"+textField.getText()+"'");
						}else if(m==1) {
							rs = state.executeQuery("select * from kucun_bj where bookid='"+textField.getText()+"'");
						}else if(m==2) {
							rs = state.executeQuery("select * from kucun_sh where bookid='"+textField.getText()+"'");
						}else if(m==3) {
							rs = state.executeQuery("select * from kucun_xn where bookid='"+textField.getText()+"'");
						}
						if(!rs.next()) {
							JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
							textField.setText(null);
						}else {
							new selectcaigou(m,textField.getText(),0,0);
							frame.dispose();
						}
						rs.last();
						rs.beforeFirst();
						state.close();
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
			});
			button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button.setHorizontalTextPosition(SwingConstants.CENTER);
			button.setFont(new Font("����", Font.BOLD, 15));
			button.setBorderPainted(false);
			button.setBounds(53, 159, 93, 23);
			frame.getContentPane().add(button);
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
				}
			});
			button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);
			button_1.setFont(new Font("����", Font.BOLD, 15));
			button_1.setBorderPainted(false);
			button_1.setBounds(218, 159, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
				
			}
			
			
			//��ѯ��Ա��¼
			
			public chaxun(int m,int m_1,int m_2,int m_3,int m_4,int m_5,int m_6,int m_7,int m_8,int m_9,int m_10,int m_11) {
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBounds(100, 100, 377, 258);
			frame.getContentPane().setLayout(null);
			frame.setLocationRelativeTo(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
			lblNewLabel.setBounds(0, 0, 361, 39);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel label = new JLabel("\u67E5  \u8BE2  ��  Ա  ��  ¼");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("����", Font.BOLD, 15));
			label.setBounds(53, 38, 258, 39);
			frame.getContentPane().add(label);
			
			JLabel label_1 = new JLabel("\u7F16\u53F7");
			label_1.setFont(new Font("����", Font.BOLD, 15));
			label_1.setBounds(35, 108, 90, 15);
			frame.getContentPane().add(label_1);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(135, 105, 199, 21);
			frame.getContentPane().add(textField);
			
			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ku k = new ku();
					Connection con = k.SQLku();
					try {
						Statement state = con.createStatement();
						ResultSet rs = null;
						if(m==0) {
							rs = state.executeQuery("select * from gonghuoshang where id='"+textField.getText()+"'");
						}else if(m==1) {
							rs = state.executeQuery("select * from jingxiaoshang where id='"+textField.getText()+"'");
						}else if(m==2) {
							rs = state.executeQuery("select * from fenqujingli where id='"+textField.getText()+"'");
						}else if(m==3) {
							rs = state.executeQuery("select * from fenquyuangong where id='"+textField.getText()+"'");
						}
						if(!rs.next()) {
							JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
							textField.setText(null);
						}else {
							new selectcaigou(m,textField.getText(),0,0,0);
							frame.dispose();
						}
						rs.last();
						rs.beforeFirst();
						state.close();
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
			});
			button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button.setHorizontalTextPosition(SwingConstants.CENTER);
			button.setFont(new Font("����", Font.BOLD, 15));
			button.setBorderPainted(false);
			button.setBounds(53, 159, 93, 23);
			frame.getContentPane().add(button);
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
				}
			});
			button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);
			button_1.setFont(new Font("����", Font.BOLD, 15));
			button_1.setBorderPainted(false);
			button_1.setBounds(218, 159, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
				
			}
	
			
			
			
	
			
//��ѯ�˵���¼
			
			public chaxun(int m,int m_1,int m_2,int m_3,int m_4,int m_5,int m_6,int m_7,int m_8,int m_9,int m_10,int m_11,int m_12) {
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBounds(100, 100, 377, 258);
			frame.getContentPane().setLayout(null);
			frame.setLocationRelativeTo(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
			lblNewLabel.setBounds(0, 0, 361, 39);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel label = new JLabel("\u67E5  \u8BE2  ��  ��  ��  ��");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("����", Font.BOLD, 15));
			label.setBounds(53, 38, 258, 39);
			frame.getContentPane().add(label);
			
			JLabel label_1 = new JLabel("\u7F16\u53F7");
			label_1.setFont(new Font("����", Font.BOLD, 15));
			label_1.setBounds(35, 108, 90, 15);
			frame.getContentPane().add(label_1);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(135, 105, 199, 21);
			frame.getContentPane().add(textField);
			
			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ku k = new ku();
					Connection con = k.SQLku();
					try {
						Statement state = con.createStatement();
						ResultSet rs = state.executeQuery("select * from zhangkuan where id='"+textField.getText()+"'");
						
						if(!rs.next()) {
							JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
							textField.setText(null);
						}else {
							new selectcaigou(m,textField.getText(),0,0,0,0);
							frame.dispose();
						}
						rs.last();
						rs.beforeFirst();
						state.close();
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
			});
			button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button.setHorizontalTextPosition(SwingConstants.CENTER);
			button.setFont(new Font("����", Font.BOLD, 15));
			button.setBorderPainted(false);
			button.setBounds(53, 159, 93, 23);
			frame.getContentPane().add(button);
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
				}
			});
			button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);
			button_1.setFont(new Font("����", Font.BOLD, 15));
			button_1.setBorderPainted(false);
			button_1.setBounds(218, 159, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
				
			}
			
			
//��ѯ������¼
			
			public chaxun(int m,int m_1,int m_2,int m_3,int m_4,int m_5,int m_6,int m_7,int m_8,int m_9,int m_10,int m_11,int m_12,int m_13) {
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBounds(100, 100, 377, 258);
			frame.getContentPane().setLayout(null);
			frame.setLocationRelativeTo(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
			lblNewLabel.setBounds(0, 0, 361, 39);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel label = new JLabel("\u67E5  \u8BE2  ��  ��  ��  ��");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("����", Font.BOLD, 15));
			label.setBounds(53, 38, 258, 39);
			frame.getContentPane().add(label);
			
			JLabel label_1 = new JLabel("\u7F16\u53F7");
			label_1.setFont(new Font("����", Font.BOLD, 15));
			label_1.setBounds(35, 108, 90, 15);
			frame.getContentPane().add(label_1);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(135, 105, 199, 21);
			frame.getContentPane().add(textField);
			
			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ku k = new ku();
					Connection con = k.SQLku();
					try {
						Statement state = con.createStatement();
						ResultSet rs = state.executeQuery("select * from baojing where id='"+textField.getText()+"'");
						
						if(!rs.next()) {
							JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
							textField.setText(null);
						}else {
							new selectcaigou(m,textField.getText(),0,0,0,0,0);
							frame.dispose();
						}
						rs.last();
						rs.beforeFirst();
						state.close();
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
			});
			button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button.setHorizontalTextPosition(SwingConstants.CENTER);
			button.setFont(new Font("����", Font.BOLD, 15));
			button.setBorderPainted(false);
			button.setBounds(53, 159, 93, 23);
			frame.getContentPane().add(button);
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
				}
			});
			button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);
			button_1.setFont(new Font("����", Font.BOLD, 15));
			button_1.setBorderPainted(false);
			button_1.setBounds(218, 159, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
				
			}
	
	
	
	// ɾ���ɹ���¼
	public chaxun(int m) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 377, 258);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
		lblNewLabel.setBounds(0, 0, 361, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u67E5  \u8BE2  \u91C7  \u8D2D  \u5355  \u53F7");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("����", Font.BOLD, 15));
		label.setBounds(53, 38, 258, 39);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u7F16\u53F7");
		label_1.setFont(new Font("����", Font.BOLD, 15));
		label_1.setBounds(35, 108, 90, 15);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 105, 199, 21);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ku k = new ku();
				Connection con = k.SQLku();
				try {
					Statement state = con.createStatement();
					ResultSet rs = null;
					if(m==0) {
						rs = state.executeQuery("select * from caigou_hn where bookid='"+textField.getText()+"'");
					}else if(m==1) {
						rs = state.executeQuery("select * from caigou_bj where bookid='"+textField.getText()+"'");
					}else if(m==2) {
						rs = state.executeQuery("select * from caigou_sh where bookid='"+textField.getText()+"'");
					}else if(m==3) {
						rs = state.executeQuery("select * from caigou_xn where bookid='"+textField.getText()+"'");
					}
					if(!rs.next()) {
						JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
						textField.setText(null);
					}else {
						deletecaigou t = new deletecaigou(m,textField.getText());
						frame.dispose();
					}
					rs.last();
					rs.beforeFirst();
					state.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
								
			}
		});
		button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("����", Font.BOLD, 15));
		button.setBorderPainted(false);
		button.setBounds(53, 159, 93, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setFont(new Font("����", Font.BOLD, 15));
		button_1.setBorderPainted(false);
		button_1.setBounds(218, 159, 93, 23);
		frame.getContentPane().add(button_1);
		frame.setVisible(true);
		
	}
	
	
	// ɾ�����ۼ�¼
		public chaxun(int m,int m_1,int m_2,int m_3) {
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBounds(100, 100, 377, 258);
			frame.getContentPane().setLayout(null);
			frame.setLocationRelativeTo(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
			lblNewLabel.setBounds(0, 0, 361, 39);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel label = new JLabel("\u67E5  \u8BE2  ��  ��  \u5355  \u53F7");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("����", Font.BOLD, 15));
			label.setBounds(53, 38, 258, 39);
			frame.getContentPane().add(label);
			
			JLabel label_1 = new JLabel("\u7F16\u53F7");
			label_1.setFont(new Font("����", Font.BOLD, 15));
			label_1.setBounds(35, 108, 90, 15);
			frame.getContentPane().add(label_1);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(135, 105, 199, 21);
			frame.getContentPane().add(textField);
			
			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ku k = new ku();
					Connection con = k.SQLku();
					try {
						Statement state = con.createStatement();
						ResultSet rs = null;
						if(m==0) {
							rs = state.executeQuery("select * from xiaoshou_hn where bookid='"+textField.getText()+"'");
						}else if(m==1) {
							rs = state.executeQuery("select * from xiaoshou_bj where bookid='"+textField.getText()+"'");
						}else if(m==2) {
							rs = state.executeQuery("select * from xiaoshou_sh where bookid='"+textField.getText()+"'");
						}else if(m==3) {
							rs = state.executeQuery("select * from xiaoshou_xn where bookid='"+textField.getText()+"'");
						}
						if(!rs.next()) {
							JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
							textField.setText(null);
						}else {
							deletecaigou t = new deletecaigou(m,textField.getText(),0);
							frame.dispose();
						}
						rs.last();
						rs.beforeFirst();
						state.close();
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
									
				}
			});
			button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button.setHorizontalTextPosition(SwingConstants.CENTER);
			button.setFont(new Font("����", Font.BOLD, 15));
			button.setBorderPainted(false);
			button.setBounds(53, 159, 93, 23);
			frame.getContentPane().add(button);
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
				}
			});
			button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);
			button_1.setFont(new Font("����", Font.BOLD, 15));
			button_1.setBorderPainted(false);
			button_1.setBounds(218, 159, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
			
		}
		
		
		
		// ɾ������¼
				public chaxun(int m,int m_1,int m_2,int m_3,int m_4,int m_5,int m_6) {
					frame = new JFrame();
					frame.getContentPane().setBackground(Color.WHITE);
					frame.setBounds(100, 100, 377, 258);
					frame.getContentPane().setLayout(null);
					frame.setLocationRelativeTo(null);
					
					JLabel lblNewLabel = new JLabel("New label");
					lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
					lblNewLabel.setBounds(0, 0, 361, 39);
					frame.getContentPane().add(lblNewLabel);
					
					JLabel label = new JLabel("��  ѯ  ��  ��  ��  ��");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					label.setFont(new Font("����", Font.BOLD, 15));
					label.setBounds(53, 38, 258, 39);
					frame.getContentPane().add(label);
					
					JLabel label_1 = new JLabel("\u7F16\u53F7");
					label_1.setFont(new Font("����", Font.BOLD, 15));
					label_1.setBounds(35, 108, 90, 15);
					frame.getContentPane().add(label_1);
					
					textField = new JTextField();
					textField.setColumns(10);
					textField.setBounds(135, 105, 199, 21);
					frame.getContentPane().add(textField);
					
					JButton button = new JButton("\u786E\u5B9A");
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							ku k = new ku();
							Connection con = k.SQLku();
							try {
								Statement state = con.createStatement();
								ResultSet rs = null;
								if(m==0) {
									rs = state.executeQuery("select * from kucun_hn where bookid='"+textField.getText()+"'");
								}else if(m==1) {
									rs = state.executeQuery("select * from kucun_bj where bookid='"+textField.getText()+"'");
								}else if(m==2) {
									rs = state.executeQuery("select * from kucun_sh where bookid='"+textField.getText()+"'");
								}else if(m==3) {
									rs = state.executeQuery("select * from kucun_xn where bookid='"+textField.getText()+"'");
								}
								if(!rs.next()) {
									JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
									textField.setText(null);
								}else {
									deletecaigou t = new deletecaigou(m,textField.getText(),0,0);
									frame.dispose();
								}
								rs.last();
								rs.beforeFirst();
								state.close();
								con.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
											
						}
					});
					button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
					button.setHorizontalTextPosition(SwingConstants.CENTER);
					button.setFont(new Font("����", Font.BOLD, 15));
					button.setBorderPainted(false);
					button.setBounds(53, 159, 93, 23);
					frame.getContentPane().add(button);
					
					JButton button_1 = new JButton("\u8FD4\u56DE");
					button_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.dispose();
						}
					});
					button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
					button_1.setHorizontalTextPosition(SwingConstants.CENTER);
					button_1.setFont(new Font("����", Font.BOLD, 15));
					button_1.setBorderPainted(false);
					button_1.setBounds(218, 159, 93, 23);
					frame.getContentPane().add(button_1);
					frame.setVisible(true);
					
				}
				
				
				
				
				// ɾ������¼
				public chaxun(int m,int m_1,int m_2,int m_3,int m_4,int m_5,int m_6,int m_7,int m_8,int m_9) {
					frame = new JFrame();
					frame.getContentPane().setBackground(Color.WHITE);
					frame.setBounds(100, 100, 377, 258);
					frame.getContentPane().setLayout(null);
					frame.setLocationRelativeTo(null);
					
					JLabel lblNewLabel = new JLabel("New label");
					lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
					lblNewLabel.setBounds(0, 0, 361, 39);
					frame.getContentPane().add(lblNewLabel);
					
					JLabel label = new JLabel("��  ѯ  ��  Ա  ��  Ϣ");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					label.setFont(new Font("����", Font.BOLD, 15));
					label.setBounds(53, 38, 258, 39);
					frame.getContentPane().add(label);
					
					JLabel label_1 = new JLabel("\u7F16\u53F7");
					label_1.setFont(new Font("����", Font.BOLD, 15));
					label_1.setBounds(35, 108, 90, 15);
					frame.getContentPane().add(label_1);
					
					textField = new JTextField();
					textField.setColumns(10);
					textField.setBounds(135, 105, 199, 21);
					frame.getContentPane().add(textField);
					
					JButton button = new JButton("\u786E\u5B9A");
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							ku k = new ku();
							Connection con = k.SQLku();
							try {
								Statement state = con.createStatement();
								ResultSet rs = null;
								if(m==0) {
									rs = state.executeQuery("select * from gonghuoshang where id='"+textField.getText()+"'");
								}else if(m==1) {
									rs = state.executeQuery("select * from jingxiaoshang where id='"+textField.getText()+"'");
								}else if(m==3) {
									rs = state.executeQuery("select * from fenquyuangong where id='"+textField.getText()+"'");
								}
								if(!rs.next()) {
									JOptionPane.showMessageDialog(null, "��Ŵ���", "ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
									textField.setText(null);
								}else {
									deletecaigou t = new deletecaigou(m,textField.getText(),0,0,0);
									frame.dispose();
								}
								rs.last();
								rs.beforeFirst();
								state.close();
								con.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
											
						}
					});
					button.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
					button.setHorizontalTextPosition(SwingConstants.CENTER);
					button.setFont(new Font("����", Font.BOLD, 15));
					button.setBorderPainted(false);
					button.setBounds(53, 159, 93, 23);
					frame.getContentPane().add(button);
					
					JButton button_1 = new JButton("\u8FD4\u56DE");
					button_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.dispose();
						}
					});
					button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
					button_1.setHorizontalTextPosition(SwingConstants.CENTER);
					button_1.setFont(new Font("����", Font.BOLD, 15));
					button_1.setBorderPainted(false);
					button_1.setBounds(218, 159, 93, 23);
					frame.getContentPane().add(button_1);
					frame.setVisible(true);
					
				}
	
	
}
