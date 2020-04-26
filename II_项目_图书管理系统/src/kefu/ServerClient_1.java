package kefu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class ServerClient_1 implements Runnable{

	private JFrame frame;
	private Scanner scan;
	private PrintStream out;
	private JTextArea textArea;
	private ServerSocket server;
	private Socket client;
	private boolean flag;
	
	public ServerClient_1(String s_11) {
		
		try {
			server = new ServerSocket(9999);
			JOptionPane.showMessageDialog(null, "正在连接！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
			client = server.accept();
			this.flag = true;
			scan = new Scanner(client.getInputStream());
			out = new PrintStream(client.getOutputStream());
			
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBounds(100, 100, 496, 461);
			frame.getContentPane().setLayout(null);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 480, 251);
			frame.getContentPane().add(panel);
			panel.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			panel.add(scrollPane);
			
			textArea = new JTextArea();
			textArea.setEditable(false);
			scrollPane.setViewportView(textArea);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(0, 277, 480, 95);
			frame.getContentPane().add(panel_1);
			panel_1.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane_1 = new JScrollPane();
			panel_1.add(scrollPane_1);
			scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			
			JTextArea textArea_1 = new JTextArea();
			scrollPane_1.setViewportView(textArea_1);
			
			JButton btnNewButton = new JButton("\u53D1 \u9001");
			btnNewButton.setFont(new Font("楷体", Font.BOLD, 14));
			btnNewButton.setForeground(Color.BLACK);
			btnNewButton.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			
			btnNewButton.setBounds(257, 389, 93, 23);
			frame.getContentPane().add(btnNewButton);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(0, 0, 480, 51);
			frame.getContentPane().add(lblNewLabel);
			
			JButton button = new JButton("\u9000 \u51FA");
			button.setIcon(new ImageIcon("img/左侧菜单 初始.PNG"));
			button.setHorizontalTextPosition(SwingConstants.CENTER);
			button.setForeground(Color.BLACK);
			button.setFont(new Font("楷体", Font.BOLD, 14));
			button.setBorderPainted(false);
			button.setBounds(377, 389, 93, 23);
			button.setHorizontalTextPosition(SwingConstants.CENTER);  //图片与文字的相对位置
			frame.getContentPane().add(button);
			
			JLabel lblNewLabel_1 =  new JLabel("");
			lblNewLabel_1.setForeground(Color.GRAY);
			lblNewLabel_1.setBackground(Color.DARK_GRAY);
			lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 15));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(377, 253, 103, 23);
			frame.getContentPane().add(lblNewLabel_1);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
			String s_22 = df.format(new Date());
			lblNewLabel_1.setText(s_22);
			
			 Thread t = new Thread(this);
			 t.start();
			
			
			//发送
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = textArea_1.getText();
					out.println(str);
					Calendar cal=Calendar.getInstance();   
					int h=cal.get(Calendar.HOUR_OF_DAY);      
					int mi=cal.get(Calendar.MINUTE);      
					int s1=cal.get(Calendar.SECOND);
					String s_22 = null;
					if(s1<10) {
						s_22 = h+":"+mi+":0"+s1;
					}else {
						s_22 = h+":"+mi+":"+s1;
					}
					textArea.setFont(new Font("宋体", 0, 14)); 
					textArea.append(s_11+"   "+s_22+"\n");
					textArea.setFont(new Font("楷体", 0, 14)); 
					textArea.append(str+"\n\n");
					textArea_1.setText("");
				}
			});
			
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						server.close();
						client.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					frame.dispose();
				}
			});
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void run() {
		while(true) {
			if(scan.hasNext()) {
				String s = scan.next().trim();
				
				Calendar cal=Calendar.getInstance();   
				int h=cal.get(Calendar.HOUR_OF_DAY);      
				int mi=cal.get(Calendar.MINUTE);      
				int s1=cal.get(Calendar.SECOND); 
				String s_22 = null;
				if(s1<10) {
					s_22 = h+":"+mi+":0"+s1;
				}else {
					s_22 = h+":"+mi+":"+s1;
				}
				
				textArea.setFont(new Font("宋体", 0, 14)); 
				textArea.append("客服"+"   "+s_22+"\n");
				textArea.setFont(new Font("楷体", 0, 14)); 
				textArea.append(s+"\n\n");
			}
		}
	}
	
	public boolean fanhui() {
		return this.flag;
	}
	
}
