package zhujiemian;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class denglu {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField textField_1;
	private JTextField textField_2;
	static zhujiemian_1 t;

	public static void main(String[] args) {
		t = new zhujiemian_1();
	}

	public denglu() {
		initialize();
	}

	private void initialize() {

		JFrame frame;
		JTextField textField; 
		JTextField textField_1;
		JTextField textField_2;
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 363, 586);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D");
		lblNewLabel.setFont(new Font("楷体", Font.BOLD, 15));
		lblNewLabel.setBounds(67, 126, 54, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("\u5BC6\u7801");
		label.setFont(new Font("楷体", Font.BOLD, 15));
		label.setBounds(67, 186, 54, 15);
		frame.getContentPane().add(label);

		textField = new JTextField();
		textField.setFont(new Font("楷体", Font.BOLD, 15));
		textField.setBounds(152, 123, 119, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JPasswordField();
		textField_1.setBounds(152, 183, 119, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel label_1 = new JLabel("\u9A8C\u8BC1\u7801");
		label_1.setFont(new Font("楷体", Font.BOLD, 15));
		label_1.setBounds(67, 358, 54, 15);
		frame.getContentPane().add(label_1);

		JLabel lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 28));
		lblNewLabel_2.setBounds(152, 259, 26, 23);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("2");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("华文琥珀", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(175, 284, 33, 26);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_1 = new JLabel("3");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_1.setBounds(204, 258, 33, 28);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_4 = new JLabel("4");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 24));
		lblNewLabel_4.setBounds(232, 280, 26, 26);
		frame.getContentPane().add(lblNewLabel_4);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("楷体", Font.BOLD, 15));
		textField_2.setBounds(152, 355, 119, 21);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		int n = (int) (Math.random() * 21);
		int n_1 = (int) (Math.random() * 10);
		int n_2 = (int) (Math.random() * 5);

		if (n % 2 == 0) {
			lblNewLabel_2.setText((n_2 + 3) + "");
			lblNewLabel_2.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17 + n_1));
			lblNewLabel_2.setBounds(152, 259 + n, 26, 23);

			lblNewLabel_3.setText((n_2 + 1) + "");
			lblNewLabel_3.setFont(new Font("华文琥珀", Font.ITALIC, 23 - n_1));
			lblNewLabel_3.setBounds(175, 284 - n, 33, 26);

			lblNewLabel_1.setText(n_2 + "");
			lblNewLabel_1.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 17 + n_1));
			lblNewLabel_1.setBounds(204, 258 + n, 33, 28);

			lblNewLabel_4.setText((n_2 + 5) + "");
			lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22 - n_1));
			lblNewLabel_4.setBounds(232, 280 - n, 26, 26);
		} else {
			lblNewLabel_2.setText((n_2 + 1) + "");
			lblNewLabel_2.setFont(new Font("华文琥珀", Font.BOLD, 17 - n_1));
			lblNewLabel_2.setBounds(152, 259 - n, 26, 23);

			lblNewLabel_3.setText((n_2 + 3) + "");
			lblNewLabel_3.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 23 + n_1));
			lblNewLabel_3.setBounds(175, 284 + n, 33, 26);

			lblNewLabel_1.setText((n_2 + 1) + "");
			lblNewLabel_1.setFont(new Font("宋体d", Font.BOLD | Font.ITALIC, 17 - n_1));
			lblNewLabel_1.setBounds(201, 258 - n, 33, 28);

			lblNewLabel_4.setText((n_2 + 2) + "");
			lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22 + n_1));
			lblNewLabel_4.setBounds(232, 280 + n, 26, 26);
		}

		// 验证码
		JButton btnNewButton_2 = new JButton("\u5237\u65B0");
		btnNewButton_2.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		btnNewButton_2.setFont(new Font("楷体", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int n = (int) (Math.random() * 21);
				int n_1 = (int) (Math.random() * 10);
				int n_2 = (int) (Math.random() * 5);

				if (n % 2 == 0) {
					lblNewLabel_2.setText((n_2 + 3) + "");
					lblNewLabel_2.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17 + n_1));
					lblNewLabel_2.setBounds(152, 259 + n, 26, 23);

					lblNewLabel_3.setText((n_2 + 1) + "");
					lblNewLabel_3.setFont(new Font("华文琥珀", Font.ITALIC, 23 - n_1));
					lblNewLabel_3.setBounds(175, 284 - n, 33, 26);

					lblNewLabel_1.setText(n_2 + "");
					lblNewLabel_1.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 17 + n_1));
					lblNewLabel_1.setBounds(204, 258 + n, 33, 28);

					lblNewLabel_4.setText((n_2 + 5) + "");
					lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22 - n_1));
					lblNewLabel_4.setBounds(232, 280 - n, 26, 26);
				} else {
					lblNewLabel_2.setText((n_2 + 1) + "");
					lblNewLabel_2.setFont(new Font("华文琥珀", Font.BOLD, 17 - n_1));
					lblNewLabel_2.setBounds(152, 259 - n, 26, 23);

					lblNewLabel_3.setText((n_2 + 3) + "");
					lblNewLabel_3.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 23 + n_1));
					lblNewLabel_3.setBounds(175, 284 + n, 33, 26);

					lblNewLabel_1.setText((n_2 + 1) + "");
					lblNewLabel_1.setFont(new Font("宋体d", Font.BOLD | Font.ITALIC, 17 - n_1));
					lblNewLabel_1.setBounds(201, 258 - n, 33, 28);

					lblNewLabel_4.setText((n_2 + 2) + "");
					lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22 + n_1));
					lblNewLabel_4.setBounds(232, 280 + n, 26, 26);
				}
			}
		});
		btnNewButton_2.setBounds(209, 460, 93, 23);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER); // 图片与文字的相对位置
		btnNewButton_2.setBorderPainted(false); // 设置是否绘制边框

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("img/验证码背景.jpg"));
		lblNewLabel_5.setBounds(152, 238, 119, 88);
		frame.getContentPane().add(lblNewLabel_5);

		// 返回键
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new zhujiemian_1();
				frame.dispose();
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("img/返回键.png"));
		btnNewButton_3.setBounds(0, 58, 41, 26);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.setBorderPainted(false); // 设置是否绘制边框

		// 登录，查询核对数据库和验证码
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		btnNewButton.setFont(new Font("楷体", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ku k1 = new ku();
				Connection con = k1.SQLku();

				String s02 = "管理账号";
				String s01 = "管理账号";
				String s03 = "管理账号";
				String s00 = "管理账号";

				try {
					Statement stmt = con.createStatement();
					ResultSet rs = stmt
							.executeQuery("select password from userID WHERE ID = " + "'" + textField.getText() + "'");
					rs.last();
					rs.beforeFirst();
					if (rs.next()) {
						if (rs.getString("password").equals(textField_1.getText())) {
							// 验证码
							String s = textField_2.getText();
							String s_1 = lblNewLabel_2.getText() + lblNewLabel_3.getText() + lblNewLabel_1.getText()
									+ lblNewLabel_4.getText();
							if (s.equals(s_1)) {
								ResultSet rs1 = stmt
										.executeQuery("select name,age,zhiwei from fenquyuangong WHERE id = " + "'"
												+ textField.getText() + "'");

								rs1.last();
								rs1.beforeFirst();
								while (rs1.next()) {
									s00 = rs1.getString(1);
									s02 = rs1.getString(2);
									s03 = rs1.getString(3);
								}

								s01 = textField.getText();
								new zhujiemian(s00, s01, s02, s03);
								frame.dispose();
							} else {
								JOptionPane.showMessageDialog(null, "验证码错误！", "系统提示", JOptionPane.WARNING_MESSAGE);
								int n = (int) (Math.random() * 21);
								int n_1 = (int) (Math.random() * 10);
								int n_2 = (int) (Math.random() * 5);
								lblNewLabel_2.setText((n_2 + 1) + "");
								lblNewLabel_2.setFont(new Font("华文琥珀", Font.BOLD, 17 - n_1));
								lblNewLabel_2.setBounds(152, 259 - n, 26, 23);

								lblNewLabel_3.setText((n_2 + 3) + "");
								lblNewLabel_3.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 23 + n_1));
								lblNewLabel_3.setBounds(175, 284 + n, 33, 26);

								lblNewLabel_1.setText((n_2 + 1) + "");
								lblNewLabel_1.setFont(new Font("宋体d", Font.BOLD | Font.ITALIC, 17 - n_1));
								lblNewLabel_1.setBounds(201, 258 - n, 33, 28);

								lblNewLabel_4.setText((n_2 + 2) + "");
								lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22 + n_1));
								lblNewLabel_4.setBounds(232, 280 + n, 26, 26);

								textField_2.setText("");
							}
						} else if (!rs.getString("password").equals(textField_1.getText())) {
							JOptionPane.showMessageDialog(null, "密码错误！", "系统提示", JOptionPane.WARNING_MESSAGE);
							int n = (int) (Math.random() * 21);
							int n_1 = (int) (Math.random() * 10);
							int n_2 = (int) (Math.random() * 5);
							lblNewLabel_2.setText((n_2 + 1) + "");
							lblNewLabel_2.setFont(new Font("华文琥珀", Font.BOLD, 17 - n_1));
							lblNewLabel_2.setBounds(152, 259 - n, 26, 23);

							lblNewLabel_3.setText((n_2 + 3) + "");
							lblNewLabel_3.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 23 + n_1));
							lblNewLabel_3.setBounds(175, 284 + n, 33, 26);

							lblNewLabel_1.setText((n_2 + 1) + "");
							lblNewLabel_1.setFont(new Font("宋体d", Font.BOLD | Font.ITALIC, 17 - n_1));
							lblNewLabel_1.setBounds(201, 258 - n, 33, 28);

							lblNewLabel_4.setText((n_2 + 2) + "");
							lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22 + n_1));
							lblNewLabel_4.setBounds(232, 280 + n, 26, 26);

							textField_2.setText("");
							textField_1.setText("");
						}
					} else {
						JOptionPane.showMessageDialog(null, "用户不存在！", "系统提示", JOptionPane.WARNING_MESSAGE);
						textField.setText("");
						textField_1.setText("");
						int n = (int) (Math.random() * 21);
						int n_1 = (int) (Math.random() * 10);
						int n_2 = (int) (Math.random() * 5);
						lblNewLabel_2.setText((n_2 + 1) + "");
						lblNewLabel_2.setFont(new Font("华文琥珀", Font.BOLD, 17 - n_1));
						lblNewLabel_2.setBounds(152, 259 - n, 26, 23);

						lblNewLabel_3.setText((n_2 + 3) + "");
						lblNewLabel_3.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 23 + n_1));
						lblNewLabel_3.setBounds(175, 284 + n, 33, 26);

						lblNewLabel_1.setText((n_2 + 1) + "");
						lblNewLabel_1.setFont(new Font("宋体d", Font.BOLD | Font.ITALIC, 17 - n_1));
						lblNewLabel_1.setBounds(201, 258 - n, 33, 28);

						lblNewLabel_4.setText((n_2 + 2) + "");
						lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 22 + n_1));
						lblNewLabel_4.setBounds(232, 280 + n, 26, 26);

						textField_2.setText("");
					}
					rs.close();
					stmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(56, 460, 93, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER); // 图片与文字的相对位置
		btnNewButton.setBorderPainted(false); // 设置是否绘制边框

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("img/抬头logo_1.PNG"));
		lblNewLabel_6.setBounds(0, 0, 347, 39);
		frame.getContentPane().add(lblNewLabel_6);

	}
}
