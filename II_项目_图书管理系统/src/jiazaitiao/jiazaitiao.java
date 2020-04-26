package jiazaitiao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import kefu.ServerClient;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jiazaitiao implements Runnable{

	private JFrame frame;
	private JButton[] butt;
	private Socket client = null;
	private ServerSocket server = null;
	private boolean flag_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boolean flag = false;
					jiazaitiao window = new jiazaitiao(flag);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public jiazaitiao(boolean flag) {
		this.flag_1 = flag;
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		JButton button_01 = new JButton("");
		button_01.setIcon(new ImageIcon("img/抬头logo.PNG"));
		JButton button_02 = new JButton("");
		button_02.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		JButton button_03 = new JButton("");
		button_03.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		JButton button_04 = new JButton("");
		button_04.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		JButton button_05 = new JButton("");
		button_05.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		JButton button_06 = new JButton("");
		button_06.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		butt = new JButton[]{button_01,button_02,button_03,button_04,button_05,button_06};
		
		
		butt[0].setBounds(49, 58, 33, 3);
		frame.getContentPane().add(butt[0]);
		
		
		butt[1].setBounds(92, 58, 33, 3);
		frame.getContentPane().add(butt[1]);
		
		
		butt[2].setBounds(135, 58, 33, 3);
		frame.getContentPane().add(butt[2]);
		
		
		butt[3].setBounds(178, 58, 33, 3);
		frame.getContentPane().add(butt[3]);
		
		
		butt[4].setBounds(221, 58, 33, 3);
		frame.getContentPane().add(butt[4]);
		
		
		butt[5].setBounds(264, 58, 33, 3);
		frame.getContentPane().add(butt[5]);
		
		
		
		Thread t = new Thread(this);
		t.start();
		

		
		JLabel lblNewLabel_01 = new JLabel("\u7B49 \u5F85 \u5BA2 \u670D \u8FDE \u63A5");
		lblNewLabel_01.setFont(new Font("楷体", Font.BOLD, 14));
		lblNewLabel_01.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_01.setBounds(49, 95, 248, 23);
		frame.getContentPane().add(lblNewLabel_01);
		
		JButton btnNewButton_01 = new JButton("\u53D6\u6D88\u8FDE\u63A5");
		btnNewButton_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_01.setFont(new Font("楷体", Font.BOLD, 14));
		btnNewButton_01.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
		btnNewButton_01.setBounds(106, 128, 130, 23);
		frame.getContentPane().add(btnNewButton_01);
		frame.setBounds(100, 100, 371, 190);
		btnNewButton_01.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
		btnNewButton_01.setBorderPainted(false);  //设置是否绘制边框
		
		frame.setLocationRelativeTo(null);
		
		
		
		
	}
	
	public void run() {
		boolean flag = true;
		int m  = 0;
		
		while(flag) {
				if(flag_1==true) {
					frame.dispose();
				}
				for(int i=0;i<6;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					butt[i].setIcon(new ImageIcon("img/抬头logo.PNG"));
					for(int j = 0;j<6;j++) {
						if(j!=i) {
							butt[j].setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
						}
					}
				}
			
		}
		
		
	}
	
	

}
