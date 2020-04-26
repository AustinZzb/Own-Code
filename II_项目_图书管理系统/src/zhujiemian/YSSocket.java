package zhujiemian;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class YSSocket {

	private JFrame frame;
	private int a = 1;
	
	
	public YSSocket() throws Exception{
		
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 678, 626);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 47, 662, 288);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 391, 662, 154);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_1.add(scrollPane_1, BorderLayout.CENTER);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JButton button = new JButton("\u53D1\u9001");
		
		button.setBounds(443, 555, 93, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.setBounds(569, 555, 93, 23);
		frame.getContentPane().add(button_1);
		
		// 连接
		JButton button_2 = new JButton("\u8FDE\u63A5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					new YSSocket_1();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			
			}
		});
		button_2.setBounds(321, 555, 93, 23);
		frame.getContentPane().add(button_2);
		frame.setVisible(true);
		
		
		
		YSSocket_1 t = new YSSocket_1();
		
		// 发送
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str = textArea_1.getText();
				t.fasong(str);
				textArea_1.append(str);
				textArea.setText("");
				
			}
		});
		
		// 退出
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		
		
		while(true) {
			t.jieshou();
		}
		
	}
	
	
	
}




















