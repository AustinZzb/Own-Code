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
import javax.swing.SwingConstants;

public class selectcaigou {
	
	
	// ��ѯ�ɹ���¼
	public selectcaigou(int m,String s) {
		JFrame frame;
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 377, 614);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 368, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u67E5  \u8BE2  \u91C7  \u8D2D  \u8BB0  \u5F55");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(55, 49, 258, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u7F16\u53F7");
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 15));
		lblNewLabel_2.setBounds(31, 121, 90, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("\u4E66\u7C4D\u540D\u79F0");
		label.setFont(new Font("����", Font.BOLD, 15));
		label.setBounds(31, 159, 90, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u4F5C\u8005");
		label_1.setFont(new Font("����", Font.BOLD, 15));
		label_1.setBounds(31, 205, 90, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u4E66\u7C4D\u7C7B\u522B");
		label_2.setFont(new Font("����", Font.BOLD, 15));
		label_2.setBounds(31, 247, 90, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u91C7\u8D2D\u5355\u53F7");
		label_3.setFont(new Font("����", Font.BOLD, 15));
		label_3.setBounds(31, 290, 90, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u91C7\u8D2D\u4EBA\u5458");
		label_4.setFont(new Font("����", Font.BOLD, 15));
		label_4.setBounds(31, 332, 90, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\u91C7\u8D2D\u5355\u4EF7");
		label_5.setFont(new Font("����", Font.BOLD, 15));
		label_5.setBounds(31, 371, 90, 15);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u91C7\u8D2D\u603B\u6570");
		label_6.setFont(new Font("����", Font.BOLD, 15));
		label_6.setBounds(31, 409, 90, 15);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\u91C7\u8D2D\u603B\u989D");
		label_7.setFont(new Font("����", Font.BOLD, 15));
		label_7.setBounds(31, 453, 90, 15);
		frame.getContentPane().add(label_7);
		
		JLabel label_7_1 = new JLabel("�ɹ�����");
		label_7_1.setFont(new Font("����", Font.BOLD, 15));
		label_7_1.setBounds(31, 490, 90, 15);
		frame.getContentPane().add(label_7_1);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new chaxun(m);
			}
		});
		button_1.setFont(new Font("����", Font.BOLD, 15));
		button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
		button_1.setBounds(131, 530, 93, 23);
		frame.getContentPane().add(button_1);
		frame.setVisible(true);
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //ͼƬ�����ֵ����λ��
		button_1.setBorderPainted(false);  //�����Ƿ���Ʊ߿�
		
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setFont(new Font("����", Font.BOLD, 15));
		lblNewLabel_3.setBounds(131, 115, 182, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label_8 = new JLabel();
		label_8.setFont(new Font("����", Font.BOLD, 15));
		label_8.setBounds(131, 151, 182, 23);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel();
		label_9.setFont(new Font("����", Font.BOLD, 15));
		label_9.setBounds(131, 197, 182, 23);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel();
		label_10.setFont(new Font("����", Font.BOLD, 15));
		label_10.setBounds(131, 239, 182, 23);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel();
		label_11.setFont(new Font("����", Font.BOLD, 15));
		label_11.setBounds(131, 282, 182, 23);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel();
		label_12.setFont(new Font("����", Font.BOLD, 15));
		label_12.setBounds(131, 324, 182, 23);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel();
		label_13.setFont(new Font("����", Font.BOLD, 15));
		label_13.setBounds(131, 363, 182, 23);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel();
		label_14.setFont(new Font("����", Font.BOLD, 15));
		label_14.setBounds(131, 401, 182, 23);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel();
		label_15.setFont(new Font("����", Font.BOLD, 15));
		label_15.setBounds(131, 445, 182, 23);
		frame.getContentPane().add(label_15);
		
		JLabel label_15_1 = new JLabel();
		label_15_1.setFont(new Font("����", Font.BOLD, 15));
		label_15_1.setBounds(131, 485, 182, 23);
		frame.getContentPane().add(label_15_1);
		
		String[] s1 = new String[10];
		
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
				s1[9] = rs.getString(10);
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
		label_15_1.setText(s1[9]);
	}
	
	
	
	// ��ѯ���ۼ�¼
		public selectcaigou(int m,String s,int m_1) {
			JFrame frame;
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBackground(Color.WHITE);
			frame.setBounds(100, 100, 377, 614);
			frame.getContentPane().setLayout(null);
			frame.setLocationRelativeTo(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBackground(Color.BLACK);
			lblNewLabel.setBounds(0, 0, 368, 39);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("\u67E5  \u8BE2  ��  ��  \u8BB0  \u5F55");
			lblNewLabel_1.setFont(new Font("����", Font.BOLD, 15));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(55, 49, 258, 39);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("\u7F16\u53F7");
			lblNewLabel_2.setFont(new Font("����", Font.BOLD, 15));
			lblNewLabel_2.setBounds(31, 121, 90, 15);
			frame.getContentPane().add(lblNewLabel_2);
			
			JLabel label = new JLabel("\u4E66\u7C4D\u540D\u79F0");
			label.setFont(new Font("����", Font.BOLD, 15));
			label.setBounds(31, 159, 90, 15);
			frame.getContentPane().add(label);
			
			JLabel label_1 = new JLabel("\u4F5C\u8005");
			label_1.setFont(new Font("����", Font.BOLD, 15));
			label_1.setBounds(31, 205, 90, 15);
			frame.getContentPane().add(label_1);
			
			JLabel label_2 = new JLabel("\u4E66\u7C4D\u7C7B\u522B");
			label_2.setFont(new Font("����", Font.BOLD, 15));
			label_2.setBounds(31, 247, 90, 15);
			frame.getContentPane().add(label_2);
			
			JLabel label_3 = new JLabel("����\u5355\u53F7");
			label_3.setFont(new Font("����", Font.BOLD, 15));
			label_3.setBounds(31, 290, 90, 15);
			frame.getContentPane().add(label_3);
			
			JLabel label_4 = new JLabel("����\u4EBA\u5458");
			label_4.setFont(new Font("����", Font.BOLD, 15));
			label_4.setBounds(31, 332, 90, 15);
			frame.getContentPane().add(label_4);
			
			JLabel label_5 = new JLabel("����\u5355\u4EF7");
			label_5.setFont(new Font("����", Font.BOLD, 15));
			label_5.setBounds(31, 371, 90, 15);
			frame.getContentPane().add(label_5);
			
			JLabel label_6 = new JLabel("����\u603B\u6570");
			label_6.setFont(new Font("����", Font.BOLD, 15));
			label_6.setBounds(31, 409, 90, 15);
			frame.getContentPane().add(label_6);
			
			JLabel label_7 = new JLabel("����\u603B\u989D");
			label_7.setFont(new Font("����", Font.BOLD, 15));
			label_7.setBounds(31, 453, 90, 15);
			frame.getContentPane().add(label_7);
			
			JLabel label_7_1 = new JLabel("��������");
			label_7_1.setFont(new Font("����", Font.BOLD, 15));
			label_7_1.setBounds(31, 490, 90, 15);
			frame.getContentPane().add(label_7_1);
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					new chaxun(m);
				}
			});
			button_1.setFont(new Font("����", Font.BOLD, 15));
			button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
			button_1.setBounds(131, 530, 93, 23);
			frame.getContentPane().add(button_1);
			frame.setVisible(true);
			button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //ͼƬ�����ֵ����λ��
			button_1.setBorderPainted(false);  //�����Ƿ���Ʊ߿�
			
			JLabel lblNewLabel_3 = new JLabel();
			lblNewLabel_3.setFont(new Font("����", Font.BOLD, 15));
			lblNewLabel_3.setBounds(131, 115, 182, 23);
			frame.getContentPane().add(lblNewLabel_3);
			
			JLabel label_8 = new JLabel();
			label_8.setFont(new Font("����", Font.BOLD, 15));
			label_8.setBounds(131, 151, 182, 23);
			frame.getContentPane().add(label_8);
			
			JLabel label_9 = new JLabel();
			label_9.setFont(new Font("����", Font.BOLD, 15));
			label_9.setBounds(131, 197, 182, 23);
			frame.getContentPane().add(label_9);
			
			JLabel label_10 = new JLabel();
			label_10.setFont(new Font("����", Font.BOLD, 15));
			label_10.setBounds(131, 239, 182, 23);
			frame.getContentPane().add(label_10);
			
			JLabel label_11 = new JLabel();
			label_11.setFont(new Font("����", Font.BOLD, 15));
			label_11.setBounds(131, 282, 182, 23);
			frame.getContentPane().add(label_11);
			
			JLabel label_12 = new JLabel();
			label_12.setFont(new Font("����", Font.BOLD, 15));
			label_12.setBounds(131, 324, 182, 23);
			frame.getContentPane().add(label_12);
			
			JLabel label_13 = new JLabel();
			label_13.setFont(new Font("����", Font.BOLD, 15));
			label_13.setBounds(131, 363, 182, 23);
			frame.getContentPane().add(label_13);
			
			JLabel label_14 = new JLabel();
			label_14.setFont(new Font("����", Font.BOLD, 15));
			label_14.setBounds(131, 401, 182, 23);
			frame.getContentPane().add(label_14);
			
			JLabel label_15 = new JLabel();
			label_15.setFont(new Font("����", Font.BOLD, 15));
			label_15.setBounds(131, 445, 182, 23);
			frame.getContentPane().add(label_15);
			
			JLabel label_15_1 = new JLabel();
			label_15_1.setFont(new Font("����", Font.BOLD, 15));
			label_15_1.setBounds(131, 485, 182, 23);
			frame.getContentPane().add(label_15_1);
			
			String[] s1 = new String[10];
			
			ku k = new ku();
			Connection con = k.SQLku();
			try {
				Statement state = con.createStatement();
				ResultSet rs = null;
				if(m==0) {
					rs = state.executeQuery("select * from xiaoshou_hn where bookid='"+s+"'");
				}else if(m==1) {
					rs = state.executeQuery("select * from xiaoshou_bj where bookid='"+s+"'");
				}else if(m==2) {
					rs = state.executeQuery("select * from xiaoshou_sh where bookid='"+s+"'");
				}else if(m==3) {
					rs = state.executeQuery("select * from xiaoshou_xn where bookid='"+s+"'");
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
			
			lblNewLabel_3.setText(s1[0]);
			label_8.setText(s1[1]);
			label_9.setText(s1[2]);
			label_10.setText(s1[3]);
			label_11.setText(s1[4]);
			label_12.setText(s1[5]);
			label_13.setText(s1[6]);
			label_14.setText(s1[7]);
			label_15.setText(s1[8]);
			label_15_1.setText(s1[9]);
		}
		
		
		
		// ��ѯ����¼
				public selectcaigou(int m,String s,int m_1,int m_2) {
					JFrame frame;
					frame = new JFrame();
					frame.getContentPane().setBackground(Color.WHITE);
					frame.setBackground(Color.WHITE);
					frame.setBounds(100, 100, 377, 614);
					frame.getContentPane().setLayout(null);
					frame.setLocationRelativeTo(null);
					
					JLabel lblNewLabel = new JLabel("New label");
					lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
					lblNewLabel.setForeground(Color.BLACK);
					lblNewLabel.setBackground(Color.BLACK);
					lblNewLabel.setBounds(0, 0, 368, 39);
					frame.getContentPane().add(lblNewLabel);
					
					JLabel lblNewLabel_1 = new JLabel("\u67E5  \u8BE2  ��  ��  \u8BB0  \u5F55");
					lblNewLabel_1.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setBounds(55, 49, 258, 39);
					frame.getContentPane().add(lblNewLabel_1);
					
					JLabel lblNewLabel_2 = new JLabel("���");
					lblNewLabel_2.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_2.setBounds(31, 121, 90, 15);
					frame.getContentPane().add(lblNewLabel_2);
					
					JLabel label = new JLabel("�鼮����");
					label.setFont(new Font("����", Font.BOLD, 15));
					label.setBounds(31, 159, 90, 15);
					frame.getContentPane().add(label);
					
					JLabel label_1 = new JLabel("��������");
					label_1.setFont(new Font("����", Font.BOLD, 15));
					label_1.setBounds(31, 205, 90, 15);
					frame.getContentPane().add(label_1);
					
					JLabel label_2 = new JLabel("���۶�");
					label_2.setFont(new Font("����", Font.BOLD, 15));
					label_2.setBounds(31, 247, 90, 15);
					frame.getContentPane().add(label_2);
					
					JLabel label_3 = new JLabel("�������");
					label_3.setFont(new Font("����", Font.BOLD, 15));
					label_3.setBounds(31, 290, 90, 15);
					frame.getContentPane().add(label_3);
					
					JLabel label_4 = new JLabel("����ܶ�");
					label_4.setFont(new Font("����", Font.BOLD, 15));
					label_4.setBounds(31, 332, 90, 15);
					frame.getContentPane().add(label_4);
					
					JLabel label_5 = new JLabel("�ɹ�����");
					label_5.setFont(new Font("����", Font.BOLD, 15));
					label_5.setBounds(31, 371, 90, 15);
					frame.getContentPane().add(label_5);
					
					JLabel label_6 = new JLabel("������");
					label_6.setFont(new Font("����", Font.BOLD, 15));
					label_6.setBounds(31, 409, 90, 15);
					frame.getContentPane().add(label_6);
					
					JButton button_1 = new JButton("\u8FD4\u56DE");
					button_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.dispose();
							new chaxun(m);
						}
					});
					button_1.setFont(new Font("����", Font.BOLD, 15));
					button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
					button_1.setBounds(131, 501, 93, 23);
					frame.getContentPane().add(button_1);
					frame.setVisible(true);
					button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //ͼƬ�����ֵ����λ��
					button_1.setBorderPainted(false);  //�����Ƿ���Ʊ߿�
					
					JLabel lblNewLabel_3 = new JLabel();
					lblNewLabel_3.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_3.setBounds(131, 115, 182, 23);
					frame.getContentPane().add(lblNewLabel_3);
					
					JLabel label_8 = new JLabel();
					label_8.setFont(new Font("����", Font.BOLD, 15));
					label_8.setBounds(131, 151, 182, 23);
					frame.getContentPane().add(label_8);
					
					JLabel label_9 = new JLabel();
					label_9.setFont(new Font("����", Font.BOLD, 15));
					label_9.setBounds(131, 197, 182, 23);
					frame.getContentPane().add(label_9);
					
					JLabel label_10 = new JLabel();
					label_10.setFont(new Font("����", Font.BOLD, 15));
					label_10.setBounds(131, 239, 182, 23);
					frame.getContentPane().add(label_10);
					
					JLabel label_11 = new JLabel();
					label_11.setFont(new Font("����", Font.BOLD, 15));
					label_11.setBounds(131, 282, 182, 23);
					frame.getContentPane().add(label_11);
					
					JLabel label_12 = new JLabel();
					label_12.setFont(new Font("����", Font.BOLD, 15));
					label_12.setBounds(131, 324, 182, 23);
					frame.getContentPane().add(label_12);
					
					JLabel label_13 = new JLabel();
					label_13.setFont(new Font("����", Font.BOLD, 15));
					label_13.setBounds(131, 363, 182, 23);
					frame.getContentPane().add(label_13);
					
					JLabel label_14 = new JLabel();
					label_14.setFont(new Font("����", Font.BOLD, 15));
					label_14.setBounds(131, 401, 182, 23);
					frame.getContentPane().add(label_14);
					
					String[] s1 = new String[9];
					
					ku k = new ku();
					Connection con = k.SQLku();
					try {
						Statement state = con.createStatement();
						ResultSet rs = null;
						if(m==0) {
							rs = state.executeQuery("select * from kucun_hn where bookid='"+s+"'");
						}else if(m==1) {
							rs = state.executeQuery("select * from kucun_bj where bookid='"+s+"'");
						}else if(m==2) {
							rs = state.executeQuery("select * from kucun_sh where bookid='"+s+"'");
						}else if(m==3) {
							rs = state.executeQuery("select * from kucun_xn where bookid='"+s+"'");
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
					
					lblNewLabel_3.setText(s1[0]);
					label_8.setText(s1[1]);
					label_9.setText(s1[2]);
					label_10.setText(s1[3]);
					label_11.setText(s1[4]);
					label_12.setText(s1[5]);
					label_13.setText(s1[6]);
					label_14.setText(s1[7]);
				}
				
				
				
				
				// ��ѯ��Ա��¼
				public selectcaigou(int m,String s,int m_1,int m_2,int m_3) {
					JFrame frame;
					frame = new JFrame();
					frame.getContentPane().setBackground(Color.WHITE);
					frame.setBackground(Color.WHITE);
					frame.setBounds(100, 100, 377, 614);
					frame.getContentPane().setLayout(null);
					frame.setLocationRelativeTo(null);
					
					JLabel lblNewLabel = new JLabel("New label");
					lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
					lblNewLabel.setForeground(Color.BLACK);
					lblNewLabel.setBackground(Color.BLACK);
					lblNewLabel.setBounds(0, 0, 368, 39);
					frame.getContentPane().add(lblNewLabel);
					
					JLabel lblNewLabel_1 = new JLabel("\u67E5  \u8BE2  \u91C7  \u8D2D  \u8BB0  \u5F55");
					lblNewLabel_1.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setBounds(55, 49, 258, 39);
					frame.getContentPane().add(lblNewLabel_1);
					
					JLabel lblNewLabel_2 = new JLabel("\u7F16\u53F7");
					lblNewLabel_2.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_2.setBounds(31, 121, 90, 15);
					frame.getContentPane().add(lblNewLabel_2);
					
					JLabel label = new JLabel("\u4E66\u7C4D\u540D\u79F0");
					label.setFont(new Font("����", Font.BOLD, 15));
					label.setBounds(31, 159, 90, 15);
					frame.getContentPane().add(label);
					
					JLabel label_1 = new JLabel("\u4F5C\u8005");
					label_1.setFont(new Font("����", Font.BOLD, 15));
					label_1.setBounds(31, 205, 90, 15);
					frame.getContentPane().add(label_1);
					
					JLabel label_2 = new JLabel("\u4E66\u7C4D\u7C7B\u522B");
					label_2.setFont(new Font("����", Font.BOLD, 15));
					label_2.setBounds(31, 247, 90, 15);
					frame.getContentPane().add(label_2);
					
					JLabel label_3 = new JLabel("\u91C7\u8D2D\u5355\u53F7");
					label_3.setFont(new Font("����", Font.BOLD, 15));
					label_3.setBounds(31, 290, 90, 15);
					frame.getContentPane().add(label_3);
					
					JLabel label_4 = new JLabel("\u91C7\u8D2D\u4EBA\u5458");
					label_4.setFont(new Font("����", Font.BOLD, 15));
					label_4.setBounds(31, 332, 90, 15);
					frame.getContentPane().add(label_4);
					
					JLabel label_5 = new JLabel("\u91C7\u8D2D\u5355\u4EF7");
					label_5.setFont(new Font("����", Font.BOLD, 15));
					label_5.setBounds(31, 371, 90, 15);
					frame.getContentPane().add(label_5);
					
					JLabel label_6 = new JLabel("\u91C7\u8D2D\u603B\u6570");
					label_6.setFont(new Font("����", Font.BOLD, 15));
					label_6.setBounds(31, 409, 90, 15);
					frame.getContentPane().add(label_6);
					
					JLabel label_7 = new JLabel("\u91C7\u8D2D\u603B\u989D");
					label_7.setFont(new Font("����", Font.BOLD, 15));
					label_7.setBounds(31, 453, 90, 15);
					frame.getContentPane().add(label_7);
					
					JButton button_1 = new JButton("\u8FD4\u56DE");
					button_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.dispose();
							new chaxun(m);
						}
					});
					button_1.setFont(new Font("����", Font.BOLD, 15));
					button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
					button_1.setBounds(131, 527, 93, 23);
					frame.getContentPane().add(button_1);
					frame.setVisible(true);
					button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //ͼƬ�����ֵ����λ��
					button_1.setBorderPainted(false);  //�����Ƿ���Ʊ߿�
					
					JLabel lblNewLabel_3 = new JLabel();
					lblNewLabel_3.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_3.setBounds(131, 115, 182, 23);
					frame.getContentPane().add(lblNewLabel_3);
					
					JLabel label_8 = new JLabel();
					label_8.setFont(new Font("����", Font.BOLD, 15));
					label_8.setBounds(131, 151, 182, 23);
					frame.getContentPane().add(label_8);
					
					JLabel label_9 = new JLabel();
					label_9.setFont(new Font("����", Font.BOLD, 15));
					label_9.setBounds(131, 197, 182, 23);
					frame.getContentPane().add(label_9);
					
					JLabel label_10 = new JLabel();
					label_10.setFont(new Font("����", Font.BOLD, 15));
					label_10.setBounds(131, 239, 182, 23);
					frame.getContentPane().add(label_10);
					
					JLabel label_11 = new JLabel();
					label_11.setFont(new Font("����", Font.BOLD, 15));
					label_11.setBounds(131, 282, 182, 23);
					frame.getContentPane().add(label_11);
					
					JLabel label_12 = new JLabel();
					label_12.setFont(new Font("����", Font.BOLD, 15));
					label_12.setBounds(131, 324, 182, 23);
					frame.getContentPane().add(label_12);
					
					JLabel label_13 = new JLabel();
					label_13.setFont(new Font("����", Font.BOLD, 15));
					label_13.setBounds(131, 363, 182, 23);
					frame.getContentPane().add(label_13);
					
					JLabel label_14 = new JLabel();
					label_14.setFont(new Font("����", Font.BOLD, 15));
					label_14.setBounds(131, 401, 182, 23);
					frame.getContentPane().add(label_14);
					
					JLabel label_15 = new JLabel();
					label_15.setFont(new Font("����", Font.BOLD, 15));
					label_15.setBounds(131, 445, 182, 23);
					frame.getContentPane().add(label_15);
					
					JLabel label_16 = new JLabel("\u91C7\u8D2D\u603B\u989D");
					label_16.setFont(new Font("����", Font.BOLD, 15));
					label_16.setBounds(31, 486, 90, 15);
					frame.getContentPane().add(label_16);
					
					JLabel label_17 = new JLabel();
					label_17.setText((String) null);
					label_17.setFont(new Font("����", Font.BOLD, 15));
					label_17.setBounds(131, 478, 182, 23);
					frame.getContentPane().add(label_17);
					
					String[] s_11 = {"���", "����", "��ϵ��ʽ", "��ַ", "��������", "�����̸�����", "�Ա�",  "��ϵ��ʽ", "�տ�����", "�����˺�"};
					String[] s_12 = {"���", "����", "��ϵ��ʽ", "��ַ", "��������", "�����ʱ�", "�����̸�����", "�Ա�",  "��ϵ��ʽ","�������"};
					String[] s_13 = {"����", "�Ա�", "����", "����", "ְλ", "н��", "��ϵ��ʽ", "��������", "��������", "���п���"};
					
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
						label_16.setText(s_11[9]);
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
						label_16.setText(s_12[9]);
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
						label_16.setText(s_13[9]);
					}
					
					String[] s1 = new String[10];
					
					ku k = new ku();
					Connection con = k.SQLku();
					try {
						Statement state = con.createStatement();
						ResultSet rs = null;
						if(m==0) {
							rs = state.executeQuery("select * from gonghuoshang where id='"+s+"'");
						}else if(m==1) {
							rs = state.executeQuery("select * from jingxiaoshang where id='"+s+"'");
						}else if(m==2) {
							rs = state.executeQuery("select * from fenqujingli where id='"+s+"'");
						}else if(m==3) {
							rs = state.executeQuery("select * from fenquyuangong where id='"+s+"'");
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
					
					lblNewLabel_3.setText(s1[0]);
					label_8.setText(s1[1]);
					label_9.setText(s1[2]);
					label_10.setText(s1[3]);
					label_11.setText(s1[4]);
					label_12.setText(s1[5]);
					label_13.setText(s1[6]);
					label_14.setText(s1[7]);
					label_15.setText(s1[8]);
					label_17.setText(s1[9]);
					
	}
				
				
				
				
				// ��ѯ�˵���¼
				public selectcaigou(int m,String s,int m_1,int m_2,int m_3,int m_4) {
					JFrame frame;
					frame = new JFrame();
					frame.getContentPane().setBackground(Color.WHITE);
					frame.setBackground(Color.WHITE);
					frame.setBounds(100, 100, 377, 614);
					frame.getContentPane().setLayout(null);
					frame.setLocationRelativeTo(null);
					
					JLabel lblNewLabel = new JLabel("New label");
					lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
					lblNewLabel.setForeground(Color.BLACK);
					lblNewLabel.setBackground(Color.BLACK);
					lblNewLabel.setBounds(0, 0, 368, 39);
					frame.getContentPane().add(lblNewLabel);
					
					JLabel lblNewLabel_1 = new JLabel("\u67E5  \u8BE2  ��  ��  \u8BB0  \u5F55");
					lblNewLabel_1.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setBounds(55, 49, 258, 39);
					frame.getContentPane().add(lblNewLabel_1);
					
					JLabel lblNewLabel_2 = new JLabel("�˿���");
					lblNewLabel_2.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_2.setBounds(31, 121, 90, 15);
					frame.getContentPane().add(lblNewLabel_2);
					
					JLabel label = new JLabel("��������");
					label.setFont(new Font("����", Font.BOLD, 15));
					label.setBounds(31, 159, 90, 15);
					frame.getContentPane().add(label);
					
					JLabel label_1 = new JLabel("���");
					label_1.setFont(new Font("����", Font.BOLD, 15));
					label_1.setBounds(31, 205, 90, 15);
					frame.getContentPane().add(label_1);
					
					JLabel label_2 = new JLabel("������ID");
					label_2.setFont(new Font("����", Font.BOLD, 15));
					label_2.setBounds(31, 247, 90, 15);
					frame.getContentPane().add(label_2);
					
					JLabel label_3 = new JLabel("ͼ��ID");
					label_3.setFont(new Font("����", Font.BOLD, 15));
					label_3.setBounds(31, 290, 90, 15);
					frame.getContentPane().add(label_3);
					
					JLabel label_4 = new JLabel("��������");
					label_4.setFont(new Font("����", Font.BOLD, 15));
					label_4.setBounds(31, 332, 90, 15);
					frame.getContentPane().add(label_4);
					
					JLabel label_5 = new JLabel("��ϸ");
					label_5.setFont(new Font("����", Font.BOLD, 15));
					label_5.setBounds(31, 371, 90, 15);
					frame.getContentPane().add(label_5);
					
					JLabel label_6 = new JLabel("ʱ��");
					label_6.setFont(new Font("����", Font.BOLD, 15));
					label_6.setBounds(31, 409, 90, 15);
					frame.getContentPane().add(label_6);
					
					JLabel label_7 = new JLabel("���");
					label_7.setFont(new Font("����", Font.BOLD, 15));
					label_7.setBounds(31, 453, 90, 15);
					frame.getContentPane().add(label_7);
					
					JLabel label_7_1 = new JLabel("����");
					label_7_1.setFont(new Font("����", Font.BOLD, 15));
					label_7_1.setBounds(31, 485, 90, 15);
					frame.getContentPane().add(label_7_1);
					
					JButton button_1 = new JButton("\u8FD4\u56DE");
					button_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.dispose();
							new chaxun(m);
						}
					});
					button_1.setFont(new Font("����", Font.BOLD, 15));
					button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
					button_1.setBounds(131, 520, 93, 23);
					frame.getContentPane().add(button_1);
					frame.setVisible(true);
					button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //ͼƬ�����ֵ����λ��
					button_1.setBorderPainted(false);  //�����Ƿ���Ʊ߿�
					
					JLabel lblNewLabel_3 = new JLabel();
					lblNewLabel_3.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_3.setBounds(131, 115, 182, 23);
					frame.getContentPane().add(lblNewLabel_3);
					
					JLabel label_8 = new JLabel();
					label_8.setFont(new Font("����", Font.BOLD, 15));
					label_8.setBounds(131, 151, 182, 23);
					frame.getContentPane().add(label_8);
					
					JLabel label_9 = new JLabel();
					label_9.setFont(new Font("����", Font.BOLD, 15));
					label_9.setBounds(131, 197, 182, 23);
					frame.getContentPane().add(label_9);
					
					JLabel label_10 = new JLabel();
					label_10.setFont(new Font("����", Font.BOLD, 15));
					label_10.setBounds(131, 239, 182, 23);
					frame.getContentPane().add(label_10);
					
					JLabel label_11 = new JLabel();
					label_11.setFont(new Font("����", Font.BOLD, 15));
					label_11.setBounds(131, 282, 182, 23);
					frame.getContentPane().add(label_11);
					
					JLabel label_12 = new JLabel();
					label_12.setFont(new Font("����", Font.BOLD, 15));
					label_12.setBounds(131, 324, 182, 23);
					frame.getContentPane().add(label_12);
					
					JLabel label_13 = new JLabel();
					label_13.setFont(new Font("����", Font.BOLD, 15));
					label_13.setBounds(131, 363, 182, 23);
					frame.getContentPane().add(label_13);
					
					JLabel label_14 = new JLabel();
					label_14.setFont(new Font("����", Font.BOLD, 15));
					label_14.setBounds(131, 401, 182, 23);
					frame.getContentPane().add(label_14);
					
					JLabel label_15 = new JLabel();
					label_15.setFont(new Font("����", Font.BOLD, 15));
					label_15.setBounds(131, 445, 182, 23);
					frame.getContentPane().add(label_15);
					
					JLabel label_15_1 = new JLabel();
					label_15_1.setFont(new Font("����", Font.BOLD, 15));
					label_15_1.setBounds(131, 480, 182, 23);
					frame.getContentPane().add(label_15_1);
					
					String[] s1 = new String[11];
					
					ku k = new ku();
					Connection con = k.SQLku();
					try {
						Statement state = con.createStatement();
						ResultSet rs = state.executeQuery("select * from zhangkuan where id='"+s+"'");
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
							s1[10] = rs.getString(11);
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
					label_15_1.setText(s1[9]);
				}
				
				
				// ��ѯ������¼
				public selectcaigou(int m,String s,int m_1,int m_2,int m_3,int m_4,int m_5) {
					JFrame frame;
					frame = new JFrame();
					frame.getContentPane().setBackground(Color.WHITE);
					frame.setBackground(Color.WHITE);
					frame.setBounds(100, 100, 377, 614);
					frame.getContentPane().setLayout(null);
					frame.setLocationRelativeTo(null);
					
					JLabel lblNewLabel = new JLabel("New label");
					lblNewLabel.setIcon(new ImageIcon("img/̧ͷlogo_1.PNG"));
					lblNewLabel.setForeground(Color.BLACK);
					lblNewLabel.setBackground(Color.BLACK);
					lblNewLabel.setBounds(0, 0, 368, 39);
					frame.getContentPane().add(lblNewLabel);
					
					JLabel lblNewLabel_1 = new JLabel("\u67E5  \u8BE2  ��  ��  \u8BB0  \u5F55");
					lblNewLabel_1.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setBounds(55, 49, 258, 39);
					frame.getContentPane().add(lblNewLabel_1);
					
					JLabel lblNewLabel_2 = new JLabel("�������");
					lblNewLabel_2.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_2.setBounds(31, 121, 90, 15);
					frame.getContentPane().add(lblNewLabel_2);
					
					JLabel label = new JLabel("�鼮ID");
					label.setFont(new Font("����", Font.BOLD, 15));
					label.setBounds(31, 172, 90, 15);
					frame.getContentPane().add(label);
					
					JLabel label_1 = new JLabel("�鼮����");
					label_1.setFont(new Font("����", Font.BOLD, 15));
					label_1.setBounds(31, 220, 90, 15);
					frame.getContentPane().add(label_1);
					
					JLabel label_2 = new JLabel("��������");
					label_2.setFont(new Font("����", Font.BOLD, 15));
					label_2.setBounds(31, 263, 90, 15);
					frame.getContentPane().add(label_2);
					
					JLabel label_3 = new JLabel("������Ϣ");
					label_3.setFont(new Font("����", Font.BOLD, 15));
					label_3.setBounds(31, 307, 90, 15);
					frame.getContentPane().add(label_3);
					
					JLabel label_4 = new JLabel("ʱ��");
					label_4.setFont(new Font("����", Font.BOLD, 15));
					label_4.setBounds(31, 353, 90, 15);
					frame.getContentPane().add(label_4);
					
					JLabel label_5 = new JLabel("����");
					label_5.setFont(new Font("����", Font.BOLD, 15));
					label_5.setBounds(31, 396, 90, 15);
					frame.getContentPane().add(label_5);
					
					JButton button_1 = new JButton("\u8FD4\u56DE");
					button_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.dispose();
							new chaxun(m);
						}
					});
					button_1.setFont(new Font("����", Font.BOLD, 15));
					button_1.setIcon(new ImageIcon("img/���˵� ��ʼ.PNG"));
					button_1.setBounds(131, 495, 93, 23);
					frame.getContentPane().add(button_1);
					frame.setVisible(true);
					button_1.setHorizontalTextPosition(SwingConstants.CENTER);  //ͼƬ�����ֵ����λ��
					button_1.setBorderPainted(false);  //�����Ƿ���Ʊ߿�
					
					JLabel lblNewLabel_3 = new JLabel();
					lblNewLabel_3.setFont(new Font("����", Font.BOLD, 15));
					lblNewLabel_3.setBounds(145, 115, 182, 23);
					frame.getContentPane().add(lblNewLabel_3);
					
					JLabel label_8 = new JLabel();
					label_8.setFont(new Font("����", Font.BOLD, 15));
					label_8.setBounds(145, 171, 182, 23);
					frame.getContentPane().add(label_8);
					
					JLabel label_9 = new JLabel();
					label_9.setFont(new Font("����", Font.BOLD, 15));
					label_9.setBounds(145, 217, 182, 23);
					frame.getContentPane().add(label_9);
					
					JLabel label_10 = new JLabel();
					label_10.setFont(new Font("����", Font.BOLD, 15));
					label_10.setBounds(145, 259, 182, 23);
					frame.getContentPane().add(label_10);
					
					JLabel label_11 = new JLabel();
					label_11.setFont(new Font("����", Font.BOLD, 15));
					label_11.setBounds(145, 302, 182, 23);
					frame.getContentPane().add(label_11);
					
					JLabel label_12 = new JLabel();
					label_12.setFont(new Font("����", Font.BOLD, 15));
					label_12.setBounds(145, 349, 182, 23);
					frame.getContentPane().add(label_12);
					
					JLabel label_13 = new JLabel();
					label_13.setFont(new Font("����", Font.BOLD, 15));
					label_13.setBounds(145, 393, 182, 23);
					frame.getContentPane().add(label_13);
					
					String[] s1 = new String[7];
					
					ku k = new ku();
					Connection con = k.SQLku();
					try {
						Statement state = con.createStatement();
						ResultSet rs = state.executeQuery("select * from baojing where id='"+s+"'");
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
				}

				
	
}



































