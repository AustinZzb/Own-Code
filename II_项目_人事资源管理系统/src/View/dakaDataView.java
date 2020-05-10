/*
 *	
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * 	@author 张致邦
 *
 * 	2020年5月8日-下午1:14:00
 */
public class dakaDataView {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public dakaDataView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4EBA\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\favicon.png"));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 463, 288);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("\u5458\u5DE5\u76F8\u7247");
		lblNewLabel.setFont(new Font("楷体", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 106, 137);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5DF2\u7B7E\u5230\u56FE\u7247");
		lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 150, 106, 75);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u7B7E\u5230\u65F6\u95F4");
		lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 224, 106, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("\u5DE5\u53F7");
		label.setFont(new Font("楷体", Font.BOLD, 16));
		label.setBounds(145, 10, 54, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setFont(new Font("楷体", Font.BOLD, 16));
		label_1.setBounds(303, 10, 54, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_1_1 = new JLabel("\u5DE5\u9F84");
		label_1_1.setFont(new Font("楷体", Font.BOLD, 16));
		label_1_1.setBounds(145, 71, 54, 15);
		frame.getContentPane().add(label_1_1);
		
		JLabel label_1_2 = new JLabel("\u804C\u4F4D");
		label_1_2.setFont(new Font("楷体", Font.BOLD, 16));
		label_1_2.setBounds(303, 71, 54, 15);
		frame.getContentPane().add(label_1_2);
		
		JLabel label_1_3 = new JLabel("\u6708\u5EA6\u8003\u52E4");
		label_1_3.setFont(new Font("楷体", Font.BOLD, 16));
		label_1_3.setBounds(145, 132, 75, 15);
		frame.getContentPane().add(label_1_3);
		
		JLabel label_1_4 = new JLabel("\u5E74\u5EA6\u8003\u52E4");
		label_1_4.setFont(new Font("楷体", Font.BOLD, 16));
		label_1_4.setBounds(303, 132, 75, 15);
		frame.getContentPane().add(label_1_4);
		
		JButton button = new JButton("\u8BE6\u60C5\u4FE1\u606F");
		button.setFont(new Font("楷体", Font.BOLD, 16));
		button.setBounds(145, 184, 106, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u786E\u8BA4");
		button_1.setBounds(344, 221, 93, 23);
		frame.getContentPane().add(button_1);
		
		// @note 添加监听器
		button_1.addActionListener(e -> fanhui());
	}
	
	/**
	 * @method 关闭当前窗口
	 */
	public void close() {
		this.frame.dispose();
	}
	
	/**
	 * @method 返回view_Daka界面
	 */
	private void fanhui() {
		new dakaView();
		this.close();
	}

}























